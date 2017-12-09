package com.a;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*@Order注解使得bean在数组中有序;只是对list集合有用；list对应的是数组;
      数组有序情况下*/
@Order(value=2)
@Component
public class A1 implements A_interface {
}
