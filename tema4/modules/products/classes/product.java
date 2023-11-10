package tema4.modules.products.classes;
import tema4.classes.dates;

public abstract class product {
	private String ID_product;
	private float price;
	private float peso;
	private int stock;
	private String color;
	private float dimension;
	private dates f_compra;
	private dates f_entrega;
	private dates f_devolucion;
	private dates f_recogida;
	private dates date_sales_init;
	private dates date_sales_end;
	private float discont;
	private float price_final;
	public product(String ID_product, float price, float peso, int stock, String color, float dimension,
			dates f_compra, dates f_entrega,  dates f_devolucion, dates f_recogida,
			dates date_sales_init,dates date_sales_end,float discont,float price_final) {
		super();
		this.ID_product = ID_product;
		this.price = price;
		this.peso = peso;
		this.stock = stock;
		this.color = color;
		this.dimension = dimension;
		this.f_compra = f_compra;
		this.f_entrega = f_entrega;
		this.f_devolucion = f_devolucion;
		this.f_recogida = f_recogida;
		this.date_sales_init =  date_sales_init;
		this.date_sales_end = date_sales_end;
		this.discont = discont;
		this.price_final = price_final;
		 
	}//end constructor
	public String getID_product() {
		return ID_product;
	}
	public void setID_product(String ID_product) {
		this.ID_product = ID_product;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getDimension() {
		return dimension;
	}
	public void setDimension(float dimension) {
		this.dimension = dimension;
	}
	public dates getF_compra() {
		return f_compra;
	}
	public dates setF_compra(dates f_compra) {
		return this.f_compra = f_compra;
	}
	public dates getF_entrega() {
		return f_entrega;
	}
	public void setF_entrega(dates date_delivery) {
		this.f_entrega = date_delivery;
	}
	public dates getF_devolucion() {
		return f_devolucion;
	}
	public void setF_devolucion(dates f_devolucion) {
		this.f_devolucion = f_devolucion;
	}
	public dates getF_recogida() {
		return f_recogida;
	}
	public void setF_recogida(dates f_recogida) {
		this.f_recogida = f_recogida;
	}
	public dates getDate_sales_init() {
		return date_sales_init;
	}
	public void setDate_sales_init(dates date_sales_init) {
		this.date_sales_init = date_sales_init;
	}
	public dates getDate_sales_end() {
		return date_sales_end;
	}
	public void setDate_sales_end(dates date_sales_end) {
		this.date_sales_end = date_sales_end;
	}
	public float getDiscont() {
		return discont;
	}
	public void setDiscont(float discont) {
		this.discont = discont;
	}
	public float getPrice_final() {
		return price_final;
	}
	public void setPrice_final(float price_final) {
		this.price_final = price_final;
	}
	//end getters and setters
	@Override
	public abstract String toString();
	//toString abstract to inherit
}//end class product