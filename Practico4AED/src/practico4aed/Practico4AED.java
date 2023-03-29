/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practico4aed;

/**
 *
 * @author alumnoFI
 */
public class Practico4AED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.agregarInicio(new NodoLista(1));
        lista.agregarInicio(new NodoLista(25));
        lista.agregarInicio(new NodoLista(5));
        lista.agregarInicio(new NodoLista(98));
        lista.agregarFinal(new NodoLista(1000));
        
        System.out.println("cantidad de elementos --> " + lista.cantElementos());
        //lista.borrarInicio();
        //lista.borrarFin();
        lista.mostrar();
        
        Prueba prueba = new Prueba();
        prueba.inicializarResultadosPrueba();
    }
    
}
