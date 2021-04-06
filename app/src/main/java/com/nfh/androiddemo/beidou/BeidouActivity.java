package com.nfh.androiddemo.beidou;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.nfh.androiddemo.BaseActivity;
import com.nfh.androiddemo.R;

public class BeidouActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int initLayout() {
        return R.layout.demo_beidou;
    }
}
