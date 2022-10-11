package com.example.banking.service;


import com.example.banking.models.Users1;
import com.example.banking.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    private UserRepository userRepository;

    public EmpServiceImpl(UserRepository employeeRepository) {
        this.userRepository = employeeRepository;
    }

    @Override
    public List<Users1> getAllEmp() {
        return (List<Users1>) userRepository.findAll();
    }

    @Override
    public Users1 saveEmp(Users1 employee) {
        return userRepository.save(employee);
    }

    @Override
    public Users1 getEmpById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public Users1 updateEmp(Users1 employee) {
        return userRepository.save(employee);
    }


    @Override
    public void deleteEmpById(Long id) {
        userRepository.deleteById(id);
    }
}
