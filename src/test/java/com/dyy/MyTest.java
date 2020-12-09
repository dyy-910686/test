package com.dyy;

import com.dyy.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 邓育永
 * @date 2020/12/9 11:24
 */
public class MyTest {
    @Test
    public void test01(){
        //使用spring容器的对象
        //1.读取spring配置文件,并创建容器，其中ClassPathXmlApplicationContext表示从类路径中加载配置文件
        String config = "test01.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //2.从容器中获取某个对象
        SomeService someService = (SomeService)applicationContext.getBean("someService");
        //3.使用spring创建好的对象
        someService.dosome();
    }
}
