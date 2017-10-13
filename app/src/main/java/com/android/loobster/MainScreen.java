package com.android.loobster;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.android.loobster.main.ProgressFragment;
import com.android.loobster.tasks.TaskListPage;

import java.util.List;

public class MainScreen extends AppCompatActivity {

    private ProgressFragment progressFragment;
    private TaskListPage     tasksFragment;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_main);
        if (savedInstanceState == null) {
            showTasksPage();
        }
        ImageView uiTasks = findViewById(R.id.tasks);
        uiTasks.setOnClickListener(v -> showTasksPage());
        uiTasks.setColorFilter(ContextCompat.getColor(this, R.color.main_menu_selection), PorterDuff.Mode.MULTIPLY);
        findViewById(R.id.create).setOnClickListener(v -> NavigateTo.create(this));
        findViewById(R.id.progress).setOnClickListener(v -> showProgressPage());
    }

    private void showProgressPage() {
        if (progressFragment == null) {
            progressFragment = new ProgressFragment();
        }
        removeAllFragments();
        getSupportFragmentManager()
            .beginTransaction()
            .add(R.id.container, progressFragment)
            .commit();
    }

    private void removeAllFragments() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments == null) return;

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        for (Fragment fragment : fragments) {
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.commit();
    }

    private void showTasksPage() {
        if (tasksFragment == null) {
            tasksFragment = new TaskListPage();
        }
        removeAllFragments();
        getSupportFragmentManager()
            .beginTransaction()
            .add(R.id.container, tasksFragment)
            .commit();
    }
}
