package com.example.administrator.experiment;

/**
 * Created by Administrator on 2018/3/26 0026.
 */
 import java.lang.*;

// enum showing Mobile prices
enum Mobile {
    Samsung(400)
            {
                @Override
                public int showPrice() {
                   System.out.print(1);
                   return 1;
                }
            }, Nokia(250),Motorola(325);

    int price;
    Mobile(int p) {
        price = p;
    }
    int showPrice() {
        return price;
    }
}

