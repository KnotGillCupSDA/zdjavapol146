package com.sda.advanced.solution.zad26;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static List<Model> getAllModels(List<Manufacturer> manufacturers) {
		/*List<Model> result = new ArrayList<>();
		for (Manufacturer manufacturer : manufacturers) {
			result.addAll(manufacturer.models);
		}
		return result;*/

		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.collect(Collectors.toList());

	}

	private static List<Car> getAllCars(List<Manufacturer> manufacturers) {
		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.flatMap(model -> model.cars.stream())
				.collect(Collectors.toList());
	}

	private static List<String> getManufacturerNames(List<Manufacturer> manufacturers) {
		return manufacturers.stream()
				.map(Manufacturer::getName)
				.collect(Collectors.toList());
	}

	private static List<Integer> getManufacturerCreationYears(List<Manufacturer> manufacturers) {
		/*List<Integer> years = new ArrayList<>(manufacturers.size());
		for (Manufacturer manufacturer : manufacturers) {
			years.add(manufacturer.yearOfCreation);
		}
		return years;*/

		return manufacturers.stream()
				.map(manufacturer -> manufacturer.yearOfCreation)
				.collect(Collectors.toList());
	}

	private static List<String> getModelNames(List<Manufacturer> manufacturers) {
		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.map(model -> model.name)
				.collect(Collectors.toList());
	}

	private static List<Integer> getProductionStartYear(List<Manufacturer> manufacturers) {
		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.map(model -> model.productionStartYear)
				.collect(Collectors.toList());
	}

	private static List<String> getCarNames(List<Manufacturer> manufacturers) {
		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.flatMap(model -> model.cars.stream())
				.map(car -> car.name)
				.collect(Collectors.toList());
	}

	private static List<String> getCarDescriptions(List<Manufacturer> manufacturers) {
		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.flatMap(model -> model.cars.stream())
				.map(car -> car.description)
				.collect(Collectors.toList());
	}

	private static List<Model> getModelsWithEvenProductionYears(List<Manufacturer> manufacturers) {
		/*List<Model> models = new ArrayList<>();
		for (Manufacturer manufacturer : manufacturers) {
			for (Model model : manufacturer.models) {
				if(model.productionStartYear % 2 == 0) {
					models.add(model);
				}
			}
		}
		return models;*/

		return manufacturers.stream()
				.flatMap(manufacturer -> manufacturer.models.stream())
				.filter(model -> model.productionStartYear % 2 == 0)
				.collect(Collectors.toList());
	}

	private static List<Car> getCarsWithEvenYearOfCreation(List<Manufacturer> manufacturers) {

		return manufacturers.stream()
				.filter(manufacturer -> manufacturer.yearOfCreation % 2 == 0)
				.flatMap(manufacturer -> manufacturer.models.stream())
				.flatMap(model -> model.cars.stream())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		Car subaru1 = new Car("Subcio", "Subaru Tomka", CarType.SEDAN);
		Car subaru2 = new Car("Impreza", "Subaru Mechanika", CarType.CABRIO);
		Car subaru3 = new Car("Śmigacz", "Subaru Pawła", CarType.HATCHBACK);

		Car skoda1 = new Car("Złomek", "Skoda Tomka", CarType.SEDAN);
		Car skoda2 = new Car("Służbowy", "Służbowe auto Tomka", CarType.COUPE);
		Car skoda3 = new Car("Służbowy żony", "Służbowe auto Oli", CarType.SEDAN);

		Model model1 = new Model("Subaru Impreza", 1990, List.of(subaru1, subaru2));
		Model model2 = new Model("Subaru XV", 2010, List.of(subaru3));

		Model model3 = new Model("Skoda Fabia", 1985, List.of(skoda1));
		Model model4 = new Model("Skoda Octavia", 1990, List.of(skoda2, skoda3));
		Model model5 = new Model("Skoda Rooster", 2000, List.of());

		Manufacturer subaru = new Manufacturer("Subaru", 1953, List.of(model1, model2));
		Manufacturer skoda = new Manufacturer("Skoda", 1895, List.of(model3, model4, model5));

		List<Manufacturer> manufacturers = List.of(subaru, skoda);


		System.out.println(getAllModels(manufacturers));
		System.out.println();
		System.out.println(getAllCars(manufacturers));
		System.out.println();
		System.out.println(getManufacturerNames(manufacturers));
		System.out.println();
		System.out.println(getManufacturerCreationYears(manufacturers));
		System.out.println();
		System.out.println(getModelNames(manufacturers));
		System.out.println();
		System.out.println(getProductionStartYear(manufacturers));
		System.out.println();
		System.out.println(getCarNames(manufacturers));
		System.out.println();
		System.out.println(getCarDescriptions(manufacturers));
		System.out.println();
		System.out.println(getModelsWithEvenProductionYears(manufacturers));
	}

	public static class MyMapper implements Function<Model, Stream<Car>> {

		@Override
		public Stream<Car> apply(Model model) {
			return model.cars.stream();
		}
	}

}
