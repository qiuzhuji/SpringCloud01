package com.lxl.feign.errimpl;

import com.lxl.entity.Student;
import com.lxl.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author: Bruce
 * @Date: 2021/4/1 11:09
 * @Description:
 */
@Component
public class FeignProviderError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务异常请稍后再试...";
    }
}
