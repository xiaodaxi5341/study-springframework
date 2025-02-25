package com.hongge.beans.annoContext.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class CommandManager {


    public void process(Object commandState) {
        Command command = createCommand();
        command.setState(commandState);
        command.execute();
    }

    @Lookup
    protected abstract Command createCommand();
}
