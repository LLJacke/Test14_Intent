package com.lljackie.test14_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_to2 = (Button) findViewById(R.id.bt_to2);
        bt_to2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("toSecondActivity");
                intent.addCategory("android.intent.category.DEFAULT");
                startActivity(intent);
            }
        });
    }
}
