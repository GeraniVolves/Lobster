package com.android.loobster.persons;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.loobster.R;

public class PersonsListScreen extends Activity {

    private Persona[] personas = new Persona[] {
        new Persona("Ilya", "Developer", "http://booksmont.ru/wp-content/uploads/2015/10/02.-vremya-priklyuchenij-kartinki-dlya-srisovki.jpg" ),
        new Persona("Kseniya", "Junior Developer", "https://i12.fotocdn.net/s5/16/gallery_xs/60/2209889039.jpg" )
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personas_screen);
        RecyclerView uiList = findViewById(R.id.list);
        uiList.setLayoutManager(new LinearLayoutManager(this));
        uiList.setAdapter(new PersonsListAdapter(personas));
    }
}
