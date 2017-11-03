package com.kang.dabonda_client;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by KANG on 2017-10-25.
 */

public class SoundDataLoader extends AsyncTask {
    String serverUrl;
    SoundData.SoundDataResponse dataloader;

    public SoundDataLoader() {
        super();
    }

    @Override
    protected void onPreExecute() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(serverUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        dataloader = retrofit.create(SoundData.SoundDataResponse.class);
    }

    @Override
    protected void onPostExecute(Object o) {

    }

    @Override
    protected void onProgressUpdate(Object[] values) {
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        Call<List<SoundData>> soundDatas = dataloader.soundData(7);
        soundDatas.enqueue(new Callback<List<SoundData>>(){
            @Override
            public void onResponse(Call<List<SoundData>> call, Response<List<SoundData>> response) {

            }

            @Override
            public void onFailure(Call<List<SoundData>> call, Throwable t) {

            }
        });
        return soundDatas;
    }
}
