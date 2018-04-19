package com.benmu.framework.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

import com.benmu.framework.model.RouterModel;
import com.benmu.framework.support.ISupportWeexActivity;
import com.benmu.framework.support.SupportWeexActivityDelegate;
import com.benmu.widget.view.BaseToolBar;
import com.taobao.weex.WXSDKInstance;

/**
 * Created by haorui on 2018/4/19.
 * Des:
 */

public class SupportWeexActivity extends AppCompatActivity implements ISupportWeexActivity{
    public final SupportWeexActivityDelegate mDelegate = new SupportWeexActivityDelegate(this);

    //====================System Callback====================
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDelegate.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        mDelegate.setContentView(layoutResID);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mDelegate.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mDelegate.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mDelegate.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mDelegate.onStop();
    }

    @Override
    public void onBackPressed() {
        mDelegate.onBackPressed();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        mDelegate.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return mDelegate.onKeyUp(keyCode, event) || super.onKeyUp(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return mDelegate.onKeyDown(keyCode, event) || super.onKeyDown(keyCode, event);
    }

    //====================Custom Callback====================

    @Override
    public View getRootView() {
        return mDelegate.getRootView();
    }

    @Override
    public BaseToolBar getNavigationBar() {
        return mDelegate.getNavigationBar();
    }

    @Override
    public void showError() {
        mDelegate.showError();
    }

    @Override
    public void hideError() {
        mDelegate.hideError();
    }

    @Override
    public void showLoadingDialog(String msg) {
        mDelegate.showLoadingDialog(msg);
    }

    @Override
    public void closeDialog() {
        mDelegate.closeDialog();
    }

    @Override
    public RouterModel getRouterParam() {
        return mDelegate.getRouterParam();
    }

    @Override
    public void setRouterParam(RouterModel param) {
        mDelegate.setRouterParam(param);
    }

    @Override
    public WXSDKInstance getWXSDkInstance() {
        return mDelegate.getWXSDkInstance();
    }

    @Override
    public void onAttach(Activity activity) {
        mDelegate.onAttach(activity);
    }

    @Override
    public void onDetach(Activity activity,boolean force) {
        mDelegate.onDetach(activity,force);
    }

    @Override
    public void refresh() {
        mDelegate.refresh();
    }

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        mDelegate.onViewCreated(instance, view);
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {
        mDelegate.onRenderSuccess(instance, width, height);
    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {
        mDelegate.onRefreshSuccess(instance, width, height);
    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {
        mDelegate.onException(instance, errCode, msg);
    }
}
