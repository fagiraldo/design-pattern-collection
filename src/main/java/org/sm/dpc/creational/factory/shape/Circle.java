package org.sm.dpc.creational.factory.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {
	
	private static final Logger logger = LoggerFactory.getLogger(Circle.class);

	@Override
	public void draw() {
		logger.debug("Inside Circle::draw() method.");
	}
}
