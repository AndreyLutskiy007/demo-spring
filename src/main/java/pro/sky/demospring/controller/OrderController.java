package pro.sky.demospring.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import pro.sky.demospring.entities.Order;
import pro.sky.demospring.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
@Scope(WebApplicationContext.SCOPE_SESSION)
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Order> add(@RequestParam("ids") List <Integer> orderIds) {
        return orderService.add(orderIds);

    }

    @GetMapping("/get")
    public List<Order> get() {
        return orderService.getAll();
    }
}
