public class AutoRally extends VehiculoCarrera {
    public AutoRally(double velocidadActual) {
        this(velocidadActual, 50);
    }

    public AutoRally(double velocidadActual, double combustible) {
        super(velocidadActual, combustible);
    }

    @Override
    public void acelerar(int segundos) {
        velocidadActual += segundos * 15;
        combustible -= segundos * 2.5;
    }

    @Override
    public String obtenerDesempeno() {
        return "auto rally - velocidad: " + velocidadActual + " km/h - combustible: " + combustible;
    }
}

