
package Entidades;

public class Cliente implements Comparable<Cliente>{
    private int numeroCliente;
    private String nombre;

    public Cliente(int numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int compareTo(Cliente o) {
           if (o.getNumeroCliente()==this.getNumeroCliente()) {
               return 0;
           }
           if (o.getNumeroCliente()<this.getNumeroCliente()) {
               return -1;              
           }
           else {
               return 1;
           }
    }
    
    public String toString(){
        return "El Cliente es:" +this.getNumeroCliente() +"-"+ this.getNombre();
    }


}
