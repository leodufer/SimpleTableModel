/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.oscarduarte.swing;

import java.util.List;

/**
 *
 * @author Virux
 */
public class UsuarioSimpleTableModel extends SimpleTableModel{
    
    public List<Usuario> usuarios;
    
    public UsuarioSimpleTableModel(List<Usuario> usuarios) {
        super();
        this.usuarios = usuarios;
        String[] columns = {"ID","NOMBRE","APELLIDO","EMAIL"};
        setColumnsName(columns);
    }
 
    @Override
    public void setData() {
        this.data = new Object[usuarios.size()][columnsName.length];
        for (int i = 0; i < usuarios.size(); i++) {
            data[i][0]= usuarios.get(i).getId();
            data[i][1]= usuarios.get(i).getNombre();
            data[i][2]= usuarios.get(i).getApellido();
            data[i][3]= usuarios.get(i).getEmail();
        }
    }  
}
