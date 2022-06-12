package com.example.carminhasandiego;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StartingActivity extends AppCompatActivity {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = getApplicationContext();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_starting);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("periodo");
            if (value.equals("1")) ((ImageView) findViewById(R.id.bg_contemporanea)).setImageResource(R.drawable.bg_quinhentismo);
        }

        Lupa lp = new Lupa(mContext);
        Button bt = (Button)findViewById(R.id.b_lupa);
        bt.setOnClickListener(lp);

        NSpinner s_time = (NSpinner) findViewById(R.id.s_time);
        StartingActivity.montar(mContext,s_time);

        Calc cc = new Calc(mContext);
        Button btc = (Button)findViewById(R.id.b_calc);
        btc.setOnClickListener(cc);


    }


    public static void montar (Context tContext, NSpinner s_time) {

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(tContext, R.array.a_periodos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_time.setAdapter(adapter);
        s_time.setSelection(-1,false);
        s_time.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null) {
                    Toast.makeText(tContext, item.toString(),
                            Toast.LENGTH_SHORT).show();
                }

                Intent i = new Intent(tContext, StartingActivity.class);
                i.putExtra("periodo","1");
                tContext.startActivity(i);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }
        });
    }

}