package controlador;

import modelo.ClienteDAO;
import vista.ClienteView;

/**
 *
 * @author PMELENDEZ
 */
public class ClienteController {
	//objetos vista y modelo
	private ClienteView vista;
	private ClienteDAO modelo;

    public ClienteView getVista() {
        return vista;
    }

    public ClienteDAO getModelo() {
        return modelo;
    }
        
        

	//constructor para inicializar el modelo y la vista
	public ClienteController(ClienteDAO modelo, ClienteView vista) {
		this.modelo = modelo;
		this.vista = vista;
	}
        
        
        //pasa el modelo a la vista para presentar los datos
	public void actualizarVista() {
		vista.imprimirDatosCliente(modelo);
	}
        
  
}
