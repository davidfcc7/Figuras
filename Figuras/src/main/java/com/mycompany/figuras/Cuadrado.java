/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

/**
 *
 * @author David
 */
public class Cuadrado extends PrincipalFigurasGeometricas {
    
    public Cuadrado(int longitud){
        super (longitud);
    }

    @Override
    public void hallarArea() {
        this.area = this.getLongitud()*this.getLongitud();
    }

    @Override
    public void hallarPerimetro() {
        this.perimetro = 4*this.getLongitud();
    }
    
    
}
