package com.roncoo;


import com.roncoo.education.yunying.common.service.UsersServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-service")
public interface UsersService extends UsersServiceApi {


}
