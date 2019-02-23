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
public class Circulo extends PrincipalFigurasGeometricas {
    
    /**
     *
     * @param longitud
     */
    public  Circulo(int longitud){
        
        super(longitud);
    }

    @Override
    public void hallarArea() {
        this.area = Math.PI*Math.pow(this.getLongitud(),2);
    }

    @Override
    public void hallarPerimetro() {
        this.perimetro = 2*Math.PI*this.getLongitud();
    }
    
    
    
}
