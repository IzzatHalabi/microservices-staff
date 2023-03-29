package com.example.staffwebservice.staff.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.staffwebservice.staff.vo.Staff;

public class StaffDAO {

    private List<Staff> list = new ArrayList<>();

    public StaffDAO() {
        list.add(new Staff("00001", "Izzat Halabi"));
        list.add(new Staff("00002", "Syafiq Halabi"));
        list.add(new Staff("00003", "Haziq"));
    }

    public List<Staff> listAll() {
        return list;
    }

    public Staff get(String staffNo) {
        for (Staff vo : list) {
            if (vo.getStaffNo().equals(staffNo)) {
                return vo;
            }
        }
        return null;
    }

    public void create(Staff vo) {
        list.add(vo);
    }
    
}
