package com.feng.flyweight;

/**
 * @desc：具体享元对象2
 * @author: tfly
 * @date: 2018/4/24 16:41
 */
public class ConcreteFlyWeight2 extends FlyWeight{

    public ConcreteFlyWeight2(String objectKey) {
        super(objectKey);
    }

    //根据外部状态进行业务逻辑处理
    public void operate() {
        //业务逻辑
    }
}
