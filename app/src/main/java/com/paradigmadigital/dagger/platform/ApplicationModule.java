package com.paradigmadigital.dagger.platform;

import com.paradigmadigital.dagger.ui.AppCollaborator;
import com.paradigmadigital.dagger.ui.IAppCollaborator;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final AndroidApplication application;

    public ApplicationModule(AndroidApplication application) {
        this.application = application;
    }

    @Provides
    Context provideContext() {
        return this.application;
    }

    @Provides
    @Singleton
    IAppCollaborator provideAppCollaborator() {
        return new AppCollaborator();
    }
}
