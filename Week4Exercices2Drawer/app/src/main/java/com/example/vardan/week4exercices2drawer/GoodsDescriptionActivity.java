package com.example.vardan.week4exercices2drawer;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;


public class GoodsDescriptionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_description);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        final ListModel listModel = MyProvider.getUserPosition();
        RecyclerView recycler = findViewById(R.id.goods_recycler);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        DescriptionAdapter adapter = new DescriptionAdapter(this, listModel.getImageUrl());
        recycler.setAdapter(adapter);

        ImageView background = findViewById(R.id.col_image_id);
        Picasso.get().load(listModel.getImageUrl()[0]).into(background);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.toolbar_layout);
        collapsingToolbarLayout.setTitle(listModel.getTitle());

        setUpVideoView(listModel.getVideoUrl());
        TextView textView = findViewById(R.id.item_description_id);
        textView.setText(listModel.getDescription());

    }

    private void setUpVideoView(String url) {
        final VideoView videoView = findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse(url));
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}
