/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 *
 * @author Hernan
 */
public class VentaDto implements Serializable {
    
    private int idVenta;
    private ProductoDto producto;
    private FacturaDto factura;
    private int cantidad;

    public VentaDto() {
    }
    
     public VentaDto(ProductoDto producto, FacturaDto factura, int cantidad) {
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public ProductoDto getProducto() {
        return producto;
    }

    public void setProducto(ProductoDto producto) {
        this.producto = producto;
    }

    public FacturaDto getFactura() {
        return factura;
    }

    public void setFactura(FacturaDto factura) {
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
