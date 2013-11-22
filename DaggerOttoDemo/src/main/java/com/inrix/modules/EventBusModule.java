package com.inrix.modules;

import com.inrix.daggerottodemo.BusFragment;
import com.inrix.daggerottodemo.MainActivity;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by paveld on 11/18/13.
 */
@Module(injects = {MainActivity.class, BusFragment.class})
public class EventBusModule {

    @Provides
    @Singleton
    Bus provideBus() {
        return new Bus();
    }
}