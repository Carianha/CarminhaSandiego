package com.example.carminhasandiego;

import android.content.Context;
import android.content.Intent;
import android.view.View;


public class Calc implements View.OnClickListener {

    private final Context mContext;

    Calc(Context context) {
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(mContext, CalcActivity.class);
        mContext.startActivity(myIntent);
    }



}

