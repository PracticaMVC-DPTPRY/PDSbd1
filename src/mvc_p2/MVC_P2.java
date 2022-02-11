
package mvc_p2;

import Controlador.ControladorMDB;
import Vista.FrmVista;
import pkgModelo.MDB;

/**
 *
 * @author Daniel Xithe
 */
public class MVC_P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MDB objModelo=new MDB();

        FrmVista objVista=new FrmVista();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
    }
    
}
