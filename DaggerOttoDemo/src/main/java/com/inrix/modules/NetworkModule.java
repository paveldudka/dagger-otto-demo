package com.inrix.modules;

import com.inrix.network.IHttpClient;
import com.inrix.network.RealHttp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/20/13.
 */
@Module(library = true)
public class NetworkModule {

    @Provides
    IHttpClient provideHttpClient()
    {
        return new RealHttp();
    }
}
