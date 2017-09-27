package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {


    @Select("select * from tb_user where name = #{name}")
    List<User> queryList(@Param("name") String name);

    @Insert("insert into tb_user (name, gender, age, password) " +
            "values (#{name},#{gender},#{age},#{password})")
    int insert(User user);

    @Update("update tb_user set name=#{name} where id=#{id}")
    int updateNameById(User user);


    @Delete("delete from tb_user where id=#{id}")
    int deleteById(Integer id);
}
