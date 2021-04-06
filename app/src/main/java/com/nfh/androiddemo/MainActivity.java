package com.nfh.androiddemo;


import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_beidou)
    Button btnBeidou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}