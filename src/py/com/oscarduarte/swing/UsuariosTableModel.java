/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.oscarduarte.swing;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Virux
 */
public class UsuariosTableModel extends AbstractTableModel{
    
    private List<Usuario> usuarios;    
    private Object[][] data;
    private String[] columnsName = {"ID","NOMBRE","APELLIDO","EMAIL"};
    

    public UsuariosTableModel(List<Usuario> usuarios){
        this.usuarios = usuarios;
        setData();
    }
    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnsName.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnsName[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    private void setData(){
        this.data = new Object[usuarios.size()][columnsName.length];
        for (int i = 0; i < usuarios.size(); i++) {
            data[i][0]= usuarios.get(i).getId();
            data[i][1]= usuarios.get(i).getNombre();
            data[i][2]= usuarios.get(i).getApellido();
            data[i][3]= usuarios.get(i).getEmail();
        }
    }
}
