package com.inrix.daggerottodemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.squareup.otto.Bus;

import javax.inject.Inject;

/**
 * Created by paveld on 11/21/13.
 */
public class BusFragment extends Fragment implements View.OnClickListener {

    @Inject
    Bus bus;

    public BusFragment() {
        Injector.inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.bus_fragment, container, false);
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
