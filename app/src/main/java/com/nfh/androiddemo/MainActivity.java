package com.nfh.androiddemo;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nfh.androiddemo.beidou.BeidouActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.btn_beidou)
    Button btnBeidou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btnBeidou.setOnClickListener(this);
    }

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_beidou:
                Intent intent = new Intent(MainActivity.this, BeidouActivity.class);
                startActivity(intent);
        }
    }
}