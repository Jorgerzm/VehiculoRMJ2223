
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoRuizMejiasJorge2223 miVehiculoRuizMejiasJorge2223;
        int stockActual;
        
        miVehiculoRuizMejiasJorge2223 = new VehiculoRuizMejiasJorge2223("Seat",18000,100);
        operativaVehiculosRuizMejiasJorge2223(miVehiculoRuizMejiasJorge2223, 50); 
        stockActual = miVehiculoRuizMejiasJorge2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosRuizMejiasJorge2223(VehiculoRuizMejiasJorge2223 miVehiculoRuizMejiasJorge2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoRuizMejiasJorge2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoRuizMejiasJorge2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
