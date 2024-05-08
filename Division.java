// Subclase para dividir
public class Division extends Operaciones {
    public Division(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base
    }

    // Método que realiza la división
    public double hacerOperacion() {
        return super.getA() / super.getB();
    }
}