package com.roncoo;


import com.roncoo.education.yunying.common.service.DiscountApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-service")
public interface DiscountService extends DiscountApi {


}
