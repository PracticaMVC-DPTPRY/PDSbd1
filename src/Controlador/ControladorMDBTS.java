//Controlador para la tabla seguimiento 
package Controlador;
import Vista.FrmSeguimientoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkgModelo.MDB;

public class ControladorMDBTS implements ActionListener {
    private FrmSeguimientoCliente _view;
    private MDB _model;

    public ControladorMDBTS(FrmSeguimientoCliente _view, MDB _model) {
        this._view = _view;
        this._model = _model;
        this._view.cmdAlta.addActionListener(this);
       this._view.cmdEliminar.addActionListener(this);
    }
    @Override 
    public void actionPerformed(ActionEvent e){
        String leyenda="";
        if(e.getSource()==_view.cmdAlta){
            leyenda=_model.registrarAlta("seguimiento_clientes","null," +_view.txtCedula.getText()+",'" +_view.txtLugar_Expedicion.getText() +"','" +_view.txtNombre_Completo.getText() 
            +"','" +_view.txtProfesion.getText()+"','" +_view.txtDireccion_Residencial.getText()+"','" +_view.txtCiudad.getText()+"','" +_view.txtDepartamento.getText()
            +"','" +_view.txtEmail.getText()+"'," +_view.txtTel_Residencial.getText()+"," +_view.txtTel_Trabajo.getText()+"," +_view.txtNum_Factura.getText()+",'" +_view.txtTipo_Cartera.getText()
            +"','" +_view.txtFecha_Mora.getText()+"'," +_view.txtDias_Mora.getText()+"," +_view.txtVal_Mora.getText()+"," +_view.txtV_Seguro.getText()+"," +_view.txtInteres_Mora.getText()
            +"," +_view.txtSald_Restante.getText()+",'" +_view.txtTipo_Cobro.getText()+"','" +_view.txtFecha_Acuerdo_Uno.getText()+"','" +_view.txtAcuerdo_Uno.getText()
            +"','" +_view.txtFecha_Acuerdo_Dos.getText()+"','" +_view.txtAcuerdo_Dos.getText()+"','" +_view.txtFecha_Acuerdo_Tres.getText()+"','" +_view.txtAcuerdo_Tres.getText()
            +"','" +_view.txtFecha_Acuerdo_Cuatro.getText()+"','" +_view.txtAcuerdo_Cuatro.getText()+"'");
        JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
       }
    
    public void limpiar(){
       _view.txtCedula.setText(null);
       _view.txtLugar_Expedicion.setText(null);
       _view.txtNombre_Completo.setAction(null);
       _view.txtCiudad.setAction(null);
       _view.txtDepartamento.setAction(null);
       _view.txtDireccion_Residencial.setAction(null);
       _view.txtEmail.setAction(null);
       _view.txtFecha_Mora.setAction(null);
       _view.txtNum_Factura.setAction(null);
       _view.txtProfesion.setAction(null);
       _view.txtTel_Residencial.setAction(null);
       _view.txtTel_Trabajo.setAction(null);
       _view.txtTipo_Cartera.setAction(null);
       
       _view.txtDias_Mora.setAction(null);
       _view.txtVal_Mora.setAction(null);
       _view.txtV_Seguro.setAction(null);
       _view.txtInteres_Mora.setAction(null);
       _view.txtSald_Restante.setAction(null);
       _view.txtTipo_Cobro.setAction(null);
       _view.txtFecha_Acuerdo_Uno.setAction(null);
       _view.txtAcuerdo_Uno.setAction(null);
       _view.txtFecha_Acuerdo_Dos.setAction(null);
       _view.txtAcuerdo_Dos.setAction(null);
       _view.txtFecha_Acuerdo_Tres.setAction(null);
       _view.txtAcuerdo_Tres.setAction(null);
       _view.txtFecha_Acuerdo_Cuatro.setAction(null);
       _view.txtAcuerdo_Cuatro.setAction(null);
 
       _view.txtNombre_Completo.setText(null);
       _view.txtProfesion.setText(null);
       _view.txtDireccion_Residencial.setText(null);
       _view.txtCiudad.setText(null);
       _view.txtDepartamento.setText(null);
       _view.txtEmail.setText(null);
       _view.txtTel_Residencial.setText(null);
       _view.txtTel_Trabajo.setText(null);
       _view.txtNum_Factura.setText(null); 
       _view.txtTipo_Cartera.setText(null);
       _view.txtFecha_Mora.setText(null);
       _view.txtDias_Mora.setText(null);
       _view.txtVal_Mora.setText(null);
       _view.txtV_Seguro.setText(null);
       _view.txtInteres_Mora.setText(null);
       _view.txtSald_Restante.setText(null);
       _view.txtTipo_Cobro.setText(null);
       _view.txtFecha_Acuerdo_Uno.setText(null);
       _view.txtAcuerdo_Uno.setText(null);
       _view.txtFecha_Acuerdo_Dos.setText(null);
       _view.txtAcuerdo_Dos.setText(null);
       _view.txtFecha_Acuerdo_Tres.setText(null);
       _view.txtAcuerdo_Tres.setText(null);
       _view.txtFecha_Acuerdo_Cuatro.setText(null);
       _view.txtAcuerdo_Cuatro.setText(null);
    }
}
