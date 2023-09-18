package com.bjpowernode.vinfo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bjpowernode.vinfo.bean.DataBean;

import java.util.List;

public interface DataService extends IService<DataBean> {


    List<DataBean> listById(int id);

}
