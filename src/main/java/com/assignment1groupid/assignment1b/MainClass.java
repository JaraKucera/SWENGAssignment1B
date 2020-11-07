package com.assignment1groupid.assignment1b;

import com.assignment1groupid.assignment1.Course;
import com.assignment1groupid.assignment1.Module;
import com.assignment1groupid.assignment1.Student;
import org.joda.time.DateTime;

public class MainClass {
    
    public static void main(String[] args) {
         
        //Student Inits
        Student john = new Student("John",18, "01/02/2002", 989784);
        Student steve = new Student("Steve",19, "02/03/2001", 989783);
        Student sam = new Student("Sam",18, "05/11/2002", 989782);
    
        //Course Init
        Course ct404 = new Course("CT404", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        Course ct405 = new Course("CT405", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
        Course ct300 = new Course("CT300", new DateTime("2020-08-01"), new DateTime("2020-12-20"));
    
        //Module Init
        Module systemsModule = new Module("Systems", 11256);
        Module machineLearningModule = new Module("Machine Learning", 11257);
        Module unprofessionalSkillsModule = new Module("UnProfessional Skills", 11258);
        Module programmingModule = new Module("Programming", 11259);
    
        //CT404 -> Systems & ML, CT405 -> Unprofessional Skills & programming, CT300 -> Programming
        ct404.addModule(systemsModule);
        ct404.addModule(machineLearningModule);
        ct405.addModule(unprofessionalSkillsModule);
        ct405.addModule(programmingModule);
        ct300.addModule(programmingModule);
    
        //John -> ct300 -> programming
        //Steve -> ct404 & ct300 -> programming & Systems ! ML
        //Sam -> ct405 & ct404 -> unprofessional skills & Systems & ML
        john.addCourse(ct300);
        john.addModule(programmingModule);
    
        steve.addCourse(ct404);
        steve.addCourse(ct300);
        steve.addModule(programmingModule);
        steve.addModule(systemsModule);
    
        sam.addCourse(ct405);
        sam.addCourse(ct404);
        sam.addModule(systemsModule);
        sam.addModule(machineLearningModule);
        sam.addModule(unprofessionalSkillsModule);
    
        System.out.println(john.getUsername()+"\n"+john.courseList()+"\n"+john.moduleList());
        System.out.println(steve.getUsername()+"\n"+steve.courseList()+"\n"+steve.moduleList());
        System.out.println(sam.getUsername()+"\n"+sam.courseList()+"\n"+sam.moduleList());
        System.out.println();
        System.out.println(ct404.moduleList());
        System.out.println(ct405.moduleList());
        System.out.println(ct300.moduleList());
        System.out.println();
        System.out.println(systemsModule.courseList());
        System.out.println(machineLearningModule.courseList());
        System.out.println(unprofessionalSkillsModule.courseList());
        System.out.println(programmingModule.courseList());
        System.out.println();
    
    }
}
