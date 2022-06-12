package com.example.carminhasandiego;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalcActivity extends AppCompatActivity {
    Context mContext;
    NSpinner s_dica1, s_dica2, s_dica3, s_dica4, s_dica5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = getApplicationContext();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Lupa lp = new Lupa(mContext);
        Button bt = (Button)findViewById(R.id.b_lupa);
        bt.setOnClickListener(lp);

        NSpinner s_time = (NSpinner) findViewById(R.id.s_time);
        StartingActivity.montar(mContext,s_time);

        s_dica1 = (NSpinner) findViewById(R.id.s_dica1);
        s_dica2 = (NSpinner) findViewById(R.id.s_dica2);
        s_dica3 = (NSpinner) findViewById(R.id.s_dica3);
        s_dica4 = (NSpinner) findViewById(R.id.s_dica4);
        s_dica5 = (NSpinner) findViewById(R.id.s_dica5);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(mContext, R.array.a_genero, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_dica1.setAdapter(adapter1);
        s_dica1.setSelection(-1,false);
        s_dica1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                Object item = adapterView.getItemAtPosition(position);
                if (item != null) {
                    Toast.makeText(mContext, item.toString(),
                            Toast.LENGTH_SHORT).show();

                    if (item.toString().equals("Prosa")) {
                        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(mContext, R.array.a_prosa_tema, android.R.layout.simple_spinner_item);
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica2.setAdapter(adapter2);
                        s_dica2.setVisibility(View.VISIBLE);
                        //s_dica2.setSelection(-1,false);

                        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(mContext, R.array.a_prosa_lugar, android.R.layout.simple_spinner_item);
                        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica3.setAdapter(adapter3);
                        s_dica3.setVisibility(View.VISIBLE);
                        s_dica3.setSelection(-1,false);

                        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(mContext, R.array.a_prosa_objetivo, android.R.layout.simple_spinner_item);
                        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica4.setAdapter(adapter4);
                        s_dica4.setVisibility(View.VISIBLE);
                        s_dica4.setSelection(-1,false);

                        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(mContext, R.array.a_prosa_final, android.R.layout.simple_spinner_item);
                        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica5.setAdapter(adapter5);
                        s_dica5.setVisibility(View.VISIBLE);
                        s_dica5.setSelection(-1,false);
                    }
                    else{
                        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(mContext, R.array.a_poesia_movimento, android.R.layout.simple_spinner_item);
                        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica2.setAdapter(adapter2);
                        s_dica2.setVisibility(View.VISIBLE);
                        s_dica2.setSelection(-1,false);

                        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(mContext, R.array.a_poesia_estrutua, android.R.layout.simple_spinner_item);
                        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica3.setAdapter(adapter3);
                        s_dica3.setVisibility(View.VISIBLE);
                        s_dica3.setSelection(-1,false);

                        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(mContext, R.array.a_poesia_tipos, android.R.layout.simple_spinner_item);
                        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica4.setAdapter(adapter4);
                        s_dica4.setVisibility(View.VISIBLE);
                        s_dica4.setSelection(-1,false);

                        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(mContext, R.array.a_poesia_objetivo, android.R.layout.simple_spinner_item);
                        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                        s_dica5.setAdapter(adapter5);
                        s_dica5.setVisibility(View.VISIBLE);
                        s_dica5.setSelection(-1,false);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generated method stub

            }
        });

    }





}