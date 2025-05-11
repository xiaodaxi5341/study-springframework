package com.hongge.beans.xmlContext.tx.reactive;

import com.hongge.beans.xmlContext.tx.Foo;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class DefaultFooService implements FooService {
    @Override
    public Flux<Foo> getFoo(String fooName) {
        return null;
    }

    @Override
    public Publisher<Foo> getFoo(String fooName, String barName) {
        return null;
    }

    @Override
    public Mono<Void> insertFoo(Foo foo) {
        throw new UnsupportedOperationException("reactive not supported");
    }

    @Override
    public Mono<Void> updateFoo(Foo foo) {
        return null;
    }
}
