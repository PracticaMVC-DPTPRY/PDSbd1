package Controlador;
import pkgModelo.MDB;
import Vista.FrmCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorMDBTC implements ActionListener{
  private FrmCliente _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    public ControladorMDBTC(FrmCliente _view, MDB model){
       this._model=model;
       this._view=_view;
       this._view.cmdAlta.addActionListener(this);
       this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
    //probar si funciona sin eso
//    public ControladorMDB(FrmUsuario objVista, MDB objModelo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
@Override
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
        leyenda=_model.registrarAlta("clientes",_view.txtCedula.getText()+",'"+_view.txtLugar_Expedicion.getText()+"','"+_view.txtNombre_Completo.getText()+"','"+_view.txtProfesion.getText()+"','"+_view.txtDireccion_Residencial.getText()+"','"+_view.txtCiudad.getText()+"','"+_view.txtDepartamento.getText()+"','"+_view.txtEmail.getText()+"',"+_view.txtTel_Residencial.getText()+","+_view.txtTel_Trabajo.getText()+","+_view.txtNum_Factura.getText()+",'"+_view.txtFecha_Credito.getText()+"','"+_view.txtTipo_Cartera.getText()+"',"+_view.txtValor_Credito.getText()+","+_view.txtNum_Cuotas.getText());
        JOptionPane.showMessageDialog(null, leyenda);
        limpiar();
}
}

public void limpiar(){
_view.txtCedula.setText(null);
_view.txtLugar_Expedicion.setText(null);
_view.txtNombre_Completo.setText(null);
_view.txtProfesion.setText(null);
_view.txtDireccion_Residencial.setText(null);
_view.txtCiudad.setText(null);
_view.txtDepartamento.setText(null);
_view.txtEmail.setText(null);
_view.txtTel_Residencial.setText(null);
_view.txtTel_Trabajo.setText(null);
_view.txtNum_Factura.setText(null);
_view.txtFecha_Credito.setText(null);
_view.txtTipo_Cartera.setText(null);
_view.txtValor_Credito.setText(null);
_view.txtNum_Cuotas.setText(null);
}
}
