package xyz.xaidworkz.www.project_naman_n_piyush;

import android.support.multidex.MultiDexApplication;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Hp on 8/13/2016.
 */
public class App extends MultiDexApplication {

    public FirebaseDatabase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = FirebaseDatabase.getInstance();
        db.setPersistenceEnabled(true);


    }
}
