package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원을 저장하면 저장된 회원이 반환
    Optional<Member> findById(Long id); //id로 회원 찾기
    Optional<Member> findByName(String name);
    List<Member> findAll(); //저장된 모든 회원 리스트 반환

}
