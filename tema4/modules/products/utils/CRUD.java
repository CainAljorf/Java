package tema4.modules.products.utils;

import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.utils.validators;

public class CRUD {
	public static laptop create_laptop() {
		String str = "";
//		String ID = insert_data.insert_ID("Ingresa un ID alfanúmerico como el siguiente ejemplo.\nABC-123", "Ingresar ID");
		dates date_purchase = date_product.insert_date_purchase(
				"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
				"Ingresar fecha compra");
		dates date_delivery = date_product.insert_date_delivery(date_purchase);
		dates date_return = date_product.insert_date_return(date_delivery);
		dates collection_date = date_product.insert_collection_date(date_return);
		dates date_sales_init = date_product.insert_date_sales_init();
		dates date_sales_end = date_product.insert_date_sales_end(date_sales_init);
		float price = validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio");
		float discount = validators.validator_float("Ingresa el descuento del producto.", "Ingresar descuento");
		singleton.L = new laptop(singleton.L.getID_product(), price, 150, 30, "Rojo", 5, date_purchase, date_delivery,
				date_sales_init, date_sales_end,date_return,collection_date,discount, 7,
				"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
// with dummies
//		singleton.L = new laptop("ASD-123", 100, 150, 30, "Rojo", 5, new dates("02/12/2000"), new dates("03/12/2000"),
//				new dates("01/12/2001"), new dates("19/12/2001"),new dates("12/12/2000"), new dates("17/12/2000"),0.5f, 7,
//				"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
		singleton.D = singleton.L.getF_compra();
		int sales_init=singleton.D.compare_dates(((laptop) singleton.L).getDate_sales_init());
		int sales_end=((dates) singleton.D).compare_dates(((laptop) singleton.L).getDate_sales_end());
		((laptop)singleton.L).setIs_promo(date_product.is_promo(sales_init,sales_end));
		((laptop)singleton.L).setIs_return(singleton.L.is_return());
		((laptop)singleton.L).calculate_price_final();
		str = "Laptop creado correctamente.";
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return singleton.L;
	}// end create_laptop
	public static smartphone create_smartphone() {
		String str = "";
		String ID = insert_data.insert_ID("Ingresa un ID alfanúmerico como el siguiente ejemplo.\nABC-123", "Ingresar ID");

		dates date_purchase = date_product.insert_date_purchase(
				"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
				"Ingresar fecha compra");
		dates date_delivery = date_product.insert_date_delivery(date_purchase);
		dates date_return = date_product.insert_date_return(date_delivery);
		dates collection_date = date_product.insert_collection_date(date_return);
		dates date_sales_init = date_product.insert_date_sales_init();
		dates date_sales_end = date_product.insert_date_sales_end(date_sales_init);
		float price = validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio");
		float discount = validators.validator_float("Ingresa el descuento del producto.", "Ingresar descuento");
		singleton.S=new smartphone(ID,price,30,100,"Negro",5,date_purchase,date_delivery,date_sales_init,
				date_sales_end,date_return,collection_date,discount,20,"IPS","6.8","8GB","128GB","Qualcomm","Oppo","Android","Leica 1.5f");
		str="Smartphone creado correctamente.";
		singleton.D = singleton.S.getF_compra();
		int sales_init=singleton.D.compare_dates(((smartphone) singleton.S).getDate_sales_init());
		int sales_end=((dates) singleton.D).compare_dates(((smartphone) singleton.S).getDate_sales_end());
		((smartphone)singleton.S).setIs_promo(date_product.is_promo(sales_init,sales_end));
		((smartphone)singleton.S).setIs_return(singleton.S.is_return());
		((smartphone)singleton.S).calculate_price_final();
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return singleton.S;
	}
	public static accessory create_accessory() {
		String str = "";
		String ID = insert_data.insert_ID("Ingresa un ID alfanúmerico como el siguiente ejemplo.\nABC-123", "Ingresar ID");
		dates date_purchase = date_product.insert_date_purchase(
				"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
				"Ingresar fecha compra");
		dates date_delivery = date_product.insert_date_delivery(date_purchase);
		dates date_return = date_product.insert_date_return(date_delivery);
		dates collection_date = date_product.insert_collection_date(date_return);
		dates date_sales_init = date_product.insert_date_sales_init();
		dates date_sales_end = date_product.insert_date_sales_end(date_sales_init);
		float price = validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio");
		float discount = validators.validator_float("Ingresa el descuento del producto.", "Ingresar descuento");
		singleton.A=new accessory(ID,price,50,90,"Azul",5,date_purchase,date_delivery,
		date_sales_init,date_sales_end,date_return,collection_date,discount,70,"Cargador","Cableado","5 años","Polvo");
		str="Accessorio creado correctamente.";
		singleton.D = singleton.S.getF_compra();
		int sales_init=singleton.D.compare_dates(((accessory) singleton.A).getDate_sales_init());
		int sales_end=((dates) singleton.D).compare_dates(((accessory) singleton.A).getDate_sales_end());
		((accessory)singleton.A).setIs_promo(date_product.is_promo(sales_init,sales_end));
		((accessory)singleton.A).setIs_return(singleton.A.is_return());
		((accessory)singleton.A).calculate_price_final();
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return singleton.A;
	}
	public static laptop new_laptop(String message, String title) {
		singleton.ID=insert_data.insert_ID(message,title);
		return new laptop(singleton.ID);
	}
	public static smartphone new_smartphone(String message, String title) {
		singleton.ID=insert_data.insert_ID(message,title);
		return new smartphone(singleton.ID);
	}
	public static accessory new_accessory(String message, String title) {
		singleton.ID=insert_data.insert_ID(message,title);
		return new accessory(singleton.ID);
	}
	public static void read_all() {
		String str = "";
		if (singleton.L instanceof laptop) {
			str = ((laptop) singleton.L).toString();
		} else if (singleton.S instanceof smartphone) {
			str = ((smartphone) singleton.S).toString();
		} else if (singleton.A instanceof accessory) {
			str = ((accessory) singleton.A).toString();
		} // end if
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	}// end read
	public static void read() {
		Object opt = null;
		String str = "";
		if (singleton.L instanceof laptop) {
			opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
							"Fecha de entrega", "Fecha de devolución", "Fecha de recogida", "Pantalla",
							"Pulgadas de pantalla", "Tipo de teclado", "Memoria RAM", "Almacenamiento", "Procesador",
							"Fuente de Alimentación", "Gráficos", "Marca", "Cámara", "Inicio de Rebajas",
							"Fin de Rebajas", "Descuento", "Precio final" },
					"ID");
			if (opt == null) {
				JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			} // end if
			switch (opt.toString()) {
			case "ID":
				str = "ID: " + ((laptop) singleton.L).getID_product();
				break;
			case "Precio":
				str = "Precio: " + ((laptop) singleton.L).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((laptop) singleton.L).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((laptop) singleton.L).getStock();
				break;
			case "Color":
				str = "Color: " + ((laptop) singleton.L).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((laptop) singleton.L).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((laptop) singleton.L).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((laptop) singleton.L).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((laptop) singleton.L).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((laptop) singleton.L).getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + ((laptop) singleton.L).getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + ((laptop) singleton.L).getScreen_inches();
				break;
			case "Tipo de teclado":
				str = "Tipo de teclado: " + ((laptop) singleton.L).getKeyboard();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + ((laptop) singleton.L).getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + ((laptop) singleton.L).getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + ((laptop) singleton.L).getCPU();
				break;
			case "Fuente de Alimentación":
				str = "Fuente de Alimentación: " + ((laptop) singleton.L).getPower_supply();
				break;
			case "Gráficos":
				str = "Gráficos: " + ((laptop) singleton.L).getGraphics();
				break;
			case "Cámara":
				str = "Cámara: " + ((laptop) singleton.L).getCamera();
				break;
			case "Marca":
				str = "Marca: " + ((laptop) singleton.L).getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((laptop) singleton.L).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + ((laptop) singleton.L).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((laptop) singleton.L).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((laptop) singleton.L).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (singleton.S instanceof smartphone) {
			opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
							"Fecha de entrega", "Fecha de devolución", "Fecha de recogida","Pantalla",
							"Pulgadas de pantalla", "Memoria RAM", "Almacenamiento", "Procesador", "Sistema Operativo",
							"Marca","Cámara","Inicio de Rebajas","Fin de Rebajas", "Descuento", "Precio final"},
					"ID");
			if (opt == null) {
				JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			} // end if
			switch (opt.toString()) {
			case "ID":
				str = "ID: " + ((smartphone) singleton.S).getID_product();
				break; 
			case "Precio":
				str = "Precio: " + ((smartphone) singleton.S).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((smartphone) singleton.S).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((smartphone) singleton.S).getStock();
				break;
			case "Color":
				str = "Color: " + ((smartphone) singleton.S).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((smartphone) singleton.S).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((smartphone) singleton.S).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((smartphone) singleton.S).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((smartphone) singleton.S).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((smartphone) singleton.S).getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + ((smartphone) singleton.S).getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + ((smartphone) singleton.S).getScreen_inches();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + ((smartphone) singleton.S).getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + ((smartphone) singleton.S).getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + ((smartphone) singleton.S).getCPU();
				break;
			case "Sistema Operativo":
				str = "Sistema Operativo: " + ((smartphone) singleton.S).getOS();
				break;
			case "Cámara":
				str = "Cámara: " + ((smartphone) singleton.S).getCamera();
				break;
			case "Marca":
				str = "Marca: " + ((smartphone) singleton.S).getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((smartphone) singleton.S).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + ((smartphone) singleton.S).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((smartphone) singleton.S).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((smartphone) singleton.S).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (singleton.A instanceof accessory) {
			opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
							"Fecha de entrega", "Fecha de devolución", "Fecha de recogida","Tipo de accesorio",
							"Garantía", "Inicio de Rebajas","Fin de Rebajas", "Descuento", "Precio final",
							"Protección", "Conectividad"},
					"ID");
			if (opt == null) {
				JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			} // end if
			switch (opt.toString()) {
			case "ID":
				str = "ID: " + ((accessory) singleton.A).getID_product();
				break;
			case "Precio":
				str = "Precio: " + ((accessory) singleton.A).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((accessory) singleton.A).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((accessory) singleton.A).getStock();
				break;
			case "Color":
				str = "Color: " + ((accessory) singleton.A).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((accessory) singleton.A).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((accessory) singleton.A).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((accessory) singleton.A).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((accessory) singleton.A).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((accessory) singleton.A).getF_recogida();
				break;
			case "Tipo de accesorio":
				str = "Tipo de accesorio: " + ((accessory) singleton.A).getType();
				break;
			case "Garantía":
				str = "Garantía: " + ((accessory) singleton.A).getWarranty();
				break;
			case "Protección":
				str = "Protección: " + ((accessory) singleton.A).getProtection();
				break;
			case "Conectividad":
				str = "Conectividad: " + ((accessory) singleton.A).getConnectivity();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((accessory) singleton.A).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Número de días de Rebajas: " + ((accessory) singleton.A).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((accessory) singleton.A).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((accessory) singleton.A).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read
	public static void update() {
		String str = "";
		Object opt = null;
		int sales_init=0;
		int sales_end=0;
		if (singleton.L instanceof laptop) {
			opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
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
				set_ID_laptop();
				break;
			case "Precio":
				singleton.L.setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de laptop actualizado a: " + singleton.L.getPrice();
				break;
			case "Peso":
				singleton.L.setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de laptop actualizado a: " + singleton.L.getPeso();
				break;
			case "Stock":
				singleton.L.setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de laptop actualizado a: " + singleton.L.getStock();
				break;
			case "Color":
				singleton.L.setColor(insert_data.insert_color());
				str = "Color de laptop actualizado a: " + singleton.L.getColor();
				break;
			case "Dimensión":
				singleton.L.setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de laptop actualizado a: " + singleton.L.getDimension();
				break;
			case "Fecha de compra":
				singleton.L.setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				singleton.L.setIs_promo(date_product.is_promo(sales_init,sales_end));
				singleton.L.calculate_price_final();
				str = "Fecha de compra de laptop actualizado a: " + singleton.L.getF_compra();
				break;
			case "Fecha de entrega":
				singleton.L.setF_entrega(date_product.insert_date_delivery(singleton.L.getF_compra()));
				str = "Fecha de entrega de laptop actualizado a: " + singleton.L.getF_entrega();
				break;
			case "Fecha de devolución":
				singleton.L.setF_devolucion(date_product.insert_date_return(singleton.L.getF_entrega()));
				singleton.L.setIs_return(singleton.L.is_return());
				singleton.L.calculate_price_final();
				str = "Fecha de devolución de laptop actualizado a: " + singleton.L.getF_devolucion();
				break;
			case "Fecha de recogida":
				singleton.L.setF_recogida(date_product.insert_collection_date(singleton.L.getF_devolucion()));
				str = "Fecha de devolución de laptop actualizado a: " + singleton.L.getF_recogida();
				break;
			case "Pantalla":
				singleton.L.setScreen(insert_data.insert_screen());
				str = "Pantalla de laptop actualizado a: " + singleton.L.getScreen();
				break;
			case "Pulgadas de pantalla":
				singleton.L.setScreen_inches(insert_data.insert_screen_inches("laptop"));
				str = "Pulgadas de pantalla del laptop actualizadas a: " + singleton.L.getScreen_inches();
				break;
			case "Tipo de teclado":
				singleton.L.setKeyboard(insert_data.insert_keyboard());
				str = "Tipo de teclado de laptop actualizado a: " + singleton.L.getKeyboard();
				break;
			case "Memoria RAM":
				singleton.L.setRAM(insert_data.insert_RAM("laptop"));
				str = "Memoria RAM de laptop actualizada a: " + singleton.L.getRAM();
				break;
			case "Almacenamiento":
				singleton.L.setStorage(insert_data.insert_storage());
				str = "Almacenamiento de laptop actualizado a: " + singleton.L.getStorage();
				break;
			case "Procesador":
				singleton.L.setCPU(insert_data.insert_CPU("laptop"));
				str = "Procesador del laptop actualizado a: " + singleton.L.getCPU();
				break;
			case "Fuente de Alimentación":
				singleton.L.setPower_supply(insert_data.insert_power_supply());
				str = "Fuente de alimentación de laptop actualizada a: " + singleton.L.getPower_supply();
				break;
			case "Gráficos":
				singleton.L.setGraphics(insert_data.insert_graphics());
				str = "Gráficos del laptop actualizados a: " + singleton.L.getGraphics();
				break;
			case "Cámara":
				singleton.L.setCamera(insert_data.insert_camera());
				str = "Cámara del laptop actualizada a: " + singleton.L.getCamera();
				break;
			case "Marca":
				singleton.L.setBrand(insert_data.insert_brand("laptop"));
				str = "Marca del laptop actualizada a: " + singleton.L.getBrand();
				break;
			case "Inicio de Rebajas":
				singleton.L.setDate_sales_init(date_product.insert_date_sales_init());
				sales_init=singleton.D.compare_dates(singleton.L.getDate_sales_init());
				singleton.L.setIs_promo(date_product.is_promo(sales_init,sales_end));
				singleton.L.calculate_price_final();
				str = "Fecha de inicio de rebajas actualizado a: "+ singleton.L.getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((laptop) singleton.L).setDate_sales_end(date_product.insert_date_sales_end(((laptop) singleton.L).getDate_sales_init()));
				sales_end=((dates) singleton.D).compare_dates(((laptop) singleton.L).getDate_sales_end());
				((laptop)singleton.L).setIs_promo(date_product.is_promo(sales_init,sales_end));
				singleton.L.calculate_price_final();
				str = "Fecha de fin de rebajas actualizado a: "+ ((laptop) singleton.L).getDate_sales_end();
				break;
			case "Descuento":
				((laptop) singleton.L).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				((laptop)singleton.L).setIs_promo(date_product.is_promo(sales_init,sales_end));
				singleton.L.calculate_price_final();
				str = "Descuento de Rebajas actualizado a: " + ((laptop) singleton.L).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((laptop) singleton.L).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (singleton.S instanceof smartphone) {
			opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
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
				set_ID_smartphone();
				str = "ID de smartphone actualizado a: " + ((smartphone) singleton.S).getID_product();
				break;
			case "Precio":
				((smartphone) singleton.S).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de smartphone actualizado a: " + ((smartphone) singleton.S).getPrice();
				break;
			case "Peso":
				((smartphone) singleton.S).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de smartphone actualizado a: " + ((smartphone) singleton.S).getPeso();
				break;
			case "Stock":
				((smartphone) singleton.S).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de smartphone actualizado a: " + ((smartphone) singleton.S).getStock();
				break;
			case "Color":
				((smartphone) singleton.S).setColor(insert_data.insert_color());
				str = "Color de smartphone actualizado a: " + ((smartphone) singleton.S).getColor();
				break;
			case "Dimensión":
				((smartphone) singleton.S).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de smartphone actualizado a: " + ((smartphone) singleton.S).getDimension();
				break;
			case "Fecha de compra":
				((smartphone) singleton.S).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de smartphone actualizado a: " + ((smartphone) singleton.S).getF_compra();
				break;
			case "Fecha de entrega":
				((smartphone) singleton.S).setF_entrega(date_product.insert_date_delivery(((smartphone) singleton.S).getF_compra()));
				str = "Fecha de entrega de smartphone actualizado a: " + ((smartphone) singleton.S).getF_entrega();
				break;
			case "Fecha de devolución":
				((smartphone)singleton.S).setF_devolucion(date_product.insert_date_return(((smartphone) singleton.S).getF_entrega()));
				str = "Fecha de devolución de smartphone actualizado a: " + ((smartphone) singleton.S).getF_devolucion();
				break;
			case "Fecha de recogida":
				((smartphone)singleton.S).setF_recogida(date_product.insert_collection_date(((smartphone) singleton.S).getF_devolucion()));
				str = "Fecha de devolución de smartphone actualizado a: " + ((smartphone) singleton.S).getF_recogida();
				break;
			case "Pantalla": 
				((smartphone) singleton.S).setScreen(insert_data.insert_screen());
				str = "Tipo de pantalla de smartphone actualizado a: " + ((smartphone) singleton.S).getScreen();
				break;
			case "Pulgadas de pantalla":
				((smartphone) singleton.S).setScreen_inches(insert_data.insert_screen_inches("smartphone"));
				str = "Pulgadas de la pantalla de smartphone actualizado a: " + ((smartphone) singleton.S).getScreen_inches();
				break;
			case "Memoria RAM":
				((smartphone) singleton.S).setRAM(insert_data.insert_RAM("smartphone"));
				str = "Memoria RAM de smartphone actualizada a: " + ((smartphone) singleton.S).getRAM();
				break;
			case "Almacenamiento":
				((smartphone) singleton.S).setStorage(insert_data.insert_storage());
				str = "Almacenamiento del smartphone actualizado a: " + ((smartphone) singleton.S).getStorage();
				break;
			case "Procesador":
				((smartphone) singleton.S).setCPU(insert_data.insert_CPU("smartphone"));
				str = "Procesador del smartphone actualizado a: " + ((smartphone) singleton.S).getCPU();
				break;
			case "Sistema Operativo":
				((smartphone) singleton.S).setOS(insert_data.insert_OS());
				str = "Sistema Operativo del smartphone actualizado a: " + ((smartphone) singleton.S).getOS();
				break;
			case "Cámara":
				((smartphone) singleton.S).setCamera(insert_data.insert_camera());
				str = "Cámara del smartphone actualizado a: " + ((smartphone) singleton.S).getCamera();
				break;
			case "Marca":
				((smartphone) singleton.S).setBrand(insert_data.insert_brand("smartphone"));
				str = "Marca del smartphone actualizado a: " + ((smartphone) singleton.S).getBrand();
				break;
			case "Inicio de Rebajas":
				((smartphone) singleton.S).setDate_sales_init(date_product.insert_date_sales_init());
				str = "Fecha de inicio de rebajas actualizado a: "+ ((smartphone) singleton.S).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((smartphone) singleton.S).setDate_sales_end(date_product.insert_date_sales_end(((smartphone) singleton.S).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((smartphone) singleton.S).getDate_sales_end();
				break;
			case "Descuento":
				((smartphone) singleton.S).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((smartphone) singleton.S).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((smartphone) singleton.S).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (singleton.A instanceof accessory) {
			opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
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
				set_ID_accessory();
				str = "ID de accesorio actualizado a: " + ((accessory) singleton.A).getID_product();
				break;
			case "Precio":
				((accessory) singleton.A).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de accessorio actualizado a: " + ((accessory) singleton.A).getPrice();
				break;
			case "Peso":
				((accessory) singleton.A).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de accessorio actualizado a: " + ((accessory) singleton.A).getPeso();
				break;
			case "Stock":
				((accessory) singleton.A).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de accessorio actualizado a: " + ((accessory) singleton.A).getStock();
				break;
			case "Color":
				((accessory) singleton.A).setColor(insert_data.insert_color());
				str = "Color de accessorio actualizado a: " + ((accessory) singleton.A).getColor();
				break;
			case "Dimensión":
				((accessory) singleton.A).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de accesorio actualizado a: " + ((accessory) singleton.A).getDimension();
				break;
			case "Fecha de compra":
				((accessory) singleton.A).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de accesorio actualizado a: " + ((accessory) singleton.A).getF_compra();
				break;
			case "Fecha de entrega":
				((accessory) singleton.A).setF_entrega(date_product.insert_date_delivery(((accessory) singleton.A).getF_compra()));
				str = "Fecha de entrega de accesorio actualizado a: " + ((accessory) singleton.A).getF_entrega();
				break;
			case "Fecha de devolución":
				((accessory)singleton.A).setF_devolucion(date_product.insert_date_return(((accessory) singleton.A).getF_entrega()));
				str = "Fecha de devolución de accesorio actualizado a: " + ((accessory) singleton.A).getF_devolucion();
				break;
			case "Fecha de recogida":
				((accessory)singleton.A).setF_recogida(date_product.insert_collection_date(((accessory) singleton.A).getF_devolucion()));
				str = "Fecha de devolución de accesorio actualizado a: " + ((accessory) singleton.A).getF_recogida();
				break;
			case "Tipo de accesorio":
				((accessory) singleton.A).setType(insert_data.insert_type_accessory());
				str = "Tipo de accesorio actualizado a: "+ ((accessory) singleton.A).getType();
				break;
			case "Garantía":
				((accessory) singleton.A).setWarranty(validators.validator_string("Ingresa la garantía producto.", "Ingresar Garantía"));
				str = "Garantía del producto actualizada a: "+ ((accessory) singleton.A).getWarranty();
				break;
			case "Protección":
				((accessory) singleton.A).setProtection(insert_data.insert_protection());
				str = "Tipo de protección del producto actualizado a: "+ ((accessory) singleton.A).getProtection();
				break;
			case "Conectividad":
				((accessory) singleton.A).setConnectivity(insert_data.insert_connectivity());
				str = "Conectividad de accesorio actualizado a: "+ ((accessory) singleton.A).getConnectivity();
				break;
			case "Inicio de Rebajas":
				((accessory) singleton.A).setDate_sales_init(date_product.insert_date_sales_init());
				str = "Fecha de inicio de rebajas actualizado a: "+ ((accessory) singleton.A).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((accessory) singleton.A).setDate_sales_end(date_product.insert_date_sales_end(((accessory) singleton.A).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((accessory) singleton.A).getDate_sales_end();
				break;
			case "Descuento":
				((accessory) singleton.A).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((accessory) singleton.A).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((accessory) singleton.A).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end update
	public static void set_ID_laptop (){
		int location = -1;
		singleton.L = CRUD.new_laptop("Escribe el ID al que quieras actualizar.", "Actualizar ID");
		location = find.find_laptop();
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya hay un producto con ese ID.","Error",JOptionPane.ERROR_MESSAGE);
		}else {
			singleton.L.setID_product(singleton.ID);
			JOptionPane.showMessageDialog(null, "ID de laptop actualizado a: " + singleton.L.getID_product(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void set_ID_smartphone (){
		int location = -1;
		singleton.S = CRUD.new_smartphone("Escribe el ID al que quieras actualizar.", "Actualizar ID");
		location = find.find_laptop();
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya hay un producto con ese ID.","Error",JOptionPane.ERROR_MESSAGE);
		}else {
			singleton.S.setID_product(singleton.ID);
		}
	}
	public static void set_ID_accessory (){
		int location = -1;
		singleton.A = CRUD.new_accessory("Escribe el ID al que quieras actualizar.", "Actualizar ID");
		location = find.find_laptop();
		if (location != -1) {
			JOptionPane.showMessageDialog(null, "Ya hay un producto con ese ID.","Error",JOptionPane.ERROR_MESSAGE);
		}else {
			singleton.A.setID_product(singleton.ID);
		}
	}
//	public static void delete() {
//		if (singleton.L instanceof laptop) {
//			singleton.L = null;
//		} else if (singleton.S instanceof smartphone) {
//			singleton.S = null;
//		} else if (singleton.A instanceof accessory) {
//			singleton.A = null;
//		} // end if
//	}// end delete
}// end class CRUD