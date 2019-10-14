package com.gebeya.misiloch.status;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;
import com.pnikosis.materialishprogress.ProgressWheel;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StatusActivity extends BaseActivity {

    @BindView(R.id.statusContainer)
    LinearLayout container;

    @BindView(R.id.statusProgressWheel)
    ProgressWheel progressWheel;

    @BindView(R.id.statusRunningLabel)
    TextView runningLabel;

    @BindView(R.id.statusVersionLabel)
    TextView versionLabel;

    @BindView(R.id.statusAuthorLabel)
    TextView authorLabel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        ButterKnife.bind(this);

    }
}
