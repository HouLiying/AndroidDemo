package com.example.houliying.mvpdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.houliying.mvpdemo.R;
import com.example.houliying.mvpdemo.bean.InfoBean;
import com.example.houliying.mvpdemo.presenter.Presenter;


public class MainActivity extends Activity implements IInfoView,View.OnClickListener{
    private EditText et_username,et_password,et_content;
    private Button btn_save,btn_get;

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
    }

    private void initData(){
        presenter =new Presenter(this);
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        et_content = (EditText) findViewById(R.id.et_content);
        btn_save = (Button) findViewById(R.id.btn_save);
        btn_get = (Button) findViewById(R.id.btn_get);
        btn_save.setOnClickListener(this);
        btn_get.setOnClickListener(this);
    }

    @Override
    public InfoBean getInfo() {
        InfoBean infoBean =new InfoBean();
        infoBean.username =et_username.getText().toString();
        infoBean.password= et_password.getText().toString();
        return infoBean;
    }

    @Override
    public void setInfo(InfoBean info) {
        StringBuffer buffer =new StringBuffer();
        buffer.append(info.username);
        buffer.append("\n");
        buffer.append(info.password);
        buffer.append("\n");

        et_content.setText(buffer.toString());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_save:
                presenter.saveInfo(getInfo());
                break;
            case R.id.btn_get:
                presenter.getInfo();
                break;
        }
    }
}
