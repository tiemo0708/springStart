package hello.hellospring.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //스프링 컨테이너에 있는 멤버 서비스를 가져다 연결
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @GetMapping("/members/new")
    public String creatteForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new") //요청 데이터 처리 메시지 바디를 통해 서버로 요청 데이터 전달

    public  String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);
        return "redirect:/"; //홈화면 이동
    }
}
