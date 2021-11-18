package com.bolsadeideas.spring.error.app.controllers;

import com.bolsadeideas.spring.error.app.errors.UsuarioNoEncontrado;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {
  @ExceptionHandler(ArithmeticException.class)
  public String aritmeticalError(ArithmeticException e, Model model) {
    model.addAttribute("error","Error de aritmetica");
    model.addAttribute("message", e.getMessage());
    model.addAttribute("errorCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
    model.addAttribute("timestamp", System.currentTimeMillis());
    return "error/aritmetica";
  }

  @ExceptionHandler(NumberFormatException.class)
  public String numberFormatError(NumberFormatException e, Model model) {
    model.addAttribute("error","Error de formato de numero");
    model.addAttribute("message", e.getMessage());
    model.addAttribute("errorCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
    model.addAttribute("timestamp", System.currentTimeMillis());
    return "error/formato-numero";
  }

  @ExceptionHandler(UsuarioNoEncontrado.class)
  public String numberFormatError(UsuarioNoEncontrado e, Model model) {
    model.addAttribute("error","Error usuario no encontrado");
    model.addAttribute("message", e.getMessage());
    model.addAttribute("errorCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
    model.addAttribute("timestamp", System.currentTimeMillis());
    return "error/UnuarioNoFount";
  }
}
