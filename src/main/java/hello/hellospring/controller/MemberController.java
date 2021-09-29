package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// Controller 외부 요청 받음
@Controller
public class MemberController {

    private final MemberService memberService;

    // spring container에 등록 -> 생성자
    @Autowired
    public MemberController(MemberService mService) {
        this.memberService = mService;
    }
}
