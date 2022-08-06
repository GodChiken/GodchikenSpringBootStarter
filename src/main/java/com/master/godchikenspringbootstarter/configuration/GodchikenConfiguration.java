package com.master.godchikenspringbootstarter.configuration;

import com.master.godchikenspringbootstarter.model.Godchiken;
import com.master.godchikenspringbootstarter.properties.GodchikenProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GodchikenProperties.class)
public class GodchikenConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Godchiken godchiken(GodchikenProperties godchikenProperties) {
        return Godchiken.builder().howLong(godchikenProperties.getHowLong())
                .name(godchikenProperties.getName())
                .build();
    }

}
