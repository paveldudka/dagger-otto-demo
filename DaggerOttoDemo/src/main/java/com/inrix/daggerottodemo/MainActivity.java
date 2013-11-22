package com.inrix.daggerottodemo;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

import javax.inject.Inject;

public class MainActivity extends Activity {

    private final String TAG = "MainActivity";
    private TextView counterText;
    private int counter = 0;

    @Inject
    Bus bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counterText = (TextView) findViewById(R.id.counter);
        updateCount(this.counter);

        Injector.inject(this);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getFragmentManager().beginTransaction().add(R.id.container, new InjectionFragment());
            transaction.add(R.id.container, new BusFragment());
            transaction.commit();
        }
    }

    private void updateCount(int counter) {
        this.counterText.setText(String.valueOf(counter));
    }

    @Override
    protected void onResume() {
        super.onResume();
        bus.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        bus.unregister(this);
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

    @Subscribe
    public void onBusButtonClicked(BusButtonClickedEvent event) {
        updateCount(++counter);
    }
}
