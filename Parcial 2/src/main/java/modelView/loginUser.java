
package modelView;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.LinkUser;

public class loginUser {
    
    CollectionReference reference;
    static Firestore db;
    
    public static boolean saveUser(String collection, String document,
            Map<String, Object> data){
        
        db = FirestoreClient.getFirestore();
        
        try{
            
            DocumentReference docRef = db.collection(collection).document(document);
            
            ApiFuture<WriteResult> result = docRef.set(data);
            
            System.out.println("Guardado exitosamente");
            
            return true;
            
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
        }
        
        return false;
        
    }
    
    public static void loadUserTable(JTable table){
    
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        
        try {
            
            CollectionReference users = LinkUser.db.collection("Worker");
            
            ApiFuture<QuerySnapshot> querySnap = users.get();
            
            for (DocumentSnapshot document: querySnap.get().getDocuments()){
                model.addRow(new Object[]{
                document.getId(),
                document.getString("Nombre"),
                document.getString("Apellido"),
                });
                
            }
            
        } catch (InterruptedException | ExecutionException e) {
            
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
        }
        
        table.setModel(model);
        
    }
    
}
