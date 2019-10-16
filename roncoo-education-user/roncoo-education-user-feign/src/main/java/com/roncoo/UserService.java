package com.roncoo;


import com.roncoo.interfaces.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-user-service")
public interface UserService extends UserServiceApi {

}
