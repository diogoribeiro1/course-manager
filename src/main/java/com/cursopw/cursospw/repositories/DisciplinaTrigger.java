package com.cursopw.cursospw.repositories;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class DisciplinaTrigger {

    private final DataSource dataSource;

    public DisciplinaTrigger(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @jakarta.annotation.PostConstruct
    public void createTrigger() {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement()) {

            // Verificar se a trigger já existe
            String checkTriggerSql = "SELECT EXISTS (SELECT 1 FROM pg_trigger WHERE tgname = 'limite_disciplinas')";
            ResultSet resultSet = statement.executeQuery(checkTriggerSql);
            resultSet.next();
            boolean triggerExists = resultSet.getBoolean(1);

            if (!triggerExists) {
                // Criação da trigger
                String triggerSql = "CREATE OR REPLACE FUNCTION verificar_limite_disciplinas() " +
                        "RETURNS TRIGGER AS $$ " +
                        "DECLARE " +
                        "   total_disciplinas INT; " +
                        "BEGIN " +
                        "   SELECT COUNT(*) INTO total_disciplinas FROM Disciplinas WHERE professor_matricula = NEW.professor_matricula; " +
                        "   IF total_disciplinas >= 10 THEN " +
                        "       RAISE EXCEPTION 'O número máximo de disciplinas que um professor pode lecionar é 10.'; " +
                        "   END IF; " +
                        "   RETURN NEW; " +
                        "END; " +
                        "$$ LANGUAGE plpgsql; " +
                        "CREATE TRIGGER limite_disciplinas " +
                        "BEFORE INSERT OR UPDATE ON Disciplinas " +
                        "FOR EACH ROW " +
                        "EXECUTE FUNCTION verificar_limite_disciplinas();";

                statement.executeUpdate(triggerSql);
            }
        } catch (Exception e) {
            // Tratar exceção ou registrar erro
            e.printStackTrace();
        }
    }
}
