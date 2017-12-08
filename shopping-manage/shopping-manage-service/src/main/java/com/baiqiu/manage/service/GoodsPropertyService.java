package com.baiqiu.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baiqiu.manage.mapper.GoodsPropertyMapper;
import com.baiqiu.manage.pojo.GoodsProperty;
@Service
public class GoodsPropertyService {

	@Autowired
	private GoodsPropertyMapper goodsPropertyMapper;
	public List<GoodsProperty> queryGoosProperty() {
		List<GoodsProperty> goodproperty=goodsPropertyMapper.queryGoodsProperty();
		return goodproperty;
	}

}
