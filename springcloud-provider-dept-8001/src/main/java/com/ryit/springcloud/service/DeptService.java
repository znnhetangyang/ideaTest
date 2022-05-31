package com.ryit.springcloud.service;

import com.ryit.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
