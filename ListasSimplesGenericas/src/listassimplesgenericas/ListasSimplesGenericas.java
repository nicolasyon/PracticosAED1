package listassimplesgenericas;

import Entidades.Cliente;
import TADs.Lista;
import TADs.NodoLista;

public class ListasSimplesGenericas {

    public static void main(String[] args) {

        /*Lista l = new Lista();
        l.agregarInicio(new NodoLista("pepe"));
        l.agregarInicio(new NodoLista("juan"));
        l.agregarInicio(new NodoLista("jose"));
        NodoLista nodo = l.obtenerElemento(new NodoLista("juan"));
        l.mostrar();*/
        Lista<Cliente> listaClientes = new Lista();
        listaClientes.agregarInicio(new NodoLista(new Cliente(1, "Cliente 1")));
        listaClientes.agregarInicio(new NodoLista(new Cliente(2, "Cliente 2")));
        listaClientes.agregarInicio(new NodoLista(new Cliente(3, "Cliente 3")));
        //System.out.println("Nodo encontrado --> " + listaClientes.obtenerElemento(new NodoLista(new Cliente(2, "Cliente 2"))));
        listaClientes.mostrarREC(listaClientes.getInicio());
        //listaClientes.mostrarInversoREC(listaClientes.getInicio());
        System.out.println("Cantidad de elementos --> " + listaClientes.cantElementos());
    }

}
