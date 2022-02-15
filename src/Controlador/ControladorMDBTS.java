//Controlador para la tabla seguimiento 
package Controlador;
import Vista.FrmSeguimiento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import pkgModelo.MDB;

public class ControladorMDBTS implements ActionListener {
    private FrmSeguimiento _view;
    private MDB _model;
    
    public ControladorMDBTS(FrmSeguimiento view, MDB model){
       this._model=model;
       this._view=view;
       this._view.cmdAlta.addActionListener(this);
       this._view.cmdEliminar.addActionListener(this);
}

    @Override 
    public void actionPerformed(ActionEvent e){
        String leyenda="";
        if(e.getSource()==_view.cmdAlta){
            leyenda=_model.registrarAlta("seguimiento_clientes"," null,"+_view.txtCedula.getText()+",'"_view.txtLugar_Expedicion.getText() );
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    public void iniciar(){
        _view.setTittle("MVC_Visual");
    }
    public void limpiar(){
       _view.txtCedula.setText(null);
    }
}
