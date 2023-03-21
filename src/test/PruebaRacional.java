/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;
import java.util.Scanner;

/**
 *
 * @author polri
 */
public class PruebaRacional {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
          Racional a = new Racional();
          a.set(2,3);
          Racional b = new Racional();
          b.set(4,7);
          a.sumar(b);
          System.out.println(a);
    }
}
