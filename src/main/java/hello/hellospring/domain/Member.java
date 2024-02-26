package hello.hellospring.domain;

public class Member {

    //요구 사항  id 식별자와 이름이 있어야함
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
