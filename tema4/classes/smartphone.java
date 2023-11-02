package tema4.class_products;
public class smartphone extends product {
	private String screen;
	private String screen_inches;
	private String RAM;
	private String storage;
	private String CPU;
	private String brand;
	private String OS;
	private String camera;
	private String f_promo;
	private String n_dias_promo;
	private String price_promo;
	public smartphone(String ID_product, float price, float peso, int stock, String color, float dimension,
			String f_compra, String f_entrega, int n_dias_entrega, String f_devolucion, String f_recogida,
			int n_dias_recogida, int n_dias_devolucion, String screen, String screen_inches, String RAM, String storage,
			String CPU, String brand, String OS, String camera,String f_promo,String n_dias_promo,String price_promo) {
		super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, n_dias_entrega, f_devolucion,
				f_recogida, n_dias_recogida, n_dias_devolucion);
		this.screen = screen;
		this.screen_inches = screen_inches;
		this.RAM = RAM;
		this.storage = storage;
		this.CPU = CPU;
		this.brand = brand;
		this.OS = OS;
		this.camera = camera;
		this.f_promo = f_promo;
		this.n_dias_promo = n_dias_promo;
		this.price_promo = price_promo;
	}//end constructor
	public String getF_promo() {
		return f_promo;
	}
	public void setF_promo(String f_promo) {
		this.f_promo = f_promo;
	}
	public String getN_dias_promo() {
		return n_dias_promo;
	}
	public void setN_dias_promo(String n_dias_promo) {
		this.n_dias_promo = n_dias_promo;
	}
	public String getPrice_promo() {
		return price_promo;
	}
	public void setPrice_promo(String price_promo) {
		this.price_promo = price_promo;
	}
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
		str += ("Número de días de entrega: " + super.getN_dias_entrega() + ".\n");
		str += ("Fecha de devolución: " + super.getF_devolucion() + ".\n");
		str += ("Fecha de recogida: " + super.getF_recogida() + ".\n");
		str += ("Número de días de recogida: " + super.getN_dias_recogida() + ".\n");
		str += ("Número de días de devolución: " + super.getN_dias_devolucion()+ ".\n");
		str += ("Tipo de pantalla: " + this.getScreen()+ ".\n");
		str += ("Pulgadas de pantalla: " + this.getScreen_inches()+ ".\n");
		str += ("Sensor de la cámara: " + this.getCamera()+ ".\n");
		str += ("Marca: " + this.getBrand()+ ".\n");
		str += ("Memoria Principal (RAM): " + this.getRAM()+ ".\n");
		str += ("Almacenamiento: " + this.getStorage()+ ".\n");
		str += ("Procesador: " + this.getCPU()+ ".\n");
		str += ("Sistema Operativo: " + this.getOS()+ ".\n");
		str += ("Fecha de la promoción: "+ this.getF_promo()+"\n");
		str += ("Número de días de la promoción: "+ this.getN_dias_promo())+"\n";
		str += ("Precio con la promoción: "+this.getPrice_promo()+"\n");
		return str;
	}//end toString
}//end class smartphone