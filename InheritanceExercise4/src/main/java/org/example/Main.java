package org.example;

import org.example.entity.Circle;
import org.example.entity.Rectangle;

/*
Español
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.

English
It is proposed to develop a program that allows us to calculate the area and perimeter of shapes
geometric shapes, in this case a circle and a rectangle. Since this calculation is going to be repeated in the
two geometric shapes, we are going to create an Interface, called calculosFormas that will have, the
two methods to calculate the area, the perimeter and the value of PI as a constant.
Develop the exercise so that the forms implement the methods of the interface and are
find the area and perimeter of the two. In the main the forms will be created and the
final score.
Circle area: PI * radius ^ 2 / Circle perimeter: PI * diameter.
Rectangle area: base * height / Rectangle perimeter: (base + height) * 2.
 */
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,2);

        System.out.println("The area of the circle is: " + circle.area() + " and its perimeter is: " + circle.perimeter());
        System.out.println("The area of the rectangle is: " + rectangle.area() + " and its perimeter is: " + rectangle.perimeter());
    }
}
