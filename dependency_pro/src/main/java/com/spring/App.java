package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
        public static void main( String[] args )
        {
             String files[] = new String[]{"spring.xml","Location.xml","Student.xml","Mentor.xml","Classroom.xml","ListOfStudents.xml"} ;

            ApplicationContext context = new ClassPathXmlApplicationContext(files);
            ClassRoom class1 = (ClassRoom) context.getBean("c1");
//            ClassRoom class2 = (ClassRoom) context.getBean("c2");
//            ClassRoom class3 = (ClassRoom) context.getBean("c3");
//            FlippedClassRoom fc1 = (FlippedClassRoom) context.getBean("fc1");
//            fc1.GetClassRoomInfo();
            class1.ShowMentorInfo();


            class1.ShowStudentInfo();
//            class1.ShowLocationInfo();
//            class1.ObjectMatcher();
//            System.out.println("XXXXXXXXXXXXX");
//            class2.ShowStudentInfo();
//            class2.ShowLocationInfo();
//            System.out.println("XXXXXXXXXXXXX");
//            class3.ShowStudentInfo();
//            class3.ShowLocationInfo();
//            class3.ObjectMatcher();
//            System.out.println("XXXXXXXXXXXXX");


        }
}
