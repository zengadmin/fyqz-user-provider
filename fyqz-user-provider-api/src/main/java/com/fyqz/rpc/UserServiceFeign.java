package com.fyqz.rpc;

import com.fyqz.model.User;
import com.fyqz.rpc.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这里采用的是feign处理负载均衡的。
 *
 *
 */
@FeignClient(value = "fyqz-service-user",fallback = UserServiceHystrix.class)
public interface UserServiceFeign {

    @RequestMapping(value = "/person/1",method = RequestMethod.GET)
    public String getUser();

    @RequestMapping(value = "/hello", method=RequestMethod.POST)
    public String hello(User user);
}
