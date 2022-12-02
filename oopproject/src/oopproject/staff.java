package oopproject;
import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.io.*;
import java.util.*;
import java.util.Calendar;
/* Hospital Management System Project in Java with Source Code PDF Visit for more https://www.programmingwithbasics.com/ */
class staff
{
    String sid, sname, desg, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
    }
    void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t" + salary);
    }
}