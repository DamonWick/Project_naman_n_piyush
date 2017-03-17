package xyz.xaidworkz.www.project_naman_n_piyush.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import xyz.xaidworkz.www.project_naman_n_piyush.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView ivIcon;
    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        ivIcon = (ImageView) findViewById(R.id.ivIcon);
        tvTitle.animate()
                .scaleX(.5f)
                .scaleY(.5f)
                .setDuration(6500)
                .setInterpolator(new BounceInterpolator())
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Intent i = new Intent(SplashActivity.this,RegestrationActivity .class);
                        startActivity(i);
                        finish();
                    }
                });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

}
