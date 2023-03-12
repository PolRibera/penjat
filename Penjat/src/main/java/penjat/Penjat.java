/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package penjat;
import java.io.IOException;
import java.util.Scanner;

public class Penjat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Estat del penjat inicial.
        final char[][] estatPenjatInicial =
      {
            {' ',' ',' ',' ','_','_','_','_',' ',' ',' ',' '},                                      
            {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
            {' ','_','_','|','_',' ',' ',' ',' ',' ',' ',' '},                                      
            {'|',' ',' ',' ',' ','|','_','_','_','_','_',' '},
            {'|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
            {'|','_','_','_','_','_','_','_','_','_','_','|'}
        };
        
        final String[] paraules = {"patata", "armari", "abric","bicicleta","bandera","casa","castanyes",
        "dreta","dibuix","esquerra","esquimal","flor","flamisell","groc","gran","helicopter","hipocrita",
        "imbecil","index","julivert","llimonada","portatil","xilofon","zebra"};
        String paraula = paraules[(int)(Math.random () * paraules.length)];
        
  
        int Encerts = 0, Errors = 0;
        boolean[] lletresEncertades = new boolean[paraula.length()];
        
        String lletres = "";
        char[][] estatPenjat = new char[estatPenjatInicial.length][estatPenjatInicial[0].length];
        inicialitzarEstatPenjat(estatPenjatInicial, estatPenjat);
        
        do {
            mostrarEstatPenjat(estatPenjat);
            mostrarParaula(paraula, lletresEncertades);
            char lletra = demanarLletra(lletres);
            
            if (comprovaEncerts(paraula, lletra, lletresEncertades)) {
                Encerts += comptaEncerts(paraula, lletra);
            } else {
                Errors++;
                actualitzarEstatPenjat(estatPenjat, Errors);
            }
            
            lletres += lletra;
            System.out.println("Lletres: " + lletres);

        } while (Encerts < paraula.length() && Errors <= 7);
        
 
        mostrarEstatPenjat(estatPenjat);
        mostrarParaula(paraula, lletresEncertades);
        System.out.println("Lletres: " + lletres);
        if (Errors >= 7) {
            System.out.println("Has perdut!! La paraula era " + paraula);
        } else {
            System.out.println("L'has encertat!");
        }
    }
    
    static void mostrarEstatPenjat(char[][] estat) {
        for (char[] fila : estat) {
            for (char valor : fila) {
                System.out.print(valor);
            }
            
            System.out.println("");
        }
    }
    
    static void inicialitzarEstatPenjat(char[][] estatPenjatInicial, char[][] estat) {
        for (int fila = 0; fila < estatPenjatInicial.length; fila++) {
            for (int columna = 0; columna < estatPenjatInicial[0].length; columna++) {
                estat[fila][columna] = estatPenjatInicial[fila][columna];
            }
        }
    }
    
    static void mostrarParaula(String paraula, boolean[] encertades) {
        System.out.print("Paraula: ");
        for (int i = 0; i < paraula.length(); i++) {
            if (encertades[i]) {
                System.out.print(paraula.charAt(i));
            } else {
                System.out.print("*");
            }
        }
        
        System.out.println("");
    }
    
    static boolean comprovaEncerts(String paraula, char lletra, boolean[] encerts) {
        boolean resultat = false;
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == lletra) {
                encerts[i] = true;
                resultat = true;
            }
        }
        
        return resultat;
    }
    

    static int comptaEncerts(String paraula, char lletra) {
        int encerts = 0;
        for (int i = 0; i < paraula.length(); i++) {
            if (paraula.charAt(i) == lletra) {
                encerts++;
            }
        }
        
        return encerts;
    }
    

    static char demanarLletra(String lletres) {
        char lletra;
        do {
            System.out.print("Introdueix lletra: ");
            lletra = sc.nextLine().toLowerCase().charAt(0);
        } while (!esLletraValida(lletra, lletres));
        
        return lletra;
    }
    

    static boolean existeixLletra(char lletra, String lletres) {
        for (int i = 0; i < lletres.length(); i++) {
            if (lletres.charAt(i) == lletra) {
                return true;
            }
        }
        
        return false;
    }
    

    static boolean esLletraValida(char lletra, String lletres) {
        
        
        return true;
    }
    

    static void actualitzarEstatPenjat(char[][] penjat, int errors) {
       
    }
    

}