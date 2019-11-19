package com.sbt.lesson6;

import com.sun.deploy.net.proxy.ProxyUtils;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

import static java.util.Collections.emptyList;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        //Calculator cached = ProxyUtils.makeCached(calculator);
        CalculatorInt calculatorProxy = (CalculatorInt) Proxy.newProxyInstance(Calculator.class.getClassLoader(),
                Calculator.class.getInterfaces(),
                new CalculatorHandler(calculator));
        System.out.println("Запрос 7 результат: "+calculatorProxy.calc(7));
        System.out.println("Запрос 3 результат: "+calculatorProxy.calc(3));
        System.out.println("Запрос 7 результат: "+calculatorProxy.calc(7));
        System.out.println("Запрос 5 результат: "+calculatorProxy.calc(5));
        System.out.println("Запрос 3 результат: "+calculatorProxy.calc(3));

    }


    public static void main1(String[] args) throws NoSuchFieldException {
 //HashMap<Integer,Integer> m = new HashMap<>();

        //Runtime<Integer> m = new Runtime<>();
        //Test m = new Test();
        Class cls = Test.class;//(); //m.getClass();
        System.out.println (cls.getName());

       /* int mods = cls.getModifiers();
        if (Modifier.isPublic  (mods))	{ System.out.println("public");  }
        if (Modifier.isAbstract(mods))	{ System.out.println("abstract");}
        if (Modifier.isFinal   (mods))	{ System.out.println("final");   }

        //Class<?>   cls = ArrayList.class;
        Class<?>[] ifs = cls.getInterfaces();

        System.out.println("List of interfaces\n");
        for(Class<?> ifc : ifs) {
            System.out.println (ifc.getName());
        }

        System.out.println();
        System.out.println();
        System.out.println("List of Constructor\n");
        Constructor[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
*/
        System.out.println();
        System.out.println();
        boolean f=true;
        System.out.println("List of Field\n");
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            Class<?> fld = field.getType();
            System.out.println("Field name : " + field.getName());
            System.out.println("Field value : " + cls.getField(field.getName()).toString());//field.toString());
            System.out.println("Class type : " + fld.getName());
            if (field.getName()!=field.toString())
            { f=false;}
        }

        System.out.println();
        System.out.println();
        System.out.println("List of Method\n");
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                System.out.println("Method name : " + method.getName());
                System.out.println("Return type : " +
                        method.getReturnType().getName());

                System.out.println();
                System.out.println();
                System.out.println("List of Parameters\n");
                Class<?>[] params = method.getParameterTypes();
                System.out.print("Parameters : ");
                for (Class<?> paramType : params) {
                    System.out.print(" " + paramType.getName());
                }
                System.out.println();
            }
        }

       /* try {
            System.out.print(
        }*/

    }

}
