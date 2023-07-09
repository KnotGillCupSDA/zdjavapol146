package com.sda.advanced.solution.zad8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ValidatorTest {

	@ParameterizedTest(name = "{index}: {0}")
	@MethodSource
	void shouldValidateParcel(@SuppressWarnings("unused") String testCaseDescription,
			ParcelImpl parcel, Validator validator, boolean expected) {
		assertEquals(expected, validator.validate(parcel));
	}

	public static Stream<Arguments> shouldValidateParcel() {
		Validator validator = new ValidableParcelByPiotr(-1, -1, -1, 1.0f, false );

		return Stream.of(
				arguments(
						"The sum of dimensions should be at most 300 (1)",
						new ParcelImpl(100, 110, 100, 2.0f, true),
						validator,
						false
				),
				arguments(
						"The sum of dimensions should be at most 300 (2)",
						new ParcelImpl(100, 100, 100, 2.0f, true),
						validator,
						true
				),
				arguments(
						"At least one dimension should be above or equal 30 (1)",
						new ParcelImpl(10, 29, 29, 2.0f, true),
						validator,
						false
				),
				arguments(
						"At least one dimension should be above or equal 30 (2)",
						new ParcelImpl(10, 29, 30, 2.0f, true),
						validator,
						true
				),
				arguments(
						"Weight has to weight at most 30.0 (1)",
						new ParcelImpl(55, 31, 31, 35.0f, false),
						validator,
						false
				),
				arguments(
						"Weight has to weight at most 30.0 (2)",
						new ParcelImpl(55, 31, 31, 30.0f, false),
						validator,
						true
				),
				arguments(
						"Express parcel has to weight at most 15.0 (1)",
						new ParcelImpl(54, 31, 31, 16.0f, true),
						validator,
						false
				),
				arguments(
						"Express parcel has to weight at most 15.0 (2)",
						new ParcelImpl(41, 31, 31, 15.0f, true),
						validator,
						true
				),
				arguments(
						"Express parcel has to weight at most 15.0",
						new ParcelImpl(41, 31, 31, 5.0f, true),
						validator,
						true
				)

		);
	}
}