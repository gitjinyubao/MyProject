package com.a;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*@Orderע��ʹ��bean������������;ֻ�Ƕ�list�������ã�list��Ӧ��������;
      �������������*/
@Order(value=2)
@Component
public class A1 implements A_interface {
}
