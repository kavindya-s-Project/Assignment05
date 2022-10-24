package com.example.assignment05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5,button6,button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                latestPostsScreen();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsAndEventsScreen();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donationsScreen();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                successStoriesScreen();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findLocationScreen();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutUsScreen();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactUsScreen();
            }
        });
    }

    private void latestPostsScreen() {
        Intent intent = new Intent(this, LatestPosts.class);
        startActivity(intent);
    }

    private void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void newsAndEventsScreen() {
        Intent intent = new Intent(this, NewsAndEvents.class);
        startActivity(intent);
    }

    private void donationsScreen() {
        Intent intent = new Intent(this, Donations.class);
        startActivity(intent);
    }

    private void successStoriesScreen() {
        Intent intent = new Intent(this, SuccessStories.class);
        startActivity(intent);
    }

    private void findLocationScreen() {
        Intent intent = new Intent(this, FindLocation.class);
        startActivity(intent);
    }

    private void aboutUsScreen() {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    private void contactUsScreen() {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
    }

}