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
public class Rectangulo extends PrincipalTrianguloRectangulo {
    
    /**
     *
     * @param base
     * @param altura
     */
    public Rectangulo(int base, int altura){
        super (base);
        this.altura = altura;
    }

    @Override
    public void hallarArea() {
        this.area = this.getBase()*this.getAltura();
    }

    @Override
    public void hallarPerimetro() {
        this.perimetro = 2 * (this.getBase()+this.getAltura()); 
    }

    
        
}
