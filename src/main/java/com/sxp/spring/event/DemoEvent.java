package com.sxp.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by shengxiaopeng on 2017/1/4.
 */
public class DemoEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg=msg;
    }
}
