package com.xianwei.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FavoriteActivity extends AppCompatActivity {
    @BindView(R.id.favorite_buy_ic)
    TextView buyIcon;
    @BindView(R.id.favorite_playing_ic)
    ImageView PlayingIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.favorite_buy_ic)
    public void openPayActivity(View view) {
        Intent intent = new Intent(this, PayActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.favorite_playing_ic)
    public void openPlayingActivity(View view) {
        Intent intent = new Intent(this, PlayingActivity.class);
        startActivity(intent);
    }
}
