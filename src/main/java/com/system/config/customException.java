package com.system.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Fruit
 * @version 1.0
 * @create 2022/9/20   17:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class customException extends RuntimeException{
    private Integer NumCode;
    private String Message;
}
