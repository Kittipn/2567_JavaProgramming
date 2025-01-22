
public class SmartPhone {

	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPACITY = 521;
	
	// Getter and Setter
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		if(brand.length() >= 2) {
			this.brand = brand;
		}
		else {
			System.out.println("Error : Brand name must have at least 2 characters");
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		if(brand.length() >= 2) {
			this.model = model;
		}
		else {
			System.out.println("Error : Model name must have at least 2 characters");
		}
	}
	
	public int getStorageCapacity() {
		return this.storageCapacity;
	}
	
	public void setStorageCapacity(int storageCapacity) {
		if(storageCapacity >= 1 && storageCapacity <= MAX_STORAGE_CAPACITY) {
			this.storageCapacity = storageCapacity;
		}
		else {
			System.out.println("Error : Storage capacity must be in length 1-512 GB");
		}
	}
	
	// Increase storage
	public void increaseStorage(int additionalStorage) {
		
		if(storageCapacity + additionalStorage > MAX_STORAGE_CAPACITY) {
			System.out.println("Error: Storage capacity cannot exceed" + MAX_STORAGE_CAPACITY + "GB!");
		}
		else if (additionalStorage <= 0){
			System.out.println("Error : Additional storage must be positive number");
		}
		else {
			storageCapacity += additionalStorage;
		}
	} 
	
	// Remaining storage
	public int getRemainingStorage(int usedStorage) {
		int remainingStorage = 0;
		
		if(usedStorage >= 0 && usedStorage <= storageCapacity) {
			remainingStorage = storageCapacity - usedStorage;
		}
		else {
			System.out.println("Error : Used storage must be in 0-"+storageCapacity+" GB");
		}
		
		return remainingStorage;
	}
}
