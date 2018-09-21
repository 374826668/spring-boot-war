package com.peng.springbootwar.dao;/**
 * Created with IntelliJ IDEA.
 *
 * @author li.peng
 * Date: 2018/9/20
 * Time: 15:55
 */

import com.peng.springbootwar.bean.AEmployeeCopyEntity;

/**
 *描述：dao
 * @author Li.peng
 *@create 2018-09-20 15:55
 */
public interface PengDao {
    int insert(AEmployeeCopyEntity aEmployeeCopyEntity);
    int deleteById(Long id);
    int updateById(AEmployeeCopyEntity aEmployeeCopyEntity);
    AEmployeeCopyEntity selectById(Long id);
//    Page<AEmployeeCopyEntity> queryForPage(int pageCurrent,int pageSize,String name);
}
