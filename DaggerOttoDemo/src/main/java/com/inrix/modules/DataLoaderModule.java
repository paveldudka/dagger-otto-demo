package com.inrix.modules;

import com.inrix.daggerottodemo.InjectionFragment;
import com.inrix.models.DataLoader;
import com.inrix.network.IHttpClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/20/13.
 */
@Module(injects = {InjectionFragment.class}, complete = false, library = true)
public class DataLoaderModule {

    @Provides
    DataLoader provideTextLoader(IHttpClient client) {
        return new DataLoader(client);
    }

}
