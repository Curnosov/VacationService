package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int vacations = 0;
        for (int i = 0; i < 12; i++) {
            if (balance >= threshold) {
                balance -= expenses;
                balance /= 3;
                vacations++;
            } else {
                balance += income - expenses;
            }
        }
        return vacations;
    }

}
