
package modelView;

import view.Window;

public class Calculator {

    public static Register hist = new Register();
    static Window ari = new Window();
      
    public static void main(String[] args) {
        
        ari.setVisible(true);
        
    }
    
    public static void save(Object o) {
        
        hist.register(o);
        
    }
    
}
