package com.inrix.modules;

import com.inrix.daggerottodemo.PlaceholderFragment;
import com.inrix.models.IAuth;
import com.inrix.models.MockAuth;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/18/13.
 */
@Module(overrides = true, injects = PlaceholderFragment.class, complete = false)
public class MockAuthModule {

    @Provides
    IAuth provideAuth() {
        return new MockAuth();
    }

}
