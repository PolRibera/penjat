/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author polri
 */
public class Operadors {
    public static void main(String[] args) {
        int quantitat= 42;
        int delta =5;
        int residu = 0;
        String nom = "Pol";
        
        quantitat+=delta;
        System.out.println(quantitat);
        residu = quantitat % 2;
        System.out.println(residu);
        quantitat = quantitat % 5;
        System.out.println(quantitat);
        residu = quantitat--;
        System.out.println(residu);
        quantitat=delta++;
        System.out.println(quantitat);
        quantitat*=delta;
        System.out.println(quantitat);
        quantitat/=7;
        System.out.println(quantitat);
        System.out.println("Bona "+"tarda");
        System.out.println("Hola, em dic " +nom);
        System.out.println("La quantitat es: "+quantitat);
        
        
    }
}
