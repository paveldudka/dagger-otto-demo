package com.inrix.daggerottodemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.inrix.models.Authenticator;
import com.inrix.models.TextLoader;
import com.squareup.otto.Bus;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = "PlaceholderFragment";

    @Inject
    Authenticator auth;
    @Inject
    TextLoader textLoader;


    @Inject
    Bus bus;

    TextView authText;
    TextView textLoaderText;

    public PlaceholderFragment() {
        Injector.inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        this.authText = (TextView) rootView.findViewById(R.id.auth);
        this.authText.setText(auth.getAuthToken());

        this.textLoaderText = (TextView) rootView.findViewById(R.id.text_loader);
        this.textLoaderText.setText(textLoader.loadText());

        ((Button) rootView.findViewById(R.id.bus_button)).setOnClickListener(this);
        return rootView;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        bus.post(new BusButtonClickedEvent());
    }
}
