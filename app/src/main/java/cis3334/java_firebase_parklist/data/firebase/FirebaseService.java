package cis3334.java_firebase_parklist.data.firebase;

import androidx.annotation.NonNull;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

public class FirebaseService {

    // TODO: Implement FirebaseService object
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    private List<Park> fetchParks(){
        db.collection("parks")
                .get()
                .addOnCanceledListener()
                @Override
                public void onComplete(@NonNull) {

                    if (task.isSusccesful()) {
                        for (QueryDocumentSnapshot document : task.getResult())
                    }
                }
    }
}
