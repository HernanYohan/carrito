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
import javax.persistence.JoinTable;

import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table

public class Clase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clase",columnDefinition = "serial")
    
    private int idClase;
    
    @Column 
    private String nombre;
    
    @Column
    private int duracion; 
    
    
    @JoinTable(name = "estudiante_clase",
            joinColumns = @JoinColumn(name="id_clase",nullable=false),
            inverseJoinColumns = @JoinColumn(name="id_estudiante",nullable=false)
            
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Estudiante> listaEstudiante;

    public Clase() {
    }

    public Clase(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;

    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }
    
    
 
    
}
