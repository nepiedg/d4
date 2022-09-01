package com.example.d4.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.d4.entity.Employee;
import com.example.d4.mapper.EmployeeMapper;
import com.example.d4.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
