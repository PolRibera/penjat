/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author polri
 */
public class Conversions {
     public static void main(String[] args) {
     int a = 2;
     double b = 3.0;
     float c = (float) (20000*a/b + 5);
         System.out.println("Valor en format float: "+c);
         System.out.println("Valor en format double: "+ (double)c);
         System.out.println("Valor en format byte: "+ (byte) c);
         System.out.println("Valor en format short: "+ (short) c);
         System.out.println("Valor en format int: "+ (int)c);
         System.out.println("Valor en format long: "+(long)c);
     
     }
}
