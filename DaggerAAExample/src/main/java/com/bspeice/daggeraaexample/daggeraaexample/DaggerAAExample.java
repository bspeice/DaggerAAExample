package com.bspeice.daggeraaexample.daggeraaexample;

import android.app.Application;
import android.content.Context;

import dagger.ObjectGraph;

/**
 * Created by bspeice on 5/10/14.
 */
public class DaggerAAExample extends Application {

    private ObjectGraph graph;

    private static DaggerAAExample instance;

    public DaggerAAExample() {
        instance = this;
    }

    public static Context getAppContext() {
        return instance;
    }

    public static DaggerAAExample getApplication(Context ctx) {
        return (DaggerAAExample)ctx.getApplicationContext();
    }

    public static DaggerAAExample getApplication() {
        return (DaggerAAExample)getAppContext();
    }

    @Override
    public void onCreate() {
        graph = ObjectGraph.create(new DaggerAAExampleModules());
        graph.inject(this);
    }

    public void inject(Object o) {
        graph.inject(o);
    }
}
