package com.example.api.member.service;

import com.example.api.member.domain.CalcDTO;
import com.example.api.member.domain.MemberDTO;

/**
 * packageName: com.example.api.member.service
 * fileName        : MemberService
 * author          : codejihyekim
 * date            : 2022-02-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-27         codejihyekim      최초 생성
 */
public interface MemberService {
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
