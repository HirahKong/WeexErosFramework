package com.benmu.framework.support;

import android.app.Activity;
import android.view.View;

import com.benmu.framework.model.RouterModel;
import com.benmu.widget.view.BaseToolBar;
import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;

/**
 * Created by haorui on 2018/4/18.
 * Des:
 */

public interface ISupportWeexActivity extends IWXRenderListener {

    //====================Need to implement the system methods====================

    //    void onBackPressed();

    //    void onActivityResult(int requestCode, int resultCode, Intent data);

    //    boolean onKeyUp(int keyCode, KeyEvent event);

    //    boolean onKeyDown(int keyCode, KeyEvent event);

    //    void setContentView(@LayoutRes int layoutResID);

    //====================Get params====================

    View getRootView();

    BaseToolBar getNavigationBar();

    RouterModel getRouterParam();

    void setRouterParam(RouterModel param);

    WXSDKInstance getWXSDkInstance();

    //====================Export method====================

    void refresh();

    void onAttach(Activity activity);

    void onDetach(Activity activity,boolean force);

    void showError();

    void hideError();

    void showLoadingDialog(String msg);

    void closeDialog();

    //====================Life cycle method====================

    //    void onCreate(@Nullable Bundle savedInstanceState);

    //    void onStart();

    //    void onPause();

    //    void onStop();

    //    void onDestroy();



}
