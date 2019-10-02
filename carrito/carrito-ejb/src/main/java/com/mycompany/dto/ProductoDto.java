/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Hernan
 */
public class ProductoDto implements Serializable{
    
    private int idProducto;
    private String nombre;
    private List<VentaDto> ListaVentaProdcutoDto;
    private int cantidad;  
    private int precio;
    private String foto;

    public ProductoDto() {
    }
    
    

    public ProductoDto(String nombre, List<VentaDto> ListaVentaProdcutoDto, int cantidad, int precio, String foto) {
        this.nombre = nombre;
        this.ListaVentaProdcutoDto = ListaVentaProdcutoDto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.foto = foto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VentaDto> getListaVentaProdcutoDto() {
        return ListaVentaProdcutoDto;
    }

    public void setListaVentaProdcutoDto(List<VentaDto> ListaVentaProdcutoDto) {
        this.ListaVentaProdcutoDto = ListaVentaProdcutoDto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}
