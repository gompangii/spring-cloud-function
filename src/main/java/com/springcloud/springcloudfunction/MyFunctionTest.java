package com.springcloud.springcloudfunction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MyFunctionTest {

  public Function<String, String> hello() {
    return value -> value.concat(" 안녕하세요?");
  }
}
