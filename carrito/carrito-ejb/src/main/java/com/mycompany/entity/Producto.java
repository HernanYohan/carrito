/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idProducto;
    
    @Column 
    private String nombre;
    
    @OneToMany(mappedBy = "producto",cascade = CascadeType.ALL)
    private List<Venta> ListaVentaProdcuto;
    
    @Column
    private int cantidad;  
    
    @Column
    private int precio;
    
    @Column
    private String foto;

    public Producto() {
    }

    
    
    public Producto(String nombre, List<Venta> ListaVentaProdcuto, int cantidad, int precio, String foto) {
        this.nombre = nombre;
        this.ListaVentaProdcuto = ListaVentaProdcuto;
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

    public List<Venta> getListaVentaProdcuto() {
        return ListaVentaProdcuto;
    }

    public void setListaVentaProdcuto(List<Venta> ListaVentaProdcuto) {
        this.ListaVentaProdcuto = ListaVentaProdcuto;
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
