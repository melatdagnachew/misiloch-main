package com.gebeya.misiloch.status;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gebeya.misiloch.App;
import com.gebeya.misiloch.R;
import com.gebeya.misiloch.framework.base.BaseActivity;
import com.gebeya.misiloch.framework.util.Const;
import com.pnikosis.materialishprogress.ProgressWheel;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
        loadApiStatus();
    }

    private void loadApiStatus() {
        Retrofit retrofit = ((App)getApplication()).getRetrofit();
        ApiStatusService service = retrofit.create(ApiStatusService.class);
        service.getStatus().enqueue(new Callback<ApiStatus>() {
            @Override
            public void onResponse(Call<ApiStatus> call, Response<ApiStatus> response) {

                ApiStatus status = response.body();
                d(status.author);
                d(status.version);
                d(status.status);
            }

            @Override
            public void onFailure(Call<ApiStatus> call, Throwable t) {

            }
        });

    }

}
