package main;

import controlador.ClienteController;
import modelo.ClienteDAO;
import modelo.ClienteVO;
import vista.ClienteView;



/**
 *
 * @author PMELENDEZ
 */
public class DaoDemo {
    	public static void main(String[] args) {
   		// objeto vista, y modelo creado con el método estático 
	
                ClienteDAO clienteDAO = new ClienteDAO();
             
                ClienteView vista= new ClienteView();
//      		//se crea un objeto controlador y se le pasa el modelo y la vista
		ClienteController controlador= new ClienteController(clienteDAO, vista);
//                // imprimir los clientes
                controlador.getVista().imprimirDatosCliente(clienteDAO);
//		// obtner un cliente
                ClienteVO cliente = controlador.getModelo().obtenerCliente(0);
		cliente.setApellido("Melendez");
//		//actualizar cliente
		controlador.getModelo().actualizarCliente(cliente);
//                // imprimir los clientes
                controlador.getVista().imprimirDatosCliente(clienteDAO);
        }
}
