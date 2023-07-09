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
			Validator validator, Parcel parcel, boolean expected) {
		assertEquals(expected, validator.validate(parcel));
	}

	public static Stream<Arguments> shouldValidateParcel() {
		return Stream.of(
				arguments(
					"The sum of dimensions should be below 300"
				)
		);
	}
}