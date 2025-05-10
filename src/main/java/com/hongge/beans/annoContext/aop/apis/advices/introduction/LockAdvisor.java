package com.hongge.beans.annoContext.aop.apis.advices.introduction;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockAdvisor extends DefaultIntroductionAdvisor {
    public LockAdvisor() {
        super(new LockMixin(), Lockable.class);
    }
}
