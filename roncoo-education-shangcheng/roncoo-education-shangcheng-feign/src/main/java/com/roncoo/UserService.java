package com.roncoo;



import com.roncoo.education.yunying.common.service.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-shangcheng-service")
public interface UserService extends UserServiceApi {

}
