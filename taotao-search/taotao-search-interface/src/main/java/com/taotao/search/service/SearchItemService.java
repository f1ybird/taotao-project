package com.taotao.search.service;

import com.taotao.common.pojo.TaotaoResult;

/**
 * 导入商品到索引库
 * 
 * @author Administrator
 *
 */
public interface SearchItemService {

	TaotaoResult importItemsToIndex();
}
