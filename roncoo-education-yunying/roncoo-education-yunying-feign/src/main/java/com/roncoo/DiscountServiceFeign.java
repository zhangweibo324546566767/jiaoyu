package com.roncoo;

import com.roncoo.education.yunying.common.service.DiscountServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-server")
public interface DiscountServiceFeign extends DiscountServiceApi {
}
