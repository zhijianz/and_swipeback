package com.xbeats.swipebacksample.dispatchactivity;

import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;


/**
 * Created by fhf11991 on 2016/7/25.
 */
public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";

    private SwipeWindowHelper mSwipeWindowHelper;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if(mSwipeWindowHelper == null) {
            mSwipeWindowHelper = new SwipeWindowHelper(getWindow(), supportSlideBack());
        }
        return mSwipeWindowHelper.processTouchEvent(ev) || super.dispatchTouchEvent(ev);
    }

    /**
     * 是否支持滑动返回
     *
     * @return
     */
    protected boolean supportSlideBack() {
        return true;
    }
}
