package com.rem.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalcProxy {
    public static Object getInstance(final MyCalcImpl myCalc) {
        return Proxy.newProxyInstance(CalcProxy.class.getClassLoader(), myCalc.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("test proxy...");
                Object invoke = method.invoke(myCalc, args);
                return invoke;
            }
        });
    }
}
