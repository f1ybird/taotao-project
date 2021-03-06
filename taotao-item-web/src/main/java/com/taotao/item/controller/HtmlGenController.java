package com.taotao.item.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 网页静态处理Controller
 */
@Controller
public class HtmlGenController {

	@Autowired
	private FreeMarkerConfigurer freeMarkerConfigurer;
	
	@Value("${HTML_OUT_PATH}")
	private String HTML_OUT_PATH;//静态页面输出路径
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/genhtml")
	@ResponseBody
	public String genHtml() throws Exception {
		//生成静态页面
		Configuration configuration = freeMarkerConfigurer.getConfiguration();
		Template template = configuration.getTemplate("hello.ftl");
		Map data = new HashMap<>();
		data.put("hello", "spring freemarker test");
		Writer out = new FileWriter(new File(HTML_OUT_PATH));
		template.process(data, out);
		out.close();
		//返回结果
		return "OK";
	}
	
}
