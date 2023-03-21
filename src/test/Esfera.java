/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author polri
 */
public class Esfera {
    public static void main(String[] args) {
     double radi = 1;
     final double pi = 3.141;
        double superficie = (4*pi)*(radi*radi);
        double volum = (4*pi/3)*(radi*radi*radi);
          System.out.println("Dimensions de l'esfera: ");
          System.out.println("El radi es: "+radi+" cm");
          System.out.println("La superficie es: "+superficie+" cm2");
          System.out.println("El volum es: "+volum+" cm3");
    }
}
