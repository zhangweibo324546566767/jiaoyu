package com.roncoo;

import com.roncoo.education.yunying.common.service.CouponServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-server")
public interface CouponServiceFeign extends CouponServiceApi {

}
