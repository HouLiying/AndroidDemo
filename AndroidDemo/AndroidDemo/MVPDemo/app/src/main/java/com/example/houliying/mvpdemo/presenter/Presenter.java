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
     * ��UI����
     * @param infoBean
     */
    public void saveInfo(InfoBean infoBean){
        iInfoModel.setInfo(infoBean);
    }

    /**
     *��UI����
     */
    public void getInfo(){
        //ͨ������iInfoView�ķ�����������ʾ�����ģʽ����
        //���ƻص���������
        iInfoView.setInfo(iInfoModel.getInfo());
    }
}
