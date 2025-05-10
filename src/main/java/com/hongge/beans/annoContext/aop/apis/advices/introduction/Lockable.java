package com.hongge.beans.annoContext.aop.apis.advices.introduction;

public interface Lockable {

    void lock();
    void unlock();
    boolean isLocked();

}
