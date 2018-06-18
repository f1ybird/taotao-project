package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;

/**
 * 商品分类管理
 * 
 * @author Administrator
 *
 */
public interface ItemCatService {

	/**
	 * 查询商品类目
	 * 
	 * @param parentId 父id
	 * @return
	 */
	List<EasyUITreeNode> getItemCatList(long parentId);

}
