package tema4.modules.products.dummies;

import javax.swing.JOptionPane;

import tema4.classes.dates;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.modules.products.utils.date_product;
import tema4.modules.products.classes.accessory;

public class dummies {
	public static laptop create_dummies_laptop(){
		return new laptop("ASD-123", 100, 150, 30, "Rojo", 5, new dates("02/12/2000"), new dates("03/12/2000"),
				new dates("01/12/2001"), new dates("19/12/2001"),new dates("12/12/2000"), new dates("17/12/2000"),0.5f, 7,
				"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
	}
	public static laptop new_id_laptop() {
		String ID="";
		ID="ABC-123";
		return new laptop (ID);
	}
	public static smartphone create_dummies_smartphone(){
		return new smartphone("ASD-123", 100, 150, 30, "Rojo", 5, new dates("02/12/2000"), new dates("03/12/2000"),
				new dates("01/12/2001"), new dates("19/12/2001"),new dates("12/12/2000"), new dates("17/12/2000"),0.5f, 7,
				"IPS","6.8","8GB","128GB","Qualcomm","Oppo","Android","Leica 1.5f");
	}
	public static smartphone new_id_smartphone() {
		String ID="";
		ID="ABC-123";
		return new smartphone(ID);
	}
	public static accessory create_dummies_accessory(){
		return new accessory("ASD-123", 100, 150, 30, "Rojo", 5, new dates("02/12/2000"), new dates("03/12/2000"),
				new dates("01/12/2001"), new dates("19/12/2001"),new dates("12/12/2000"), new dates("17/12/2000"),0.5f, 7,
				"Cargador","Cableado","5 años","Polvo");
	}
	public static accessory new_id_accessory() {
		String ID="";
		ID="ABC-123";
		return new accessory (ID);
	}
	public static void update_dummies() {
	String str = "";
	Object opt = null;
	int sales_init=0;
	int sales_end=0;
	if (singleton.L instanceof laptop) {
		opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega", "Fecha de devolución", "Fecha de recogida", "Pantalla",
						"Pulgadas de pantalla", "Tipo de teclado", "Memoria RAM", "Almacenamiento", "Procesador",
						"Fuente de Alimentación", "Gráficos", "Marca", "Cámara", "Inicio de Rebajas",
						"Fin de Rebajas", "Descuento", "Precio final"},
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} // end if
		sales_init=singleton.D.compare_dates(singleton.L.getDate_sales_init());
		sales_end=singleton.D.compare_dates(singleton.L.getDate_sales_end());
		switch (opt.toString()) {
		case "ID":
			singleton.L.setID_product("ACB-123");
			break;
		case "Precio":
			singleton.L.setPrice(100);
			singleton.L.calculate_price_final();
			str = "Precio de laptop actualizado a: " + singleton.L.getPrice();
			break;
		case "Peso":
			singleton.L.setPeso(90);
			str = "Peso de laptop actualizado a: " + singleton.L.getPeso();
			break;
		case "Stock":
			singleton.L.setStock(99);
			str = "Stock de laptop actualizado a: " + singleton.L.getStock();
			break;
		case "Color":
			singleton.L.setColor("RED");
			str = "Color de laptop actualizado a: " + singleton.L.getColor();
			break;
		case "Dimensión":
			singleton.L.setDimension(34);
			str = "Dimensión de laptop actualizado a: " + singleton.L.getDimension();
			break;
		case "Fecha de compra":
			singleton.L.setF_compra(new dates("12/12/2000"));
			singleton.L.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.L.calculate_price_final();
			str = "Fecha de compra de laptop actualizado a: " + singleton.L.getF_compra();
			break;
		case "Fecha de entrega":
			singleton.L.setF_entrega(new dates("13/12/2000"));
			str = "Fecha de entrega de laptop actualizado a: " + singleton.L.getF_entrega();
			break;
		case "Fecha de devolución":
			singleton.L.setF_devolucion(new dates("14/12/2000"));
			singleton.L.setIs_return(singleton.L.is_return());
			singleton.L.calculate_price_final();
			str = "Fecha de devolución de laptop actualizado a: " + singleton.L.getF_devolucion();
			break;
		case "Fecha de recogida":
			singleton.L.setF_recogida(new dates("15/12/2000"));
			str = "Fecha de devolución de laptop actualizado a: " + singleton.L.getF_recogida();
			break;
		case "Pantalla":
			singleton.L.setScreen("QLED");
			str = "Pantalla de laptop actualizado a: " + singleton.L.getScreen();
			break;
		case "Pulgadas de pantalla":
			singleton.L.setScreen_inches("21'");
			str = "Pulgadas de pantalla del laptop actualizadas a: " + singleton.L.getScreen_inches();
			break;
		case "Tipo de teclado":
			singleton.L.setKeyboard("QWERTY RU");
			str = "Tipo de teclado de laptop actualizado a: " + singleton.L.getKeyboard();
			break;
		case "Memoria RAM":
			singleton.L.setRAM("64GB");
			str = "Memoria RAM de laptop actualizada a: " + singleton.L.getRAM();
			break;
		case "Almacenamiento":
			singleton.L.setStorage("2TB");
			str = "Almacenamiento de laptop actualizado a: " + singleton.L.getStorage();
			break;
		case "Procesador":
			singleton.L.setCPU("AMD Ryzen 7");
			str = "Procesador del laptop actualizado a: " + singleton.L.getCPU();
			break;
		case "Fuente de Alimentación":
			singleton.L.setPower_supply("80 plus Gold");
			str = "Fuente de alimentación de laptop actualizada a: " + singleton.L.getPower_supply();
			break;
		case "Gráficos":
			singleton.L.setGraphics("Nvidia GeForce");
			str = "Gráficos del laptop actualizados a: " + singleton.L.getGraphics();
			break;
		case "Cámara":
			singleton.L.setCamera("Sony XLe 1.5f");
			str = "Cámara del laptop actualizada a: " + singleton.L.getCamera();
			break;
		case "Marca":
			singleton.L.setBrand("Lenovo");
			str = "Marca del laptop actualizada a: " + singleton.L.getBrand();
			break;
		case "Inicio de Rebajas":
			singleton.L.setDate_sales_init(new dates("10/12/2000"));
			sales_init=singleton.D.compare_dates(singleton.L.getDate_sales_init());
			singleton.L.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.L.calculate_price_final();
			str = "Fecha de inicio de rebajas actualizado a: "+ singleton.L.getDate_sales_init();
			break;
		case "Fin de Rebajas":
			singleton.L.setDate_sales_end(new dates("22/12/2000"));
			sales_end=singleton.D.compare_dates(singleton.L.getDate_sales_end());
			singleton.L.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.L.calculate_price_final();
			str = "Fecha de fin de rebajas actualizado a: "+ singleton.L.getDate_sales_end();
			break;
		case "Descuento":
			singleton.L.setDiscont(0.5f);
			singleton.L.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.L.calculate_price_final();
			str = "Descuento de Rebajas actualizado a: " + singleton.L.getDiscont();
			break;
		case "Precio final":
			str = "El precio final del producto es "+singleton.L.getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
			break;
		}// end switch
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	} else if (singleton.S instanceof smartphone) {
		opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra","Fecha de entrega",
						"Fecha de devolución", "Fecha de recogida","Pantalla","Pulgadas de pantalla", "Memoria RAM", 
						"Almacenamiento", "Procesador", "Sistema Operativo","Marca","Cámara","Inicio de Rebajas",
						"Fin de Rebajas", "Descuento", "Precio final"},
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} // end if
		switch (opt.toString()) {
		case "ID":
			singleton.S.setID_product("QWE-123");
			str = "ID de smartphone actualizado a: " + singleton.S.getID_product();
			break;
		case "Precio":
			singleton.S.setPrice(66);
			singleton.S.calculate_price_final();
			str = "Precio de smartphone actualizado a: " + singleton.S.getPrice();
			break;
		case "Peso":
			singleton.S.setPeso(30);
			str = "Peso de smartphone actualizado a: " + singleton.S.getPeso();
			break;
		case "Stock":
			singleton.S.setStock(200);
			str = "Stock de smartphone actualizado a: " + singleton.S.getStock();
			break;
		case "Color":
			singleton.S.setColor("Black");
			str = "Color de smartphone actualizado a: " + singleton.S.getColor();
			break;
		case "Dimensión":
			singleton.S.setDimension(40);
			str = "Dimensión de smartphone actualizado a: " + singleton.S.getDimension();
			break;
		case "Fecha de compra":
			singleton.S.setF_compra(new dates("12/12/2000"));
			str = "Fecha de compra de smartphone actualizado a: " + singleton.S.getF_compra();
			break;
		case "Fecha de entrega":
			singleton.S.setF_entrega(new dates("13/12/2000"));
			str = "Fecha de entrega de smartphone actualizado a: " + singleton.S.getF_entrega();
			break;
		case "Fecha de devolución":
			singleton.S.setF_devolucion(new dates("00/00/0000"));
			str = "Fecha de devolución de smartphone actualizado a: " + singleton.S.getF_devolucion();
			break;
		case "Fecha de recogida":
			singleton.S.setF_recogida(new dates("00/00/0000"));
			str = "Fecha de devolución de smartphone actualizado a: " + singleton.S.getF_recogida();
			break;
		case "Pantalla": 
			singleton.S.setScreen("Micro-LED");
			str = "Tipo de pantalla de smartphone actualizado a: " + singleton.S.getScreen();
			break;
		case "Pulgadas de pantalla":
			singleton.S.setScreen_inches("7.1");
			str = "Pulgadas de la pantalla de smartphone actualizado a: " + singleton.S.getScreen_inches();
			break;
		case "Memoria RAM":
			singleton.S.setRAM("16GB");
			str = "Memoria RAM de smartphone actualizada a: " + singleton.S.getRAM();
			break;
		case "Almacenamiento":
			singleton.S.setStorage("128GB");
			str = "Almacenamiento del smartphone actualizado a: " + singleton.S.getStorage();
			break;
		case "Procesador":
			singleton.S.setCPU("MediaTek");
			str = "Procesador del smartphone actualizado a: " + singleton.S.getCPU();
			break;
		case "Sistema Operativo":
			singleton.S.setOS("Android 12 with MIUI");
			str = "Sistema Operativo del smartphone actualizado a: " + singleton.S.getOS();
			break;
		case "Cámara":
			singleton.S.setCamera("Leica 1.4f");
			str = "Cámara del smartphone actualizado a: " + singleton.S.getCamera();
			break;
		case "Marca":
			singleton.S.setBrand("Xiaomi");
			str = "Marca del smartphone actualizado a: " + singleton.S.getBrand();
			break;
		case "Inicio de Rebajas":
			singleton.S.setDate_sales_init(new dates("21/12/2000"));
			str = "Fecha de inicio de rebajas actualizado a: "+ singleton.S.getDate_sales_init();
			break;
		case "Fin de Rebajas":
			singleton.S.setDate_sales_end(new dates("22/12/2000"));
			str = "Fecha de fin de rebajas actualizado a: "+ singleton.S.getDate_sales_end();
			break;
		case "Descuento":
			singleton.S.setDiscont(0.5f);
			str = "Descuento de Rebajas actualizado a: " + singleton.S.getDiscont();
			break;
		case "Precio final":
			str = "El precio final del producto es "+ singleton.S.getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
			break;
		}// end switch
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	} else if (singleton.A instanceof accessory) {
		opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra","Fecha de entrega",
						"Fecha de devolución", "Fecha de recogida","Tipo de accesorio",	"Garantía", "Inicio de Rebajas",
						"Fin de Rebajas", "Descuento", "Precio final","Protección", "Conectividad" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} // end if
		switch (opt.toString()) {
		case "ID":
			singleton.A.setID_product("ASD-123");
			str = "ID de accesorio actualizado a: " + singleton.A.getID_product();
			break;
		case "Precio":
			singleton.A.setPrice(300);
			singleton.A.calculate_price_final();
			str = "Precio de accessorio actualizado a: " + singleton.A.getPrice();
			break;
		case "Peso":
			singleton.A.setPeso(333);
			str = "Peso de accessorio actualizado a: " + singleton.A.getPeso();
			break;
		case "Stock":
			singleton.A.setStock(999);
			str = "Stock de accessorio actualizado a: " + singleton.A.getStock();
			break;
		case "Color":
			singleton.A.setColor("Yellow");
			str = "Color de accessorio actualizado a: " + singleton.A.getColor();
			break;
		case "Dimensión":
			singleton.A.setDimension(30);
			str = "Dimensión de accesorio actualizado a: " + singleton.A.getDimension();
			break;
		case "Fecha de compra":
			singleton.A.setF_compra(new dates("12/12/2000"));
			str = "Fecha de compra de accesorio actualizado a: " + singleton.A.getF_compra();
			break;
		case "Fecha de entrega":
			singleton.A.setF_entrega(new dates("13/12/2000"));
			str = "Fecha de entrega de accesorio actualizado a: " + singleton.A.getF_entrega();
			break;
		case "Fecha de devolución":
			singleton.A.setF_devolucion(new dates("14/12/2000"));
			str = "Fecha de devolución de accesorio actualizado a: " + singleton.A.getF_devolucion();
			break;
		case "Fecha de recogida":
			singleton.A.setF_recogida(new dates("15/12/2000"));
			str = "Fecha de devolución de accesorio actualizado a: " + singleton.A.getF_recogida();
			break;
		case "Tipo de accesorio":
			singleton.A.setType("Funda Rugerizada");
			str = "Tipo de accesorio actualizado a: "+ singleton.A.getType();
			break;
		case "Garantía":
			singleton.A.setWarranty("6 meses");
			str = "Garantía del producto actualizada a: "+ singleton.A.getWarranty();
			break;
		case "Protección":
			singleton.A.setProtection("Ultravioleta");
			str = "Tipo de protección del producto actualizado a: "+ singleton.A.getProtection();
			break;
		case "Conectividad":
			singleton.A.setConnectivity("Manual");
			str = "Conectividad de accesorio actualizado a: "+ singleton.A.getConnectivity();
			break;
		case "Inicio de Rebajas":
			singleton.A.setDate_sales_init(new dates("01/12/2000"));
			str = "Fecha de inicio de rebajas actualizado a: "+ singleton.A.getDate_sales_init();
			break;
		case "Fin de Rebajas":
			singleton.A.setDate_sales_end(new dates("22/12/2000"));
			str = "Fecha de fin de rebajas actualizado a: "+ singleton.A.getDate_sales_end();
			break;
		case "Descuento":
			singleton.A.setDiscont(0.6f);
			str = "Descuento de Rebajas actualizado a: " + singleton.A.getDiscont();
			break;
		case "Precio final":
			str = "El precio final del producto es "+ singleton.A.getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
			break;
		}// end switch
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	} // end if
}// end update
}
