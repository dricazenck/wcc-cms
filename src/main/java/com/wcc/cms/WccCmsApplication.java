package com.wcc.cms;

import com.wcc.cms.configuration.ObjectMapperConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ObjectMapperConfig.class)
public class WccCmsApplication {

  public static void main(String[] args) {
    SpringApplication.run(WccCmsApplication.class, args);
  }
}
