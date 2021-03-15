package com.algamoneyapi.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.algamoneyapi.model.Usuario;

public class UsuarioSistema extends User {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	public UsuarioSistema(Usuario usuario, Collection<? extends GrantedAuthority> authority) {
		super(usuario.getEmail(), usuario.getSenha(), authority);
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
}
