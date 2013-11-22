package com.inrix.modules;


import com.inrix.daggerottodemo.PlaceholderFragment;
import com.inrix.models.Authenticator;
import com.inrix.network.IHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/18/13.
 */
@Module(injects = {PlaceholderFragment.class}, complete = false, library = true)
public class AuthModule {

    @Provides @Singleton
    Authenticator provideAuth(IHttpClient client) {
        return new Authenticator(client);
    }

}
