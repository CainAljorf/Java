package tema4.modules.products.classes;
import tema4.classes.dates;
import tema4.modules.products.utils.date_product;
import tema4.utils.menu;

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
	private boolean is_promo;
	private boolean is_return;
	
	public product(String ID_product, float price, float peso, int stock, String color, float dimension,
			dates f_compra, dates f_entrega, dates date_sales_init,dates date_sales_end,dates f_devolucion,
			dates f_recogida,float discont,float price_final) {
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
	public void setF_compra(dates f_compra) {
		this.f_compra = f_compra;
//		this.calculate_price_final();
	}
	public dates getF_entrega() {
		return f_entrega;
	}
	public void setF_entrega(dates date_delivery) {
		this.f_entrega = date_delivery;
//		this.calculate_price_final();
	}
	public dates getF_devolucion() {
		return f_devolucion;
	}
	public dates getF_recogida() {
		return f_recogida;
	}
	public void setF_recogida(dates f_recogida) {
		this.f_recogida = f_recogida;
//		this.calculate_price_final();
	}
	public dates getDate_sales_init() {
		return date_sales_init;
	}
	public void setDate_sales_init(dates date_sales_init) {
		this.date_sales_init = date_sales_init;
//		this.calculate_price_final();
	}
	public dates getDate_sales_end() {
		return date_sales_end;
	}
	public void setDate_sales_end(dates date_sales_end) {
		this.date_sales_end = date_sales_end;
//		this.calculate_price_final();
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
    public boolean getIs_promo() {
		return is_promo;
	}
	public boolean getIs_return() {
		return is_return;
	}
	public void setIs_return(boolean is_return) {
		this.is_return = is_return;
	}
	public void setF_devolucion(dates f_devolucion) {
		this.f_devolucion = f_devolucion;
		this.calculate_price_final();
	}
	public void setIs_promo(boolean is_promo) {
		this.is_promo = is_promo;
	}
	public boolean is_return() {
		System.out.println(this.f_devolucion);
		if(this.f_devolucion.getDate_return()!="00/00/0000") {
			System.out.println(this.f_devolucion.getDate_return());
			return true;
		}else {
			return false;
		}
	}
//	public boolean is_return() {
//		String date = menu.D.getDate_return();
//		if(!date.equals(cancel)) {
//			this.is_return=true;
//			return true;
//		}else{
//			this.is_return=false;
//			return false;
//		}
//	} Con el equals no entra en el if cuando debe.
	public void calculate_price_final() {
		float i = this.getPrice();
		if (this.is_promo) {
			if(this.is_return) {
				i = this.price * this.discont;
				i *= -1;
				this.price_final = i;
			}else {
				price_final = this.price * this.discont;
				}
			}//end if
		else if(this.is_promo==false && this.is_return){
			i *= -1;
			this.price_final = i;
		}else {
			this.price_final = i;
		}//end if
	}//end calculate_price_final
	//end getters and setters
	@Override
	public abstract String toString();
	//toString abstract to inherit
}//end class product