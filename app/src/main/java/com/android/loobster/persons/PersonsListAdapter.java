package com.android.loobster.persons;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.loobster.R;
import com.android.loobster.utils.ImageLoader;
import com.android.loobster.utils.Views;

public class PersonsListAdapter extends RecyclerView.Adapter<PersonViewHolder> {

    private Persona[] personas;

    PersonsListAdapter(Persona[] usersNames) {
        this.personas = usersNames;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = Views.inflate(R.layout.person_item, parent);
        return new PersonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Persona persona = personas[position];
        holder.uiName.setText(persona.name);
        holder.uiPosition.setText(persona.position);
        ImageLoader.loadCicrle(holder.uiAvatar, persona.avatarUrl);
    }

    @Override
    public int getItemCount() {
        return personas.length;
    }
}
