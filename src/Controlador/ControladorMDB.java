package Controlador;

//prueba
import pkgModelo.MDB;
import Vista.FrmVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorMDB implements ActionListener{
  private FrmVista _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    public ControladorMDB(FrmVista view, MDB model){
       this._model=model;
       this._view=view;
       this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
       this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
    //probar si funciona sin eso
//    public ControladorMDB(FrmUsuario objVista, MDB objModelo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
        leyenda=_model.registrarAlta("Tbusuarios"," null, ' " +_view.txtNombre.getText()+"','" +_view.txtUsuario.getText() +"',"+_view.txtpsw.getText());
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
        JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null);
_view.txtUsuario.setText(null);
_view.txtpsw.setText(null);
}
}
