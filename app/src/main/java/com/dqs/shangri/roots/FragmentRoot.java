package com.dqs.shangri.roots;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.logging.Logger;

/**
 * Created by Insert on 2015/4/13.
 */
public abstract class FragmentRoot extends Fragment {
    private Logger log;

    public FragmentRoot(Logger logger) {
        log = logger;
    }

    /*@Override
    public void onAttach(Activity activity) {
        log.info("Fragment Life --> onAttach");
        super.onAttach(activity);
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        log.info("Fragment Life --> onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log.info("Fragment Life --> onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        log.info("Fragment Life --> onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        log.info("Fragment Life --> onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        log.info("Fragment Life --> onResume");
        super.onResume();
        //GlobalDurationHelper.onFragmentStart(log.getName());
    }

    @Override
    public void onPause() {
        log.info("Fragment Life --> onPause");
        super.onPause();
        //GlobalDurationHelper.onFragmentEnd(log.getName());
    }

    @Override
    public void onStop() {
        log.info("Fragment Life --> onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        log.info("Fragment Life --> onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        log.info("Fragment Life --> onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        log.info("Fragment Life --> onDetach");
        super.onDetach();
    }
}
