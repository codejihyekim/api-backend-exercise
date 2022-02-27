package com.example.api.member.service;

import com.example.api.member.domain.CalcDTO;
import com.example.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: com.example.api.member.service
 * fileName        : MemberServiceImpl
 * author          : codejihyekim
 * date            : 2022-02-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-27         codejihyekim      최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case "+": res = a+b;break;
            case "-": res = a-b;break;
            case "*": res = a*b;break;
            case "/": res = a/b;break;
            case "%": res = a%b;break;
        }
        return String.format("%d %s %d = %d", a,op,b,res);
    }
}
