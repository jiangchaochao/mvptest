package com.example.mvptest.presenter;

import com.example.mvptest.model.User;
import com.example.mvptest.view.MainActivity;
import com.example.mvptest.view.mainViewIml;

public class mainPresenter implements mainPresenterIml{

    private mainViewIml viewIml;
    @Override
    public void login(User user) {
        if (user.getUserName().isEmpty() || user.getPasswd().isEmpty())
        {
            viewIml.showToast("账户或密码不能为空");
        }else
        {
            if (user.getUserName().equals("jiangc") && user.getPasswd().equals("123456"))
            {
                viewIml.loginSucces("登录成功");
            }else
            {
                viewIml.loginFailed("登录失败");
            }
        }
    }

    @Override
    public void attach(mainViewIml v) {
        viewIml = v;
    }

    @Override
    public void detach() {
        viewIml = null;
    }
}
