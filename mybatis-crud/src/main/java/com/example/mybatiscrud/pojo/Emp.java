package com.example.mybatiscrud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

    private Integer id;

    private String username;

    private String password;

    private String name;

    private Short gender;

    private String image;

    private Short job; // 职位，说明：1.班主任 2.讲师 3.学工主管 4.教研主管 5.咨询师

    private LocalDate entryDate;  // 入职日期  年-月-日

    private Integer deptId;

    private LocalDateTime createTime; // 创建时间 年月日时分秒

    private LocalDateTime updateTime;

}
