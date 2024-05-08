// Subclase para multiplicar
public class Multiplicacion extends Operaciones {
    public Multiplicacion(double a, double b) {
        super(a, b); // Llamada al constructor de la clase base
    }

    // Método que realiza la multiplicación
    public double hacerOperacion() {
        return super.getA() * super.getB();
    }
}