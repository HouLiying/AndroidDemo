package com.example.houliying.mvpdemo.model;

import com.example.houliying.mvpdemo.bean.InfoBean;

/**
 * Created by houliying on 2016/6/6.
 */
public interface IInfoModel {

    /**
     * �������ṩ�߻�ȡ���ݷ���
     * @return
     */
    InfoBean getInfo();

    /**
     * ���������ṩ���
     * @param info
     */
    void setInfo(InfoBean info);
}
