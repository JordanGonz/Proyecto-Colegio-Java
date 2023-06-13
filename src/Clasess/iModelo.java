package Clasess;


import javax.swing.table.DefaultTableModel;

public interface iModelo {
    public boolean verificarExiste(String[] dato);
    public boolean insertar(Object obj);
    public boolean eliminar(Object obj);
    public boolean actualizar(Object obj);
    public Object consultar(String dato);
    public void listarTabla(DefaultTableModel listado);
    
}
