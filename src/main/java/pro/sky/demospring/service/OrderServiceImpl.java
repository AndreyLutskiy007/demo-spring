package pro.sky.demospring.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
import pro.sky.demospring.entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Scope(WebApplicationContext.SCOPE_SESSION)
public class OrderServiceImpl implements OrderService {
    private final List<Order> orders = new ArrayList<>();

    public List <Order> add(List<Integer> ids) {
        List<Order> newOrders = ids.stream()
                .map(Order::new)
                .collect(Collectors.toList());
        orders.addAll(newOrders);
        return newOrders;

    }

    public List<Order> getAll() {
        return orders;
    }

}
