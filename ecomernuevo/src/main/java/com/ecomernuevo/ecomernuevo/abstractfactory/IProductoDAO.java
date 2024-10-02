package com.ecomernuevo.ecomernuevo.abstractfactory;

import com.ecomernuevo.ecomernuevo.Producto;

public interface IProductoDAO {
    void agregarProducto(Producto producto);
    Producto obtenerProducto(int id);
    void actualizarProducto(Producto producto);
    void eliminarProducto(int id);
}
