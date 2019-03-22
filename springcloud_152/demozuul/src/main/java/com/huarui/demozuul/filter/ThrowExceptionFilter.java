package com.huarui.demozuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:21 2019/3/21
 * @ Description  :
 */
public class ThrowExceptionFilter extends ZuulFilter {
    Logger logger= LoggerFactory.getLogger(ThrowExceptionFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.error("this is a RuntimeException...");
        doSomeThing();
        return null;
    }

    private void doSomeThing(){
        throw new RuntimeException();
    }
}
