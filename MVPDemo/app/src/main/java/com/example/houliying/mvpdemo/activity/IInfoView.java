package com.example.houliying.mvpdemo.activity;

import com.example.houliying.mvpdemo.bean.InfoBean;

/**
 * Created by houliying on 2016/6/6.
 */
public interface IInfoView {
    /**
     * 从UI取数据的方法
     * @return
     */
    InfoBean getInfo();

    /**
     * 给UI显示数据的方法
     * @param info
     */
    void setInfo(InfoBean info);
}
