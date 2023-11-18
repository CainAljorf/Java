package tema4.modules.products.classes;

import tema4.classes.dates;

public class smartphone extends product {
	private String screen;
	private String screen_inches;
	private String RAM;
	private String storage;
	private String CPU;
	private String brand;
	private String OS;
	private String camera;

	public smartphone(String ID_product, float price, float peso, int stock, String color, float dimension,dates f_compra, 
			dates f_entrega, dates f_devolucion, dates f_recogida,dates date_sales_init, dates date_sales_end, 
			float discont,	float price_final, String screen, String screen_inches, String RAM, String storage, String CPU,
			String brand, String OS, String camera) {
		super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, f_devolucion,
				f_recogida, date_sales_init, date_sales_end, discont, price_final);
		this.screen = screen;
		this.screen_inches = screen_inches;
		this.RAM = RAM;
		this.storage = storage;
		this.CPU = CPU;
		this.brand = brand;
		this.OS = OS;
		this.camera = camera;
	}
	public smartphone(String ID) {
		super(ID);
	}//constructor primary key
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	public String getScreen_inches() {
		return screen_inches;
	}
	public void setScreen_inches(String screen_inches) {
		this.screen_inches = screen_inches;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String RAM) {
		this.RAM = RAM;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String CPU) {
		this.CPU = CPU;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String OS) {
		this.OS = OS;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}//end getters and setters
	@Override
	public String toString() {
		String str="";
		str += ("ID: " + super.getID_product() + ".\n");
		str += ("Precio: " + super.getPrice() + ".\n");
		str += ("Peso: " + super.getPeso() + ".\n");
		str += ("Stock: " + super.getStock() + ".\n");
		str += ("Color: " + super.getColor() + ".\n");
		str += ("Dimensiones: " + super.getDimension() + ".\n");
		str += ("Fecha de compra: " + super.getF_compra() + ".\n");
		str += ("Fecha de entrega: " + super.getF_entrega() + ".\n");
		str += ("Fecha de devolución: " + super.getF_devolucion() + ".\n");
		str += ("Fecha de recogida: " + super.getF_recogida() + ".\n");
		str += ("Descuento: " + super.getDiscont() + ".\n");
		str += ("Precio final: " + super.getPrice_final() + ".\n");
		str += ("Fecha de inicio de promoción: " + super.getDate_sales_init() + ".\n");
		str += ("Fecha de fin: " + super.getDate_sales_end() + ".\n");
		str += ("Tipo de pantalla: " + this.getScreen()+ ".\n");
		str += ("Pulgadas de pantalla: " + this.getScreen_inches()+ ".\n");
		str += ("Sensor de la cámara: " + this.getCamera()+ ".\n");
		str += ("Marca: " + this.getBrand()+ ".\n");
		str += ("Memoria Principal (RAM): " + this.getRAM()+ ".\n");
		str += ("Almacenamiento: " + this.getStorage()+ ".\n");
		str += ("Procesador: " + this.getCPU()+ ".\n");
		str += ("Sistema Operativo: " + this.getOS()+ ".\n");
		return str;
	}//end toString
}//end class smartphone