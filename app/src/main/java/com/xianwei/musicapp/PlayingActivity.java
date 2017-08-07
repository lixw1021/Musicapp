package com.xianwei.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlayingActivity extends AppCompatActivity {

    @BindView(R.id.playing_back_btn)
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.playing_back_btn)
    public void backToMainScreen(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
