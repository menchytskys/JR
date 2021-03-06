package com.javarush.task.task25.task2513;

import java.util.Random;

/* Обеспечение отсутствия прерывания важной операции

Просмотри метод moveMoney.
Если RANDOM.nextInt(5000) больше порогового значения THRESHOLD_VALUE, то обеспечь переуступку кванта времени (переход хода для текущей нити).
Добавь этот код в единственное допустимое место.


Требования:
1. Класс Solution должен содержать класс Account.
2. Метод moveMoney должен перечислять сумму amount с счета from на счет to.
3. В методе moveMoney вызови Thread.yield если RANDOM.nextInt(5000) больше порогового значения THRESHOLD_VALUE.
4. Thread.yield должен быть вызван в правильном месте.
*/
public class Solution {
    private static final Integer THRESHOLD_VALUE = 500;
    private static final Random RANDOM = new Random();

    public synchronized void moveMoney(Account from, Account to, int amount) {
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }

    class Account {
        private int balance;

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
    }
}
