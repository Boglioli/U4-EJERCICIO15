public class MonoPlazaF1 extends VehiculoCarrera{
    public MonoPlazaF1(double velocidadActual) {
        this(velocidadActual, 50);
    }

    public MonoPlazaF1(double velocidadActual, double combustible) {
        super(velocidadActual, combustible);
    }

    @Override
    public void acelerar(int segundos) {
        velocidadActual += segundos * 19;
        combustible -= segundos * 1;
    }

    @Override
    public String obtenerDesempeno() {
        return "monoplaza f1 - velocidad: " + velocidadActual + " km/h - combustible: " + combustible;
    }
}
