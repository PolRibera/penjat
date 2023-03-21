/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;

/**
 *
 * @author polri
 */
public class Racional {
    private int numerador;
    private int denominador;
    public void set(int numerador, int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public void imprimir() {
        System.out.println(this.numerador+" / "+this.denominador);
    }
    @Override
    public String toString(){   
        return numerador+" / "+denominador;
    }
    
    private void simplificar(){
        int mcd;
        int m = numerador;
        int n = denominador;
        if (m!=0&&n!=0) {
            int residu=m%n;
            while(residu!=0){
                m=n;
                n=residu;
                residu=m&n;
            }
            mcd=n;
        } else {
            mcd=(n==0)?m:n;
            numerador/=mcd;
            denominador/=mcd;
        }
    }
    
    public void sumar(Racional B){
        numerador=(this.numerador*B.denominador)+(this.denominador*B.numerador);
        denominador*=B.denominador;
        simplificar();
    }
    
    public void producto(Racional B){
        numerador*=B.numerador;
        denominador*=B.denominador;
    }
    
}
