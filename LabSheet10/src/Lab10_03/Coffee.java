package Lab10_03;


public class Coffee extends Drink {
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;

	Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista){
		super(type,' ');
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = sizeCoffee;
        this.barista = barista;
	}
	
	Coffee(int type,int typeCoffee){
		super(type,' ');
		this.typeCoffee = typeCoffee;
        this.sizeCoffee = ' ';
        this.barista = null;
	}
	
	public Barista getBarista() {
		return this.barista;
	}
	
	@Override
	public String getTypeName() {
		if(this.typeCoffee == 1) {
			return "Americano";
		}
		else if(this.typeCoffee == 2) {
			return "Espresso";
		}
		else if(this.typeCoffee == 3){
			return "Cappuccino";
		}
		else {return null;}
	} 
	
	@Override
	public int getTypePrice() {
		if(this.typeCoffee == 1) {
			return 50;
		}
		else if(this.typeCoffee == 2) {
			return 55;
		}
		else if(this.typeCoffee == 3){
			return 60;
		}
		else {return 0;}
	}
	
	@Override
	public String getSizeName() {
		if(this.sizeCoffee == 'S') {
			return "Short";
		}
		else if(this.sizeCoffee == 'T') {
			return "Tall";
		}
		else if(this.sizeCoffee == 'G'){
			return "Grande";
		}
		else if(this.sizeCoffee == 'V'){
			return "Venti";
		}
		else {return null;}
	}
	
	@Override
	public int getSizePrice() {
		if(this.sizeCoffee == 'S') {
			return 100;
		}
		else if(this.sizeCoffee == 'T') {
			return 150;
		}
		else if(this.sizeCoffee == 'G'){
			return 200;
		}
		else if(this.sizeCoffee == 'V'){
			return 250;
		}
		else {return 0;}
	}
	
	@Override
	public int getTotalPrice() {
		return super.getTotalPrice()+ getTypePrice() + getSizePrice();
	}
	public String toString() {
		return super.getTypeName()+ " " + getTypeName() +" ("+getSizeName()+") is "+getTotalPrice()+" baht.";
	}
}
