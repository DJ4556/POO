
package modelView;

public interface Worker {
    
    public abstract class User{
        
        protected int id;
        protected String nombre;
        protected String apellido;
        
        public User(int id, String nombre, String apellido){
            
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            
            
        }
        
    }
    
}
