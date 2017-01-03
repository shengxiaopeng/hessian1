package  com.sxp.hessian;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 3400062242004002707L;  
    private String userId;  
    private String userName;  
  
    public String getUserId() {  
        return userId;  
    }  
  
    public void setUserId(String userId) {  
        this.userId = userId;  
    }  
  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
  
} 