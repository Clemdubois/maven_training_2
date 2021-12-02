package fr.lernejo.tester.internal;

import fr.lernejo.tester.api.TestMethod;

import java.lang.reflect.*;
import java.util.*;
import java.lang.Class;

public class TestClassDescription {

    Class<?> nameClass = null;

    public TestClassDescription(Class<?> name){
        this.nameClass = name;
    }

    public List<Method> listTestMethods(){
        List<Method> list = new ArrayList<>(List.of(nameClass.getDeclaredMethods()));
        List<Method> res = new ArrayList<>();
        for(Method method : list){
            if(Modifier.isPublic(method.getModifiers())
                    && method.getReturnType().equals(Void.TYPE)
                    && method.isAnnotationPresent(TestMethod.class)
                    && method.getParameterCount()==0){

                res.add(method);
            }
        }
        return res;
    }
}
