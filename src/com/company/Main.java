package com.company;
/**
 * @author Vasylkivska Kateryna KNTEU
 * @varsion 1.0 22.06.2020
 *
 * Classname Main
 *
 * Description: Main class
 *
 * Laboratory Work 2
 *
 * Topic: Object-oriented programming,  JavaCollectionFramework
 *
 * Choose a subject according to your number. Develop a service using all your best
 * in OOP and Java collections.
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
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1.Create two appropriate classes and 5 objects of each one.
        List<MonthSubscription> listOfclientsGymMonthSubscription = new ArrayList<>();
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
        List<FreeVisitGym> listOfclientsGymFreeVisitGym = new ArrayList<>();
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

        List<IFitnessCentre> listOfClientsGym = new ArrayList<>();

        // 2. Calculate   the total payment amount.
        System.out.println("Payment amount");
        //per month subscription
      listOfclientsGymMonthSubscription.stream().forEach(item ->{
            System.out.println(item.getClientName() + " - " + item.getPaymentAmount());
            listOfClientsGym.add(item);
        });
        //per free visit gym
        listOfclientsGymFreeVisitGym.stream().forEach(item ->{
            System.out.println(item.getClientName() + " - " + item.getPaymentAmount());
            listOfClientsGym.add(item);
        });

        //sum of all gym
        double profit = listOfClientsGym.stream()
                .mapToDouble(IFitnessCentre::getPaymentAmount)
                .sum();
        System.out.println("Прибуток залу становить  - " + profit + " грн");

        // 3. Find the highest price for client.
        IFitnessCentre maxPrice = listOfClientsGym.stream()
                .max(Comparator.comparingDouble(IFitnessCentre::getPaymentAmount))
                .orElse(null);
        System.out.println("Найбільша плата за відвідування залу одним клієнтом - "
                + maxPrice.getPaymentAmount() + " грн");

        //4. Find he lowest price for client.
        IFitnessCentre minPrice = listOfClientsGym.stream()
                .min(Comparator.comparingDouble(IFitnessCentre::getPaymentAmount))
                .orElse(null);
        System.out.println("Найменша плата за відвідування залу одним клієнтом - "
                + minPrice.getPaymentAmount() + " грн");

        //5. The average price for client.
        double averagePrice = listOfClientsGym.stream()
                .mapToDouble(IFitnessCentre::getPaymentAmount)
                .average().orElse(0);
        System.out.println("Середня ціна абонементу - " + averagePrice + " грн");

        //6. Who get more salary, part-time or full-time employees?
        double sumMonthSubscriptionPrice = listOfclientsGymMonthSubscription.stream()
                .mapToDouble(IFitnessCentre::getPaymentAmount)
                .sum();
        double sumFreeVisitorPrice = listOfclientsGymFreeVisitGym.stream()
                .mapToDouble(IFitnessCentre::getPaymentAmount)
                .sum();

        if (sumMonthSubscriptionPrice > sumFreeVisitorPrice){
            System.out.println("Клієнти, які беруть місячний абонемент сплачують більше");
        }else{
            System.out.println("Клієнти, які обирають вільне відвідування сплачують більше");
        }

    }
}
