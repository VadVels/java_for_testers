package ru.solar.triangletests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.solar.triangleTest.Triangle;

public class "TriangleTests" {

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
}

@Test
void testTriangle(){
    var side1 = (1);
    var side2 = (2);
    var side3 = (5);
    short Object = 0;
    Assertions.assertEquals (side1, side2, side3);
   }
}