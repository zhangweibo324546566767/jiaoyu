package com.roncoo;


import com.roncoo.education.yunying.common.service.VipApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-service")
public interface VipService extends VipApi {


}
