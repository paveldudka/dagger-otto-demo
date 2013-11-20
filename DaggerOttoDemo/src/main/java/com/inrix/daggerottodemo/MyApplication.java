package com.inrix.daggerottodemo;

import android.app.Application;

import com.inrix.modules.AuthModule;
import com.inrix.modules.EventBusModule;
import com.inrix.modules.NetworkModule;
import com.inrix.modules.TextLoaderModule;

/**
 * Created by paveld on 11/18/13.
 */
public class MyApplication extends Application {
    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();

        Object[] modules = new Object[]{new AuthModule(), new NetworkModule(), new EventBusModule(), new TextLoaderModule()};
        Injector.init(modules);
    }
}
