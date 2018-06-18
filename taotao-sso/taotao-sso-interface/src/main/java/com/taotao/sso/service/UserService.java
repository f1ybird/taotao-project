package com.taotao.sso.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.pojo.TbUser;

/**
 * 用户服务
 * 
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 检查数据是否可用
	 * 
	 * @param data
	 * @param type
	 * @return
	 */
	TaotaoResult checkData(String data, int type);

	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 */
	TaotaoResult register(TbUser user);

	/**
	 * 用户登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	TaotaoResult login(String username, String password);

	/**
	 * 根据token查询用户信息
	 * 
	 * @param token
	 * @return
	 */
	TaotaoResult getUserByToken(String token);
}
