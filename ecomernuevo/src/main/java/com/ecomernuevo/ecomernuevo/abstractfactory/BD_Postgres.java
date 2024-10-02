package com.ecomernuevo.ecomernuevo.abstractfactory;

import com.ecomernuevo.ecomernuevo.Producto;

import java.util.HashSet;
import java.util.Set;

public class BD_Postgres implements IProductoDAO {
    private Set<Producto> productos;

    public BD_Postgres() {
        this.productos = new HashSet<>();
        // Datos por defecto
        productos.add(new Producto(1, "Producto Postgres 1", 120.0));
        productos.add(new Producto(2, "Producto Postgres 2", 220.0));
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto obtenerProducto(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productos.removeIf(p -> p.getId() == producto.getId());
        productos.add(producto);
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}
