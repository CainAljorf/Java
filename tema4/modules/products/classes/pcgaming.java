package tema4.modules.products.classes;
import tema4.classes.dates;

public class pcgaming extends product {
	
    private dates f_ini_sales_nadal;
    private dates f_fin_sales_nadal;
    private boolean sales_nadal;
    private int num_dies_nadal;
    private String disseny_caixa;
    private String refrigeracio;
    private int num_ventiladors;
    private float discount_nadal;
	
	public pcgaming(String ID_product, float price, float peso, int stock, String color, float dimension,
            dates f_compra, dates f_entrega, dates date_sales_init, dates date_sales_end, dates f_devolucion,
            dates f_recogida, float discont, float price_final, dates f_ini_sales_nadal, dates f_fin_sales_nadal,
            boolean sales_nadal, int num_dies_nadal, String disseny_caixa, String refrigeracio, int num_ventiladors,
            float discount_nadal) {
        super(ID_product, price, peso, stock, color, dimension, f_compra, f_entrega, date_sales_init, date_sales_end,
                f_devolucion, f_recogida, discont, price_final);
        this.f_ini_sales_nadal = f_ini_sales_nadal;
        this.f_fin_sales_nadal = f_fin_sales_nadal;
        this.sales_nadal = sales_nadal;
        this.num_dies_nadal = num_dies_nadal;
        this.disseny_caixa = disseny_caixa;
        this.refrigeracio = refrigeracio;
        this.num_ventiladors = num_ventiladors;
        this.discount_nadal = discount_nadal;
    }

    public pcgaming(String ID) {
        super(ID);
    }// constructor primary key
        public dates getF_ini_sales_nadal() {
        return f_ini_sales_nadal;
    }
    public void setF_ini_sales_nadal(dates f_ini_sales_nadal) {
        this.f_ini_sales_nadal = f_ini_sales_nadal;
    }
    public dates getF_fin_sales_nadal() {
        return f_fin_sales_nadal;
    }
    public void setF_fin_sales_nadal(dates f_fin_sales_nadal) {
        this.f_fin_sales_nadal = f_fin_sales_nadal;
    }
    public boolean isSales_nadal() {
        return sales_nadal;
    }
    public void setSales_nadal(boolean sales_nadal) {
        this.sales_nadal = sales_nadal;
    }
    public int getNum_dies_nadal() {
        return num_dies_nadal;
    }
    public void setNum_dies_nadal(int num_dies_nadal) {
        this.num_dies_nadal = num_dies_nadal;
    }
    public String getDisseny_caixa() {
        return disseny_caixa;
    }
    public void setDisseny_caixa(String disseny_caixa) {
        this.disseny_caixa = disseny_caixa;
    }
    public String getRefrigeracio() {
        return refrigeracio;
    }
    public void setRefrigeracio(String refrigeracio) {
        this.refrigeracio = refrigeracio;
    }
    public int getNum_ventiladors() {
        return num_ventiladors;
    }
    public void setNum_ventiladors(int num_ventiladors) {
        this.num_ventiladors = num_ventiladors;
    }
    public float getDiscount_nadal() {
        return discount_nadal;
    }
    public void setDiscount_nadal(float discount_nadal) {
        this.discount_nadal = discount_nadal;
    }
    public float calculateFinalPrice(float initialPrice, float discount, float discount_nadal) {
        float finalPrice = initialPrice;
        finalPrice = finalPrice - (finalPrice * discount / 100);
        finalPrice = finalPrice - (finalPrice * discount_nadal / 100);    
        return finalPrice;
    }
    //Función para calcular el precio final de un producto en promoción de navidad
    //No utilizada por falta de tiempo en el examen.
    public void calculate_price_final_nadal() {
        float price = super.getPrice();
		if (super.getIs_promo() && this.isSales_nadal()) {
			if(super.getIs_return()) {
				price = super.getPrice() * super.getDiscont();
                price = price * this.discount_nadal;
				price *= -1;
				super.setPrice_final(price);
			}else {
				price = super.getPrice() * super.getDiscont();
                price = price * this.discount_nadal;
				price *= -1;
				super.setPrice_final(price);
                }
		}//end if
	}//end calculate_price_final
    //end getters and setters
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
		str += ("Fecha de inicio de promoción de navidad: " + this.getF_ini_sales_nadal() + ".\n");
        str += ("Fecha de fin de promoción de navidad: " + this.getF_fin_sales_nadal() + ".\n");
        str += ("¿Promoción de navidad activa?: " + this.isSales_nadal() + ".\n");
        str += ("Número de días de promoción de navidad: " + this.getNum_dies_nadal() + ".\n");
        str += ("Diseño de la caja: " + this.getDisseny_caixa() + ".\n");
        str += ("Refrigeración: " + this.getRefrigeracio() + ".\n");
        str += ("Número de ventiladores: " + this.getNum_ventiladors() + ".\n");
        str += ("Descuento de navidad: " + this.getDiscount_nadal() + ".\n");
	return str;
	}//end toString
}//end class laptop