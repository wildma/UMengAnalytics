package com.wildma.umenganalytics;

import android.os.Bundle;
import android.view.View;

import com.umeng.analytics.MobclickAgent;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 模拟进入nike店铺
     * @param view
     */
    public void nike(View view) {
        MobclickAgent.onEvent(this, "nike");
    }

    /**
     * 模拟进入new balance店铺
     * @param view
     */
    public void newBalance(View view) {
        MobclickAgent.onEvent(this, "new_balance");
    }

    /**
     * 模拟错误
     * @param view
     */
    public void createError(View view) {
        int i = 1 / 0;
    }

}
