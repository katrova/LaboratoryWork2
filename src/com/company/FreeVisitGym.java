package com.company;

public class FreeVisitGym implements IFitnessCentre {
    private String clientName;
    private String contact;             //client contact phone number
    private String genders;
    private float priceOneActivity;
    private int countOfTrainingDays;    //the number of days that a person visited

    public FreeVisitGym() {
    }

    public FreeVisitGym(String clientName, String contact, String genders,
                        float priceOneActivity, int countOfTrainingDays) {
        this.clientName = clientName;
        this.contact = contact;
        this.genders = genders;
        this.priceOneActivity = priceOneActivity;
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

    public float getPriceOneActivity() {
        return priceOneActivity;
    }

    public void setPriceOneActivity(float priceOneActivity) {
        this.priceOneActivity = priceOneActivity;
    }

    public int getCountOfTrainingDays() {
        return countOfTrainingDays;
    }

    public void setCountOfTrainingDays(int countOfTrainingDays) {
        this.countOfTrainingDays = countOfTrainingDays;
    }

    @Override
    public String toString() {
        return "FreeVisitGym{" +
                "clientName='" + clientName + '\'' +
                ", contact='" + contact + '\'' +
                ", genders='" + genders + '\'' +
                ", priceOneActivity=" + priceOneActivity +
                ", countOfTrainingDays=" + countOfTrainingDays +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        return getPriceOneActivity() * getCountOfTrainingDays();
    }
}
