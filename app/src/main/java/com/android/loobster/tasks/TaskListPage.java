package com.android.loobster.tasks;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loobster.R;
import com.android.loobster.persons.Persona;
import com.android.loobster.tasks.checkbox.CheckItem;
import com.android.loobster.tasks.models.Audio;
import com.android.loobster.tasks.models.Note;
import com.android.loobster.tasks.models.Task;
import com.android.loobster.tasks.models.ToDo;
import com.android.loobster.tasks.note.NoteItem;
import com.android.loobster.utils.Dps;
import com.android.loobster.utils.Keyboard;
import com.android.loobster.utils.Views;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.IFlexible;

public class TaskListPage extends Fragment {

    private DateHeaderItem today         = new DateHeaderItem(new Date());
    private DateHeaderItem tomorrow      = new DateHeaderItem(new Date((new Date().getTime() + 1000 * 60 * 60 * 24)));
    private DateHeaderItem afterTomorrow = new DateHeaderItem(new Date((new Date().getTime() + 1000 * 60 * 60 * 24 * 2)));

    public static final String MARRY_IMAGE_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Curie-nobel-portrait-2-600.jpg/259px-Curie-nobel-portrait-2-600.jpg";
    public static final String JIM_KARRY       = "https://images-na.ssl-images-amazon.com/images/M/MV5BMTQwMjAwNzI0M15BMl5BanBnXkFtZTcwOTY1MTMyOQ@@._V1_UY317_CR22,0,214,317_AL_.jpg";

    List<IFlexible> tasks = Arrays.asList(
        new TaskItemHeader(new Task(new Persona("Jim Karry", null, JIM_KARRY),
            "Купить 123", "todo", "super important", "30 min", "#E747BB", "#EC6E9F", "#FFFFFF"), today),
        new TaskItemHeader(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h", "#487FFE", "#798DDB", "#FFFFFF"), today),
        new TaskItemHeader(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h", "#BD4355", "#F86774", "#FFFFFF"), today),
        new CheckItem(new ToDo("Can we trust him?", false), today),
        new TaskItemHeader(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h", "#E747BB", "#EC6E9F", "#FFFFFF"), tomorrow),
        new TaskItemHeader(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h", "#E747BB", "#EC6E9F", "#FFFFFF", "https://i.pinimg.com/originals/83/c1/35/83c135b33c4cfeac76f1231f752ab2b0.jpg"), tomorrow),
        new TaskItemHeader(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h", "#BD4355", "#F86774", "#FFFFFF"), tomorrow),
        new NoteItem(new Note("Last month, my wife, Anne Doe, took me to Las Vegas because she had to go for a business convention."), tomorrow),
        new TaskItemHeader(new Task(new Persona("Мария Кюри", null, MARRY_IMAGE_URL),
            "Купить Радий и Полоний", "todo", "live of death", "7h", "#BD4355", "#F86774", "#FFFFFF"), tomorrow),
        new TaskItemHeader(new Task(new Persona("Гитлер", null, MARRY_IMAGE_URL),
            "Уничтожить мир. БУГАГАГАГА!", "todo", "live of death", "7h", "#E747BB", "#EC6E9F", "#FFFFFF"), afterTomorrow),
        new TaskItemHeader(new Task(new Persona("Гитлер", null, MARRY_IMAGE_URL),
            "Уничтожить мир. БУГАГАГАГА!", "todo", "live of death", "7h", "#E747BB", "#EC6E9F", "#FFFFFF"), afterTomorrow),
        new TaskItemHeader(new Task(new Persona("Гитлер", null, MARRY_IMAGE_URL),
            "Уничтожить мир. БУГАГАГАГА!", "todo", "live of death", "7h", "#E747BB", "#EC6E9F", "#FFFFFF"), afterTomorrow),
        new AudioItem(new Audio(), afterTomorrow)
    );

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return Views.inflate(R.layout.tasks_screen, container);
    }


    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView uiTasksList = view.findViewById(R.id.tasks_rv);
        uiTasksList.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                RecyclerView.ViewHolder holder = parent.getChildViewHolder(view);
                if (holder instanceof DateHeaderHolder) {
                    outRect.top = Dps.toPixel(24, getContext());
                } else {
                    outRect.top = Dps.toPixel(8, getContext());
                }
                outRect.left = Dps.toPixel(8, getContext());
                outRect.right = Dps.toPixel(8, getContext());
            }
        });
        @SuppressWarnings("unchecked") FlexibleAdapter<IFlexible> adapter = new TasksAdapter(tasks);
        adapter.setDisplayHeadersAtStartUp(true);
        uiTasksList.setAdapter(adapter);
        adapter.setLongPressDragEnabled(true);
        uiTasksList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);

                if (newState == RecyclerView.SCROLL_STATE_DRAGGING) {
                    Keyboard.hide(getActivity());
                }
            }
        });

    }
}
