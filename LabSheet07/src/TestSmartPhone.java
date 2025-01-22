
public class TestSmartPhone {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		
		// Set default data 
		System.out.println("Setting Smartphone's default data");
		phone.setBrand("SmartMobile");
		phone.setModel("W1000");
		phone.setStorageCapacity(256);
		System.out.println(".\n" + ".\n" + ".");
		Space();
		
		// Display phone data
		System.out.println("Smartphone's default data");
		Line();
		
		System.out.println("Brand : " + phone.getBrand());
		System.out.println("Model : " + phone.getModel());
		System.out.println("Storage Capacity : " + phone.getStorageCapacity());
		Space();
		
		// Add valid phone storage
		System.out.println("Adding storage capacity 100 GB...");
		phone.increaseStorage(100);
		Space();
		
		// Add invalid phone storage 
		System.out.println("Adding storage capacity 200 GB...");
		phone.increaseStorage(200);
		Space();
		
		System.out.println("Adding storage capacity -50 GB...");
		phone.increaseStorage(-50);
		Space();
		
		// คา นวณพ้ืนที่หน่วยความจา ที่เหลือ(valid used storage)
		System.out.println("\nคา นวณพ้ืนที่หน่วยความจา ที่เหลือโดยใชไ้ปแลว้ 120 GB...");
		int remainingStorage = phone.getRemainingStorage(120); // ค านวณส าเร็จ
		if (remainingStorage != -1) {
		System.out.println("พ้ืนที่ที่เหลือ: " + remainingStorage + " GB");
		}
		// คา นวณพ้ืนที่หน่วยความจา ที่เหลือ(invalid used storage)
		System.out.println("\nคา นวณพ้ืนที่หน่วยความจา ที่เหลือโดยใชไ้ปแลว้ 500 GB...");
		phone.getRemainingStorage(500); // ไม่สา เร็จ: เกินความจุ
		// ทดสอบการต้งัค่าที่ไม่ถูกตอ้ง (brand และ model)
		System.out.println("\nต้งัค่าแบรนด์และรุ่นดว้ยค่าที่ไม่ถูกตอ้ง...");
		phone.setBrand(""); // ไม่สา เร็จ:แบรนดส์ ้ันเกินไป
		phone.setModel("A"); // ไม่สา เร็จ:รุ่นส้ันเกินไป
		// ทดสอบการต้งัค่าความจุที่ไม่ถูกตอ้ง
		System.out.println("\nต้งัค่าความจุหน่วยความจา ที่ไม่ถูกตอ้ง...");
		phone.setStorageCapacity(600); // ไม่สา เร็จ: เกินขีดจา กดั
		// แสดงรายละเอียดสมาร์ทโฟนหลงัการต้งัค่าต่างๆ
		System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
		System.out.println("Brand : " + phone.getBrand());
		System.out.println("Model : " + phone.getModel());
		System.out.println("Storage Capacity : " + phone.getStorageCapacity());
	}
	
	public static void Space() {
		System.out.println();
	}
	
	public static void Line() {
		for(int i = 1 ; i <= 30 ; i++) {
			System.out.print("-");
		}
		Space();
	}

}
