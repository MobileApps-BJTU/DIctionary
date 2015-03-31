package com.example.gakasgado.Dictionary2;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import javax.xml.transform.Result;

import static android.view.View.inflate;


public class HistoryFragment extends ListActivity {

    //int position=1;
    private String word[] = {
            "Processor",
            "Programming",
            "Graphic Design",
            "Android Studio",
            "Java",
            "RAM",
            "AVD"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_fragment);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, word);
        setListAdapter(adapter);

    }



}
