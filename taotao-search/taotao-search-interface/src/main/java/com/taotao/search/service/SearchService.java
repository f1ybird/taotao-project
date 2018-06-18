package com.taotao.search.service;

import com.taotao.common.pojo.SearchResult;

/**
 * 查询索引库
 * 
 * @author Administrator
 *
 */
public interface SearchService {

	SearchResult search(String queryString, int page, int rows) throws Exception;
}
