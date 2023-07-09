package com.sda.advanced.solution.zad9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CircleTest {

	private Circle circle;

	@BeforeEach
	void setUp() {
		circle = new Circle(new Point2D(0.0, 0.0), new Point2D(1.0, 0.0));
	}

	@Test
	void shouldCalculateRadius() {
		assertEquals(1.0, circle.getRadius());
	}

	@Test
	void shouldCalculatePerimeter() {
		assertEquals(2 * Math.PI, circle.getPerimeter());
	}

	@Test
	void shouldCalculateArea() {
		assertEquals(Math.PI, circle.getPerimeter());
	}
}