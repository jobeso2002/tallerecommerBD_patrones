package com.ecomernuevo.ecomernuevo.factory;

import com.ecomernuevo.ecomernuevo.Producto;

public interface IProductoDAO {
    void agregarProducto(Producto producto);
    Producto obtenerProducto(int id);
    void actualizarProducto(Producto producto);
    void eliminarProducto(int id);
}
