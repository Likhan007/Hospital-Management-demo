package oopproject;
import java.io.*;
import java.util.*;
import java.util.Calendar;
class fecility //Sorry Facility but do not change the name 
{
    String fec_name;
    void add_feci()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
    }
    void show_feci()
    {
        System.out.println(fec_name);
    }
}