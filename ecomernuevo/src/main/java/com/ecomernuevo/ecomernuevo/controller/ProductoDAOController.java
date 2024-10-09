package com.ecomernuevo.ecomernuevo.controller;

import com.ecomernuevo.ecomernuevo.Producto;
import com.ecomernuevo.ecomernuevo.factory.IProductoDAO;
import com.ecomernuevo.ecomernuevo.configuracionfabrica.ConfiguracionBD;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productos")
public class ProductoDAOController {
    private IProductoDAO productoDAO;

    public ProductoDAOController() {
        ConfiguracionBD.configureAdapterDB();
        this.productoDAO = ConfiguracionBD.getProductoDAO();
    }


    @PostMapping
    public void agregarProducto(@RequestBody Producto producto) {
        productoDAO.agregarProducto(producto);
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id) {
        return productoDAO.obtenerProducto(id);
    }


    @PutMapping
    public void actualizarProducto(@RequestBody Producto producto) {
        productoDAO.actualizarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable int id) {
        productoDAO.eliminarProducto(id);
    }
}
