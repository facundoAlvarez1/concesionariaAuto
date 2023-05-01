import models.Alquiler;
import models.Sucursal;
import models.TipoVehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Alquiler> alquiler = new ArrayList<>();

        Alquiler a = new Alquiler("DOSPUERTAS",500,2018,2012,2000,"Facundo","40478938",true,50,"2023-02-03","2023-02-05");
        Alquiler b =new Alquiler("CUATROPUERTAS",200,2022,120,2000,"Pedro","2345782",true,50,"2023-03-02","2023-03-05");
        Alquiler c =new Alquiler("CAMIONETA",400,2021,125,2000,"lucas","1344672",true,50,"2023-03-01","2023-03-04");
        Alquiler d =new Alquiler("CAMIONETA",400,2021,125,2000,"lucas","1344672",true,50,"2023-03-01","2023-03-04");
        Sucursal s = new Sucursal("Mar Del Plata","colon 2535","2236830509");
        alquiler.add(a);
        alquiler.add(b);
        alquiler.add(c);
        alquiler.add(d);


        System.out.println("Alquiler en Mar Del Plata : ");
        //Mostrar Alquileres de vehiculos
        for (Alquiler nuevo: alquiler) {
            System.out.println("================================================================");
            System.out.println(nuevo.toString()+ "\n");
            System.out.println(s.toString());
            System.out.println("================================================================");
        }
        //Mostrar Costo mayor de vehiculo
        Alquiler alquilerMayorCosto = alquiler.get(0);
            for (Alquiler nuevo: alquiler ) {
                if (nuevo.getCosto() > alquilerMayorCosto.getCosto()){
                    alquilerMayorCosto=nuevo;
                }
            }
        System.out.println("================================================================");
        System.out.println("Alquiler con costo mayor es :" + alquilerMayorCosto.toString() );
        System.out.println("================================================================");


        //Mostrar cantidad de alquileres por vehiculo
        Map<String, Integer> cantidadAlquileresPorTipoVehiculo = new HashMap<>();
        for (Alquiler nuevo: alquiler) {
            cantidadAlquileresPorTipoVehiculo.merge(nuevo.getModelo(), 1, Integer::sum);
        }
        System.out.println("Cantidad de alquileres por tipo de vehículo:");
        for (Map.Entry<String, Integer> entry : cantidadAlquileresPorTipoVehiculo.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}