package com.betulsahin.springbootcamp.schoolmanagementsystemdemov2;

import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.model.*;
import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service.CourseService;
import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service.InstructorService;
import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service.StudentService;
import com.betulsahin.springbootcamp.schoolmanagementsystemdemov2.service.CourseRegistrationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class SchoolManagementSystemDemoV2Application {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementSystemDemoV2Application.class, args);
    }

    @Bean
    public CommandLineRunner loadTestData(StudentService studentService,
                                          CourseService courseService,
                                          CourseRegistrationService courseRegistrationService,
                                          InstructorService instructorService){
        return args -> {

            // create students
            Student student1 = new Student("Ahmet Yılmaz", LocalDate.of(1990, Month.JANUARY,5), "Adana", GenderType.MALE.name());
            Student student2 = new Student( "Ayse Yılmaz", LocalDate.of(1994, Month.MARCH,20), "Ankara", GenderType.FEMALE.name());
            Student student3 = new Student( "Veli Yılmaz", LocalDate.of(1991, Month.NOVEMBER,15), "İstanbul", GenderType.MALE.name());
            Student student4 = new Student( "Nuran Yılmaz", LocalDate.of(1998, Month.APRIL,7), "Edirne", GenderType.FEMALE.name());
            Student student5 = new Student( "Zeynep Yılmaz", LocalDate.of(1995, Month.JUNE,22), "İzmir", GenderType.MALE.name());

            // saving students
            student1 = studentService.save(student1);
            student2 = studentService.save(student2);
            student3 = studentService.save(student3);
            student4 = studentService.save(student4);
            student5 = studentService.save(student5);

            // create courses
            Course course1 = new Course( "Bilgi Teknolojilerine Giriş", "btk1000", 100);
            Course course2 = new Course("JAVA İle Programlamaya Giriş", "btk1001", 100);
            Course course3 = new Course("Python ile Makine Öğrenmesi", "btk1002", 100);
            Course course4 = new Course("Doğal Dil İşlemeye Giriş", "btk1003", 100);
            Course course5 = new Course("Algoritma, Programlama ve Veri Yapıları", "btk1004", 100);
            Course course6 = new Course("HTML5 ile Web Geliştirme", "btk1005", 100);
            Course course7 = new Course("Büyük Veriye Giriş", "btk1006", 100);
            Course course8 = new Course("Uygulamalarla SQL Öğreniyorum", "btk1007", 100);

            // save courses
            course1 = courseService.save(course1);
            course2 = courseService.save(course2);
            course3 = courseService.save(course3);
            course4 = courseService.save(course4);
            course5 = courseService.save(course5);
            course6 = courseService.save(course6);
            course7 = courseService.save(course7);
            course8 = courseService.save(course8);

            // save student to courses
            CourseRegistration registration1 = new CourseRegistration(LocalDate.now());
            registration1.setCourse(course1);
            registration1.setStudent(student1);
            courseRegistrationService.save(registration1);

            CourseRegistration registration2 = new CourseRegistration(LocalDate.now());
            registration2.setCourse(course2);
            registration2.setStudent(student1);
            courseRegistrationService.save(registration2);

            CourseRegistration registration3 = new CourseRegistration(LocalDate.now());
            registration3.setCourse(course3);
            registration3.setStudent(student2);
            courseRegistrationService.save(registration3);

            CourseRegistration registration4 = new CourseRegistration(LocalDate.now());
            registration4.setCourse(course2);
            registration4.setStudent(student2);
            courseRegistrationService.save(registration4);

            CourseRegistration registration5 = new CourseRegistration(LocalDate.now());
            registration5.setCourse(course4);
            registration5.setStudent(student2);
            courseRegistrationService.save(registration5);

            CourseRegistration registration6 = new CourseRegistration(LocalDate.now());
            registration6.setCourse(course6);
            registration6.setStudent(student4);
            courseRegistrationService.save(registration6);

            CourseRegistration registration7 = new CourseRegistration(LocalDate.now());
            registration7.setCourse(course7);
            registration7.setStudent(student4);
            courseRegistrationService.save(registration7);

            CourseRegistration registration8 = new CourseRegistration(LocalDate.now());
            registration8.setCourse(course8);
            registration8.setStudent(student4);
            courseRegistrationService.save(registration8);

            CourseRegistration registration9 = new CourseRegistration(LocalDate.now());
            registration9.setCourse(course1);
            registration9.setStudent(student5);
            courseRegistrationService.save(registration9);

            CourseRegistration registration10 = new CourseRegistration(LocalDate.now());
            registration10.setCourse(course5);
            registration10.setStudent(student5);
            courseRegistrationService.save(registration10);

            CourseRegistration registration11 = new CourseRegistration(LocalDate.now());
            registration11.setCourse(course7);
            registration11.setStudent(student5);
            courseRegistrationService.save(registration11);

            // create instructors
            Instructor instructor1 = new VisitingResearcher("Şadi Evren Şeker", "İstanbul", "05554331256", 40, 250.0);
            Instructor instructor2 = new PermanentInstructor("Engin Demiroğ", "Ankara", "05554331256", 10000.0);
            Instructor instructor3 = new PermanentInstructor("Uras Mutlu", "İstanbul", "05554331256", 10000.0);
            Instructor instructor4 = new VisitingResearcher("Gizem Gezici", "Ankara", "05554331256", 40, 250.0);
            Instructor instructor5 = new VisitingResearcher("Zafer Cömert", "İzmir", "05554331256", 40, 250.0);
            Instructor instructor6 = new PermanentInstructor( "Fahrettin Erdinç", "İstanbul", "05554331256", 10000);
            Instructor instructor7 = new PermanentInstructor("Talha Kılıç", "Ankara", "05554331256", 10000);
            Instructor instructor8 = new PermanentInstructor( "Ömer Faruk Çolakoğlu", "İstanbul", "05554331256", 10000);

            // save instructors
            instructor1 = instructorService.save(instructor1);
            instructor2 = instructorService.save(instructor2);
            instructor3 = instructorService.save(instructor3);
            instructor4 = instructorService.save(instructor4);
            instructor5 = instructorService.save(instructor5);
            instructor6 = instructorService.save(instructor6);
            instructor7 = instructorService.save(instructor7);
            instructor8 = instructorService.save(instructor8);

            // update instructors
            instructorService.save(instructor1);
            instructorService.save(instructor2);
            instructorService.save(instructor4);
            instructorService.save(instructor5);
            instructorService.save(instructor6);
            instructorService.save(instructor7);

            // set instructors of courses
            course1.setInstructor(instructor1);
            course2.setInstructor(instructor5);
            course3.setInstructor(instructor6);
            course6.setInstructor(instructor2);
            course7.setInstructor(instructor2);
            course8.setInstructor(instructor2);
            course4.setInstructor(instructor4);
            course5.setInstructor(instructor7);

            // update courses
            courseService.save(course1);
            courseService.save(course2);
            courseService.save(course3);
            courseService.save(course4);
            courseService.save(course5);
            courseService.save(course6);
            courseService.save(course7);
            courseService.save(course8);

        };
    }
}
