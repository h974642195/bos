package com.baiqiu.manage.mapper;
import java.util.List;

import com.baiqiu.manage.pojo.ItemCat;
import com.baiqiu.manage.pojo.ItemCatList;
import com.github.abel533.mapper.Mapper;


public interface ItemCatMapper extends Mapper<ItemCat>{

	public List<ItemCat> queryByParentId(Long parentId);

	public void updateItemCatByid(ItemCatList itemCatList);

	public void insertItemCatById(ItemCat itemCat);
}
