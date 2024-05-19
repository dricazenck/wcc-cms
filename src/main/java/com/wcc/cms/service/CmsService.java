package com.wcc.cms.service;

import com.wcc.cms.domain.pages.TeamPage;
import com.wcc.cms.utils.FileUtil;
import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class CmsService {
  public TeamPage getTeamPage() {
    return new TeamPage("Team Page", "Core Team", "Check our team members", new ArrayList<>());
  }

  public String getSamplePage() {
    return FileUtil.readFileAsString("teamPage.json");
  }
}
