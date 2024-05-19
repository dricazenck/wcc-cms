package com.wcc.cms.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.wcc.cms.domain.SocialNetworkType;
import java.io.IOException;
import java.util.Arrays;

public class SocialNetworkTypeDeserializer extends JsonDeserializer<SocialNetworkType> {

  @Override
  public SocialNetworkType deserialize(JsonParser jsonParser, DeserializationContext context) {
    try {
      var value = jsonParser.getText();

      return Arrays.stream(SocialNetworkType.values())
          .filter(memberType -> memberType.name().equalsIgnoreCase(value))
          .findFirst()
          .orElse(SocialNetworkType.UNKNOWN);
    } catch (IOException ex) {
      return SocialNetworkType.UNKNOWN;
    }
  }
}
