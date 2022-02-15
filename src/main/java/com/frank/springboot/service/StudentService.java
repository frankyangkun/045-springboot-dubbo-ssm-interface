package com.frank.springboot.service;

import com.frank.springboot.model.Student;

public interface StudentService {
    /**
     * 根据学生id查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 将值存入redis
     * @param id
     * @param object
     */
    void putRedis(Integer id, Object object);

    /**
     * 根据id查询学生详情
     * @param id
     * @return
     */
    Student queryStudentByRedis(Integer id);

    /**
     * 查询学生总人数
     * @return
     */
    Integer queryStudentCount();
}
