package com.ictehi.project_logging.controller;

import com.ictehi.project_logging.service.DeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DeptController {

    private static final Logger logger = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    DeptService deptService;

    @RequestMapping("/hello")
    @ResponseBody
    public Map deptList(HttpServletRequest request) {
        // 日志记录业务方法被调用  此处可用session获取用户信息
        logger.info(String.format("deptController中deptList被%s调用", request.getRemoteAddr()));
        Map<String, String> map = new HashMap();
        map.put("content", "hello");
        return map;
    }
}
