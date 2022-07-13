package eu.tutorials.makeapp.data.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

import eu.tutorials.makeapp.R;

public class Apps {

    private ArrayList<APP> apps;



    public Apps(ArrayList<APP> apps) {
        this.apps = apps;
    }

    public ArrayList<APP> getApps() {
        return apps;
    }
}
