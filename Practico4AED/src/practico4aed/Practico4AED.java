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
        lista.agregarInicio(new NodoLista(5));
        lista.agregarInicio(new NodoLista(25));
        lista.agregarInicio(new NodoLista(98));
        //lista.agregarFinal(new NodoLista(1000));
        lista.agregarOrd(new NodoLista(77));

        //System.out.println("cantidad de elementos --> " + lista.cantElementos());
        //lista.borrarInicio();
        //lista.borrarFin();
        
        /*NodoLista puntero = lista.obtenerElemento(new NodoLista(1000));
        if (puntero != null) {
            System.out.println(puntero.getDato());            
        }
        else{
            System.out.println("No se encontro el elemento");            
        }*/

        //lista.mostrar();
        lista.mostrarREC(lista.getInicio());
        //lista.mostrarRECLista(lista);
        //lista.mostrarInversoREC(lista.getInicio()); 
        //System.out.println(lista.existeDatoREC(lista.getInicio(), 5));

    }

}
