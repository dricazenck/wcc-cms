package com.wcc.cms.domain.pages;

import com.wcc.cms.domain.Member;
import java.util.List;

public record TeamPage(String title, String subtitle, String description, List<Member> members) {}
