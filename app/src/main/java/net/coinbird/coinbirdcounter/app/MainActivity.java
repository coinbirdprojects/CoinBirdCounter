package net.coinbird.coinbirdcounter.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {

   //public final static String EXTRA_MESSAGE = "net.coinbird.coinbirdcounter.app.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Normal button */
    public void normalButton (View view) {
        Intent intent = new Intent(this, NormalButton.class);
        startActivity(intent);
    }

    /** Called when the user clicks the 2P button */
    public void _2pButton (View view) {
        Intent intent = new Intent(this, _2pButton.class);
        startActivity(intent);
    }

    /** Called when the user clicks the 3P button */
    public void _3pButton (View view) {
        Intent intent = new Intent(this, _3pButton.class);
        startActivity(intent);
    }

    /** Called when the user clicks the 4P button */
    public void _4pButton (View view) {
        Intent intent = new Intent(this, _4pButton.class);
        startActivity(intent);
    }
    }

