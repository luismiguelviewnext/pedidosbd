package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidoService;

/**
 * Controlador que gestiona las operaciones relacionadas con los pedidos.
 */
@RestController
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    /**
     * Obtiene la lista de todos los pedidos en formato JSON.
     *
     * @return La lista de pedidos.
     */
    @GetMapping(value="pedido", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pedido> obtenerPedidos() {
        return pedidoService.obtenerPedidos();
    }

    /**
     * Crea un nuevo pedido a partir de los datos proporcionados en el cuerpo de la solicitud.
     *
     * @param pedido El pedido que se va a crear.
     */
    @PostMapping(value="pedido", produces = MediaType.APPLICATION_JSON_VALUE)
    public void crearPedido(@RequestBody Pedido pedido) {
        pedidoService.crearPedido(pedido);
    }    
}
