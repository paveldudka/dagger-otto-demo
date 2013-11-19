package com.inrix.modules;

import android.app.Application;
import android.content.Context;

import com.inrix.daggerottodemo.ForApplication;
import com.inrix.daggerottodemo.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/18/13.
 */
@Module(injects = MainActivity.class, complete = false)
public class AndroidModule {
    private Application appContext;

    public AndroidModule(Application appContext)
    {
        this.appContext = appContext;
    }

    @Provides @Singleton @ForApplication
    Context provideAppContext()
    {
        return appContext.getApplicationContext();
    }
}
