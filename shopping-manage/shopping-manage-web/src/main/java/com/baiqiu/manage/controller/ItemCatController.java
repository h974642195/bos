package com.baiqiu.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baiqiu.manage.pojo.GoodsProperty;
import com.baiqiu.manage.pojo.ItemCat;
import com.baiqiu.manage.pojo.ItemCatList;
import com.baiqiu.manage.service.GoodsPropertyService;
import com.baiqiu.manage.service.ItemCatService;

@Controller
@RequestMapping("item")
public class ItemCatController {
	
   @Autowired
	private ItemCatService itemCatService;
	

   /**
    * 查询商品类目
    * @param parentId
    * @return
    */
   @RequestMapping(value="/cat",method=RequestMethod.GET)
	public ResponseEntity<List<ItemCat>> queryItemCatListByParentId(
			@RequestParam(value="id",defaultValue="0") Long parentId){
		try {
			List<ItemCat> list=this.itemCatService.queryItemCatListByParentId(parentId);
			if(null==list|| list.isEmpty()){
				//资源不存在
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}
   
 
   /**
    * 商品类目上移下移
    * @param list
    * @return
    */
   	@RequestMapping(value="/move",method=RequestMethod.POST,produces="application/json;charset=utf-8")
   	@ResponseBody
   	public ResponseEntity<Void> updateItemCatListById(@RequestBody List<ItemCatList> list){
   	
   		try {
   			
   		    System.out.println("parameter"+list);
   			for (ItemCatList result : list) {
				
				itemCatService.updateItemCatByid(result);
				
			}
   	   		
            return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
		}
   		//错误返回500
   		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
 
   		
   	}
   	/**
   	 * 添加
   	 * @param itemCat
   	 * @return
   	 */
   	@RequestMapping(value="/add",method=RequestMethod.POST)
   	public ResponseEntity<Void> insertItemCatListById(@RequestBody ItemCat itemCat){
   		itemCatService.insertItemCatById(itemCat);
   		return ResponseEntity.status(HttpStatus.CREATED).build();
   	}
}
