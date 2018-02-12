package com.example.k0s03ht4y.howyouspend;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.app.Application;

/**
 * Created by k0s03ht4y on 2/12/18.
 */

public class DataBase extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
