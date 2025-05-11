package com.hongge.beans.xmlContext.tx;


public class DefaultFooService implements FooService {
    @Override
    public Foo getFoo(String fooName) {
        return new Foo();
    }

    @Override
    public Foo getFoo(String fooName, String barName) {
        return new Foo();
    }

    @Override
    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateFoo(Foo foo) {

    }
}
