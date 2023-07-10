package com.chengfu.android.github_publish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.chengfu.android.lib1.Lib1;
import com.chengfu.android.lib2.Lib2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.tv);
        tv.setText(String.format("%s---%s", Lib1.test(), Lib2.test()));
    }
}