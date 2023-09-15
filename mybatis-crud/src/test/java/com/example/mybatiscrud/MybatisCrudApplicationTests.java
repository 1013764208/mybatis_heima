package com.example.mybatiscrud;

import com.example.mybatiscrud.mapper.EmpMapper;
import com.example.mybatiscrud.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisCrudApplicationTests {

    @Autowired
    private EmpMapper empMapper;


    @Test
    public void testDelete() {
        empMapper.delete(17);
    }

    @Test
    public void testInsert() {

        Emp emp = new Emp();
        emp.setUsername("Tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntryDate(LocalDate.of(2000, 1, 1));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        // 执行新增员工信息操作
        empMapper.insert(emp);
    }


    // 更新员工
    @Test
    public void testUpdate() {
        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom-mari");
        emp.setName("汤姆-玛丽");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntryDate(LocalDate.of(2000, 1, 1));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.update(emp);
    }

    // 根据ID查询
    @Test
    public void testGetById(){
        Emp emp = empMapper.getById(2);
        System.out.println(emp);
    }

    // 根据条件查询
    @Test
    public void testList(){
//        List<Emp> empList = empMapper.list("张", (short) 1, LocalDate.of(2010, 1, 1), LocalDate.of(2020, 1, 1));
        List<Emp> empList = empMapper.list("张", (short) 1, null, null);
        System.out.println(empList);
    }

    @Test
    public void testUpdate2(){

        Emp emp = new Emp();
        emp.setId(18);
        emp.setUsername("Tom-mari-2023");
        emp.setName("汤姆-玛丽");
        emp.setImage("1.jpg");

        empMapper.updata2(emp);
    }

    @Test
    public void testDeleteByIds(){
        List<Integer> ids = Arrays.asList(13, 14, 15);
        empMapper.deleteByIds(ids);
    }
}
