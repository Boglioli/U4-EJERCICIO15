import java.util.ArrayList;
public class Main {
    public static void probarVehiculos(ArrayList<VehiculoCarrera> vehiculos) {
        for (VehiculoCarrera vehiculo : vehiculos) {
            vehiculo.acelerar(5);
            System.out.println(vehiculo.obtenerDesempeno());
        }
    }
    public static void main(String[] args) {
        ArrayList<VehiculoCarrera> vehiculos = new ArrayList<>();
        vehiculos.add(new MonoPlazaF1(100));
        vehiculos.add(new AutoRally(100));
        vehiculos.add(new Motocicleta(100));
        probarVehiculos(vehiculos);
    }
}
