package com.bolsadeideas.spring.error.app.errors;

public class UsuarioNoEncontrado extends RuntimeException{

  public UsuarioNoEncontrado(String id) {
    super("Usuario con id ".concat(id).concat(" no encontrado"));
  }
  
}
