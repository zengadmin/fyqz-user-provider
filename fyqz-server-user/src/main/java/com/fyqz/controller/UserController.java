package com.fyqz.controller;


import com.fyqz.model.Person;
import com.fyqz.model.User;
import org.apache.commons.lang.math.RandomUtils;
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
    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(HttpServletRequest request, @PathVariable("personId") Integer personId){
        Person person = new Person();
        person.setAge(30);
        person.setName("Eureka Test");
        person.setPersonId(personId);
        person.setMsg(request.getRequestURL().toString());
        return person;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public User hello(@RequestBody User user, HttpServletRequest request) {
        user.setMsg(request.getRequestURL().toString());
        user.setPersonId(RandomUtils.nextInt());
        return user;
    }
}
