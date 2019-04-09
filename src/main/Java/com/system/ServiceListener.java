package com.system;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Create by GodWei on 2018/11/28
 * Good Good Study! Day Day Up!
 */
public class ServiceListener implements ServletContextListener {

    private Logger log=Logger.getLogger(ServiceListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.error("服务已启动！");
        log.error(servletContextEvent.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        log.error("服务已停止！");
        log.error(servletContextEvent.getServletContext());
    }
}
