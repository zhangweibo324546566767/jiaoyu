package com.roncoo;



import com.roncoo.education.yunying.common.service.InformationServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "roncoo-education-yunying-server")
public interface InformationServiceFeign extends InformationServiceApi {


}
