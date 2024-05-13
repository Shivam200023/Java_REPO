// Base class Building
class Building {
  protected int numberOfFloors;
  protected int numberOfRooms;
  protected double totalFootage;

  // Constructor for Building class
  public Building(int numberOfFloors, int numberOfRooms, double totalFootage) {
      this.numberOfFloors = numberOfFloors;
      this.numberOfRooms = numberOfRooms;
      this.totalFootage = totalFootage;
  }

  // Method to display building information
  public void displayInfo() {
      System.out.println("Number of Floors: " + numberOfFloors);
      System.out.println("Number of Rooms: " + numberOfRooms);
      System.out.println("Total Footage: " + totalFootage + " sq.ft");
  }
}

// Derived class House inheriting from Building
class House extends Building {
  private int numberOfBedrooms;
  private int numberOfBathrooms;

  // Constructor for House class
  public House(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
      super(numberOfFloors, numberOfRooms, totalFootage);
      this.numberOfBedrooms = numberOfBedrooms;
      this.numberOfBathrooms = numberOfBathrooms;
  }

  // Method to display house information
  public void displayInfo() {
      super.displayInfo();
      System.out.println("Number of Bedrooms: " + numberOfBedrooms);
      System.out.println("Number of Bathrooms: " + numberOfBathrooms);
  }
}

// Main class
public class builddemo {
  public static void main(String[] args) {
      // Create an object of House
      House myHouse = new House(2, 5, 2000.0, 3, 2);

      // Display information about the house
      System.out.println("House Information:");
      myHouse.displayInfo();
  }
}
