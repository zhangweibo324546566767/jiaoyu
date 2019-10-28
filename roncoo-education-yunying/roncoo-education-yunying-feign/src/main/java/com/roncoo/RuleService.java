package com.roncoo;


import com.roncoo.education.yunying.common.service.RuleApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-service")
public interface RuleService extends RuleApi {


}
