package fabricas;

import interfaces.Vehiculo;
import interfaces.VehiculoDeTransporte;

/**
 * Clase que permite la creacion de un servicio 
 * @author chenao
 *
 */
public class FabricaDeVehiculos {
	
	public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory)
	{
		/**Aplicamos Polimorfismo*/
		Vehiculo objetoVehiculo= factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}

}
