package com.android.loobster.persons;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.android.loobster.R;
import com.android.loobster.utils.Views;

public class PersonsListAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private String[] userNames;

    PersonsListAdapter(String[] usersNames) {
        this.userNames = usersNames;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = Views.inflate(R.layout.person_item, parent);
        return new PersonViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.uiName.setText(userNames[position]);
        holder.uiPosition.setText(userNames[position]);
    }

    @Override
    public int getItemCount() {
        return userNames.length;
    }
}


