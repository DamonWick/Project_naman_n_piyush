package xyz.xaidworkz.www.project_naman_n_piyush.activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import xyz.xaidworkz.www.project_naman_n_piyush.R;

public class RegestrationActivity extends AppCompatActivity {
    @BindView(R.id.tvReg)
    TextView tvReg;
    @BindView(R.id.btnLogin)
    Button btnLogin;
    @BindView(R.id.btnSign)
    Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration2);
        Typeface font=Typeface.createFromAsset(getAssets(),"FREESCPT.TTF");
        findViewById(R.id.tvReg);
        tvReg.setTypeface(font);

    }
}
