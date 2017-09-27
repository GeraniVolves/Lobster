package com.android.loobster.persons;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loobster.R;

public class PersonsListAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder


    // Provide a suitable constructor (depends on the kind of dataset)


    public PersonsListAdapter(String[] DatesUsers) {
        mDataset = DatesUsers;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.person_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        PersonViewHolder vh = new PersonViewHolder(view);
        return vh;
    }


    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.uiName.setText(mDataset[position]);
        holder.uiPosition.setText(mDataset[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}


