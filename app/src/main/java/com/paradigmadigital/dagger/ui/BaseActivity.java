package com.paradigmadigital.dagger.ui;

import com.paradigmadigital.dagger.di.ActivityComponent;
import com.paradigmadigital.dagger.di.ApplicationComponent;
import com.paradigmadigital.dagger.platform.ActivityModule;
import com.paradigmadigital.dagger.platform.AndroidApplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {
    private ActivityComponent activityComponent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.activityComponent = getApplicationComponent().plus(new ActivityModule(this));
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AndroidApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}