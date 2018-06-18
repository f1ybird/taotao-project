package com.taotao.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.utils.JsonUtils;
import com.taotao.utils.FastDFSClient;

/**
 * 图片上传处理类
 * 
 * @author Administrator
 *
 */
@Controller
public class PictureController {
	
	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;

	
	@RequestMapping(value="/pic/upload")
	@ResponseBody
	public String fileUpload(MultipartFile uploadFile) {
		try {
			// 获取文件原始名
			String originalFilename = uploadFile.getOriginalFilename();
			// 获取扩展名
			String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
			// fastDFS客户端上传
			FastDFSClient dfsClient = new FastDFSClient("classpath:properties/client.conf");
			String path = dfsClient.uploadFile(uploadFile.getBytes(), extName);
			// 拼接上传后的文件url
			String url = IMAGE_SERVER_URL + path;
			// 返回结果
			Map result = new HashMap<>();
			result.put("error", 0);
			result.put("url", url);
			return JsonUtils.objectToJson(result);
		}catch(Exception e){
			e.printStackTrace();
			Map result = new HashMap<>();
			result.put("error", 1);
			result.put("message", "图片上传失败");
			return JsonUtils.objectToJson(result);
		}
		
	}
}
