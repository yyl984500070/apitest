package com.example.apitest.controller;

import com.example.apitest.model.Order;
import com.example.apitest.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
@Api(value = "订单接口api")
public class OrderController {
    @ApiOperation(value = "获取当前时间")
    @GetMapping("getCurrentTime")
    public Result<String> getCurrentTime(){
        return Result.success(String.format("当前时间：%s", LocalDateTime.now()));
    }

    @ApiOperation(value = "根据订单号获取订单")
    @GetMapping("getOrderById/{id}")
    public Result<Order> getOrderById(@PathVariable("id") Long id){
        Order order = new Order();
        order.setId(id);
        order.setName("订单名称" + id);
        order.setAmount(BigDecimal.valueOf(1));
        return Result.success(order);
    }
}
