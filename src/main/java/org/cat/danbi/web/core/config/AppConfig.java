package org.cat.danbi.web.core.config;

import org.cat.danbi.web.core.LgTV;
import org.cat.danbi.web.core.SamsungTV;
import org.cat.danbi.web.core.TV;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TV samsungTV() {
        return new SamsungTV();
    }

    @Bean
    public TV lgTV() {
        return new LgTV();
    }
}
