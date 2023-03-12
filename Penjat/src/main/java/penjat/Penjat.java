/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package penjat;
import java.util.Scanner;

public class Penjat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final char[][] PenjatTauler =
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
        

        final String[] paraules = {"patata", "armari", "bicicleta", "advocat", "ascensor", "astronauta",
            "autopista",};
        String paraula = paraules[(int)(Math.random () * paraules.length)];
        
     
        int Encerts = 0, Errors = 0;

        
        String lletres = "";
        char[][] estatPenjat = new char[PenjatTauler.length][PenjatTauler[0].length];
        inicialitzarEstatPenjat(PenjatTauler, estatPenjat);
        
        
        System.out.println("Lletres: " + lletres);
        if (Errors >= 7) {
            System.out.println("OOOOOoooohhhh! Has perdut!!\nLa paraula secreta era " + paraula);
        } else {
            System.out.println("Felicitats! Has encertat la paraula secreta!!");
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
        char lletra='a';
        
        return lletra;
    }
    
    static boolean existeixLletra(char lletra, String lletres) {
       
        
        return false;
    }
    
    static boolean esLletraValida(char lletra, String lletres) {

        return false;
    }
    
    static void actualitzarEstatPenjat(char[][] penjat, int errors) {
        
    }
    
}