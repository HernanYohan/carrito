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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    /**
     * mapeo de las tablas 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int idUsuario;
    @Column
    private String nombre;
    
    @Column
    private String clave;
    
    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL)
    private List<Factura> listafactura;

    public Usuario() {
    }

    public Usuario(String nombre, String clave, List<Factura> listafactura) {
        this.nombre = nombre;
        this.clave = clave;
        this.listafactura = listafactura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public List<Factura> getListafactura() {
        return listafactura;
    }

    public void setListafactura(List<Factura> listafactura) {
        this.listafactura = listafactura;
    }
    
    

}
