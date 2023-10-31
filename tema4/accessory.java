package tema4;

public class accessory extends product {
	private String type;
	private String electric;
	private String connectivity;
	private String warranty;
	private String protection;
	public accessory(String ID_product, float price, float peso, int stock, String color, float dimension,
			String f_compra, String f_entrega, int n_dias_entrega, String f_devolucion, String f_recogida,
			int n_dias_recogida, int n_dias_devolucion, String type, String electric, String connectivity,
			String warranty, String protection) {
		super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, n_dias_entrega, f_devolucion,
				f_recogida, n_dias_recogida, n_dias_devolucion);
		this.type = type;
		this.electric = electric;
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
	public String getElectric() {
		return electric;
	}
	public void setElectric(String electric) {
		this.electric = electric;
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
	}
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
		str += ("Electrico: " + this.getElectric()+ ".\n");
		str += ("Conectividad: " + this.getConnectivity()+ ".\n");
		str += ("Garantía: " + this.getWarranty()+ ".\n");
		str += ("Protección: " + this.getProtection()+ ".\n");
		return str;
	}
}