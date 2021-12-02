package fr.lernejo.tester.internal;

import fr.lernejo.tester.SomeLernejoTests;

import java.lang.reflect.Method;
import java.util.List;

public class TestClassDescriptionLernejoTests {
    public static void main(String[] args) {
        TestClassDescription desc = new TestClassDescription(SomeLernejoTests.class);
        List<Method> list = desc.listTestMethods();
        for(Method elem : list){
            System.out.println(elem);
        }
    }
}
