package demo1.thread;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode


public class User {
    int id;
    String name;
}

class distributor  {
    ReentrantLock reentrantLock = new ReentrantLock();
    final Condition condition = reentrantLock.newCondition();

    List<User> userList1 = new ArrayList<>();
    List<User> userList2 = new ArrayList<>();
    List<User> userList;

    public distributor() {
        userList = new ArrayList<>();
        userList.add(new User(1, "Vilen"));
        userList.add(new User(2, "Dasha"));
        userList.add(new User(3, "Mykola"));
        userList.add(new User(4, "Olga"));
        userList.add(new User(5, "Alina"));
        userList.add(new User(6, "Katya"));
        userList.add(new User(7, "Olena"));
        userList.add(new User(8, "Anya"));
        userList.add(new User(9, "Serhiy"));
        userList.add(new User(10, "Luba"));
    }

    public void distributorVoid()  {
        reentrantLock.lock();
        try {
            System.out.println("Distributor is started");
            for (User user : userList) {
                if (user.getId() % 2 == 0) {
                    userList1.add(user);
                    System.out.println("Array1 is update : " + userList1);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (user.getName().equals("Katya")) {
                        System.out.println("Distributor is stopped");
                        try {
                            condition.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

//                    condition.signal();

                } else if (user.getId() % 2 == 1) {
                    userList2.add(user);
                    System.out.println("Array2 is update : " + userList2);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
                System.out.println("Distributor end work");
        } finally {

            reentrantLock.unlock();
        }

    }

    public void waiter() {
        reentrantLock.lock();
        try {
            System.out.println("Distributor has stopped and waiting when waiter void is stopped");
            for (int i = 0; i < 5; i++) {
                System.out.println(i + " sec");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            condition.signal();
        } finally {
            reentrantLock.unlock();
        }
    }


}

