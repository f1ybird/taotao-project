package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.EasyUITreeNode;
import com.taotao.common.pojo.TaotaoResult;

/**
 * 内容分类服务
 * 
 * @author Administrator
 *
 */
public interface ContentCategoryService {

	/**
	 * 查询分类列表
	 * 
	 * @param parentId
	 *            分类父id
	 * @return
	 */
	List<EasyUITreeNode> getContentCategoryList(long parentId);

	/**
	 * 新增分类
	 * 
	 * @param parentId
	 *            分类父id
	 * @param name
	 *            分类名称
	 * @return
	 */
	TaotaoResult addContentCategory(Long parentId, String name);
}
