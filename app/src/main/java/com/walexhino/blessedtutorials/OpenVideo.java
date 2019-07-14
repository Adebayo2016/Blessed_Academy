package com.walexhino.blessedtutorials;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class OpenVideo extends AppCompatActivity {


    VideoView videoView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_layout);
        Intent intent=getIntent();
        String receiving=intent.getStringExtra("vid");

       videoView=(VideoView)findViewById(R.id.video_view);

       String VideoPath="android.resources://"+ getPackageName()+ "/" + receiving;

        Uri uri=Uri.parse(VideoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);





}

}
