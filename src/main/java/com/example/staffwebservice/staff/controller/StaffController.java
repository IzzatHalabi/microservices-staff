package com.example.staffwebservice.staff.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.staffwebservice.staff.dao.StaffDAO;
import com.example.staffwebservice.staff.vo.Staff;

@RestController
public class StaffController {

    private final StaffDAO mainDAO = new StaffDAO();

    @GetMapping("/staff/version-info")
    public Map<String, String> versionInfo() {
        Map<String, String> map = new HashMap<>();
        map.put("version", "1.2");
        return map;
    }

    @GetMapping("/staff")
    public List<Staff> list(HttpServletRequest request) {
        return mainDAO.listAll();
    }

    @GetMapping("/staff/{staffNo}")
    public Staff list(@PathVariable String staffNo, HttpServletRequest request) {
        return mainDAO.get(staffNo);
    }

    @PostMapping("/staff")
    public Map<String, String> create(Staff staff, HttpServletRequest request) {
        
        mainDAO.create(staff);

        Map<String, String> map = new HashMap<>();
        map.put("message", "Save is successful!");

        return map;
    }

}