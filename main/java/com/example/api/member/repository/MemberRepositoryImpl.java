package com.example.api.member.repository;

import com.example.api.member.domain.CalcDTO;
import com.example.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName: com.example.api.member.repository
 * fileName        : MemberRepositoryImpl
 * author          : codejihyekim
 * date            : 2022-02-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-27         codejihyekim      최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository{
    @Override
    public String calc(CalcDTO calc) {
        return null;
    }

    @Override
    public String bmi(MemberDTO bmi) {
        return null;
    }

    @Override
    public String grade(MemberDTO grade) {
        return null;
    }

    @Override
    public String login(MemberDTO login) {
        return null;
    }
}
