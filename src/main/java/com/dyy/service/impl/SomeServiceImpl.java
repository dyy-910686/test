package com.dyy.service.impl;

import com.dyy.service.SomeService;

/**
 * @author 邓育永
 * @date 2020/12/9 11:09
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void dosome() {
        System.out.println("执行了dosome方法");
    }
}
