package pro.sky.demospring.service;

import pro.sky.demospring.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> add(List<Integer> id);

    List<Order> getAll();
}
