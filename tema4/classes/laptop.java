package tema4.classes;
public class laptop extends product {
	private String screen;
	private String screen_inches;
	private String keyboard;
	private String RAM;
	private String storage;
	private String CPU;
	private String power_supply;
	private String graphics;
	private String brand;
	private String camera;
	private String f_sales;
	private String num_dias_sales;
	private String price_sales;
	public laptop(String ID_product, float price, float peso, int stock, String color, float dimension, String f_compra,
			String f_entrega, int n_dias_entrega, String f_devolucion, String f_recogida, int n_dias_recogida,
			int n_dias_devolucion, String screen, String screen_inches, String keyboard, String RAM, String storage,
			String CPU, String power_supply, String graphics, String brand, 
			String camera, String f_sales,String num_dias_sales,String price_sales) {
		super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, n_dias_entrega, f_devolucion,
				f_recogida, n_dias_recogida, n_dias_devolucion);
		this.screen = screen;
		this.screen_inches = screen_inches;
		this.keyboard = keyboard;
		this.RAM = RAM;
		this.storage = storage;
		this.CPU = CPU;
		this.power_supply = power_supply;
		this.graphics = graphics;
		this.brand = brand;
		this.camera = camera;
		this.f_sales = f_sales;
		this.num_dias_sales = num_dias_sales;
		this.price_sales = price_sales;
	}//end constructor
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
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
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
	public String getPower_supply() {
		return power_supply;
	}
	public void setPower_supply(String power_supply) {
		this.power_supply = power_supply;
	}
	public String getGraphics() {
		return graphics;
	}
	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	public String getF_sales() {
		return f_sales;
	}
	public void setF_sales(String f_sales) {
		this.f_sales = f_sales;
	}
	public String getNum_dias_sales() {
		return num_dias_sales;
	}
	public void setNum_dias_sales(String num_dias_sales) {
		this.num_dias_sales = num_dias_sales;
	}
	public String getPrice_sales() {
		return price_sales;
	}
	public void setPrice_sales(String price_sales) {
		this.price_sales = price_sales;
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
		str += ("Número de días de devolución: " + super.getN_dias_devolucion() + ".\n");
		str += ("Tipo de pantalla: " + this.getScreen() + ".\n");
		str += ("Pulgadas de pantalla: " + this.getScreen_inches() + ".\n");
		str += ("Idioma del teclado: " + this.getKeyboard() + ".\n");
		str += ("Sensor de la cámara: " + this.getCamera() + ".\n");
		str += ("Marca: " + this.getBrand() + ".\n");
		str += ("Memoria Principal (RAM): " + this.getRAM() + ".\n");
		str += ("Almacenamiento: " + this.getStorage() + ".\n");
		str += ("Procesador: " + this.getCPU()+ ".\n");
		str += ("Fuente de alimentación: " + this.getPower_supply() + ".\n");
		str += ("Tipo de gráficos " + this.getGraphics() + ".\n");
		str += ("Rebajas: " + this.getF_sales() + ".\n");
		str += ("Número de días de rebajas: " + this.getNum_dias_sales() + ".\n");
		str += ("Precio de rebajas: " + this.getPrice_sales() + ".\n");
	return str;
	}//end toString
}//end class laptop