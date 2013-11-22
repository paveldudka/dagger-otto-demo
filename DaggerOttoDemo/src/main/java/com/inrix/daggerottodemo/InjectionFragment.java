package com.inrix.daggerottodemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inrix.models.Authenticator;
import com.inrix.models.TextLoader;

import javax.inject.Inject;

/**
 * A placeholder fragment containing a simple view.
 */
public class InjectionFragment extends Fragment {

    @Inject
    Authenticator auth;
    @Inject
    TextLoader textLoader;

    TextView authText;
    TextView textLoaderText;

    public InjectionFragment() {
        Injector.inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.injection_fragment, container, false);
        this.authText = (TextView) rootView.findViewById(R.id.auth);
        this.authText.setText(auth.getAuthToken());

        this.textLoaderText = (TextView) rootView.findViewById(R.id.text_loader);
        this.textLoaderText.setText(textLoader.loadText());

        return rootView;
    }
}
