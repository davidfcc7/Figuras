/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ivan Calderon, David Caicedo
 */
public class Main {
    /*Linea para leer teclas*/
    public static BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public static void main(String [] args)throws IOException{
    
        /*Menu principal*/
        Menu();
        
    }
    /*Metodo que me imprime el menu y me lee opcion que el usuario digite*/
    public static void Menu()throws IOException{
        /*Variables para capturar los datos*/
        String opcionMenu;
        String longitud, longituda, longitudb;
        String altura, base, ladoA, ladoB, ladoC;
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                Figuras                  |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                         |");
            System.out.println("|   1. Cuadrado                           |");
            System.out.println("|   2. Rectangulo                         |");
            System.out.println("|   3. Circulo                            |");
            System.out.println("|   4. Triangulo equilatero               |");
            System.out.println("|   5. Triangulo isosceles                |");
            System.out.println("|   6. Triangulo escaleno                 |");
            System.out.println("|   0. Salir.                             |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - +");
            
            opcionMenu=entradaDatos.readLine();//Lee la opcion que digite el usuario
            
            switch(opcionMenu){
                case "1":
                    System.out.println("Digite la longitud del cuadrado: ");
                    longitud = entradaDatos.readLine();
                    Cuadrado cuadro;
                    cuadro = new Cuadrado(Integer.parseInt(longitud));
                    cuadro.hallarArea();
                    cuadro.hallarPerimetro();
                    cuadro.resultado();
                    entradaDatos.read();
                    break;
                case "2":
                    System.out.println("Digite la base del rectangulo: ");
                    base = entradaDatos.readLine();
                    System.out.println("Digite la altura del rectangulo: ");
                    altura = entradaDatos.readLine();
                    Rectangulo rectangulo;
                    rectangulo = new Rectangulo(Integer.parseInt(base),Integer.parseInt(altura));
                    rectangulo.hallarArea();
                    rectangulo.hallarPerimetro();
                    rectangulo.resultado();
                    entradaDatos.read();
                    break;
                case "3":
                    System.out.println("Circulo");
                    System.out.println("Digite radio del circulo: ");
                    longitud = entradaDatos.readLine();
                    Circulo circulo;
                    circulo = new Circulo(Integer.parseInt(longitud));
                    circulo.hallarArea();
                    circulo.hallarPerimetro();
                    circulo.resultado();
                    entradaDatos.read();
                    break;
                case "4":
                    System.out.println("Triangulo equilatero");
                    System.out.println("Digite la base del triangulo equilatero: ");
                    base = entradaDatos.readLine();
                    System.out.println("Digite la altura del triangulo equilatero: ");
                    altura = entradaDatos.readLine();
                    System.out.println("Digite el lado (A) del triangulo equilatero: ");
                    ladoA = entradaDatos.readLine();
                    Triangulo triangulo;
                    triangulo = new Triangulo(Integer.parseInt(base),Integer.parseInt(altura), Integer.parseInt(ladoA));
                    triangulo.hallarArea();
                    triangulo.hallarPerimetro();
                    triangulo.resultado();
                    entradaDatos.read();
                    break;
                case "5":
                    System.out.println("Tirangulo isosceles");
                    System.out.println("Digite longitud del lado a: ");
                    ladoA = entradaDatos.readLine();
                    System.out.println("Digite logitud del lado b: ");
                    ladoB = entradaDatos.readLine();
                    System.out.println("Digite altura triangulo: ");
                    altura = entradaDatos.readLine();
                    System.out.println("Digite base triangulo: ");
                    base = entradaDatos.readLine();        
                    triangulo = new Triangulo(Integer.parseInt(ladoA),Integer.parseInt(ladoB),Integer.parseInt(base), Integer.parseInt(altura));
                    triangulo.hallarArea();
                    triangulo.hallarPerimetroIsosceles();
                    triangulo.resultado();
                    entradaDatos.read();
                    break;
                case "6":
                    System.out.println("Tirangulo escaleno");
                    System.out.println("Digite lado a del triangulo: ");
                    ladoA = entradaDatos.readLine();
                    System.out.println("Digite lado b del triangulo: ");
                    ladoB = entradaDatos.readLine();
                    System.out.println("Digite lado c del triangulo: ");
                    ladoC = entradaDatos.readLine();
                    System.out.println("Digite altura triangulo: ");
                    altura = entradaDatos.readLine();
                    System.out.println("Digite base triangulo: ");
                    base = entradaDatos.readLine();
                    triangulo = new Triangulo(Integer.parseInt(ladoA),Integer.parseInt(ladoB),Integer.parseInt(ladoC),Integer.parseInt(altura), Integer.parseInt(base));
                    triangulo.hallarArea();
                    triangulo.hallarPerimetroEscaleno();
                    triangulo.resultado();
                    entradaDatos.read();
                    break;                    
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(!"0".equals(opcionMenu));
    }
    
}

