package com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service;

import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.model.CourseRegistration;
import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistrationService implements BaseService<CourseRegistration> {
    private CrudRepository courseRegistrationDaoJpa;

    public CourseRegistrationService(@Qualifier("courseRegistrationDaoJpaImpl") CrudRepository courseRegistrationDaoJpa) {
        this.courseRegistrationDaoJpa = courseRegistrationDaoJpa;
    }

    @Override
    public List<CourseRegistration> findAll() {
        return courseRegistrationDaoJpa.findAll();
    }

    @Override
    public CourseRegistration findById(Long id) {
        return (CourseRegistration) courseRegistrationDaoJpa.findById(id);
    }

    @Override
    public CourseRegistration save(CourseRegistration courseRegistration) {
        return (CourseRegistration) courseRegistrationDaoJpa.save(courseRegistration);
    }

    @Override
    public void deleteById(Long id) {

    }
}
