package Modulo1;

import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        
         // Capturar datos
         double   ladoUno,ladoDos,ladoTres;
         Scanner  miScanner;
         String[] entrada; 
         String   tipoTriangulo;

         miScanner = new Scanner(System.in); 
         
         System.out.println("Digite los tres lados del triangulo : ");
         entrada = miScanner.nextLine().split(" ");
        
         ladoUno  = Double.parseDouble(entrada[0]);
         ladoDos  = Double.parseDouble(entrada[1]);
         ladoTres = Double.parseDouble(entrada[2]);  
        
        // Ejercicio No 1
        // Dados los tres lados de un triángulo, determine si el triángulo es equilátero, isósceles o  escaleno.
        // Triángulo equilatero:  Tiene todos los lados iguales.
        // Triángulo isósceles :  Tiene dos lados iguales y uno desigual.

        tipoTriangulo = identificarTipoTriangulo(ladoUno,ladoDos,ladoTres)

    }


    private static String identificarTipoTriangulo(double ladoUno,double ladoDos,double ladoTres) {
        String tipoTriangulo=" ";



        return tipoTriangulo;
    }


    
}
