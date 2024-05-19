package com.wcc.cms.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.wcc.cms.deserializer.MemberTypeDeserializer;
import com.wcc.cms.deserializer.SocialNetworkTypeDeserializer;
import com.wcc.cms.domain.MemberType;
import com.wcc.cms.domain.SocialNetworkType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfig {

  @Bean
  public ObjectMapper objectMapper() {
    ObjectMapper objectMapper = new ObjectMapper();
    registerCustomDeserializers(objectMapper);
    return objectMapper;
  }

  private void registerCustomDeserializers(ObjectMapper objectMapper) {
    objectMapper.registerModule(
        new SimpleModule()
            .addDeserializer(MemberType.class, new MemberTypeDeserializer())
            .addDeserializer(SocialNetworkType.class, new SocialNetworkTypeDeserializer()));
  }
}
