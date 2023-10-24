
package modelView;

import java.util.ArrayList;

public class Register {
    
    ArrayList<Object> Result;
    

    public Register(){
        
        Result = new ArrayList<>();
        
    }
    
    public void register(Object o){
            
        this.Result.add(o);
            
    }
    
    public ArrayList<Object> returner(){
    
        return Result;
        
    }
    
}
