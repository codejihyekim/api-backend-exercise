package com.example.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.example.api.member.domain
 * fileName        : MemberDTO
 * author          : codejihyekim
 * date            : 2022-02-27
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-27         codejihyekim      최초 생성
 */
@Data
@Component
public class MemberDTO {
    private String name;
    private String userid;
    private double height;
    private double weight;
    private String password;
    private int korscore;
    private int engscore;
    private int mathscore;
}
