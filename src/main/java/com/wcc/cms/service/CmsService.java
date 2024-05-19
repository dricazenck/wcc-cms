package com.wcc.cms.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wcc.cms.domain.pages.CollaboratorsPage;
import com.wcc.cms.domain.pages.TeamPage;
import com.wcc.cms.utils.FileUtil;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmsService {
  private final ObjectMapper objectMapper;

  @Autowired
  public CmsService(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  public TeamPage getTeam() {
    String teamPage = FileUtil.readFileAsString("teamPage.json");

    try {
      return objectMapper.readValue(teamPage, TeamPage.class);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }

  public CollaboratorsPage getCollaborators() {
    return new CollaboratorsPage(
        "Collaborators", "Collaborators Team", "Check our volunteers", new ArrayList<>());
  }
}
