
package Clasess;

import java.awt.Toolkit;

public class Validaciones {
    public void soloNumeros(java.awt.event.KeyEvent evt){
        int key = (int)evt.getKeyChar();
        if(key<48 || key>57){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    public void soloTexto(java.awt.event.KeyEvent evt){
        int key = (int)evt.getKeyChar();
        if((key<65 || key>90) && (key<97 || key>122) && key!=209 && key!=241 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
 }
}

