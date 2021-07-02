package com.softserve.edu06fig;

public class Appl {
	
	public static void main(String[] args) {
		// Figure figure = new Figure(); // Error
		/*-
		Figure[] figures = {
				new Circle(0.1),
                new Circle(1.2),
                new Circle(1.3),
                new Rectangle(2,3),
                new Rectangle(3,3),
                new Circle(1.4),
                new Rectangle(1,2)
        };
		//
        double maxArea = figures[0].getArea(); // -1
        Figure maxAreafigure = figures[0]; // null;
        //
        for (Figure current : figures) {
            double currentArea = current.getArea();
            if (maxArea < currentArea) {
                maxArea = currentArea;
                maxAreafigure = current;
            }
        }
        System.out.println("maxArea = " + maxArea 
                + "  maxAreafigure: " + maxAreafigure);
        */
        // /*-
        Figure f = new Figure() {
        	
            public double getArea() {
                return 0;
            }
            
            @Override
            public String toString() {
                return "Unnamed Class";
            }
        };
        System.out.println(f + "   i = " + f.i);
        // */
    }
    
}
