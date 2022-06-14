package de.validas.nlx.view.fxviews.control;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javafx.scene.input.DataFormat;
import javafx.util.Pair;

public class DragContainer implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = -1458406119115196098L;

    private final List <Pair<String, String> > mDataPairs = new ArrayList <Pair<String, String> > ();
 
    public static final DataFormat AddLink = new DataFormat("application.NodeLink.add");
    
    public DragContainer () {
    }
    
    public void addData (String key, String value) {
        mDataPairs.add(new Pair<String, String>(key, value));        
    }
    
    public String getValue (String key) {
 
        for (Pair<String, String> data: mDataPairs) {
 
        if (data.getKey().equals(key))
            return data.getValue();
 
         }
 
        return null;
    }
    
    public List <Pair<String, String> > getData () { return mDataPairs; }
}