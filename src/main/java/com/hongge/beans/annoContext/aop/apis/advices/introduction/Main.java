package com.hongge.beans.annoContext.aop.apis.advices.introduction;

import org.springframework.aop.framework.ProxyFactory;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProxyFactory proxyFactory = new ProxyFactory(product);
        proxyFactory.addAdvisor(new LockAdvisor());
        proxyFactory.setOptimize(true);

        Product proxy = (Product) proxyFactory.getProxy();

        Lockable lockable = (Lockable) proxy;
        proxy.setName("还行吧");

        System.out.println(proxy.getName());

        lockable.lock();
        proxy.setName("出错了");
    }
}
