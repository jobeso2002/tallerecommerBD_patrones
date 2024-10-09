package com.ecomernuevo.ecomernuevo.factory;

import com.ecomernuevo.ecomernuevo.Producto;

import java.util.HashMap;
import java.util.Map;

public class BD_Oracle implements IProductoDAO {
    private Map<Integer, Producto> productos;

    public BD_Oracle() {
        this.productos = new HashMap<>();
        // Datos por defecto
        productos.put(1, new Producto(1, "Producto Oracle 1", 150.0));
        productos.put(2, new Producto(2, "Producto Oracle 2", 250.0));
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.get(id);
    }



    @Override
    public void actualizarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.remove(id);
    }
}
