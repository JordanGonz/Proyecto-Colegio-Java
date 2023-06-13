
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




public class GuardarRegistro1 implements iModelo {
 public String RUTA = System.getProperty("user.dir") + "/datos.obj";

    private ArrayList<Estudiante> leerDatos() {
        ArrayList<Estudiante> persona = new ArrayList<>();
        try {
            File fichero = new File(RUTA);
            if (fichero.exists()) {
                FileInputStream fis = new FileInputStream(fichero);
                ObjectInputStream ois = new ObjectInputStream(fis);
                persona = (ArrayList<Estudiante>) ois.readObject();
                Collections.sort(persona, (Estudiante p1, Estudiante p2)
                        -> String.valueOf(p1.getCedula()).compareTo(p2.getCedula()));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return persona;
    }

    @Override
    public boolean verificarExiste(String[] dato) {
         boolean estado = false;
       // try {
            ArrayList<Estudiante> lista = leerDatos();
            for (Estudiante persona : lista) {
                if (persona.getCedula().equals(dato[0])) {
                    estado = true;
                    break;//cuando le encuentra rompemos la ejecución del bucle
                }
            }
       /* } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/
      return estado;
    }

    public boolean guardarDatos(ArrayList<Estudiante> lista) {
          boolean estado = false;
        try {
            FileOutputStream fos = new FileOutputStream(RUTA);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lista);
            oos.flush();
            oos.close();
            estado = true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return estado;
    }

    @Override
 public boolean insertar(Object obj) {
        Estudiante objP = (Estudiante) obj;
        boolean estado = false;
        try {
            String[] datoP = {objP.getCedula()};
            if (verificarExiste(datoP)) {
                JOptionPane.showMessageDialog(null, " ya existe");
                return false;
            }
            ArrayList<Estudiante> lista = leerDatos();
            lista.add(objP);
            estado = guardarDatos(lista);
        } catch (Exception e) {
           
           // JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public boolean eliminar(Object obj) {
        boolean estado=false;
        try {
            Estudiante newP=(Estudiante)obj;
            ArrayList<Estudiante> persona=leerDatos();
            for (Estudiante per : persona) {
                if (per.getCedula().equalsIgnoreCase(newP.getCedula())) {
                    //IgnoreCase compara sin importar mayusculas o minúsculas
                    persona.remove(per);
                    estado=guardarDatos(persona);
                    break;
                }
            }
            
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public boolean actualizar(Object obj) {
      boolean estado=false;
        try {
            Estudiante newP=(Estudiante)obj;
            ArrayList<Estudiante> persona=leerDatos();
            for (Estudiante per : persona) {
              persona.remove(per);
              persona.add(newP);
              estado=guardarDatos(persona);
              break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return estado;
    }

    @Override
    public Object consultar(String dato) {
        try {
            ArrayList<Estudiante> persona=leerDatos();
            for (Estudiante per : persona) {
                if (per.getCedula().equalsIgnoreCase(dato)) {
                    return per;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cedula no existe");
        }
        return null;
    }

    @Override
    public void listarTabla(DefaultTableModel listado) {
        listado.getDataVector().clear();
       // try {
            ArrayList<Estudiante> persona=leerDatos();
            for (Estudiante per: persona) {
                Object[] obj=new Object[6];
                obj[0]=per.getCedula();
                obj[1]=per.getNombre();
                obj[2]=per.getApellido();
                obj[3]=per.getDireccion();
                obj[4]=per.getEdad();
                obj[5]=per.getEstado_civil();
                listado.addRow(obj);
            }
       /*} catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/
    }
}