
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ItemProvider {
    
    CollectionReference reference;
    static Firestore db;
    
    public static boolean saveItem(String collection, String document,
            Map<String, Object> data){
        
        db = FirestoreClient.getFirestore();
        
        try{
            
            DocumentReference docRef = db.collection(collection).document(document);
            
            ApiFuture<WriteResult> result = docRef.set(data);
            
            System.out.println("Guardado exitosamente");
            
            return true;
            
        } catch(Exception e){
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return false;
        
    }
    
    public static boolean updateItem(String collection, String document,
            Map<String, Object> data){
        
        db = FirestoreClient.getFirestore();
        
        try{
            
            DocumentReference docRef = db.collection(collection).document(document);
            
            ApiFuture<WriteResult> result = docRef.update(data);
            
            System.out.println("Actualizado exitosamente");
            
            return true;
            
        } catch(Exception e){
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return false;
        
    }
    
    public static boolean deleteItem(String collection, String document){
        
        db = FirestoreClient.getFirestore();
        
        try{
            
            DocumentReference docRef = db.collection(collection).document(document);
            
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            
            System.out.println("Eliminado exitosamente");
            
            return true;
            
        } catch(Exception e){
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return false;
        
    }
    
    public static void loadItemTable(JTable table){
    
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Price");
        
        try {
            
            CollectionReference items = Link.db.collection("Item");
            
            ApiFuture<QuerySnapshot> querySnap = items.get();
            
            for (DocumentSnapshot document: querySnap.get().getDocuments()){
                model.addRow(new Object[]{
                document.getId(),
                document.getString("Name"),
                document.getDouble("Price")
                });
                
            }
            
        } catch (InterruptedException | ExecutionException e) {
            
            System.err.println("Error: " + e.getMessage());
            
        }
        
        table.setModel(model);
        
    }
}
