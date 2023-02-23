package com.developeralamin.retro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.developeralamin.retro.adapter.QuranAdapter;
import com.developeralamin.retro.api.RetrofitClient;
import com.developeralamin.retro.databinding.ActivityMainBinding;
import com.developeralamin.retro.model.QuranModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private List<QuranModel> list;
    private QuranAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        list = new ArrayList<>();
        adapter = new QuranAdapter(this, list);

        RetrofitClient.getRetrofileClient().getquraModel().enqueue(new Callback<List<QuranModel>>() {
            @Override
            public void onResponse(Call<List<QuranModel>> call, Response<List<QuranModel>> response) {

                if (response.isSuccessful() && response.body() != null) {
                    list.addAll(response.body());
                    binding.recyclerViewId.setAdapter(adapter);
                    binding.progressBarId.setVisibility(View.GONE);
                }

                Log.d("SAKIB", "onResponse: "+response.body());

            }

            @Override
            public void onFailure(Call<List<QuranModel>> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getLocalizedMessage().toString(), Toast.LENGTH_SHORT).show();

                Log.d("SAKIB", "onFailure: "+t.getLocalizedMessage().toString());

            }
        });
    }
}