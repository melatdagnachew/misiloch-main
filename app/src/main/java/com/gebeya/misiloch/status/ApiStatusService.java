package com.gebeya.misiloch.status;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiStatusService {

    @GET("status")
    Call<ApiStatus> getStatus();

}
