package com.example.android.rockbeast.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.rockbeast.R;

public class FeedbackActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

//    Find the view that shows the Main Activity
        Button buttonToMainActivity = (Button) findViewById(R.id.button_to_main_activity);
//       Set a clickListener on that view
        buttonToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivityIntent = new Intent(FeedbackActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });
    }
}