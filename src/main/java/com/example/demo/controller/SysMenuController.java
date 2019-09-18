package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.log.MyLog;

@RestController
@RequestMapping("/sys/menu")
public class SysMenuController {
	 	@Autowired
	    //private SysMenuService sysMenuService;

	    @MyLog(value = "删除菜单记录")  //这里添加了AOP的自定义注解
	    @PostMapping("/del")
	    public void deleteBatch() {
	        

	       
	    }
}
