package com.bjpowernode.vinfo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.bjpowernode.vinfo.bean.DataBean;
import com.bjpowernode.vinfo.mapper.DataMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DataServiceImpl extends ServiceImpl<DataMapper, DataBean>
        implements DataService {

    @Override
    public List<DataBean> listById(int id) {
        return null;
    }
}
