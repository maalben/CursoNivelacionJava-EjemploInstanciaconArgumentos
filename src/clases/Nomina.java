package clases;

public class Nomina extends Empleado {

    public Nomina(double vHora, double cHora) {
        super(vHora, cHora);
    }

    public double calcularSalario(){
        return (this.getCantidadHora() * this.getValorHora());
    }

}
