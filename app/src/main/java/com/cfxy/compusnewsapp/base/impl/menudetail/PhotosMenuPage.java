package com.cfxy.compusnewsapp.base.impl.menudetail;

import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.cfxy.compusnewsapp.base.BaseMenuDetailPage;

/**
 * Created by ralap on 2017/5/3.
 */
public class PhotosMenuPage extends BaseMenuDetailPage {

    public PhotosMenuPage(Activity activity) {
        super(activity);
    }

    @Override
    public View initView() {
        TextView tx = new TextView(mActivity);
        tx.setText("组图详情");
        tx.setTextColor(Color.RED);
        tx.setGravity(Gravity.CENTER);
        return tx;
    }
}
