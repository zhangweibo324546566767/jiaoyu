package com.roncoo;

import com.roncoo.education.ketang.common.service.KetangBijiApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-ketang-service")
public interface KetangBijiService extends KetangBijiApi {

}
