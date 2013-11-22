package com.inrix.modules;

import com.inrix.daggerottodemo.InjectionFragment;
import com.inrix.models.TextLoader;
import com.inrix.network.IHttpClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/20/13.
 */
@Module(injects = {InjectionFragment.class}, complete = false)
public class TextLoaderModule {

    @Provides
    TextLoader provideTextLoader(IHttpClient client) {
        return new TextLoader(client);
    }

}
