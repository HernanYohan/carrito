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
public class FacturaDto implements Serializable {
    
    private int idFactura;
    private List<VentaDto> listaVentaFacturaDto;
    private UsuarioDto usuarioDto;
    private int total;

    public FacturaDto() {
    }

    public FacturaDto(List<VentaDto> listaVentaFacturaDto, UsuarioDto usuarioDto, int total) {
        this.listaVentaFacturaDto = listaVentaFacturaDto;
        this.usuarioDto = usuarioDto;
        this.total = total;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public List<VentaDto> getListaVentaFacturaDto() {
        return listaVentaFacturaDto;
    }

    public void setListaVentaFacturaDto(List<VentaDto> listaVentaFacturaDto) {
        this.listaVentaFacturaDto = listaVentaFacturaDto;
    }

    public UsuarioDto getUsuarioDto() {
        return usuarioDto;
    }

    public void setUsuarioDto(UsuarioDto usuarioDto) {
        this.usuarioDto = usuarioDto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    

}
