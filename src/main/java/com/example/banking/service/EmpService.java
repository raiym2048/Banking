package com.example.banking.service;



import com.example.banking.models.Users1;

import java.util.List;

public interface EmpService {
    List<Users1> getAllEmp();

    Users1 saveEmp(Users1 employee);

    Users1 getEmpById(Long id);

    Users1 updateEmp(Users1 employee);

    void deleteEmpById(Long id);
}
