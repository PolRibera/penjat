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
public class Cotxe {
    public static Scanner sc = new Scanner(System.in);
    private String marca;
        void setMarca(String N){
            marca=N;
        }
        String getMarca(){
            return marca;
        }
     
    private Color color;
        void setColor(Color color){
            this.color= color;
        }
        Color getColor(){
            return color;
        }
    private int potencia;
        void setPotencia(int N){
             this.potencia=N;
         }
         int getPotencia(){
             return potencia;
         }
    private int velMaxima;
        void setVelMaxima(int N){
            this.velMaxima=N;
        }
        int getVelMaxima(){
            return velMaxima;
        }
    private int diposit;
        void setDiposit(int N){
            this.diposit=N;
        }
        int getDiposit(){
            return diposit;
        }
    private String matricula;
        void setMatricula(String N){
             this.matricula=N;
        }
        String getMatricula(){
             return matricula;
        }
    private int VelocitatActual;
    
    private Persona conductor;

    public int getVelocitatActual() {
        return VelocitatActual;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }
    
    public boolean arrencarMotor(){
        boolean resposta = true;
        System.out.println("Vols arrencar el motor?");
        String N = sc.nextLine();
        if (N.toLowerCase().equals("si")) {
            resposta=true;
            System.out.println("Has arrencat el motor!");
        } else {
            resposta=false;
            System.out.println("No has arrencat el motor!");
        }
        return resposta;
    }
    public boolean aturarMotor() {
        boolean resposta = true;
            System.out.println("Vols aturar el motor?");
           String N = sc.nextLine();
        if (N.toLowerCase().equals("si")) {
            resposta=true;
            System.out.println("Has aturat el motor!");
        } else {
            resposta=false;
            System.out.println("No has aturat el motor!");
        }


        return resposta;
    }
    public void accelerar() {
            VelocitatActual+=5;
            System.out.println("La velocitat actual del cotxe "+getMatricula()+" es de "+VelocitatActual+" km/h");

        
    }
    public void frenar() {
            VelocitatActual-=5;
            System.out.println("La velocitat actual del cotxe "+getMatricula()+" es de "+VelocitatActual+" km/h");
    }
        
}

