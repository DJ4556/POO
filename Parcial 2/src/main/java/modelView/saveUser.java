
package modelView;

import java.awt.HeadlessException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import modelView.Worker.User;

public class saveUser extends User implements Worker{
        
    public saveUser(int id, String nombre, String apellido) {
        
        super(id, nombre, apellido);
  
    }
    
    public void save(){
        
        try {
            
            Map<String, Object> datos = new HashMap<>();
            
            datos.put("ID", this.id);
            datos.put("Nombre", this.nombre);
            datos.put("Apellido", this.apellido);
            
            loginUser.saveUser("Worker", String.valueOf(this.id), datos);
            
            JOptionPane.showMessageDialog(null, "Registrado con éxito");
            
            JOptionPane.showMessageDialog(null, "Ya puede empezar a trabajar");            
            
        } catch (HeadlessException e) {
             
            System.err.println("Error: " + e.getMessage());
            
            Object[] options = { "OK", "CANCEL" };
                JOptionPane.showOptionDialog(null, "Error al guardar", 
                "Warning",JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            
        }
        
    }
        
}

