package com.sxp.spring.aop;

import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author sxp
 * @create 2016/12/22.
 */

@Service
public class Bean1 {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name="sxp";

}
