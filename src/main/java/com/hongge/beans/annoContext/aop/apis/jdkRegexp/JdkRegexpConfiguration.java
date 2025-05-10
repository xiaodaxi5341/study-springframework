package com.hongge.beans.annoContext.aop.apis.jdkRegexp;

import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdkRegexpConfiguration {

    @Bean
    public JdkRegexpMethodPointcut settersAndAbsquatulatePointcut(){
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPatterns(".*set.*", ".*absquatulate");
        return pointcut;
    }


//    @Bean
//    public RegexpMethodPointcutAdvisor regexpMethodPointcutAdvisor() {
//        RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor();
//        MethodInterceptor methodInterceptor = invocation -> {
//            System.out.println("[Regexp Advisor] Before: " + invocation.getMethod().getName());
//            return invocation.proceed();
//        };
//        advisor.setAdvice(methodInterceptor);
//        advisor.setPatterns(".*set.*", ".*absquatulate");
//        return advisor;
//    }

}
