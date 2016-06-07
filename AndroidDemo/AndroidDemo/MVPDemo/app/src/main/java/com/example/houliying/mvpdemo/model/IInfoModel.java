package com.example.houliying.mvpdemo.model;

import com.example.houliying.mvpdemo.bean.InfoBean;

/**
 * Created by houliying on 2016/6/6.
 */
public interface IInfoModel {

    /**
     * 从数据提供者获取数据方法
     * @return
     */
    InfoBean getInfo();

    /**
     * 存入数据提供最方法
     * @param info
     */
    void setInfo(InfoBean info);
}
