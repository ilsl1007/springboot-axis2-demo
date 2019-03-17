package com.yulj.config;

import org.apache.axis2.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Axis注入bean配置
 *
 * @author yulj
 * @create: 2019/03/12 20:04
 */

@Configuration
public class WebConfig {

    /**
     * 配置servlet的Bean，添加axis2
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean myServletBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new AxisServlet(), "/services/*");
        servletRegistrationBean.addInitParameter("axis2.repository.path", this.getClass().getResource("/WEB-INF").getPath().toString());
        return servletRegistrationBean;
    }
}
