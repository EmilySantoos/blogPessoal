package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	
	//SELECT * FROM tb_usuario WHERE usuario = "usuarios";estara assim no msql
	// A instrução FROM tb_usuarios será inserida pelo JPA ao checar o nome da tabela gerada pela Classe Usuario.
}