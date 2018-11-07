package clases;
import interfaces.Vehiculo;

import javax.swing.JOptionPane;

/**
 *  clase que establece el codigo del servicio de busetas
 * @author chenao
 *
 */
public class Buseta implements Vehiculo{
	
	private int codigo;
	
        public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
        
        @Override
	public int generarCodigo()
	{
		int codigoBuseta=(int) (Math.random()*9999);
		return codigoBuseta;
	}

	@Override
	public void codigoDeVehiculo() {
		JOptionPane.showMessageDialog(null,"El Codigo de la Buseta es : "+getCodigo());
	}

}

