package com.inrix.daggerottodemo;

import dagger.ObjectGraph;

public final class Injector
{
    public static ObjectGraph objectGraph = null;

    public static void init(final Object... modules) {

        if(objectGraph == null)
        {
            objectGraph = ObjectGraph.create(modules);
        }
        else
        {
            objectGraph = objectGraph.plus(modules);
        }

        // Inject statics
        objectGraph.injectStatics();
    }

    public static final void inject(final Object target)
    {
        objectGraph.inject(target);
    }

    public static <T> T resolve(Class<T> type)
    {
        return objectGraph.get(type);
    }
}