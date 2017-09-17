package com.android.loobster.persons;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loobster.R;
import com.android.loobster.persons.PersonViewHolder;

public class PersonsListAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder


    // Provide a suitable constructor (depends on the kind of dataset)


    public PersonsListAdapter(String[] DatesUsers) {
        mDataset = DatesUsers;
    }

// Create new views (invoked by the layout manager)

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        PersonViewHolder vh = new PersonViewHolder(view);
        return vh;
    }


    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
// - get element from your dataset at this position
// - replace the contents of the view with that element
        holder.uiName.setText(mDataset[position]);

    }

    // Return the size of your dataset (invoked by the layout manager)

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}


