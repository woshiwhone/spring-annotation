package com.sse.annotation.config;


import com.sse.annotation.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
public class MainConfigOfProperty {

    @Bean("person03")
    public Person person() {
        return new Person();
    }
}
