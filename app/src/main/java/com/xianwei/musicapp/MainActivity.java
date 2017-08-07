package com.xianwei.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.login_view)
    TextView login;
    @BindView(R.id.playlist_view)
    TextView playlist;
    @BindView(R.id.favorite_view)
    TextView favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_view)
    public void openLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.playlist_view)
    public void openPlaylist(View view) {
        Intent intent = new Intent(this, PlaylistsActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.favorite_view)
    public void openFavorite(View view) {
        Intent intent = new Intent(this, FavoriteActivity.class);
        startActivity(intent);
    }

}
