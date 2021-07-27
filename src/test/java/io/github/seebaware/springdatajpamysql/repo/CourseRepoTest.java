package io.github.seebaware.springdatajpamysql.repo;

import io.github.seebaware.springdatajpamysql.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class CourseRepoTest {

    @Autowired
    private CourseRepo courseRepo;

    @Test
    public void printCourses() {

        List<Course> courseList = courseRepo.findAll();

        System.out.println(courseList);

    }

    @Test
    public void findAllPagination() {

        Pageable firstPageWithFiveRecords = PageRequest.of(0, 5);
        Pageable secondPageWithTenRecords = PageRequest.of(1, 10);

        List<Course> courses = courseRepo.findAll(firstPageWithFiveRecords).getContent();

        long totalElements = courseRepo.findAll(firstPageWithFiveRecords).getTotalElements();

        long totalPages = courseRepo.findAll(firstPageWithFiveRecords).getTotalPages();

        System.out.println(courses);

        System.out.println(totalElements);

        System.out.println(totalPages);

    }

    @Test
    public void findAllSorting() {

        Pageable sortByTitle = PageRequest.of(0,2, Sort.by("title"));

        Pageable sortByCreditDesc = PageRequest.of(0,2, Sort.by("credit").descending());

        Pageable sortByTitleAndCreditDesc = PageRequest.of(0, 2, Sort.by("title").descending().and(Sort.by("credit")));

        List<Course> courseList = courseRepo.findAll(sortByTitle).getContent();

        System.out.println(courseList);

    }

    @Test
    public void findByTitleContaining() {
        Pageable firstPageRecords = PageRequest.of(0,10);
        List<Course> courseList = courseRepo.findByTitleContaining("J",firstPageRecords).getContent();
        System.out.println(courseList);
    }

}