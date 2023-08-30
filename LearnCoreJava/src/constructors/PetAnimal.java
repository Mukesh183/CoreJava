package constructors;

public class PetAnimal {
	String animalName;
	String animalType;
	
	public PetAnimal(String animal, String type) {
		animalName = animal;
		animalType = type;
	}
	public void Pet() {
		System.out.println("My Pet is "+ animalName + " It is a "+ animalType);
	}

	public static void main(String[] args) {
		PetAnimal petForHouse = new PetAnimal("Cat", "Herbivores");
		PetAnimal petForHouse2 = new PetAnimal("Lion", "Omnivores");
		petForHouse.Pet();
		petForHouse2.Pet();

	}

}
