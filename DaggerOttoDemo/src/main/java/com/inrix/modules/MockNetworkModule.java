package com.inrix.modules;

import com.inrix.models.IHttpClient;
import com.inrix.models.MockHttp;

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
