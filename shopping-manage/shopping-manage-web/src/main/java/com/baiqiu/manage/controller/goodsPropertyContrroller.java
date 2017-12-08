package com.baiqiu.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baiqiu.manage.pojo.GoodsProperty;
import com.baiqiu.manage.service.GoodsPropertyService;

public class goodsPropertyContrroller {
	@Autowired
	private GoodsPropertyService goodsPropertyService;

	/**
	 * 查询商品属性
	 * 以及附加值
	 * @return
	 */
	@RequestMapping(value = "/goodprperty", method = RequestMethod.GET)
	public ResponseEntity<List<GoodsProperty>> queryGoodsPropertybyCatId() {

		List<GoodsProperty> list = this.goodsPropertyService
				.queryGoosProperty();
		return ResponseEntity.status(HttpStatus.OK).body(list);

	}
}
