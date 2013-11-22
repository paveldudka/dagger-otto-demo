package com.inrix.modules;

import com.inrix.daggerottodemo.PlaceholderFragment;
import com.inrix.network.IHttpClient;
import com.inrix.models.TextLoader;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/20/13.
 */
    @Module(complete = false, injects = {PlaceholderFragment.class})
public class TextLoaderModule {

    @Provides
    TextLoader provideTextLoader(IHttpClient client)
    {
        return new TextLoader(client);
    }

}
