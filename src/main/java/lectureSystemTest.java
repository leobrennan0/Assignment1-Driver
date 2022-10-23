import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.util.ArrayList;


public class lectureSystemTest {



    public static void main(String[] args)
    {
        //                              -------COMPUTER SCIENCE DATA-------

        //computer science students
        Student johnMurphy = new Student("John Murphy", 21, LocalDate.parse("2001-01-01"), 1);
        Student maryHannon = new Student("Mary Hannon", 20, LocalDate.parse("2002-12-02"), 2);
        Student adamByrne = new Student("Adam Byrne", 21, LocalDate.parse("2001-02-10"), 3);

        //computer science lecturers
        Lecturer johnSmith = new Lecturer("John Smith", 42, LocalDate.parse("1980-01-03"), 1);
        Lecturer anneFlynn = new Lecturer("Anne Flynn", 44, LocalDate.parse("1978-04-09"), 2);
        Lecturer martinHenry = new Lecturer("Martin Henry", 50, LocalDate.parse("1972-11-01"), 3);

        //computer science modules
        Module softwareEngineering = new Module("Software Engineering", 1, johnSmith);
        Module networks = new Module("Networks", 2, anneFlynn);
        Module cryptography = new Module("Cryptography", 3, martinHenry);

        //computer science course
        Course computerScience = new Course("Computer Science", LocalDate.parse("2020-01-09"), LocalDate.parse("2024-01-05"));

        //adding modules to computer science
        computerScience.modules.add(softwareEngineering);
        computerScience.modules.add(networks);
        computerScience.modules.add(cryptography);

        //adding students to computer science
        computerScience.students.add(johnMurphy);
        computerScience.students.add(maryHannon);
        computerScience.students.add(adamByrne);

        //adds computer science to all students course variable
        for(int i = 0;i < computerScience.students.size();i++)
        {
            computerScience.students.get(i).course = computerScience;

            //adds computer science modules to students modules list and adds students to each modules list dynamically
            for(int j = 0;j < computerScience.modules.size();j++)
            {
                computerScience.modules.get(j).students.add(computerScience.students.get(i));
                computerScience.students.get(i).modules.add(computerScience.modules.get(j));
            }
        }

        //adds modules to lecturers modules list and adds computer science to modules courses list
        for (Module module : computerScience.modules)
        {
            module.courses.add(computerScience);
            module.lecturer.modules.add(module);
        }




        //                              -------BIS DATA-------

        //BIS Students
        Student alexCarey = new Student("Alex Carey", 20, LocalDate.parse("2002-07-11"), 4);
        Student daraMullery = new Student("Dara Mullery", 20, LocalDate.parse("2002-11-02"), 5);
        Student cormacDarby = new Student("Cormac Darby", 20, LocalDate.parse("2002-03-08"), 6);

        //BIS Lecturers
        Lecturer alexBurke = new Lecturer("Alex Burke", 40, LocalDate.parse("1982-11-03"), 4);
        Lecturer hazelPreda = new Lecturer("Hazel Preda", 42, LocalDate.parse("1980-02-09"), 5);
        Lecturer brianKilloran = new Lecturer("Brian Killoran", 40, LocalDate.parse("1982-02-10"), 6);

        //BIS Modules
        Module business = new Module("Business", 4, alexBurke);
        Module economics = new Module("Economics", 5, hazelPreda);
        Module dataScience = new Module("Data Science", 6, brianKilloran);

        //BIS Course
        Course bis = new Course("Business & Information Systems", LocalDate.parse("2020-01-09"), LocalDate.parse("2024-01-05"));

        //adding modules to bis
        bis.modules.add(business);
        bis.modules.add(economics);
        bis.modules.add(dataScience);
        bis.modules.add(softwareEngineering);

        //adding students to bis
        bis.students.add(alexCarey);
        bis.students.add(daraMullery);
        bis.students.add(cormacDarby);

        //adds bis to all students course variable
        for(int i = 0;i < bis.students.size();i++)
        {
            bis.students.get(i).course = bis;

            //adds bis modules to students modules list and adds students to each modules list dynamically
            for(int j = 0;j < bis.modules.size();j++)
            {
                bis.modules.get(j).students.add(bis.students.get(i));
                bis.students.get(i).modules.add(bis.modules.get(j));
            }
        }

        //adds modules to lecturers modules list and adds bis to modules courses list
        for (Module module : bis.modules)
        {
            module.courses.add(bis);
            module.lecturer.modules.add(module);
        }




        //                              -------DATA ANALYTICS-------

        //data analytics students
        Student joeDevine = new Student("Joe Devine", 20, LocalDate.parse("2002-06-10"), 7);
        Student robertMcIntyre = new Student("Robert McIntyre", 20, LocalDate.parse("2002-10-01"), 8);
        Student oisinKeenan = new Student("Oisin Keenan", 20, LocalDate.parse("2002-02-07"), 9);

        //data analytics Lecturers
        Lecturer daireFleming = new Lecturer("Daire Fleming", 40, LocalDate.parse("1982-09-03"), 7);
        Lecturer sarahMurphy = new Lecturer("Sarah Murphy", 42, LocalDate.parse("1980-01-04"), 8);
        Lecturer seanBlackwell = new Lecturer("Sean Blackwell", 40, LocalDate.parse("1982-08-02"), 9);

        //Data Analytics Modules
        Module algebra = new Module("Algebra", 7, daireFleming);
        Module socialScience = new Module("Social Science", 8, sarahMurphy);
        Module machineLearning = new Module("Machine Learning", 9, seanBlackwell);

        //Data Analytics course
        Course dataAnalytics = new Course("Data Analytics", LocalDate.parse("2020-01-09"), LocalDate.parse("2024-01-05"));

        //Data Analytics modules
        dataAnalytics.modules.add(algebra);
        dataAnalytics.modules.add(socialScience);
        dataAnalytics.modules.add(machineLearning);
        dataAnalytics.modules.add(dataScience);
        dataAnalytics.modules.add(networks);

        //Data Analytics Students
        dataAnalytics.students.add(joeDevine);
        dataAnalytics.students.add(robertMcIntyre);
        dataAnalytics.students.add(oisinKeenan);

        //adds Data Analytics to all students course variable
        for(int i = 0;i < dataAnalytics.students.size();i++)
        {
            dataAnalytics.students.get(i).course = dataAnalytics;

            //adds data analytics modules to students modules list and adds students to each modules list dynamically
            for(int j = 0;j < dataAnalytics.modules.size();j++)
            {
                dataAnalytics.modules.get(j).students.add(dataAnalytics.students.get(i));
                dataAnalytics.students.get(i).modules.add(dataAnalytics.modules.get(j));
            }
        }

        //adds modules to lecturers modules list and adds data analytics to modules courses list
        for (Module module : dataAnalytics.modules)
        {
            module.courses.add(dataAnalytics);
            module.lecturer.modules.add(module);
        }
        
        
        //                              --------PRINTING DATA--------

        System.out.println("--------COURSE DETAILS--------");

        //Computer Science data
        System.out.println("COURSE: " + computerScience.name + "");
        String csModules = "MODULES:\n";
        for (Module module: computerScience.modules)
        {
            csModules += "        " + module.name + "\n";
        }
        System.out.println(csModules);

        //bis data
        System.out.println("\nCOURSE: " + bis.name);
        String bisModules = "MODULES:\n";
        for (Module module: bis.modules)
        {
            bisModules += "        " + module.name + "\n";
        }
        System.out.println(bisModules);

        //Data Analytics data
        System.out.println("\nCOURSE: " + dataAnalytics.name);
        String daModules = "MODULES:\n";
        for (Module module: dataAnalytics.modules)
        {
            daModules += "        " + module.name + "\n";
        }
        System.out.println(daModules);



        //Student data
        System.out.println("--------STUDENT DETAILS--------");

        //create an array of courses to loop through students
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(computerScience);
        courses.add(bis);
        courses.add(dataAnalytics);

        for (Course course: courses)
            for (Student student: course.students)
            {
                System.out.println("\nSTUDENT NAME: " + student.name);
                System.out.println("USERNAME: " + student.getUsername());
                System.out.println("COURSE: " + student.course.name);
                System.out.println("MODULES: ");
                for (Module module: student.modules)
                {
                    System.out.println("        " + module.name);
                }
            }

    }
}

