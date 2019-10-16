package com.roncoo;




import com.roncoo.education.ketang.common.service.UserServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-caiwu-service")
public interface UserService extends UserServiceApi {

}
