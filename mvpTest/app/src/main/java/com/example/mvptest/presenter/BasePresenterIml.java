package com.example.mvptest.presenter;

public interface BasePresenterIml<T>{
    void attach(T v);    //View绑定
    void detach();       //View解绑
}
