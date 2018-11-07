package clases;
import interfaces.Vehiculo;

import javax.swing.JOptionPane;

/**
 *  clase que establece el codigo del servicio de buses
 * @author chenao
 *
 */
public class Bus implements Vehiculo{
	
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
		int codigoBus=(int) (Math.random()*9999);
		return codigoBus;
	}

        @Override
	public void codigoDeVehiculo() {
		JOptionPane.showMessageDialog(null,"El Codigo del Bus es : "+getCodigo());
	}
	
	

	

}
