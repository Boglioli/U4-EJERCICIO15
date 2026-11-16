public class Motocicleta extends VehiculoCarrera {
    public Motocicleta(double velocidadActual) {
        this(velocidadActual, 50);
    }

    public Motocicleta(double velocidadActual, double combustible) {
        super(velocidadActual, combustible);
    }

    @Override
    public void acelerar(int segundos) {
        velocidadActual += segundos * 12;
        combustible -= segundos * 4;
    }

    @Override
    public String obtenerDesempeno() {
        return "motocicleta - velocidad: " + velocidadActual + " km/h - combustible: " + combustible;
    }
}
