package com.lxl.feign;

import com.lxl.entity.Student;
import com.lxl.feign.errimpl.FeignProviderError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Author: Bruce
 * @Date: 2021/4/1 11:00
 * @Description:
 */
@FeignClient(value="provider", fallback = FeignProviderError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
