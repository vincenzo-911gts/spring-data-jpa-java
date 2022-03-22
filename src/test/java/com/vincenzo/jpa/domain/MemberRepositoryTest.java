package com.vincenzo.jpa.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("h2")
@Rollback(value = false)
@Transactional
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testMember() {
        Member memberA = Member.builder().userName("mmemberA").build();
        Member savedMember = memberRepository.save(memberA);
        Member findMember = memberRepository.findById(savedMember.getId()).get();

        assertThat(findMember.getId()).isEqualTo(memberA.getId());
        assertThat(findMember.getUserName()).isEqualTo(memberA.getUserName());
        assertThat(findMember).isEqualTo(memberA); // findMember == memberA // 영속성컨텍스트의 동일성보장
    }
}