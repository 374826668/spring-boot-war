package com.peng.springbootwar;

import com.peng.springbootwar.bean.AEmployeeCopyEntity;
import com.peng.springbootwar.dao.PengDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWarApplicationTests {
    @Autowired
    private PengDao pengDao;

    @Test
    public void insert(){
        AEmployeeCopyEntity aEmployeeCopyEntity=new AEmployeeCopyEntity();
        aEmployeeCopyEntity.setName("李鹏");
        aEmployeeCopyEntity.setEmail("374826668@qq.com");
        int count=pengDao.insert(aEmployeeCopyEntity);
        System.out.println(count);
    }

    @Test
    public void deleteById(){
        int count=pengDao.deleteById(7L);
        System.out.println(count);
    }

    @Test
    public void  updateById(){
        AEmployeeCopyEntity aEmployeeCopyEntity=new AEmployeeCopyEntity();
        aEmployeeCopyEntity.setId(7L);
        aEmployeeCopyEntity.setName("李鹏测试");
        aEmployeeCopyEntity.setEmail("374826669@qq.com");
        int count=pengDao.updateById(aEmployeeCopyEntity);
    }

    @Test
    public void  selectById(){
        AEmployeeCopyEntity aEmployeeCopyEntity=pengDao.selectById(7L);
        System.out.println(aEmployeeCopyEntity.getName()+"              "+aEmployeeCopyEntity.getEmail());
    }
}
