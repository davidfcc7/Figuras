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

public abstract class PrincipalTrianguloRectangulo {
    
    protected double area;
    protected double perimetro;
    protected int base;
    protected int altura;
    
   
    
    /**
     *
     * @param longitudAreaBase
     * 
     */
    public PrincipalTrianguloRectangulo(int longitudAreaBase){
    
    
    }
    
    /**
     *Hallar base
     */
    public abstract void hallarArea();

    /**
     *Hallar altura
     */
    public abstract void hallarPerimetro();
    
    /**
     *
     * @return
     */
    public double getBase(){
        return base;        
    }

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
    public double getAltura(){
        return altura;
    }

    /**
     *
     * @return
     */
    
    /**
     *Hallar resultado
     */
    public void resultado(){
        
        System.out.println("El area de la figura es...: /n"+this.getArea());
        System.out.println("La altura de la figura es...: "+this.getPerimetro());
    }
}
