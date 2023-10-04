package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidoService {

    //Recibirá los datos del pedido y los dará de alta

    void crearPedido(Pedido pedido);

    // Mostrará los pedidos existentes
    List<Pedido> obtenerPedidos();

    

    

    
}
