package hello.hellospring.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //스프링 컨테이너에 있는 멤버 서ql스를 가져다 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
