package vista;

import modelo.ClienteDAO;

/**
 *
 * @author PMELENDEZ
 */
public class ClienteView {
	public void imprimirDatosCliente(int id,String nombre, String apellido) {
		System.out.println("**** DATOS CLIENTE ****");
		System.out.println("Id: "+id);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
	}

    public void imprimirDatosCliente(ClienteDAO modelo) {
          // imprimir los clientes
		System.out.println("*****");
		modelo.obtenerClientes().forEach(System.out::println);
    }
}
