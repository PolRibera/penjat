/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjat;

import java.util.Scanner;

/**
 *
 * @author polri
 */
public class penjat {
        public static void main(String[] args) {
        String[] llistaParaules = {"patata", "escola", "poma", "taula", "internet",
            "llapis", "pantalla", "altaveu", "ordinador", "ratolí"};
        String paraulaEndevinar;

        paraulaEndevinar = triaParaula(llistaParaules);
        System.out.println(paraulaEndevinar);
        if (jugar(paraulaEndevinar) == true) {
            System.out.println("Enhorabona!!! Has encertat la paraula " + paraulaEndevinar);
        } else {
            System.out.println("OOOOOoooohhhh! Has perdut!!\n\n"
                    + "La paraula secreta era: " + paraulaEndevinar);
        }
    }

    public static String triaParaula(String[] llista) {
        int index = (int) (Math.random() * (llista.length));
        return llista[index];
    }

   
    public static boolean jugar(String paraula) {
        String paraulaParcial = "", lletresDites = "", lletra;
        Scanner in = new Scanner(System.in);
        int posicion, encerts = 0, errors = 0;

        for (int i = 0; i < paraula.length(); i++) {
            paraulaParcial += "*";
        }

        for (int i = 0; i < 8 && encerts < paraula.length(); i++) {
            pintarForca(errors);
            System.out.printf("Paraula: %s%n", paraulaParcial);
            System.out.printf("Lletres: %s%n", lletresDites);
            System.out.print("Introdueix lletra: ");
            lletra = in.nextLine();
            if (paraula.contains(lletra)) {
                lletresDites += lletra;
                posicion = -1;
                do {
                    posicion = paraula.indexOf(lletra, posicion+1);
                    if (posicion >= 0) {
                        paraulaParcial = paraulaParcial.substring(0, posicion)
                                + lletra + paraulaParcial.substring(posicion + 1);
                        encerts++;
                    }
                } while (posicion != -1 && posicion < paraula.length()-1);
            }else{
                errors++;
            }
        }
        return (encerts == paraula.length());
    }

    public static void pintarForca(int nombreErrors){
        String[] forcaZero = {
            "   ____",
            "  |    ",
            "  |",
            "  |",
            "  |",
            "  |",
            " _|_",
            "|   |______",
            "|          |",
            "|__________|"
        };
        
        String[][] forcaErrors = {
                        {"","","","",""},
                        {"|","","","",""},
                        {"|","O","","",""},
                        {"|","O","|","",""},
                        {"|","O","/|","",""},
                        {"|","O","/|\\","",""},
                        {"|","O","/|\\","|",""},
                        {"|","O","/|\\","|","/"},
                        {"|","O","/|\\","|","\\"}
                      };                                   
        
        System.out.println(forcaZero[0]);
        
        for (int i = 1; i < 5; i++) {
            System.out.print(forcaZero[i]);
            System.out.println(forcaErrors[nombreErrors][i]);
        }
        
        for (int i = 5; i < forcaZero.length; i++) {
            System.out.println(forcaZero[i]);
        }
    }
    
}
