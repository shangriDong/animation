package com.dqs.shangri.roots;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.dqs.shangri.animation.R;

import java.util.logging.Logger;


/**
 * Created by Insert on 2015/4/13.
 */
public abstract class FragmentActivityRoot extends FragmentActivity {
    private Logger log;
    protected abstract Fragment createFragment();

    protected void onCreateUI(Bundle savedInstanceState) {
        setContentView(R.layout.activity_root);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }

    protected FragmentActivityRoot(Logger logger) {
        log = logger;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        log.info("FragmentActivity Life --> onCreate");
        super.onCreate(savedInstanceState);
        onCreateUI(savedInstanceState);

    }

    @Override
    protected void onStart() {
        log.info("FragmentActivity Life --> onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        log.info("FragmentActivity Life --> onRestart");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        log.info("FragmentActivity Life --> onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        log.info("FragmentActivity Life --> onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        log.info("FragmentActivity Life --> onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        log.info("FragmentActivity Life --> onDestroy");
        super.onDestroy();
    }

    @Override
    public Resources getResources()
    {
        // 让字体不受系统控制。。。。。。。。。
        Resources res = super.getResources();
        Configuration config=new Configuration();
        //config.setToDefaults();
        config.fontScale = 1.0f;
        res.updateConfiguration(config,res.getDisplayMetrics() );
        return res;
    }
}
