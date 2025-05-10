package com.hongge.beans.annoContext.aop.apis.advices.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

    private boolean locked;

    @Override
    public void lock() {
        this.locked = true;
    }

    @Override
    public void unlock() {
        this.locked = false;
    }

    @Override
    public boolean isLocked() {
        return locked;
    }

    // 拦截方法调用
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        if (isLocked() && invocation.getMethod().getName().startsWith("set")) {
            throw new RuntimeException("Object is locked!");
        }
        return super.invoke(invocation);
    }

}
