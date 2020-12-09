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


        /*
            1.读取spring配置文件,并创建容器，其中ClassPathXmlApplicationContext表示从类路径中加载配置文件，
            读取配置文件的过程中，spring会创建配置文件中所有的对象，并将创建的对象放入spring容器中
        */
        String config = "test01.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        //2.从容器中获取某个对象
        SomeService someService = (SomeService)applicationContext.getBean("someService");
        //3.使用spring创建好的对象
        someService.dosome();
    }
}
