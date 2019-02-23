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
public abstract class PrincipalFigurasGeometricas {
    
    protected double area;
    protected double perimetro;
    
    int longitud;
    
    /**
     *
     * @param longitud
     */
    public PrincipalFigurasGeometricas(int longitud){
    this.longitud = longitud;
    }
    
    /**
     *Hallar area
     */
    public abstract void hallarArea();

    /**
     *Hallar perimetro
     */
    public abstract void hallarPerimetro();
    /**
     *
     * @return
     */
    public double getArea(){
        return area;
        
    }
    
    /**
     *
     * @return
     */
    public double getPerimetro(){
        return perimetro;
        
    }
    
    /**
     *
     * @return
     */
    public double getLongitud(){
        return longitud;
    }

    /**
     *Hallar resultado
     */
    public void resultado(){
        System.out.println("El area de la figura es...: /n"+this.getArea());
        System.out.println("El perimetro de la figura es...:"+this.getPerimetro());
    }
    
    
    
    
    
    
}
