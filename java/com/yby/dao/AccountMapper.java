package com.yby.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yby.enity.Account;

@Mapper
public interface AccountMapper {
	//添加
	@Insert({"INSERT INTO "
			+ "account(name,money)"
			+ " VALUES"
			+ "(#{name},#{money})"})
	Boolean insert(Account account);
	
	//删除
	@Delete({"DELETE "
			+ "FROM account "
			+ "WHERE id=#{id}"})
	Boolean deleteById(@Param("id") int id);
	
	//更新
	@Update({"UPDATE account SET name=#{name} ,money=#{money} WHERE id=#{id}"})
	Boolean updateById(Account account);
	
	//查询所有信息
	@Select({"select * from account"})
	List<Account> getAll();
	
	
	/**
	 * insert
	 * updateById
	 * findByCondition()
	 * get()
	 * count()
	 */
	
	//TODO  参数封装 ， AccountMapper 动态sql -- update
	
	
}
