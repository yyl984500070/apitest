package com.example.apitest.controller;

import com.example.apitest.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Api
public class OrderController {
    @ApiOperation(value = "获取当前时间")
    @GetMapping("getCurrentTime")
    public Result<String> getCurrentTime(){
        return Result.success(String.format("当前时间：%s", LocalDateTime.now()));
    }

    @ApiOperation(value = "获取当前时间")
    @GetMapping("getCurrentTime")
    public Result<String> getOrderByID(){
        return Result.success(String.format("当前时间：%s", LocalDateTime.now()));
    }
}
