package com.example.houliying.mvpdemo.activity;

import com.example.houliying.mvpdemo.bean.InfoBean;

/**
 * Created by houliying on 2016/6/6.
 */
public interface IInfoView {
    /**
     * ��UIȡ���ݵķ���
     * @return
     */
    InfoBean getInfo();

    /**
     * ��UI��ʾ���ݵķ���
     * @param info
     */
    void setInfo(InfoBean info);
}
