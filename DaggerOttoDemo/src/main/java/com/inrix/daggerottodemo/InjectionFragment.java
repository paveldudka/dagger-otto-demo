package com.inrix.daggerottodemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inrix.models.Authenticator;
import com.inrix.models.DataLoader;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class InjectionFragment extends Fragment {


    @Inject
    DataLoader dataLoader;

    TextView dataLoaderText;

    @Inject
    Authenticator auth;

    TextView authText;


    public InjectionFragment() {
        Injector.inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.injection_fragment, container, false);


        this.dataLoaderText = (TextView) rootView.findViewById(R.id.data_loader);
        this.dataLoaderText.setText(dataLoader.loadData());

        this.authText = (TextView) rootView.findViewById(R.id.auth);
        this.authText.setText(auth.getAuthToken());


        return rootView;
    }
}
