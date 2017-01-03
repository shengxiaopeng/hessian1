package com.sxp.hessian;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

public class PersonTest {
    public static void main(String[] args) {  
        // 服务器访问路径  
        String url = "http://127.0.0.1:8080/PersonServlet";
        HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
        try {  
            // IHello是客户端的接口，与服务器接口一致（客户端的语言包括：Java,Objective C,Flex 等）  
            IPersonServer iPersonServer = (IPersonServer) hessianProxyFactory  
                    .create(IPersonServer.class, url);
            // 客户端调服务器的接口实现  
            Person person = new Person();
            person.setUserId("1001");
            person.setUserName("mingxue.zhang@163.com");  
            Person resultBean = iPersonServer.getPerson(person);  
            System.out.println(resultBean.getUserId() + "\t"  
                    + resultBean.getUserName());  
        } catch (MalformedURLException e) {
            e.printStackTrace();  
        }  
    }  
} 