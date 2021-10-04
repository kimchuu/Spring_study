package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 데이터 jpa가 jpaRepository보고 자동으로 spring bean 등록해줌
public interface SpringDataMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL가 select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
