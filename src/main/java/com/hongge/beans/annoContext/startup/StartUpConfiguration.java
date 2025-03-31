package com.hongge.beans.annoContext.startup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

@Configuration
public class StartUpConfiguration {

    @Bean
    public FlightRecorderApplicationStartup applicationStartup() {
        return new FlightRecorderApplicationStartup();
    }

}
