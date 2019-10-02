/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;


import com.mycompany.entity.Clase;
import com.mycompany.entity.Estudiante;
import com.mycompany.interfaces.ClaseFacadeLocal;
import com.mycompany.interfaces.EstudianteFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hernan
 */
@ManagedBean

@ViewScoped
public class Index implements Serializable {
    
    @EJB()
    private EstudianteFacadeLocal estudianteFacade;
    
    
    private Estudiante estudiantes;
    
    
    private Clase clases;
    
    
    @EJB
    private ClaseFacadeLocal claseFacade;
    
    public void crearEstudiante(){
        estudiantes = new Estudiante("Camilin", 1070);
        estudianteFacade.create(estudiantes);
        
    }
    
    public void crearClase(){
        clases = new Clase("linea", 6);
        claseFacade.create(clases);
    }
    
    public void crearEstudianteClase(){
        clases = claseFacade.find(1);
        estudiantes = estudianteFacade.find(1);    
        
        clases.getListaEstudiante().add(estudiantes);
        claseFacade.edit(clases);
        
   
    }
    
    public void mostrar(){
        List<Estudiante> lista = estudianteFacade.consultaEstudiante(1);
        
        for (Estudiante listaEstudiante : lista) {
            
            System.out.println("nombre: " + listaEstudiante.getNombre());
            
        }
    }
    
}
