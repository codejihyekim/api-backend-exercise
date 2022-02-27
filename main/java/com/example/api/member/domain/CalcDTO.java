package com.example.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.example.api.member.domain
 * fileName        : CalcDTO
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
public class CalcDTO {
    private int num1;
    private int num2;
    private String opcode;
}
