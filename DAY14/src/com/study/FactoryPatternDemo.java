package com.study;

/**
 * 
 */
public class FactoryPatternDemo {

    /**
     * Default constructor
     * 
     */
    public FactoryPatternDemo() {
    }

    /**
     * @return
     */
    public static void main(String[] args) {
    	ShapeFactory shapeFactory = new ShapeFactory();
    	Shape shape = shapeFactory.getShape("circle");
    	shape.Draw();
    	
    }

}