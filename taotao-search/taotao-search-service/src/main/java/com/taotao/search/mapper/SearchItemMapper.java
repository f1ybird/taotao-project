package com.taotao.search.mapper;

import java.util.List;

import com.taotao.common.pojo.SearchItem;

/**
 * 商品查询mapper
 * 
 * @author Administrator
 *
 */
public interface SearchItemMapper {

	List<SearchItem> getItemList();

	SearchItem getItemById(long itemId);
}
