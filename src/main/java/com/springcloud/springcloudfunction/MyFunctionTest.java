package com.springcloud.springcloudfunction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Configuration
@Component
public class MyFunctionTest {

  public Function<String, String> hello() {
    return value -> value.concat(" 안녕하세요?");
  }
}
