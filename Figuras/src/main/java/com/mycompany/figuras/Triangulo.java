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
public class Triangulo extends PrincipalTrianguloRectangulo {
    
    private int ladoA, ladoB, ladoC;
    /**
     *
     * @param base
     * @param altura
     */
    public Triangulo(int base, int altura){
        super (base);
        this.altura = altura;
        
    }

    /**
     *
     * @param base
     * @param altura
     * @param ladoA
     */
    public Triangulo(int base, int altura, int ladoA){
        super (base);
        this.altura = altura;
        this.ladoA = ladoA;
        
    }
    public Triangulo(int base, int altura, int ladoA, int ladoB){
        super (base);
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        
    }
    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC){
        super (base);
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
    }
    
    @Override
    public void hallarArea() {
        this.area = ((this.getBase()*this.getAltura())/2);
    }
    /*Hallar perimetro triangulo Equilatero*/
    @Override
    public void hallarPerimetro() {
        this.perimetro = this.ladoA*3;
    }
    /*Hallar perimetro triangulo Isosceles*/
    
    public void hallarPerimetroIsosceles() {
        this.perimetro = 2*(this.ladoA+this.ladoB);
    }
    /*Hallar perimetro triangulo Escaleno*/
    
    public void hallarPerimetroEscaleno() {
        this.perimetro = this.ladoA+this.ladoB+this.ladoC;
    }
}
