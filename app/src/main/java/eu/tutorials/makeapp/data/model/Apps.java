package eu.tutorials.makeapp.data.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import eu.tutorials.makeapp.R;

public class Apps {

    private ArrayList<APP> apps;
    APP nAPP = new APP("Appy", R.drawable.ic_launcher_background);


    public Apps(ArrayList<APP> apps) {
        this.apps = apps;
    }

    public ArrayList<APP> getApps() {
        apps.add(nAPP);
        return apps;
    }
}
