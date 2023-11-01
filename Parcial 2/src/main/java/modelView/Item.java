
package modelView;

import java.util.Map;


public interface Item {
    
    public abstract class Product{
        
        Map<String, Object> datos;
        protected int code;
        protected String producto;
        protected int precio;
        protected int cantidad;
        
        public Product(int code, String producto, int precio, int cantidad){
            
            this.code= code;
            this.producto = producto;
            this.precio = precio;
            this.cantidad = cantidad;
            
            
        }
    
    }
    
}
