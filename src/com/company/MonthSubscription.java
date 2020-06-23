package com.company;

/**
 * @author Vasylkivska Kateryna KNTEU
 * @varsion 1.0 22.06.2020
 *
 * Classname: MonthSubscription
 *
 * Description: Class contains information about clients who chose
 * month subscription
 */

public class MonthSubscription implements IFitnessCentre {
    private String clientName;
    private String contact;                 //client contact phone number
    private String genders;
    private float priceMonthSubscription;
    private int countOfTrainingDays;       //monthly subscription valid for 30 days

    public MonthSubscription() {
    }

    public MonthSubscription(String clientName, String contact, String genders,
                             float priceMonthSubscription, int countOfTrainingDays) {
        this.clientName = clientName;
        this.contact = contact;
        this.genders = genders;
        this.priceMonthSubscription = priceMonthSubscription;
        this.countOfTrainingDays = countOfTrainingDays;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGenders() {
        return genders;
    }

    public void setGenders(String genders) {
        this.genders = genders;
    }

    public float getPriceMonthSubscription() {
        return priceMonthSubscription;
    }

    public void setPriceMonthSubscription(float priceMonthSubscription) {
        this.priceMonthSubscription = priceMonthSubscription;
    }

    public int getCountOfTrainingDays() {
        return countOfTrainingDays;
    }

    public void setCountOfTrainingDays(int countOfTrainingDays) {
        this.countOfTrainingDays = countOfTrainingDays;
    }

    @Override
    public String toString() {
        return "MonthSubscription{" +
                "clientName='" + clientName + '\'' +
                ", contact='" + contact + '\'' +
                ", genders='" + genders + '\'' +
                ", priceMonthSubscription=" + priceMonthSubscription +
                ", countOfTrainingDays=" + countOfTrainingDays +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getPriceMonthSubscription();
    }
}
