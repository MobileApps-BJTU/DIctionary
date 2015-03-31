package com.example.massalagabriel.dictionary;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.TextView;


public class ResultFragment extends ActionBarActivity {

    private TextView word;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_fragment);

        word = (TextView) findViewById(R.id.word_result);

        ImageButton google = (ImageButton) findViewById(R.id.google);
        google.setOnClickListener(GoogleSearchListener);
    }

    // ClickListener launches web browser
    View.OnClickListener GoogleSearchListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            // get query string and create a URL representing the search
            String urlString = getString(R.string.URL) + word.getText().toString();

            // create an Intent to launch a web browser
            Intent webIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(urlString));

            startActivity(webIntent); // launches web browser to view results
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
