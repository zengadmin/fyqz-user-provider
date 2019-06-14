package com.fyqz.controller;


import com.fyqz.model.Person;
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
     * @param personId
     * @return
     */
    @ApiOperation(value = "测试获取用户2",notes = "测试获取用户4")
    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(HttpServletRequest request, @PathVariable("personId") Integer personId){
        Person person = new Person();
        person.setAge(30);
        person.setName("Eureka Test");
        person.setPersonId(personId);
        person.setMsg(request.getRequestURL().toString());
        return person;
    }

    @ApiOperation(value = "测试获取用户",notes = "测试获取用户")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public User hello(@RequestBody User user, HttpServletRequest request) {
        user.setMsg(request.getRequestURL().toString());
        user.setId(UUIDGenerator.INSTANCE.toString());
        return user;
    }
}
