package com.example.api.member.controller;

import com.example.api.member.domain.CalcDTO;
import com.example.api.member.domain.MemberDTO;
import com.example.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.example.api.member.controller
 * fileName        : MemberController
 * author          : codejihyekim
 * date            : 2022-02-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-27         codejihyekim      최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService service;

    @PostMapping("/grade")
    public String grade(@RequestBody MemberDTO grade){
        return service.grade(grade);
    }
    @PostMapping("/bmi")
    public String bmi(@RequestBody MemberDTO bmi){
        return service.bmi(bmi);
    }
    @PostMapping("/calc")
    public String calc(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }
    @PostMapping("/login")
    public String login(@RequestBody MemberDTO login){
        return service.login(login);
    }
}
