package test1223;

public class synchronizedman {
    public static void main(String[] args) {
        Runnable r = new RunnableMan();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class RunnableMan implements Runnable {
    Account acc = new Account();

    public void run() {
        while (acc.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            if(!acc.withdraw(money)){return;}
            System.out.println(acc.getBalance());
        }
    }
}

class Account {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized boolean withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            balance -= money;
            if(balance == 0){return false;}
        }
        else {
            System.out.println("Not enough money2");
            return false;
        }
        return true;
    }
}

