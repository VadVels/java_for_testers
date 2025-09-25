package ru.solar.triangletests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.solar.triangleTest.Triangle;

public class TriangleTests {

@Test
void canCalculatePerimeter() {
        int result = Triangle.PerimeterTriangle(3, 4, 5);
        Assertions.assertEquals(12, result);
   }

@Test
    void canCalculateHalfmeter() {
    int result = Triangle.HalfmeterTriangle(3, 4, 5);
    Assertions.assertEquals(6, result);
   }

@Test
    void canCalculateArea() {
    int result = Triangle.AreaTriangle(3, 4, 5);
    Assertions.assertEquals(36, result);
    }


    @Test
    void testEqualSides(){
        var tr1 = new Triangle(2, 3, 5);
        var tr2 = new Triangle(1, 8, 5);
        Assertions.assertEquals(tr1,tr2);


    }

    @Test
    void testNotEqualsides(){
        var tr1 = new Triangle(3, 2, 5);
        var tr2 = new Triangle(5, 5, 5);
        Assertions.assertTrue(tr1. equals (tr2));



    }




}