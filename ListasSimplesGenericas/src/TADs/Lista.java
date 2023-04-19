package TADs;

public class Lista<T extends Comparable<T>> implements ILista<T> {

    private NodoLista inicio;
    private NodoLista fin;

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
        return this.fin;
    }

    @Override
    public boolean esVacia() {
        return (this.getInicio() == null);
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
    public void mostrar() {
        if (this.esVacia()) {
            System.out.println("La lista está vacia");
            return;
        }
        NodoLista aux = this.getInicio();
        while (aux != null) {
            System.out.println(aux.getDato().toString());
            aux = aux.getSig();
        }
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
    public int largoR(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarFinal(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarFin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vaciar() {
        this.setInicio(null);
        this.setFin(null);
    }

    //PRE CONDICION --> La lista debe estar ordenada previamente
    @Override
    public void agregarOrd(NodoLista nodo) {
        
    }
    
    

    @Override
    public void borrarElemento(NodoLista nodo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int cantElementos() {
        return cantElementoREC(this.getInicio(), 0);
    }

    private int cantElementoREC(NodoLista indice, int cantidad) {
        if (this.esVacia()) {
            return 0;
        } else {
            cantidad++;
        }

        if (indice.getSig() == null) {
            return cantidad;
        }

        return cantElementoREC(indice.getSig(), cantidad);
    }

    //PRE CONDICION: El elemento debe existir en la lista sino retorna null
    @Override
    public NodoLista obtenerElemento(NodoLista nodo) {
        return obtenerElemento(nodo, this.getInicio());
    }

    private NodoLista obtenerElemento(NodoLista nodo, NodoLista indice) {
        if (nodo.getDato().compareTo(indice.getDato()) == 0) {
            return nodo;
        }

        // Es el ultimo de la lista
        if (indice.getSig() == null) {
            return null;
        }

        // Va a comparar con el siguiente
        return obtenerElemento(nodo, indice.getSig());
    }

    @Override
    public void mostrarREC(NodoLista indice) {
        if (indice.getSig() != null) {
            System.out.println(indice.getDato().toString());
            mostrarInversoREC(indice.getSig());
        }

    }

    @Override
    public void mostrarInversoREC(NodoLista indice) {
        if (indice.getSig() != null) {
            mostrarInversoREC(indice.getSig());
        }
        System.out.println(indice.getDato().toString());
    }

    @Override
    public boolean existeDatoREC(NodoLista nodo, T n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean pertenece(T x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrar(T x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int largo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void snoc(T x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void snocR(NodoLista indice, T x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean perteneceR(NodoLista nodo, T x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarR(NodoLista nodo, T x) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
