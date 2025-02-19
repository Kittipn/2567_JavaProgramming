package Lab10_03;

public class Drink {
	
	private int type;
	private char size;
	
	Drink(int type, char size){
		this.type = type;
		this.size = size;
	}
	
	 // Default constructor
    Drink() {
        this(0, ' '); 
    }

    public String getTypeName() {
    	switch(type) {
    	
    	case 1:
    		return "Hot";
    		
    	case 2:
    		return "Cold";
    		
    	default:
    		return null;
    		
    	} 
    }
    
    public int getTypePrice() {
    	switch(type) {
    	
    	case 1:
    		return 10;
    	case 2:
    		return 20;
    	default:
    		return 0;
    		
    	} 
    }
    
    public String getSizeName() {
    	switch(size) {
    	
    	case 'S':
    		return "Small";
    	case 'M':
    		return "Medium";
    	case 'L':
    		return "Large";
    	default:
    		return null;
    	}
    }

    public char getSize() {
        return this.size;
    }
	

}
