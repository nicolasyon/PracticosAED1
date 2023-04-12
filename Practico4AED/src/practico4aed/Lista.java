/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practico4aed;

public class Lista implements ILista {

    private NodoLista inicio;
    private NodoLista fin;

    //Constructor
    public void Lista() {
        this.inicio = null;
        this.fin = null;
    }

    @Override
    public void setInicio(NodoLista i) {
        this.inicio = i;
    }

    @Override
    public NodoLista getInicio() {
        return this.inicio;
    }

    @Override
    public void setFin(NodoLista f) {
        this.fin = f;
    }

    @Override
    public NodoLista getFin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean esVacia() {
        return this.inicio == null;
    }

    @Override
    public void agregarInicio(NodoLista nodo) {
        if (this.esVacia()) {
            this.setInicio(nodo);
            this.setFin(nodo);
        } else {
            nodo.setSig(this.getInicio());
            this.setInicio(nodo);
        }
    }

    @Override
    public void agregarFinal(NodoLista nodo) {
        if (this.esVacia()) {
            this.agregarInicio(nodo);
        } else {
            NodoLista aux = this.getInicio();
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nodo);
        }
    }

    @Override
    public void borrarInicio() {
        if (!this.esVacia()) {
            this.setInicio(this.getInicio().getSig());
        }
    }

    @Override
    public void borrarFin() {
        if (!this.esVacia()) {
            NodoLista aux = this.getInicio();
            if (aux.getSig() != null) {
                while (aux.getSig().getSig() != null) {
                    aux = aux.getSig();
                }

                aux.setSig(null);
            } else {
                this.vaciar();
            }
        }
    }

    @Override
    public void vaciar() {
        this.setInicio(null);
    }

    @Override
    public void mostrar() {
        if (this.esVacia()) {
            System.out.println("La lista es vacia");
        } else {
            NodoLista aux = this.getInicio();
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.getSig();
            }
        }
    }

    // PRECONDICION: La lista tiene que estar ordenada
    @Override
    public void agregarOrd(NodoLista nodo) {
        if (this.esVacia()) {
            // Si esta vacio se agrega al inicio
            this.agregarInicio(nodo);
        } else {
            //Si es menor al primer elemento se agrega al inicio
            if (this.getInicio().getDato() >= nodo.getDato()) {
                this.agregarInicio(nodo);
            } else {
                // Recorro la lista
                NodoLista aux = this.getInicio();
                while (aux != null && aux.getSig() != null && aux.getSig().getDato() < nodo.getDato()) {
                    aux = aux.getSig();
                }

                if (aux != null && aux.getSig() != null) {
                    // Inserto el nodo en medio de los otros dos nodos
                    nodo.setSig(aux.getSig());
                    aux.setSig(nodo);
                } else {
                    // Inserto el nodo al final de la lista
                    aux.setSig(nodo);
                }
            }
        }

    }

    @Override
    public void borrarElemento(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        if (this.esVacia()) {
            return 0;
        } else {
            int cantidad = 1;
            NodoLista aux = this.getInicio();
            while (aux.getSig() != null) {
                aux = aux.getSig();
                cantidad++;
            }

            return cantidad;
        }
    }

    @Override
    public NodoLista obtenerElemento(NodoLista nodo) {
        if (this.esVacia()) {
            return null;
        } else {
            NodoLista aux = this.getInicio();
            while (aux != null) {
                if (aux.getDato() == nodo.getDato()) {
                    return aux;
                }

                aux = aux.getSig();
            }
            return null;
        }

    }

    @Override
    public void mostrarRECLista(Lista lista) {
        mostrarRECLista(lista, lista.getInicio());
    }

    private void mostrarRECLista(Lista lista, NodoLista indice) {
        if (indice != null) {
            System.out.println(indice.getDato());
            mostrarRECLista(lista, indice.getSig());
        }
    }

    @Override
    public void mostrarREC(NodoLista desde) {
        if (desde != null) {
            System.out.println(desde.getDato());
            mostrarREC(desde.getSig());
        }
    }

    @Override
    public void mostrarInversoREC(NodoLista nodo) {
        if (nodo != null) {
            mostrarInversoREC(nodo.getSig());
            System.out.println(nodo.getDato());
        }
    }

    @Override
    public boolean existeDatoREC(NodoLista nodo, int n) {
        if (nodo != null) {
            if (nodo.getDato() == n) {
                return true;
            }
            return existeDatoREC(nodo.getSig(), n);
        }
        return false;
    }

    @Override
    public boolean pertenece(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrar(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int largo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void snoc(int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void snocR(NodoLista indice, int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Lista invertir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean estaOrdenada() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean perteneceR(NodoLista nodo, int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int largoR(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarR(NodoLista nodo, int x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
