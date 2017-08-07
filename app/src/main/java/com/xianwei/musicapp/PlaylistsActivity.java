package com.xianwei.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PlaylistsActivity extends AppCompatActivity {

    @BindView(R.id.buy_ic)
    TextView buyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buy_ic)
    public void buy(View view) {
        Intent intent = new Intent(this, PayActivity.class);
        startActivity(intent);
    }
}
