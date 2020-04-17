package com.shengchan.sc;

import com.aki.TestInterface;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class TestInterfaceImpl implements TestInterface {
    @Override
    public String testString() {
        return "测试生产者";
    }
}
