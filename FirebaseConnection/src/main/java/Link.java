
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;

public class Link {
   
    public static Firestore db;
    
    public static void linkFirebase(){
     
        try{
            FileInputStream serviceAccount = new FileInputStream("aether.json");
            
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
            
            FirebaseApp.initializeApp(options);
            
            db = FirestoreClient.getFirestore();
            
            System.out.println("Exito al conectar");
            
        }catch (IOException e){
            
            System.err.println("Error: Por pendejo " + e.getMessage());
            
        }
        
        
    }
}
