package com.example.carminhasandiego;

import android.content.Context;
import android.content.Intent;
import android.view.View;


public class Lupa implements View.OnClickListener {

    private final Context mContext;

    Lupa(Context context) {
        this.mContext = context;
    }

    @Override
    public void onClick(View v) {
        Intent myIntent = new Intent(mContext, LupaActivity.class);
        mContext.startActivity(myIntent);
    }



}

