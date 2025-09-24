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
        var side1 = new Triangle(2, 3, 5);
        var side2 = new Triangle(2, 3, 5);
        Assertions.assertEquals(side1,side2);

    }

    @Test
    void testNotEqualsides(){
        var side1 = new Triangle(2, 3, 4);
        var side2 = new Triangle(4, 3, 2);
        Assertions.assertTrue(side1. equals (side2));
        Assertions.assertTrue(side2. equals (side1));
    }




}