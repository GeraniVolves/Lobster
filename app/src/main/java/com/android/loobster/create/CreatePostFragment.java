package com.android.loobster.create;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.loobster.R;
import com.android.loobster.create.post.CreatePostViewModel;
import com.android.loobster.databinding.CreatePostPageBinding;

public class CreatePostFragment extends Fragment {

    private CreatePostViewModel createPostViewModel;

    @Override public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createPostViewModel = ViewModelProviders.of(this).get(CreatePostViewModel.class);
    }

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        CreatePostPageBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.create_post_page, container, false);
        dataBinding.addImage.setOnClickListener(view -> {
                createPostViewModel.hasImage.set(true);
                createPostViewModel.imageUrl.set("https://www.w3schools.com/w3images/fjords.jpg");
            }
        );
        dataBinding.image.setOnClickListener(view -> createPostViewModel.hasImage.set(false));
        dataBinding.setVm(createPostViewModel);
        return dataBinding.getRoot();
    }
}
