package ru.job4j.tracker;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Список для хранения заявок.
     */

    private final List<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод возвращает копию массива без пустых клеток
     */

    public List<Item> findAll() {
        return items;
    }

    /**
     * Метод получения списка по имени
     * @param key
     * @return
     */
    public List<Item> findByName(String key) {
        List<Item> temp = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                temp.add(item);
            }
        }
        return temp;
    }

    /**
     * Метод получения заявки по id
     * @param id
     * @return
     */
    public Item findById(String id) {
        // Находим индекс
        int index = indexOf(id);
        // Если индекс найден возвращаем item, иначе null
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод замены заявки
     * @param fresh
     * @param id
     */
    public boolean replace(String id, Item fresh) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            fresh.setId(id);
            items.set(index, fresh);
        }
        return rsl;
    }

    /**
     * Метод удаления заявки
     * @param id
     * @return
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод, который будет возвращать index по id
     * @param id
     * @return
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }


}