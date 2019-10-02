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
public class UsuarioDto implements Serializable  {
        
    private int idUsuario;
    private String nombre;
    private String clave;
    private List<FacturaDto> listafactura;

    public UsuarioDto() {
    }

    public UsuarioDto(String nombre, String clave, List<FacturaDto> listafactura) {
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

    public List<FacturaDto> getListafactura() {
        return listafactura;
    }

    public void setListafactura(List<FacturaDto> listafactura) {
        this.listafactura = listafactura;
    }
}
