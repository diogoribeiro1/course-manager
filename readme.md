# Course Manager

Sistema web para o controle do quadro de horário acadêmico do curso Engenharia de Software

## Teste em Produção

https://data-structure-production.up.railway.app/

## Tecnologias Utilizadas

- Java 11
- Spring / Spring Boot
- HTML
- CSS
- JavaScript
- Bootstrap

## Funcionalidades do Sistema

1) Cadastrar Estudante no curso (ID/Matrícula, nome completo, Email, Ano de egresso)

2) Cadastrar Professor no curso (ID/Matrícula, nome completo, Email, Ano de egresso)

3) Cadastrar Disciplina no curso (Código da disciplina, Nome,  Professor)

4) Matricular Estudantes na disciplina ( Código da disciplina, código do estudante)  

5) Emitir o Quadro de Horário do Professor   

6) Emitir o Quadro de Horário do Estudante

7) Emitir o  diário da disciplina  ( Imprimir o nome da disciplina, dia e horário da disciplina, professor e a lista de estudante matriculado)

## Configure e execute

1. Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema. Você pode verificar digitando java -version no terminal. Se não estiver instalado, você precisará instalá-lo.

2. Certifique-se de ter o Maven instalado em seu sistema. O Maven é uma ferramenta de automação de compilação e gerenciamento de dependências para projetos Java. Verifique digitando mvn -version no terminal. Se não estiver instalado, você precisará instalá-lo.

3. Abra o terminal e navegue até o diretório raiz do seu projeto Spring. O diretório raiz geralmente contém o arquivo pom.xml.

4. Execute o seguinte comando para compilar o projeto e empacotá-lo em um arquivo JAR:
```shell
   mvn clean package    
```
Isso irá compilar o código-fonte, executar os testes e gerar o arquivo JAR no diretório "target".

5. Depois que o pacote JAR for gerado com sucesso, você poderá executá-lo com o comando java -jar seguido do nome do arquivo JAR. Por exemplo:
```shell
   java -jar target/meuapp.jar    
```
Substitua "meuapp.jar" pelo nome real do seu arquivo JAR.

6. O aplicativo Spring será iniciado e começará a ser executado. Você verá as mensagens de log e, se tudo estiver configurado corretamente, poderá acessar o aplicativo em um navegador da web no endereço "http://localhost:8080" (ou outro endereço e porta, dependendo da configuração do seu aplicativo Spring).