package com.baiqiu.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baiqiu.manage.mapper.ItemCatMapper;
import com.baiqiu.manage.pojo.ItemCat;
import com.baiqiu.manage.pojo.ItemCatList;

@Service
@Transactional
public class ItemCatService {
	@Autowired
private ItemCatMapper itemCatMapper;
/**
 * 根据父节点id查询商品类目列表
 * @param parentId
 * @return
 */
	public List<ItemCat> queryItemCatListByParentId(Long parentId) {
//		ItemCat record=new ItemCat(); 
//		record.setParentId(parentId);
		List<ItemCat> cat=itemCatMapper.queryByParentId(parentId);
		return cat;
	}
    public boolean updateItemCatByid(ItemCatList itemCatList) {
	
	itemCatMapper.updateItemCatByid(itemCatList);
	return true;
}
    public void insertItemCatById(ItemCat itemCat) {
		itemCatMapper.insertItemCatById(itemCat);
	
}

}
