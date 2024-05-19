package com.wcc.cms.controller;

import com.wcc.cms.domain.pages.TeamPage;
import com.wcc.cms.service.CmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cms/v1/")
public class CmsController {

  private final CmsService cmsService;

  @Autowired
  public CmsController(CmsService service) {
    this.cmsService = service;
  }

  @GetMapping("/team")
  public TeamPage getTeamPage() {
    return cmsService.getTeamPage();
  }

  @GetMapping("/sample")
  public String getStaticTeamPage() {
    return cmsService.getSamplePage();
  }
}
