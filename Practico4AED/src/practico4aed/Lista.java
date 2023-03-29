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

    @Override
    public void agregarOrd(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarREC(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarInversoREC(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeDatoREC(NodoLista nodo, int n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
