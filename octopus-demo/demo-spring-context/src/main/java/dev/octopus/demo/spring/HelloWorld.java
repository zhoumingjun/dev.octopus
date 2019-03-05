package dev.octopus.demo.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean , DisposableBean {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    public void hi(){
        logger.info("hi");
    }

    public void afterPropertiesSet(){
        logger.info("after properties set");
    }

    public void destroy(){
        logger.info("destroy");
    }
}
