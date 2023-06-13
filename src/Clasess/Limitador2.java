
package Clasess;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class Limitador2 extends PlainDocument{
    private JTextField editor;
    private int num;

    public Limitador2(JTextField editor, int num) {
        this.editor = editor;
        this.num = num;
    }
    
    //para ver q los datos no se repita
    //AttributeSet es el conjunto de propiedades especificadas en un archivo de recursos xml">xml.

    public void insertString(int arg0,String arg1,AttributeSet arg2)throws BadLocationException{
        if((editor.getText().length()+arg1.length())> this.num){
          return;
        }super.insertString(arg0, arg1, arg2);
    }
    
}

