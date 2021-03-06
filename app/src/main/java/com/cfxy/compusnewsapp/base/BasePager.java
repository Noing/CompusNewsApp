package com.cfxy.compusnewsapp.base;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.cfxy.compusnewsapp.R;
import com.cfxy.compusnewsapp.ui.activity.MainActivity;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

/**
 * Created by ralap on 2017/5/1.
 */
public abstract class BasePager {
    public Activity mActivity;
    public View mRootView;
    public TextView tvTitle;
    public ImageButton btnMenu;
    public FrameLayout flBasePage;

    public BasePager(Activity activity) {
        this.mActivity = activity;
        initView();
    }

    public void initView() {
        mRootView = View.inflate(mActivity, R.layout.base_pager, null);
        tvTitle = (TextView) mRootView.findViewById(R.id.tv_title);
        btnMenu = (ImageButton) mRootView.findViewById(R.id.btn_menu);
        flBasePage = (FrameLayout) mRootView.findViewById(R.id.fl_base_page);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle();
            }
        });

    }
    public abstract void initData();

    /**
     * 侧边栏展开或者收起的方法
     */
    private void toggle() {
        MainActivity mainUI = (MainActivity) mActivity;
        SlidingMenu slidingMenu = mainUI.getSlidingMenu();
        slidingMenu.toggle();
    }
}
