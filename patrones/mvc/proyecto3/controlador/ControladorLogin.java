package controlador;

import javax.swing.JOptionPane;
import modelo.dao.UsuarioDao;
import modelo.vo.UsuarioVo;
import vista.VentanaLogin;
import vista.VentanaMenuPrincipal;

/**
 *
 * @author PMELENDEZ
 */
public class ControladorLogin {
       private VentanaLogin ventanaLogin = new VentanaLogin();

    public VentanaLogin getVentanaLogin() {
        return ventanaLogin;
    }

    public void setVentanaLogin(VentanaLogin ventanaLogin) {
        this.ventanaLogin = ventanaLogin;
    }
       
    public void validarUsuario(UsuarioVo usu) {
         System.out.println(usu.getUsuario()+" "+usu.getPassword());  
          UsuarioDao usuarioDao = new UsuarioDao();
          
           if (!usu.getUsuario().equals("") && !usu.getPassword().equals("")) {
           
              if(usuarioDao.buscarUsuario(usu)!= null){ //si usuario existe abre el menuprincipal
                 new VentanaMenuPrincipal().setVisible(true);
                 ventanaLogin.dispose(); //cierra la ventala login y avanza al menuprincipal
          }
               
           }else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
           }
   }
}
