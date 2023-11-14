package tema4.modules.products.classes;

import tema4.classes.dates;

public class accessory extends product {
	private String type;
	private String connectivity;
	private String warranty;
	private String protection;

	public accessory(String ID_product, float price, float peso, int stock, String color, float dimension,
			dates f_compra, dates f_entrega, dates f_devolucion, dates f_recogida, dates date_sales_init,
			dates date_sales_end, float discont, float price_final, String type, String connectivity, String warranty,
			String protection) {
		super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, f_devolucion, f_recogida,
				date_sales_init, date_sales_end, discont, price_final);
		this.type = type;
		this.connectivity = connectivity;
		this.warranty = warranty;
		this.protection = protection;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getProtection() {
		return protection;
	}
	public void setProtection(String protection) {
		this.protection = protection;
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
		str += ("Precio final: " + super.getPrice_final()+ ".\n");
		str += ("Fecha de inicio de promo: " + super.getDate_sales_init()+ ".\n");
		str += ("Fecha de fin de promo: " + super.getDate_sales_end()+ ".\n");
		str += ("Tipo: " + this.getType()+ ".\n");
		str += ("Conectividad: " + this.getConnectivity()+ ".\n");
		str += ("Garantía: " + this.getWarranty()+ ".\n");
		str += ("Protección: " + this.getProtection()+ ".\n");
		return str;
	}//end toString
}//end class accessory