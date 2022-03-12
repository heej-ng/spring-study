package com.example.inf_hello.repository;

import com.example.inf_hello.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL select m from Member m where m.name = ?
    // 메소드 이름만으로도 조회 기능 제공
    // 메소드 이름을 규칙을 통해 기능 알아서 만들어준다
    @Override
    Optional<Member> findByName(String name);
}
