package net.coinbird.coinbirdcounter.app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NormalButton extends ActionBarActivity {

    Button p1add;
    Button p1sub;
    Button p2sub;
    Button p2add;
    TextView p1score;
    TextView p2score;
    int p1counter = 20;
    int p2counter = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_button);
        p1add = (Button) findViewById(R.id.p1add);
        p1sub = (Button) findViewById(R.id.p1sub);
        p2sub = (Button) findViewById(R.id.p2sub);
        p2add = (Button) findViewById(R.id.p2add);
        p1score = (TextView) findViewById(R.id.p1Score);
        p2score = (TextView) findViewById(R.id.p2Score);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.normal_button, menu);
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

    /**
     * Called when the user clicks the +/- buttons
     */
    public void onClick(View v) {
        if (v == p1add) {
            p1counter++;
            p1score.setText(Integer.toString(p1counter));
            p1score.setBackgroundColor(Color.GREEN);
            p1score.setBackgroundColor(Color.TRANSPARENT);
        }
        if (v == p1sub) {
            p1counter--;
            p1score.setText(Integer.toString(p1counter));
            p1score.setBackgroundColor(Color.RED);
            p1score.setBackgroundColor(Color.TRANSPARENT);
        }

        if (v == p2sub) {
            p2counter--;
            p2score.setText(Integer.toString(p2counter));
            p2score.setBackgroundColor(Color.RED);
            p2score.setBackgroundColor(Color.TRANSPARENT);
        }
        if (v == p2add) {
            p2counter++;
            p2score.setText(Integer.toString(p2counter));
            p2score.setBackgroundColor(Color.GREEN);
            p2score.setBackgroundColor(Color.TRANSPARENT);
        }
    }

}
