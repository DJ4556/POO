
package modelView;

import java.awt.HeadlessException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import modelView.Item.Product;

public class objectAction extends Product implements Item{
        
    public objectAction (int code, String producto, int precio, int cantidad) {
        
        super(code, producto, precio, cantidad);
  
    }
    
    public void save(){
        
        try {
            
            datos = new HashMap<>();
            
            datos.put("Código", this.code);
            datos.put("Producto", this.producto);
            datos.put("Precio", this.precio);
            datos.put("Cantidad", this.cantidad);
            
            itemProvider.saveItem("Objeto", String.valueOf(this.code), datos);
            
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            
            
        } catch (HeadlessException e) {
             
            System.err.println("Error: " + e.getMessage());
            
            Object[] options = { "OK", "CANCEL" };
                JOptionPane.showOptionDialog(null, "Error al guardar", 
                "Warning",JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            
        }
        
    }
    
    public void delete(){
        
        String idDoc = String.valueOf(this.code);
        
        try{
             
            datos = new HashMap<>();
            
            itemProvider.deleteItem("Objeto", idDoc);
            
            JOptionPane.showMessageDialog(null, "Eliminado con éxito");
            
        } catch (HeadlessException e) {
             
            System.err.println("Error: " + e.getMessage());
            
            Object[] options = { "OK", "CANCEL" };
                JOptionPane.showOptionDialog(null, "Error al eliminar", 
                "Warning",JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            
        } 
        
    }
    
    public void update() {
       
        String idDoc = String.valueOf(this.code);
        
        try {
            
            datos = new HashMap<>();
            
            datos.put("Producto", this.producto);
            datos.put("Precio", this.precio);
            datos.put("Cantidad", this.cantidad);
            
            itemProvider.updateItem("Objeto", idDoc, datos);
            
            JOptionPane.showMessageDialog(null, "Actualizado con éxito");
            
            
        } catch (HeadlessException e) {
             
            System.err.println("Error: " + e.getMessage());
            
            Object[] options = { "OK", "CANCEL" };
                JOptionPane.showOptionDialog(null, "Error al actualizar", 
                "Warning",JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            
        } 
        
    }
        
}
