/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico4aed;

public class NodoLista{
    private int dato;
    private NodoLista sig;

    //Constructor
    public NodoLista(int n){
        this.dato=n;
        this.sig=null;
    }

    //Dato
    public void setDato(int d){
        this.dato=d;
    }
    public int getDato(){
        return this.dato;
    }

    //Siguiente
    public void setSig(NodoLista s){
        this.sig=s;
    }
    public NodoLista getSig(){
        return this.sig;
    }
}
