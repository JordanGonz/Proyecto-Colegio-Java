package Clasess;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuardarRegistroProfesor implements imodelos {

    public String ruta = System.getProperty("user.dir") + "/datosPro.txt";

    private ArrayList<Profesor> leerDatos() {
        ArrayList<Profesor> profe = new ArrayList<>();
        try {
            File fichero = new File(ruta);
            if (fichero.exists()) {
                FileInputStream fis = new FileInputStream(fichero);
                ObjectInputStream ois = new ObjectInputStream(fis);
                profe = (ArrayList<Profesor>) ois.readObject();
                Collections.sort(profe, (Profesor p1, Profesor p2)
                        -> String.valueOf(p1.getCodigo()).compareTo(p2.getCodigo()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return profe;
    
    }

    @Override
    public boolean verificarExiste1(String[] dato) {
        boolean estado = false;
        try {
            ArrayList<Profesor> lista = leerDatos();
            for (Profesor profe : lista) {
                if (profe.getCodigo().equals(dato[0])) {
                    estado = true;
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    public boolean guardarDatos(ArrayList<Profesor> lista) {
        boolean estado = false;
        try {
            FileOutputStream fos = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.flush();
            oos.close();
            estado = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public boolean insertar1(Object obj) {
        Profesor objP = (Profesor) obj;
        boolean estado = false;
        try {
            String[] datoP = {objP.getCodigo()};
            if (verificarExiste1(datoP)) {
                JOptionPane.showMessageDialog(null, " ya existe");
                return false;
            }
            ArrayList<Profesor> lista = leerDatos();
            lista.add(objP);
            estado = guardarDatos(lista);
        } catch (Exception e) {
           
           // JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public boolean eliminar1(Object obj) {
        boolean estado=false;
        try {
            Profesor newP=(Profesor)obj;
            ArrayList<Profesor> profe=leerDatos();
            for (Profesor per : profe) {
                if (per.getCodigo().equalsIgnoreCase(newP.getCodigo())) {
                    //IgnoreCase compara sin importar mayusculas o minúsculas
                    profe.remove(per);
                    estado=guardarDatos(profe);
                    break;
                }
            }
            
      } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public boolean actualizar1(Object obj) {
      boolean estado=false;
        try {
            Profesor newP=(Profesor)obj;
            ArrayList<Profesor> profe=leerDatos();
            for (Profesor per : profe) {
              profe.remove(per);
              profe.add(newP);
              estado=guardarDatos(profe);
              break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public Object consultar1(String dato) {
        try {
            ArrayList<Profesor> profe=leerDatos();
            for (Profesor per : profe) {
                if (per.getCodigo().equalsIgnoreCase(dato)) {
                    return per;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Profesor no existe");
        }
        return null;
    }

    @Override
    public void listarTabla1(DefaultTableModel listado1) {
        listado1.getDataVector().clear();
        try {
            ArrayList<Profesor> profe=leerDatos();
            for (Profesor produ: profe) {
                Object[] obj=new Object[4];
                obj[0]=produ.getCodigo();
                obj[1]=produ.getNombre();
                obj[2]=produ.getApellido();
                obj[3]=produ.getCurso();
               
               
                
                listado1.addRow(obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}