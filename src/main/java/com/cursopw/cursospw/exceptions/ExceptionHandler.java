package com.cursopw.cursospw.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {

    @ResponseStatus // Define o código de status HTTP para 500
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class) // Manipula qualquer exceção do tipo Exception
    public String handleInternalServerError(Exception ex) {
        // Aqui você pode realizar algum tratamento de erro, como registrar o erro em um log
        // ou exibir uma página de erro personalizada.
        
        // Retorna o nome da página de erro personalizada
        return "error";
    }
}
