package hello.hellospring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //jpa가 관리
public class Member {

    //요구 사항  id 식별자와 이름이 있어야함
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //임의로 시스템이 정하는 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
