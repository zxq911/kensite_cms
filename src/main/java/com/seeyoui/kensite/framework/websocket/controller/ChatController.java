/*
 * Powered By cuichen
 * Since 2014 - 2015
 */
package com.seeyoui.kensite.framework.websocket.controller;  
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authz.annotation.RequiresUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seeyoui.kensite.common.base.controller.BaseController;
/**
 * websocket 在线聊天
 * @author cuichen
 * @version 1.0
 * @since 1.0
 * @date 2016-05-05
 */
@Controller
@RequestMapping(value = "sys/chat")
public class ChatController extends BaseController {
	
	/**
	 * websocket
	 * @param modelMap
	 * @param module
	 * @return
	 * @throws Exception
	 */
	@RequiresUser
	@RequestMapping(value = "/{page}")
	public ModelAndView page(HttpSession session,
			HttpServletResponse response, HttpServletRequest request,
			ModelMap modelMap, @PathVariable String page) throws Exception {
		return new ModelAndView("framework/websocket/"+page, modelMap);
	}
	
}