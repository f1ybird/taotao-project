package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemDesc;

/**
 * 商品服务接口
 * 
 * @author Administrator
 *
 */
public interface ItemService {

	/**
	 * 根据Id查询商品
	 * 
	 * @param itemId
	 *            商品id
	 * @return 商品信息
	 */
	TbItem getItemById(long itemId);

	/**
	 * 查询商品列表
	 * 
	 * @param page 第几页
	 * @param rows 每页多少行
	 * @return
	 */
	EasyUIDataGridResult getItemList(int page, int rows);
	
	/**
	 * 新增商品
	 * @param item 商品信息
	 * @param desc 商品描述
	 * @return
	 */
	TaotaoResult addItem(TbItem item, String desc);
	
	/**
	 * 根据id查询商品详情
	 * @param itemId 商品id
	 * @return
	 */
	TbItemDesc getItemDescById(long itemId);

}
