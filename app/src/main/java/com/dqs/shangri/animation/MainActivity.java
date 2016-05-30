package com.dqs.shangri.animation;

import android.support.v4.app.Fragment;

import android.os.Bundle;

import com.dqs.shangri.fragment.MainFragment;
import com.dqs.shangri.roots.FragmentActivityRoot;

import java.util.logging.Logger;

public class MainActivity extends FragmentActivityRoot {
    private static final Logger log = Logger.getLogger(MainActivity.class.toString());

    public MainActivity() {
        super(log);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment createFragment() {
        return new MainFragment();
    }

    @Override
    public void finish() {
        super.finish();
    }
}