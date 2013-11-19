package com.inrix.modules;


import com.inrix.daggerottodemo.PlaceholderFragment;
import com.inrix.models.IAuth;
import com.inrix.models.RealAuth;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/18/13.
 */
@Module(injects = PlaceholderFragment.class, complete = false)
public class AuthModule {

    @Provides
    IAuth provideAuth() {
        return new RealAuth();
    }

}
