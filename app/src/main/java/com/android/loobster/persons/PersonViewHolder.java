package com.android.loobster.persons;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.android.loobster.R;


public class PersonViewHolder extends RecyclerView.ViewHolder {

    TextView uiName;
    TextView uiPosition;

    public PersonViewHolder(View view) {
        super(view);
        uiName = view.findViewById(R.id.name);
        uiPosition = view.findViewById(R.id.position);
    }





}
