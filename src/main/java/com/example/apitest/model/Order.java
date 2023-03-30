package com.example.apitest.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
@ApiModel(value = "订单对象")
public class Order implements Serializable {
    private static final long serialVersionUID = 3054557791783176792L;
    @ApiModelProperty(value = "订单号", position = 0)
    private Long id;
    @ApiModelProperty(value = "订单名称", position = 1)
    private String name;
    @ApiModelProperty(value = "订单金额", position = 2)
    private BigDecimal amount;
    @ApiModelProperty(value = "数量", position = 3)
    private Integer count;
}
