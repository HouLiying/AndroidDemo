package com.example.houliying.mvpdemo.presenter;

import com.example.houliying.mvpdemo.activity.IInfoView;
import com.example.houliying.mvpdemo.bean.InfoBean;
import com.example.houliying.mvpdemo.model.IInfoModel;
import com.example.houliying.mvpdemo.model.InfoModelImpl;

/**
 * Created by houliying on 2016/6/6.
 */
public class Presenter {
    IInfoModel iInfoModel;
    IInfoView iInfoView;

    public Presenter(IInfoView infoView){
        iInfoView =infoView;
        iInfoModel =new InfoModelImpl();
    }

    /**
     * 供UI调用
     * @param infoBean
     */
    public void saveInfo(InfoBean infoBean){
        iInfoModel.setInfo(infoBean);
    }

    /**
     *供UI调用
     */
    public void getInfo(){
        //通过调用iInfoView的方法来更新显示，设计模式运用
        //类似回调监听处理
        iInfoView.setInfo(iInfoModel.getInfo());
    }
}
