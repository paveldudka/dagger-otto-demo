package com.inrix.modules;

import com.inrix.network.IHttpClient;
import com.inrix.network.MockHttp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/20/13.
 */
@Module(library = true, overrides = true)
public class MockNetworkModule {

    @Provides
    IHttpClient provideHttpClient()
    {
        return new MockHttp();
    }
}
