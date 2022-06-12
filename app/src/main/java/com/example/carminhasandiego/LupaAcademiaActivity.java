package com.example.carminhasandiego;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LupaAcademiaActivity extends AppCompatActivity {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = getApplicationContext();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_academia);

        Lupa lp = new Lupa(mContext);
        Button bt = (Button)findViewById(R.id.b_lupa);
        bt.setOnClickListener(lp);

        NSpinner s_time = (NSpinner) findViewById(R.id.s_time);
        StartingActivity.montar(mContext,s_time);

    }

}