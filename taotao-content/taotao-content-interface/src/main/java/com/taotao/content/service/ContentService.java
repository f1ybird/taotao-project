package com.taotao.content.service;

import java.util.List;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbContent;

/**
 * 内容管理服务
 * 
 * @author Administrator
 *
 */
public interface ContentService {

	/**
	 * 新增内容
	 * 
	 * @param content
	 *            内容
	 * @return
	 */
	TaotaoResult addContent(TbContent content);

	/**
	 * 根据分类查询内容列表
	 * 
	 * @param cid
	 *            分类id
	 * @return
	 */
	List<TbContent> getContentByCid(long cid);
}
