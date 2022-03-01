package com.example.api.member.service;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import com.example.api.member.domain.CalcDTO;
import com.example.api.member.domain.MemberDTO;
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

    @Override
    public String bmi(MemberDTO bmi) {
        String name = bmi.getName();
        double height = bmi.getHeight();
        double weight = bmi.getWeight();
        double b = weight / (height * height) * 10000;
        String res = "";
        if(b < 18.5) {
            res = "저체중";
        } else if(b <22.9){
            res = "정상";
        } else if(b < 24.9) {
            res = "과체중";
        } else if(b < 29.9){
            res = "경도비만";
        } else if(b < 34.9){
            res = "중도비만";
        }else {
            res = "고도비만";
        }
        return String.format("%s 님의 BMI는 %.2f으로 %s입니다.",name, b, res);
    }

    @Override
    public String grade(MemberDTO grade) {
        String name = grade.getName();
        int korscore = grade.getKorscore();
        int engscore = grade.getEngscore();
        int mathscore = grade.getMathscore();
        int sum = korscore + engscore + mathscore;
        int avg = sum / 3;
        String pass = (avg > 80) ? "합격" : "불합격";
        return String.format(" * 이름: %s\n" +
                " * > 국어: %d점 \n" +
                " * > 영어: %d점 \n" +
                " * > 수학: %d점\n" +
                " * 총점: %d점 \n" +
                " * 평균(정수): %d점\n" +
                " * 합격여부: %s\n",name, korscore, engscore, mathscore, sum, avg, pass);
    }

    @Override
    public String login(MemberDTO login) {
        String name = login.getName();
        String userid = login.getUserid();
        String password = login.getPassword();
        return (password.equals("abc")) ? String.format("%s 님의 로그인 성공하였습니다.", name):
                String.format("%s님의 아이디 %s는 맞고, 비번 %s은 틀립니다. 로그인 실패", name, userid, password);
    }
}
