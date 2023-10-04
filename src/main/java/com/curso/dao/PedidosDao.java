package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Pedido;

/**
 * Interfaz que proporciona métodos de acceso a datos para la entidad Pedido.
 */
public interface PedidosDao extends JpaRepository<Pedido, Integer> {
    
}
