package com.wcc.cms.service;

import static org.junit.jupiter.api.Assertions.*;

import com.wcc.cms.domain.Member;
import com.wcc.cms.domain.MemberType;
import com.wcc.cms.domain.pages.TeamPage;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsServiceTest {

  @Autowired private CmsService service;

  @Test
  void getTeamTest() {
    var result = service.getTeam();

    var members = new ArrayList<Member>();
    var expected = new TeamPage("Meet our team", "Core Team", "Team description", members);

    assertEquals(expected.title(), result.title());
    assertEquals(expected.title(), result.title());

    Member member = result.members().get(0);
    assertEquals("Irina Kamalova", member.fullName());
    assertEquals(MemberType.DIRECTOR, member.memberType());
    assertEquals(2, result.members().size());
  }
}
