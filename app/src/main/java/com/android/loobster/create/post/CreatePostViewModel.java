package com.android.loobster.create.post;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

public class CreatePostViewModel extends ViewModel {

    public final ObservableField<String> imageUrl = new ObservableField<>();
    public final ObservableField<String> text     = new ObservableField<>();
    public final ObservableBoolean       hasImage = new ObservableBoolean();

}
