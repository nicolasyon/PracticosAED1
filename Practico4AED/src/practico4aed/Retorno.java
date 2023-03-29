package practico4aed;

public class Retorno {

    enum Resultado {
        OK, ERROR, NO_IMPLEMENTADA
    }

    int valorEntero;
    String valorString;
    boolean valorBooleano;

    Resultado resultado;

    //Constructor
    public Retorno(Resultado resultado) {
        this.resultado = resultado;
    }
}
