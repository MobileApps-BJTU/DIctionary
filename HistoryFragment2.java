package com.example.gakasgado.Dictionary2;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by GAKAS.GADO on 3/31/2015.
 */
public interface HistoryFragment2 {
    void onCreate(Bundle savedInstanceState);

    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState);

    void onListItemClick(ListView l, View v, int position, long id);

    void onAttach(Activity activity);

    void onDetach();
}
