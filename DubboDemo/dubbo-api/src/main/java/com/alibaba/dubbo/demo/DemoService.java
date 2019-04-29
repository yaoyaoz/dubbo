package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * Created by yaoyao on 2019/4/28.
 */
public interface DemoService {

    List<String> getPermissions(Long id);

}
