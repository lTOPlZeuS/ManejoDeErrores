package com.bolsadeideas.spring.error.app.services;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.spring.error.app.models.domain.Usuario;

import org.springframework.stereotype.Service;
@Service
public interface UsuarioService {
  public List<Usuario> listar();

  public Usuario buscarPorId(Integer id);

  public Optional<Usuario> buscarPorIdOptional(Integer id);
}
