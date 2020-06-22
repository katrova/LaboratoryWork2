package com.company;
/**
 * @author Vasylkivska Kateryna KNTEU
 * @varsion 1.0
 *
 * Laboratory Work 2
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number. Develop a service using all your best in OOP and Java collections.
 *
 * Six methods must be written like in the following example. A point for each one.
 *
 * Creative approaches are welcome.
 *
 * EXAMPLE
 *
 *  A company contains two types of employees:  full-time and  part-time ones.
 * 1. Create two appropriate classes and 5 objects of each one.
 * 2. Calculate   the total salary of a month.
 * 3. Find the highest salary employee.
 * 4. Find he lowest salary employee
 * 5. The average salary.
 * 6. Who get more salary, part-time or full-time employees?
 *
 *  Subjects according to my number - 10. Fitness centre:  minimal month subscription and free choice.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1.Create two appropriate classes and 5 objects of each one.
        List<IFitnessCentre> listOfclientsGymMonthSubscription = new ArrayList<>();
        listOfclientsGymMonthSubscription.add(
                new MonthSubscription("Kate", "+3805672345", "Female", 3000,
                        30));
        listOfclientsGymMonthSubscription.add(
                new MonthSubscription("Ivan", "+38056723469", "Male", 3000,
                        30));
        listOfclientsGymMonthSubscription.add(
                new MonthSubscription("Oleg", "+3805677845", "Male", 3000,
                        30));
        listOfclientsGymMonthSubscription.add(
                new MonthSubscription("Nata", "+3805623345", "Female", 3000,
                        30));
        listOfclientsGymMonthSubscription.add(
                new MonthSubscription("Anna", "+3804572345", "Female", 3000,
                        30));
        List<IFitnessCentre> listOfclientsGymFreeVisitGym = new ArrayList<>();
        listOfclientsGymFreeVisitGym.add(
               new FreeVisitGym("Sofa", "+3805699345", "Female", 150,
                        10));
        listOfclientsGymFreeVisitGym.add(
                new FreeVisitGym("Alex", "+3805892345", "Male", 150,
                        26));
        listOfclientsGymFreeVisitGym.add(
                new FreeVisitGym("Vlad", "+3805633345", "Male", 150,
                        19));
        listOfclientsGymFreeVisitGym.add(
                new FreeVisitGym("Julia", "+3805122345", "Female", 150,
                        4));
        listOfclientsGymFreeVisitGym.add(
                new FreeVisitGym("Pavel", "+3805634345", "Male", 150,
                        30));

        // 2. Calculate the total salary of a month.
        System
        listOfclientsGym


    }
}
