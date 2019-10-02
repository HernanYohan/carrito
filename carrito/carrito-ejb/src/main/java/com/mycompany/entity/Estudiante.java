/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table
@NamedQueries({
    @NamedQuery(name = "consultaEstudiante", query = "SELECT e FROM estudiante e WHERE E.id_estudiante = :id")
})
public class Estudiante implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante",columnDefinition = "serial")
    private int idEstudiante;
 
    @Column
    private String nombre;
    
    @Column
    private int cedula;
    
    @ManyToMany (mappedBy="listaEstudiante")
    private List<Clase> listaClase;

    public Estudiante() {
    }

    public Estudiante(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
       
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public List<Clase> getListaClase() {
        return listaClase;
    }

    public void setListaClase(List<Clase> listaClase) {
        this.listaClase = listaClase;
    }

    


    
    
}
