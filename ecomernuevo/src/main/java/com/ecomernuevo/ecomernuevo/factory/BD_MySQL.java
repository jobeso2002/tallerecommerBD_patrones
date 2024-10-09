package com.ecomernuevo.ecomernuevo.factory;

import com.ecomernuevo.ecomernuevo.Producto;

import java.util.ArrayList;
import java.util.List;

public class BD_MySQL  implements IProductoDAO {
    private List<Producto> productos;

    public BD_MySQL() {
        this.productos = new ArrayList<>();
        // Datos por defecto
        productos.add(new Producto(1, "Producto MySQL 1", 100.0));
        productos.add(new Producto(2, "Producto MySQL 2", 200.0));
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
        Producto prod = obtenerProducto(producto.getId());
        if (prod != null) {
            prod.setDescripcion(producto.getDescripcion());
            prod.setPrecio(producto.getPrecio());
        }
    }

    @Override
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }
}
