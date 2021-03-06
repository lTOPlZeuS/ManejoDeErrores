package com.bolsadeideas.spring.error.app.controllers;

import com.bolsadeideas.spring.error.app.errors.UsuarioNoEncontrado;
import com.bolsadeideas.spring.error.app.models.domain.Usuario;
import com.bolsadeideas.spring.error.app.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class AppController {
  
  @Autowired
  private UsuarioService usuarioService;

  @GetMapping("/index")
  public String index() {
    return "index";
  }

  @GetMapping("/cero")
  public String home() {
    Integer valor = 100/0;
    return "index";
  }

  @GetMapping("/integer")
  public String error() {
    Integer valor = Integer.parseInt("10x");
    return "index";
  }

  @GetMapping("/ver/{id}")
  public String ver(@PathVariable Integer id, Model model) {;
    // Anterior mente obteniamos por metodo buscarPorId con if ahora lo hacemos con Optional que nos permite obtener un valor o null
    // Usuario usuario = usuarioService.buscarPorId(id);
    // if (usuario == null) {
    //   throw new UsuarioNoEncontrado(id.toString());
    // }
    Usuario usuario = usuarioService.buscarPorIdOptional(id).orElseThrow(() -> new UsuarioNoEncontrado(id.toString()));
    model.addAttribute("usuario", usuario);
    return "ver";
  }
  
}
