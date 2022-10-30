package controller;

import entity.UserTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserServiceTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: sth
 * @Description: 用于UserTestController测试
 * @Date: 2022/10/29
 * @Time: 15:53
 */
@Controller //标记为MVC的控制器类，方便DispatcherServlet进行扫描定位
@RequestMapping("/test")
public class UserTestController {
    @Resource
    private UserServiceTest userServiceTest;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<UserTest> findAll(){
        return userServiceTest.findAllUser();
    }


//多个servlet
    @RequestMapping("/findAll1")
    @ResponseBody
    public List<UserTest> findAll1(){
        return userServiceTest.findAllUser();
    }


    @RequestMapping("/findAll2")
    @ResponseBody
    public List<UserTest> findAll2(){
        return userServiceTest.findAllUser();
    }


}
