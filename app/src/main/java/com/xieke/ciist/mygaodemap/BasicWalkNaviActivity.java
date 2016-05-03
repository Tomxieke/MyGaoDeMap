package com.xieke.ciist.mygaodemap;

import android.os.Bundle;

import com.amap.api.navi.AMapNaviView;
import com.amap.api.navi.model.NaviLatLng;

/**
 * 创建时间：16/1/7 11:59
 * 项目名称：newNaviDemo
 *
 * @author lingxiang.wang
 * @email lingxiang.wang@alibaba-inc.com
 * 类说明：
 */

public class BasicWalkNaviActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_basic_navi);
        mAMapNaviView = (AMapNaviView) findViewById(R.id.navi_view);
        mAMapNaviView.onCreate(savedInstanceState);
        mAMapNaviView.setAMapNaviViewListener(this);
        mEndLatlng = new NaviLatLng(39.989614,116.481763);
        mStartLatlng = new NaviLatLng(30.73333,103.9741200);
    }


    @Override
    public void onInitNaviSuccess() {
        mAMapNavi.calculateWalkRoute(mStartList.get(0), mEndList.get(0));
    }
}
