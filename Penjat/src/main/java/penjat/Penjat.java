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

public class Penjat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Estat del penjat inicial.
        final char[][] PenjatInici =
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
        boolean[] lletresCorrectes = new boolean[paraula.length()];
        
        String lletres = "";
        char[][] estatPenjat = new char[PenjatInici.length][PenjatInici[0].length];
        inicialitzarEstatPenjat(PenjatInici, estatPenjat);
        
        do {
            mostrarEstatPenjat(estatPenjat);
            mostrarParaula(paraula, lletresCorrectes);
            System.out.print("Introdueix lletra: ");
            char lletra = sc.nextLine().toLowerCase().charAt(0);
            
            if (comprovaEncerts(paraula, lletra, lletresCorrectes)) {
                Encerts += comptaEncerts(paraula, lletra);
            } else {
                Errors++;
                PrintErrors(estatPenjat, Errors);
            }
            
            lletres += lletra;
            System.out.println("Lletres: " + lletres);

        } while (Encerts < paraula.length() && Errors <= 7);
        
 
        mostrarEstatPenjat(estatPenjat);
        mostrarParaula(paraula, lletresCorrectes);
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
    
    static void PrintErrors(char[][] penjat, int errors) {
        switch (errors) {
            case 1:
                penjat[1][8] = '|';
                break;
            case 2:
                penjat[2][8] = 'O';
                break;
            case 3:
                penjat[3][8] = '|';
                break;
            case 4:
                penjat[3][7] = '/';
                break;
            case 5:
                penjat[3][9] = '\\';
                break;
            case 6:
                penjat[4][8] = '|';
                break;
            case 7:
                penjat[5][7] = '/';
                break;
            case 8:
                penjat[5][9] = '\\';
                break;
        }
    }
}