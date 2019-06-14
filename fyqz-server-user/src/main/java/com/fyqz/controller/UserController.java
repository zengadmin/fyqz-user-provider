package com.fyqz.controller;


import com.fyqz.model.User;
import io.swagger.annotations.ApiOperation;
import org.redisson.liveobject.resolver.UUIDGenerator;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 服务调用者
 */
@RestController
public class UserController {
    /**
     *
     * @param request
     * @param userId
     * @return
     */
    @ApiOperation(value = "测试获取用户2",notes = "测试获取用户4")
    @RequestMapping(value = "/user/{userId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public User findPerson(HttpServletRequest request, @PathVariable("userId") String userId){
        User user = new User();
        user.setName("user Test");
        user.setId(userId);
        user.setMsg(request.getRequestURL().toString());
        return user;
    }

    @ApiOperation(value = "测试获取用户",notes = "测试获取用户")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public User hello(@RequestBody User user, HttpServletRequest request) {
        user.setMsg(request.getRequestURL().toString());
        user.setId(UUIDGenerator.INSTANCE.toString());
        return user;
    }
}
