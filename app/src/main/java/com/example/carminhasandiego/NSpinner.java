package com.example.carminhasandiego;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatSpinner;

public class NSpinner extends AppCompatSpinner {

    public NSpinner(Context context)
    { super(context); }

    public NSpinner(Context context, int mode)
    { super(context,mode); }

    public NSpinner(Context context, AttributeSet attrs)
    { super(context, attrs); }

    public NSpinner(Context context, AttributeSet attrs, int defStyle)
    { super(context, attrs, defStyle); }

    public NSpinner(Context context, AttributeSet attrs, int defStyleAttr, int mode)
    { super(context, attrs, defStyleAttr, mode); }

    public NSpinner(Context context, AttributeSet attrs, int defStyleAttr, int mode, Resources.Theme popupTheme)
    { super(context, attrs, defStyleAttr, mode, popupTheme); }


    @Override public void
    setSelection(int position, boolean animate)
    {
        if (position == -1)
            super.setSelection(0, animate);
        else {
            boolean sameSelected = position == getSelectedItemPosition();
            super.setSelection(position, animate);
            if (sameSelected) {
                // Spinner does not call the OnItemSelectedListener if the same item is selected, so do it manually now
                getOnItemSelectedListener().onItemSelected(this, getSelectedView(), position, getSelectedItemId());
            }
        }
    }

    @Override public void
    setSelection(int position)
    {
        boolean sameSelected = position == getSelectedItemPosition();
        super.setSelection(position);
        if (sameSelected) {
            // Spinner does not call the OnItemSelectedListener if the same item is selected, so do it manually now
            getOnItemSelectedListener().onItemSelected(this, getSelectedView(), position, getSelectedItemId());
        }
    }



}
