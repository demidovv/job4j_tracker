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
        users.putIfAbsent(user, new ArrayList<Account>());
//
//        if (!users.containsKey(user)) {
//            users.put(user, new ArrayList<Account>());
//        }
    }

    /**
     * Добавление нового счета пользователю
     * @param passport
     */
    public void addAccount(String passport, Account account) {
//        users.putIfAbsent(findByPassport(passport), users.get(findByPassport(passport)).add(account));

        if (!users.get(findByPassport(passport)).contains(account)) {
            users.get(findByPassport(passport)).add(account);
        }
    }


    /**
     * Поиск пользователя по паспорту
     * @param passport
     * @return пользователь
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Поиск счета пользователя по реквизитам
     * @param passport
     * @param requisite
     * @return аккаунт
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Перевод денег
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        System.out.println(rsl);
        return rsl;
    }
}


