/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.oscarduarte.swing;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Virux
 */
public abstract class SimpleTableModel extends AbstractTableModel{
    public Object[][] data;
    public  String[] columnsName;

    
    public void setColumnsName(String[] columnsName) {
        this.columnsName = columnsName;
        setData();
        fireTableStructureChanged();
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
    
    public abstract void setData();
    
    public void update(){
        fireTableStructureChanged();
        fireTableDataChanged();
    }
}
