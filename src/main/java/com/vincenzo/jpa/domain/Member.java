package com.vincenzo.jpa.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@ToString
@Getter
@Builder(builderClassName = "MemberBuilder")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String userName;

//    protected Member() {} // Jpa Proxy 때문에,
//    public Member(String userName) {
//        this.userName = userName;
//    }

    public static class MemberBuilder {
        private String userName;
    }
}
