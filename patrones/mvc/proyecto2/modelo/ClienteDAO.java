package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PMELENDEZ
 */
public class ClienteDAO implements IClienteDAO{

    //lista de tipo cliente
    List<ClienteVO> clientes;
    
    	//inicializar los objetos cliente y añadirlos a la lista
	public ClienteDAO() {
	       clientes = new ArrayList<>();
               ClienteVO cliente1 = new ClienteVO(0,"Javier", "Molina");
               ClienteVO cliente2 = new ClienteVO(1,"Lillian","Álvarez");
               clientes.add(cliente1);
               clientes.add(cliente2);
	}

    @Override
    public List<ClienteVO> obtenerClientes() {
            return clientes;
    }

    @Override
    public ClienteVO obtenerCliente(int id) {
             ClienteVO cliente;
             cliente = clientes.get(id);
             return cliente;
    }

    @Override
    public void actualizarCliente(ClienteVO cliente) {
         	clientes.get(cliente.getId()).setNombre(cliente.getNombre());
	        clientes.get(cliente.getId()).setApellido(cliente.getApellido()); 
   	        System.out.println("Cliente con id: "+cliente.getId()+" actualizado satisfactoriamente");
    }

    @Override
    public void eliminarCliente(ClienteVO cliente) {
         clientes.remove(cliente.getId());
	System.out.println("Cliente con id: "+cliente.getId()+" elimnado satisfactoriamente");    }  
}
