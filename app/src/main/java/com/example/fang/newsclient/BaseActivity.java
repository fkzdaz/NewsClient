package com.example.fang.newsclient;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Fkz on 2017/6/26.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initListener();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract void initListener();


}
