package org.springframework.mingj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @ClassName ITesteService
 * @Description TODO描述
 * @Author mingj
 * @Date 2020/1/26 19:31
 **/
@Service
public class ITestService {


	@Autowired
	private IHelloService service;

    public void test(String name){
        System.out.println(name + "test method");
    }
}
