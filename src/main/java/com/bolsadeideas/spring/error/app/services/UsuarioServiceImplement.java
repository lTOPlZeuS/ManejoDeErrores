package com.bolsadeideas.spring.error.app.services;

import java.util.ArrayList;
import java.util.List;

import com.bolsadeideas.spring.error.app.models.domain.Usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImplement implements UsuarioService {

  private List<Usuario> lista;


  public UsuarioServiceImplement() {
    this.lista = new ArrayList<>();
    this.lista.add(new Usuario(1,"Jesus Antonio","Rocha Vicente"));
    this.lista.add(new Usuario(2,"Freddy","Ramirez"));
    this.lista.add(new Usuario(3,"Pedro","Dominguez"));
    this.lista.add(new Usuario(4,"Maria","Perez"));
    this.lista.add(new Usuario(5,"Raquel","Granados"));
    this.lista.add(new Usuario(6,"Israek","Hernandez"));
  }

  @Override
  public List<Usuario> listar() {
    return this.lista;
  }

  @Override
  public Usuario buscarPorId(Integer id) {
    Usuario usuario = null;
    for (Usuario u : this.lista) {
      if (u.getId().equals(id)) {
        usuario = u;
        break;
      }
    }
    return usuario;
  }
  
}
