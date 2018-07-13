package com.chain.finalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class DashBoardActivity extends AppCompatActivity {
    private CardView suggest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        suggest = findViewById(R.id.suggestion);
        suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this,SuggestionActivity.class);
                startActivity(intent);
                Toast.makeText(DashBoardActivity.this, "suggest", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
