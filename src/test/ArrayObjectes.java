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
public class ArrayObjectes {
    public static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
            Cotxe cotxe1 = new Cotxe();
            cotxe1.setMarca("Renault");
            cotxe1.setColor(Color.BLAU);
            cotxe1.setPotencia(95);
            cotxe1.setVelMaxima(120);
            cotxe1.setDiposit(55);
            cotxe1.setMatricula("3465-GPT");
          if (cotxe1.arrencarMotor()) {
            cotxe1.accelerar();
            cotxe1.accelerar();
            cotxe1.accelerar();
            cotxe1.frenar();
            cotxe1.aturarMotor();
            
          }

    }
      
}
