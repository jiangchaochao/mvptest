package com.example.mvptest.presenter;

import com.example.mvptest.model.User;
import com.example.mvptest.view.mainViewIml;

public interface mainPresenterIml extends BasePresenterIml<mainViewIml>{
    void login(User user);
}
