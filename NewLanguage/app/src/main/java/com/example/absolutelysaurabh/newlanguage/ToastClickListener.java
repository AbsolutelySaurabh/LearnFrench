package com.example.absolutelysaurabh.newlanguage;

import android.view.View;
import android.widget.Toast;

/**
 * Created by absolutelysaurabh on 19/2/17.
 */

public class ToastClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Toasting...",Toast.LENGTH_LONG).show();
    }
}
