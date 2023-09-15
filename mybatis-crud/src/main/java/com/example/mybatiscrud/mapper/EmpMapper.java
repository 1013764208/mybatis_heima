package com.example.mybatiscrud.mapper;


import com.example.mybatiscrud.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    // 根据ID删除数据
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);


    // 新增员工信息
    @Insert("insert into emp(username, password,name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "values (#{username},#{password},#{name},#{gender},#{image},#{job},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);


    // 更新员工
    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender},image = #{image},entrydate = #{entryDate}, dept_id = #{deptId},update_time = #{updateTime} where id = #{id};")
    public void update(Emp emp);

    // 动态更新员工信息
    public void updata2(Emp emp);


    // 查询
    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);


    // 条件查询员工
//    @Select("select * from emp where name like '%${name}%' and gender = #{gender} and entrydate between #{begin} and #{end} order by update_time")
//    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);


    // 使用 XML 映射
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);


    // 批量删除员工
    public void deleteByIds(List<Integer> ids);
}

