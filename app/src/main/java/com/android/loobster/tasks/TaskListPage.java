package com.android.loobster.tasks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loobster.R;
import com.android.loobster.persons.Persona;
import com.android.loobster.tasks.models.Task;
import com.android.loobster.utils.Views;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;

public class TaskListPage extends Fragment {

    private DateHeaderItem today    = new DateHeaderItem(new Date());
    private DateHeaderItem tomorrow = new DateHeaderItem(new Date(0));

    public static final String MARRY_IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Curie-nobel-portrait-2-600.jpg/259px-Curie-nobel-portrait-2-600.jpg";
    List<TaskViewHolderItem> tasks = Arrays.asList(
        new TaskViewHolderItem(new Task(new Persona("Jim Karry", null, "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQwMjAwNzI0M15BMl5BanBnXkFtZTcwOTY1MTMyOQ@@._V1_UY317_CR22,0,214,317_AL_.jpg"),
            "Купить молока", "todo", "super important", "30 min"), today),
        new TaskViewHolderItem(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h"), today),
        new TaskViewHolderItem(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h"), today),
        new TaskViewHolderItem(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h"), tomorrow),
        new TaskViewHolderItem(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h"), tomorrow),
        new TaskViewHolderItem(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h"), tomorrow),
        new TaskViewHolderItem(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h"), tomorrow)
    );

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return Views.inflate(R.layout.tasks_screen, container);
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView uiTasksList = view.findViewById(R.id.tasks_rv);
        FlexibleAdapter<TaskViewHolderItem> adapter = new FlexibleAdapter<>(tasks);
        adapter.setDisplayHeadersAtStartUp(true);
        uiTasksList.setAdapter(adapter);
    }
}
