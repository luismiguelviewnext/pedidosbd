package com.curso.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidosDao;
import com.curso.model.Pedido;
import com.curso.model.Producto;

/**
 * Implementación del servicio para gestionar pedidos.
 */
@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    PedidosDao dao;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Crea un pedido y realiza las acciones necesarias en la base de datos y el
     * servicio de productos.
     *
     * @param pedido El pedido que se va a crear.
     */
    @Override
    public void crearPedido(Pedido pedido) {

        // Obtener la lista de productos desde el servicio de productos
        Producto[] productos = restTemplate.getForObject("http://localhost:8080/producto", Producto[].class);


        // Iterar sobre los productos para encontrar el producto deseado
        for (Producto producto : productos) {
            if (producto.getCodigoProducto() == pedido.getCodigoProducto()) {
                // Actualizar el stock del producto
               
               // restTemplate.postForLocation("http://localhost:8080/producto/" + producto.getCodigoProducto() + "/" +  pedido.getUnidades(), producto);
                restTemplate.put("http://localhost:8080/producto/" + producto.getCodigoProducto() + "/" +  pedido.getUnidades(), producto);    
                // Calcular el total y la fecha del pedido
                pedido.setTotal(producto.getPrecioUnitario() * pedido.getUnidades());
                pedido.setFecha(new Date());
                // Guardar el pedido en la base de datos
                dao.save(pedido);

            }

        }
    }

    /**
     * Obtiene la lista de todos los pedidos almacenados en la base de datos.
     *
     * @return La lista de pedidos.
     */
    @Override
    public List<Pedido> obtenerPedidos() {
        return dao.findAll();

    }
}
