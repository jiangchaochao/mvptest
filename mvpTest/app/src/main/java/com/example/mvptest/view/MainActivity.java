package com.example.mvptest.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvptest.R;
import com.example.mvptest.model.User;
import com.example.mvptest.presenter.mainPresenter;

public class MainActivity extends AppCompatActivity implements mainViewIml{

    private EditText username;
    private EditText passwd;
    private Button login;

    private mainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        passwd = findViewById(R.id.passwd);
        login = findViewById(R.id.login);

        mainPresenter = new mainPresenter();
        mainPresenter.attach(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User();
                user.setUserName(username.getText().toString());
                user.setPasswd(passwd.getText().toString());
                mainPresenter.login(user);
            }
        });
    }

    @Override
    public void loginSucces(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginFailed(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detach();
    }
}
