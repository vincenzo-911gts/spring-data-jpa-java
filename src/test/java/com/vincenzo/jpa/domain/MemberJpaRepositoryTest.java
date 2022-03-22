package com.vincenzo.jpa.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("h2")
@SpringBootTest
@Transactional
// @Rollback(value = false)
class MemberJpaRepositoryTest {
    @Autowired
    MemberJpaRepository memberJpaRepository;

    @Test
    public void insertMemberTest() {
        Member memberA = Member.builder().userName("mmemberA").build();
        Member savedMemberA = memberJpaRepository.save(memberA);

        Member memberB = Member.builder().userName("memberB").build();
        Member savedMemberB = memberJpaRepository.save(memberB);

        Member memberC = Member.builder().userName("memberC").build();
        Member savedMemberC = memberJpaRepository.save(memberC);
    }

    @Test
    public void testMember() {
        Member memberA = Member.builder().userName("mmemberA").build();
        Member savedMember = memberJpaRepository.save(memberA);
        Member findMember = memberJpaRepository.find(savedMember.getId());

        assertThat(findMember.getId()).isEqualTo(memberA.getId());
        assertThat(findMember.getUserName()).isEqualTo(memberA.getUserName());
        assertThat(findMember).isEqualTo(memberA); // findMember == memberA // 영속성컨텍스트의 동일성보장
    }
}