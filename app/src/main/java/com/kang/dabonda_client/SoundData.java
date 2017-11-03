package com.kang.dabonda_client;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by KANG on 2017-10-25.
 */

public class SoundData {


    public interface SoundDataResponse{
        @GET("/sound_data_block/{days}")
        Call<List<SoundData>> soundData(@Path("days") int days);
    }
}
