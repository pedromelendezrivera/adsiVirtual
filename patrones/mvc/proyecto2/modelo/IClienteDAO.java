package modelo;

import java.util.List;

/**
 *
 * @author PMELENDEZ
 */
public interface IClienteDAO {
	//declaración de métodos para acceder a la base de datos
	public List<ClienteVO> obtenerClientes();
	public ClienteVO obtenerCliente(int id);
	public void actualizarCliente(ClienteVO cliente);
	public void eliminarCliente(ClienteVO cliente);
}
