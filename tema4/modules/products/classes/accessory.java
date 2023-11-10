package tema4.modules.products.classes;

import tema4.classes.dates;

public class accessory extends product {
	private String type;
	private String connectivity;
	private String warranty;
	private String protection;
	private String f_ultimas_unit;
	private String num_dias_unit;
	private String price_ult_unit;
	public accessory(String ID_product, float price, float peso, int stock, String color, float dimension,
			dates f_compra, dates f_entrega, int n_dias_entrega, dates f_devolucion, dates f_recogida,
			int n_dias_recogida, int n_dias_devolucion, String type, String connectivity,
			String warranty, String protection,String f_ultimas_unit, String num_dias_unit, String price_ult_unit) {
		super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, n_dias_entrega, f_devolucion,
				f_recogida, n_dias_recogida, n_dias_devolucion);
		this.type = type;
		this.connectivity = connectivity;
		this.warranty = warranty;
		this.protection = protection;
		this.f_ultimas_unit = f_ultimas_unit;
		this.num_dias_unit = num_dias_unit;
		this.price_ult_unit = price_ult_unit;
	}//end constructor
	public String getF_ultimas_unit() {
		return f_ultimas_unit;
	}
	public void setF_ultimas_unit(String f_ultimas_unit) {
		this.f_ultimas_unit = f_ultimas_unit;
	}
	public String getNum_dias_unit() {
		return num_dias_unit;
	}
	public void setNum_dias_unit(String num_dias_unit) {
		this.num_dias_unit = num_dias_unit;
	}
	public String getPrice_ult_unit() {
		return price_ult_unit;
	}
	public void setPrice_ult_unit(String price_ult_unit) {
		this.price_ult_unit = price_ult_unit;
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
		str += ("Número de días de entrega: " + super.getN_dias_entrega() + ".\n");
		str += ("Fecha de devolución: " + super.getF_devolucion() + ".\n");
		str += ("Fecha de recogida: " + super.getF_recogida() + ".\n");
		str += ("Número de días de recogida: " + super.getN_dias_recogida() + ".\n");
		str += ("Número de días de devolución: " + super.getN_dias_devolucion()+ ".\n");
		str += ("Tipo: " + this.getType()+ ".\n");
		str += ("Conectividad: " + this.getConnectivity()+ ".\n");
		str += ("Garantía: " + this.getWarranty()+ ".\n");
		str += ("Protección: " + this.getProtection()+ ".\n");
		str += ("Fecha últimas unidades: "+ this.getF_ultimas_unit()+"\n");
		str += ("Número de días de últimas unidades: "+ this.getNum_dias_unit()+"\n");
		str += ("Precio de últimas unidades: "+ this.getPrice_ult_unit()+"\n");
		return str;
	}//end toString
}//end class accessory