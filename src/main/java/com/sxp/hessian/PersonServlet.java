package com.sxp.hessian;
import com.caucho.hessian.server.HessianServlet;

public class PersonServlet extends HessianServlet{
  
    private static final long serialVersionUID = -343120217079779622L;  
  
    /** 
     * 实现服务端接口的方法 
     */  
    public Person getPerson(Person bean) {  
        System.out.println("客户端参数：" + bean.getUserId() + "\t"  
                + bean.getUserName());  
        bean.setUserName("Server111:" + bean.getUserName());
        return bean;  
    }  
  
}  