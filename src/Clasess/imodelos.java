
package Clasess;

import javax.swing.table.DefaultTableModel;


public interface imodelos {
       public boolean verificarExiste1(String[] dato);
    public boolean insertar1(Object obj);
    public boolean eliminar1(Object obj);
    public boolean actualizar1(Object obj);
    public Object consultar1(String dato);
    public void listarTabla1(DefaultTableModel listado1);
    
}
