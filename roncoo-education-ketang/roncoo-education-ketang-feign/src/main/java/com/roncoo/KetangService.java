package com.roncoo;


import com.roncoo.education.ketang.common.service.KetangApi;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-ketang-service")
public interface KetangService extends KetangApi {


}
