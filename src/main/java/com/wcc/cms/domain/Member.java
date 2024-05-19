package com.wcc.cms.domain;

import java.util.List;

public record Member(
    String fullName,
    String position,
    MemberType memberType,
    String imagePath,
    List<SocialNetwork> socialNetwork) {}
