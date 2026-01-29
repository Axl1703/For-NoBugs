package practice_2;

public class BankAccount {

    String owner;
    int balance;

    BankAccount(String someOwner, int someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    String getOwner(){
        return this.owner;
    }

    int getBalance(){
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    public int deposit(int amount){
        return this.balance = getBalance() + amount;
    }

    public int withdraw(int amount){
        return this.balance = getBalance() - amount;
    }

    void printBalance(){
        System.out.println(this.balance);
    }

//    Создайте класс
//    BankAccount с
//    полями owner
//    и balance.
//    Реализуйте конструктор, геттеры, сеттер
//    для владельца, методы
//
//    deposit(amount) и withdraw(amount)
//    и метод
//
//    printBalance().
//    В main
//    внесите деньги, снимите
//    и выведите
//    баланс .
}
