package clases;

public class Empleado {

    private double valorHora;
    private double cantidadHora;

    public Empleado(double vHora, double cHora){ //Parámetros

        this.valorHora = vHora;
        this.cantidadHora = cHora;

    }
//Parámetros: Son las variables que hacen referencia al valor que recibirán
    //a través de una función, método, entre otras.
//Argumentos
    protected double getValorHora(){
        return this.valorHora;
    }

    protected double getCantidadHora(){
        return this.cantidadHora;
    }

}
