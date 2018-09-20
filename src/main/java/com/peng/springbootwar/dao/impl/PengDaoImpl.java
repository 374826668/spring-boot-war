package com.peng.springbootwar.dao.impl;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/20
 * Time: 15:58
 */

import com.peng.springbootwar.bean.AEmployeeCopyEntity;
import com.peng.springbootwar.dao.PengDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *描述：impl
 * @author Li.peng
 *@create 2018-09-20 15:58
 */
@Repository
public class PengDaoImpl implements PengDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public int insert(AEmployeeCopyEntity aEmployeeCopyEntity) {
        String sql="INSERT INTO a_employee_copy  (name,email) VALUE(?,?)";
        return jdbcTemplate.update(sql,aEmployeeCopyEntity.getName(),aEmployeeCopyEntity.getEmail());
    }

    @Override
    public int deleteById(Long id) {
        String sql="delete from a_employee_copy a where a.id=?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateById(AEmployeeCopyEntity aEmployeeCopyEntity) {
        String sql="update a_employee_copy a set a.name=? , a.email=? where a.id=?";
        return jdbcTemplate.update(sql,aEmployeeCopyEntity.getName(),aEmployeeCopyEntity.getEmail(),aEmployeeCopyEntity.getId());
    }

    @Override
    public AEmployeeCopyEntity selectById(Long id) {
        String sql="select  * from a_employee_copy a where a.id=?";
        return jdbcTemplate.queryForObject(sql, new RowMapper<AEmployeeCopyEntity>() {
            @Override
            public AEmployeeCopyEntity mapRow(ResultSet resultSet, int i) throws SQLException {
                AEmployeeCopyEntity aEmployeeCopyEntity=new AEmployeeCopyEntity();
                aEmployeeCopyEntity.setId(resultSet.getLong("id"));
                aEmployeeCopyEntity.setName(resultSet.getString("name"));
                aEmployeeCopyEntity.setEmail(resultSet.getString("email"));
                return aEmployeeCopyEntity;
            }
        },id);
    }
}
