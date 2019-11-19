package com.sbt.lesson6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CalculatorHandler implements InvocationHandler {
    HashMap<Integer,Integer> cache = new HashMap<>();
    private Object obj;
    public CalculatorHandler(Object f1){obj = f1;}

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
     throws Throwable{
        if (cache.containsKey(args[0])){
            System.out.println("Получение результата из cache для " + args[0]);
            return cache.get(args[0]);
        }
        else
        {
            //try {
            System.out.println("Запрос расчета калькулятором и кэширование для " + args[0]);
                Integer result = (Integer) method.invoke(obj, args);
                cache.put((Integer)args[0],result);
                return  result;
            //}
        }
        //return null;
    }
}
