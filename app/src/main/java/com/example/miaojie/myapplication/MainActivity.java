package com.example.miaojie.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {
    protected UnityPlayer unityPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        unityPlayer=new UnityPlayer(this);

        View view=mUnityPlayer.getView();
        LinearLayout linearLayout=findViewById(R.id.content);
        linearLayout.addView(view);
    }
}
