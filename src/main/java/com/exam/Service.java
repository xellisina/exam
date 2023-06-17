package com.exam;


import java.util.Random;

@org.springframework.stereotype.Service
public class Service {
    public Long findRandomNum(Nums nums){
        Random random = new Random();
        return random.nextLong(nums.getMaxNum() - nums.getMinNum()) + nums.getMinNum();
    }
}
