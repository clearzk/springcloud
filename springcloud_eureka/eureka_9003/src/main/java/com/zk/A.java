package com.zk;

import java.math.BigDecimal;

public class A {
    public static void main(String[] args) {
        BigDecimal bigDecimal=new BigDecimal("1221");
        Double bd=bigDecimal.multiply(new BigDecimal(0.85)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();

        System.out.println(bd.toString());
    }
}
