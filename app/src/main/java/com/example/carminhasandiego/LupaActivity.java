package com.example.carminhasandiego;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;


public class LupaActivity extends AppCompatActivity{
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = getApplicationContext();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa);

        Lupa lp = new Lupa(mContext);
        Button bt = (Button)findViewById(R.id.b_lupa);
        bt.setOnClickListener(lp);

        NSpinner s_time = (NSpinner) findViewById(R.id.s_time);
        StartingActivity.montar(mContext,s_time);
    }


    public void f_pegadas(View view) {
        Glide.with(getApplicationContext())
                .asGif()
                .load(R.drawable.a_pegadas) // Replace with a valid url
                .addListener(new RequestListener<GifDrawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                        resource.setLoopCount(1); // Place your loop count here.
                        resource.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
                            @Override
                            public void onAnimationEnd(Drawable drawable) {
                                Intent myIntent = new Intent(mContext, LupaAcademiaActivity.class);
                                mContext.startActivity(myIntent);
                            }
                        });
                        return false;
                    }
                })
                .into((ImageView) findViewById(R.id.imageView6)); // Replace with your ImageView id.

    }

    public void f_pegadas_e(View view) {
        Glide.with(getApplicationContext())
                .asGif()
                .load(R.drawable.a_pegadas_e) // Replace with a valid url
                .addListener(new RequestListener<GifDrawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                        resource.setLoopCount(1); // Place your loop count here.
                        resource.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
                            @Override
                            public void onAnimationEnd(Drawable drawable) {
                                Intent myIntent = new Intent(mContext, LupaCarminhaActivity.class);
                                mContext.startActivity(myIntent);
                            }
                        });
                        return false;
                    }
                })
                .into((ImageView) findViewById(R.id.imageView6)); // Replace with your ImageView id.
    }

    public void f_pegadas_d(View view) {
        Glide.with(getApplicationContext())
                .asGif()
                .load(R.drawable.a_pegadas_d) // Replace with a valid url
                .addListener(new RequestListener<GifDrawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                        resource.setLoopCount(1); // Place your loop count here.
                        resource.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
                            @Override
                            public void onAnimationEnd(Drawable drawable) {
                                Intent myIntent = new Intent(mContext, LupaAnalisadorActivity.class);
                                mContext.startActivity(myIntent);
                            }
                        });
                        return false;
                    }
                })
                .into((ImageView) findViewById(R.id.imageView6)); // Replace with your ImageView id.

    }





}

