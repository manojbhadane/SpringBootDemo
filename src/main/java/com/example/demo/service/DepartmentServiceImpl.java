package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }

    @Override
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department d = departmentRepository.findById(departmentId).get();
        if (Objects.nonNull(d.getDepartmentName()) && !"".equalsIgnoreCase(d.getDepartmentName())){
            d.setDepartmentName(department.getDepartmentName());
        }
        if (Objects.nonNull(d.getDepartmentAddress()) && !"".equalsIgnoreCase(d.getDepartmentAddress())){
            d.setDepartmentAddress(department.getDepartmentAddress());
        }
        if (Objects.nonNull(d.getDepartmentCode()) && !"".equalsIgnoreCase(d.getDepartmentCode())){
            d.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(d);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
