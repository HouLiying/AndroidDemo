package com.example.houliying.mvpdemo.model;

import com.example.houliying.mvpdemo.bean.InfoBean;

/**
 * Created by houliying on 2016/6/6.
 */
public class InfoModelImpl implements IInfoModel{
    private InfoBean infoBean =new InfoBean();

    @Override
    public InfoBean getInfo() {
        return infoBean;
    }

    @Override
    public void setInfo(InfoBean info) {
        //ģ��洢���ݣ���ʵ�кܶ����
        infoBean =info;
    }
}
