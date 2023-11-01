package model;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LinkItem {
   
    public static Firestore db;
    
    public static void linkFirebase(){
     
        try{
            FileInputStream serviceAccount = new FileInputStream("aether.json");
            
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();
            
            FirebaseApp.initializeApp(options);
            
            db = FirestoreClient.getFirestore();
            
            JOptionPane.showMessageDialog(null, "Éxito al conectar");
            
        }catch (IOException e){
            
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            
        }
        
        
    }
}
