package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class BankService {
    private Map<User, List<Account>> users = new HashMap();

    /**
     * Добавление пользователя
     * @param user
     */
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    /**
     * Добавление нового счета пользователю
     * @param passport
     */
    public void addAccount(String passport) {

        findByPassport(passport);
    }

    /**
     * Поиск пользователя по паспорту
     * @param passport
     * @return
     */
    public User findByPassport(String passport) {
            for (User user: users.get()) {

            }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}
