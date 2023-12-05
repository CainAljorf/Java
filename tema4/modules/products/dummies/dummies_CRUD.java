package tema4.modules.products.dummies;

import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.modules.products.classes.pcgaming;
import tema4.modules.products.utils.date_product;
import tema4.modules.products.utils.insert_data;
import tema4.utils.validators;
import tema4.modules.products.classes.accessory;

public class dummies_CRUD {
	public static laptop create_dummies_laptop(){
		return new laptop(singleton.L.getID_product(), 100, 150, 30, "Rojo", 5, singleton.D=new dates("02/12/2000"), singleton.D=new dates("03/12/2000"),
				singleton.D=new dates("01/12/2001"), singleton.D=new dates("19/12/2001"),singleton.D=new dates("12/12/2000"), singleton.D=new dates("17/12/2000"),0.5f, 7,
				"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
	}
	public static pcgaming create_dummies_pcgaming(){
		return new pcgaming(singleton.PC.getID_product(), // ID_product
        100, // price
        150, // peso
        30, // stock
        "Rojo", // color
        5, // dimension
        singleton.D=new dates("02/12/2000"), // f_compra
        singleton.D=new dates("03/12/2000"), // f_entrega
        singleton.D=new dates("01/12/1999"), // date_sales_init
        singleton.D=new dates("19/12/1999"), // date_sales_end
        singleton.D=new dates("00/00/0000"), // f_devolucion
        singleton.D=new dates("00/00/0000"), // f_recogida
        0.5f, // discont
        7, // price_final
        singleton.D=new dates("01/12/2000"), // f_ini_sales_nadal
        singleton.D=new dates("07/01/2001"), // f_fin_sales_nadal
        false, // sales_nadal
        7, // num_dies_nadal
        "ATX", // disseny_caixa
        "Líquida", // refrigeracio
        3, // num_ventiladors
        0.5f);// discount_nadal);
	}
	public static pcgaming new_id_pcgaming() {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ID = "";
	    for (int i = 0; i < 3; i++) {
	        int randomIndex = (int) (Math.random() * letters.length());
	        ID += letters.charAt(randomIndex);
	    }
	    ID += "-";
	    for (int i = 0; i < 3; i++) {
	    	ID += (int) (Math.random() * 10);
	    }
	    singleton.ID = ID;
		return new pcgaming (singleton.ID);
	}
	public static laptop new_id_laptop() {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ID = "";
	    for (int i = 0; i < 3; i++) {
	        int randomIndex = (int) (Math.random() * letters.length());
	        ID += letters.charAt(randomIndex);
	    }
	    ID += "-";
	    for (int i = 0; i < 3; i++) {
	    	ID += (int) (Math.random() * 10);
	    }
	    singleton.ID = ID;
		return new laptop (singleton.ID);
	}
	public static smartphone create_dummies_smartphone(){
		return new smartphone(singleton.S.getID_product(), 100, 150, 30, "Rojo", 5, singleton.D=new dates("02/12/2000"), singleton.D=new dates("03/12/2000"),
				singleton.D=new dates("01/12/2001"), singleton.D=new dates("19/12/2001"),singleton.D=new dates("12/12/2000"), singleton.D=new dates("17/12/2000"),0.5f, 7,
				"IPS","6.8","8GB","128GB","Qualcomm","Oppo","Android","Leica 1.5f");
	}
	public static smartphone new_id_smartphone() {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ID = "";
	    for (int i = 0; i < 3; i++) {
	        int randomIndex = (int) (Math.random() * letters.length());
	        ID += letters.charAt(randomIndex);
	    }
	    ID += "-";
	    for (int i = 0; i < 3; i++) {
	    	ID += (int) (Math.random() * 10);
	    }
	    singleton.ID = ID;
		return new smartphone(singleton.ID);
	}
	public static accessory create_dummies_accessory(){
		return new accessory(singleton.A.getID_product(), 100, 150, 30, "Rojo", 5, singleton.D=new dates("02/12/2000"), singleton.D=new dates("03/12/2000"),
				singleton.D=new dates("01/12/2001"), singleton.D=new dates("19/12/2001"),singleton.D=new dates("12/12/2000"), singleton.D=new dates("17/12/2000"),0.5f, 7,
				"Cargador","Cableado","5 años","Polvo");
	}
	public static accessory new_id_accessory() {
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ID = "";
	    for (int i = 0; i < 3; i++) {
	        int randomIndex = (int) (Math.random() * letters.length());
	        ID += letters.charAt(randomIndex);
	    }
	    ID += "-";
	    for (int i = 0; i < 3; i++) {
	    	ID += (int) (Math.random() * 10);
	    }
	    singleton.ID = ID;
		return new accessory (singleton.ID);
	}
	public static String set_dummies_ID_laptop (){
		int location = -1;
		String str;
		singleton.L_ID = new_id_laptop();
		location = find_dummies.find_product_dummies(singleton.L_ID);
		if (location != -1) {
			str="Ya hay un producto con ese ID.";
		}else {
			singleton.L.setID_product(singleton.ID);
			str="ID de laptop actualizado a: " + singleton.L.getID_product();
		}
		return str;
	}
	public static String set_dummies_ID_smartphone (){
		int location = -1;
		String str;
		singleton.S_ID = new_id_smartphone();
		location = find_dummies.find_product_dummies(singleton.S_ID);
		if (location != -1) {
			str="Ya hay un producto con ese ID.";
		}else {
			singleton.S.setID_product(singleton.ID);
			str="ID de smartphone actualizado a: " + singleton.S.getID_product();
		}
		return str;
	}
	public static String set_dummies_pcgaming(){
		int location = -1;
		String str;
		singleton.PC_ID = new_id_pcgaming();
		location = find_dummies.find_product_dummies(singleton.PC_ID);
		if (location != -1) {
			str="Ya hay un producto con ese ID.";
		}else {
			singleton.PC.setID_product(singleton.ID);
			str="ID de pcgaming actualizado a: " + singleton.PC.getID_product();
		}
		return str;
	}
	public static String set_dummies_ID_accessory (){
		int location = -1;
		String str;
		singleton.A_ID = new_id_accessory();
		location = find_dummies.find_product_dummies(singleton.A_ID);
		if (location != -1) {
			str="Ya hay un producto con ese ID.";
		}else {
			singleton.A.setID_product(singleton.ID);
			str="ID de accesorio actualizado a: " + singleton.A.getID_product();
		}//end if
		return str;
	}
	public static void read_laptop() {
		String str = "";
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
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
		} else {
			switch (opt.toString()) {
				case "ID":
					str = "ID: " + singleton.L.getID_product();
					break;
				case "Precio":
					str = "Precio: " + singleton.L.getPrice();
					break;
				case "Peso":
					str = "Peso: " + singleton.L.getPeso();
					break;
				case "Stock":
					str = "Stock: " + singleton.L.getStock();
					break;
				case "Color":
					str = "Color: " + singleton.L.getColor();
					break;
				case "Dimensión":
					str = "Dimensión: " + singleton.L.getDimension();
					break;
				case "Fecha de compra":
					str = "Fecha de Compra: " + singleton.L.getF_compra();
					break;
				case "Fecha de entrega":
					str = "Fecha de entrega: " + singleton.L.getF_entrega();
					break;
				case "Fecha de devolución":
					str = "Fecha de devolución: " + singleton.L.getF_devolucion();
					break;
				case "Fecha de recogida":
					str = "Fecha de recogida: " + singleton.L.getF_recogida();
					break;
				case "Pantalla":
					str = "Pantalla: " + singleton.L.getScreen();
					break;
				case "Pulgadas de pantalla":
					str = "Pulgadas de pantalla: " + singleton.L.getScreen_inches();
					break;
				case "Tipo de teclado":
					str = "Tipo de teclado: " + singleton.L.getKeyboard();
					break;
				case "Memoria RAM":
					str = "Memoria RAM: " + singleton.L.getRAM();
					break;
				case "Almacenamiento":
					str = "Almacenamiento: " + singleton.L.getStorage();
					break;
				case "Procesador":
					str = "Procesador: " + singleton.L.getCPU();
					break;
				case "Fuente de Alimentación":
					str = "Fuente de Alimentación: " + singleton.L.getPower_supply();
					break;
				case "Gráficos":
					str = "Gráficos: " + singleton.L.getGraphics();
					break;
				case "Cámara":
					str = "Cámara: " + singleton.L.getCamera();
					break;
				case "Marca":
					str = "Marca: " + singleton.L.getBrand();
					break;
				case "Inicio de Rebajas":
					str = "Inicio de rebajas: " + singleton.L.getDate_sales_init();
					break;
				case "Fin de Rebajas":
					str = "Fin de Rebajas: " + singleton.L.getDate_sales_end();
					break;
				case "Descuento":
					str = "Descuento de Rebajas: " + singleton.L.getDiscont();
					break;
				case "Precio final":
					str = "Precio final: " + singleton.L.getPrice_final();
					break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read_laptop
	public static void read_pcgaming(){
		String str = "";
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega", "Fecha de devolución", "Fecha de recogida","Inicio de Rebajas de navidad",
						"Fin de Rebajas de navidad", "Descuento", "Precio final", "Diseño de la caja", "Refrigeración",
						"Número de ventiladores", "Descuento de Navidad" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			switch (opt.toString()) {
				case "ID":
					str = "ID: " + singleton.PC.getID_product();
					break;
				case "Precio":
					str = "Precio: " + singleton.PC.getPrice();
					break;
				case "Peso":
					str = "Peso: " + singleton.PC.getPeso();
					break;
				case "Stock":
					str = "Stock: " + singleton.PC.getStock();
					break;
				case "Color":
					str = "Color: " + singleton.PC.getColor();
					break;
				case "Dimensión":
					str = "Dimensión: " + singleton.PC.getDimension();
					break;
				case "Fecha de compra":
					str = "Fecha de Compra: " + singleton.PC.getF_compra();
					break;
				case "Fecha de entrega":
					str = "Fecha de entrega: " + singleton.PC.getF_entrega();
					break;
				case "Fecha de devolución":
					str = "Fecha de devolución: " + singleton.PC.getF_devolucion();
					break;
				case "Fecha de recogida":
					str = "Fecha de recogida: " + singleton.PC.getF_recogida();
					break;
				case "Inicio de Rebajas de navidad":
					str = "Fecha de inicio de rebajas de navidad: " + singleton.PC.getF_ini_sales_nadal();
					break;
				case "Fin de Rebajas de navidad":
					str = "Fecha de fin de rebajas de navidad: " + singleton.PC.getF_fin_sales_nadal();
					break;
				case "Descuento":
					str = "Descuento de Rebajas: " + singleton.PC.getDiscont();
					break;
				case "Precio final":
					str = "Precio final: " + singleton.PC.getPrice_final();
					break;
				case "Diseño de la caja":
					str = "Diseño de la caja: " + singleton.PC.getDisseny_caixa();
					break;
				case "Refrigeración":
					str = "Refrigeración: " + singleton.PC.getRefrigeracio();
					break;
				case "Número de ventiladores":
					str = "Número de ventiladores: " + singleton.PC.getNum_ventiladors();
					break;
				case "Descuento de Navidad":
					str = "Descuento de Navidad: " + singleton.PC.getDiscount_nadal();
					break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read_pcgaming
	public static void read_smartphone() {
		String str = "";
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega", "Fecha de devolución", "Fecha de recogida", "Pantalla",
						"Pulgadas de pantalla", "Memoria RAM", "Almacenamiento", "Procesador", "Sistema Operativo",
						"Marca", "Cámara", "Inicio de Rebajas", "Fin de Rebajas", "Descuento", "Precio final" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			switch (opt.toString()) {
				case "ID":
					str = "ID: " + singleton.S.getID_product();
					break;
				case "Precio":
					str = "Precio: " + singleton.S.getPrice();
					break;
				case "Peso":
					str = "Peso: " + singleton.S.getPeso();
					break;
				case "Stock":
					str = "Stock: " + singleton.S.getStock();
					break;
				case "Color":
					str = "Color: " + singleton.S.getColor();
					break;
				case "Dimensión":
					str = "Dimensión: " + singleton.S.getDimension();
					break;
				case "Fecha de compra":
					str = "Fecha de Compra: " + singleton.S.getF_compra();
					break;
				case "Fecha de entrega":
					str = "Fecha de entrega: " + singleton.S.getF_entrega();
					break;
				case "Fecha de devolución":
					str = "Fecha de devolución: " + singleton.S.getF_devolucion();
					break;
				case "Fecha de recogida":
					str = "Fecha de recogida: " + singleton.S.getF_recogida();
					break;
				case "Pantalla":
					str = "Pantalla: " + singleton.S.getScreen();
					break;
				case "Pulgadas de pantalla":
					str = "Pulgadas de pantalla: " + singleton.S.getScreen_inches();
					break;
				case "Memoria RAM":
					str = "Memoria RAM: " + singleton.S.getRAM();
					break;
				case "Almacenamiento":
					str = "Almacenamiento: " + singleton.S.getStorage();
					break;
				case "Procesador":
					str = "Procesador: " + singleton.S.getCPU();
					break;
				case "Sistema Operativo":
					str = "Sistema Operativo: " + singleton.S.getOS();
					break;
				case "Cámara":
					str = "Cámara: " + singleton.S.getCamera();
					break;
				case "Marca":
					str = "Marca: " + singleton.S.getBrand();
					break;
				case "Inicio de Rebajas":
					str = "Inicio de rebajas: " + singleton.S.getDate_sales_init();
					break;
				case "Fin de Rebajas":
					str = "Fin de Rebajas: " + singleton.S.getDate_sales_end();
					break;
				case "Descuento":
					str = "Descuento de Rebajas: " + singleton.S.getDiscont();
					break;
				case "Precio final":
					str = "Precio final: " + singleton.S.getPrice_final();
					break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read_smartphone
	public static void read_accessory() {
		String str = "";
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para ver:", "Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega", "Fecha de devolución", "Fecha de recogida", "Tipo de accesorio",
						"Garantía", "Inicio de Rebajas", "Fin de Rebajas", "Descuento", "Precio final",
						"Protección", "Conectividad" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			switch (opt.toString()) {
				case "ID":
					str = "ID: " + singleton.A.getID_product();
					break;
				case "Precio":
					str = "Precio: " + singleton.A.getPrice();
					break;
				case "Peso":
					str = "Peso: " + singleton.A.getPeso();
					break;
				case "Stock":
					str = "Stock: " + singleton.A.getStock();
					break;
				case "Color":
					str = "Color: " + singleton.A.getColor();
					break;
				case "Dimensión":
					str = "Dimensión: " + singleton.A.getDimension();
					break;
				case "Fecha de compra":
					str = "Fecha de Compra: " + singleton.A.getF_compra();
					break;
				case "Fecha de entrega":
					str = "Fecha de entrega: " + singleton.A.getF_entrega();
					break;
				case "Fecha de devolución":
					str = "Fecha de devolución: " + singleton.A.getF_devolucion();
					break;
				case "Fecha de recogida":
					str = "Fecha de recogida: " + singleton.A.getF_recogida();
					break;
				case "Tipo de accesorio":
					str = "Tipo de accesorio: " + singleton.A.getType();
					break;
				case "Garantía":
					str = "Garantía: " + singleton.A.getWarranty();
					break;
				case "Protección":
					str = "Protección: " + singleton.A.getProtection();
					break;
				case "Conectividad":
					str = "Conectividad: " + singleton.A.getConnectivity();
					break;
				case "Inicio de Rebajas":
					str = "Inicio de rebajas: " + singleton.A.getDate_sales_init();
					break;
				case "Fin de Rebajas":
					str = "Número de días de Rebajas: " + singleton.A.getDate_sales_end();
					break;
				case "Descuento":
					str = "Descuento de Rebajas: " + singleton.A.getDiscont();
					break;
				case "Precio final":
					str = "Precio final: " + singleton.A.getPrice_final();
					break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read_accessory
	public static void update_laptop() {
		String str = "";
		int sales_init = 0;
		int sales_end = 0;
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:",
				"Selector de opciones",
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
		} else {
			sales_init = singleton.D.compare_dates(singleton.L.getDate_sales_init());
			sales_end = singleton.D.compare_dates(singleton.L.getDate_sales_end());
			switch (opt.toString()) {
				case "ID":
					str = set_dummies_ID_laptop();
					break;
				case "Precio":
					singleton.L.setPrice(validators.validator_float(
							"Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
					singleton.L.calculate_price_final();
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
					singleton.L.setIs_promo(date_product.is_promo(sales_init, sales_end));
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
					sales_init = singleton.D.compare_dates(singleton.L.getDate_sales_init());
					singleton.L.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.L.calculate_price_final();
					str = "Fecha de inicio de rebajas actualizado a: " + singleton.L.getDate_sales_init();
					break;
				case "Fin de Rebajas":
					singleton.L.setDate_sales_end(date_product.insert_date_sales_end(singleton.L.getDate_sales_init()));
					sales_end = singleton.D.compare_dates(singleton.L.getDate_sales_end());
					singleton.L.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.L.calculate_price_final();
					str = "Fecha de fin de rebajas actualizado a: " + singleton.L.getDate_sales_end();
					break;
				case "Descuento":
					singleton.L.setDiscont(validators.validator_float(
							"Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
					singleton.L.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.L.calculate_price_final();
					str = "Descuento de Rebajas actualizado a: " + singleton.L.getDiscont();
					break;
				case "Precio final":
					str = "El precio final del producto es " + singleton.L.getPrice_final()
							+ " y se calcula automáticamente, por lo que no se puede modificar.";
					break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end update_laptop
	public static void update_pcgaming() {
		String str = "";
		int sales_init = 0;
		int sales_end = 0;
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:",
				"Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega", "Fecha de devolución", "Fecha de recogida","Inicio de Rebajas de navidad",
						"Fin de Rebajas de navidad", "Descuento", "Precio final", "Diseño de la caja", "Refrigeración",
						"Número de ventiladores", "Descuento de Navidad" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			sales_init = singleton.D.compare_dates(singleton.PC.getDate_sales_init());
			sales_end = singleton.D.compare_dates(singleton.PC.getDate_sales_end());
			switch (opt.toString()) {
				case "ID":
					str = set_dummies_pcgaming();
					break;
				case "Precio":
					singleton.PC.setPrice(validators.validator_float(
							"Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
					singleton.PC.calculate_price_final();
					str = "Precio de pcgaming actualizado a: " + singleton.PC.getPrice();
					break;
				case "Peso":
					singleton.PC.setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
					str = "Peso de pcgaming actualizado a: " + singleton.PC.getPeso();
					break;
				case "Stock":
					singleton.PC.setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
					str = "Stock de pcgaming actualizado a: " + singleton.PC.getStock();
					break;
				case "Color":
					singleton.PC.setColor(insert_data.insert_color());
					str = "Color de pcgaming actualizado a: " + singleton.PC.getColor();
					break;
				case "Dimensión":
					singleton.PC.setDimension(
							validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
					str = "Dimensión de pcgaming actualizado a: " + singleton.PC.getDimension();
					break;
				case "Fecha de compra":
					singleton.PC.setF_compra(date_product.insert_date_purchase(
							"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
							"Ingresar fecha compra"));
					singleton.PC.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.PC.calculate_price_final();
					str = "Fecha de compra de pcgaming actualizado a: " + singleton.PC.getF_compra();
					break;
				case "Fecha de entrega":
					singleton.PC.setF_entrega(date_product.insert_date_delivery(singleton.PC.getF_compra()));
					str = "Fecha de entrega de pcgaming actualizado a: " + singleton.PC.getF_entrega();
					break;
				case "Fecha de devolución":
					singleton.PC.setF_devolucion(date_product.insert_date_return(singleton.PC.getF_entrega()));
					singleton.PC.setIs_return(singleton.PC.is_return());
					singleton.PC.calculate_price_final();
					str = "Fecha de devolución de pcgaming actualizado a: " + singleton.PC.getF_devolucion();
					break;
				case "Fecha de recogida":
					singleton.PC.setF_recogida(date_product.insert_collection_date(singleton.PC.getF_devolucion()));
					str = "Fecha de devolución de pcgaming actualizado a: " + singleton.PC.getF_recogida();
					break;
				case "Inicio de Rebajas de navidad":
					singleton.PC.setF_ini_sales_nadal(date_product.insert_date_sales_init());
					sales_init = singleton.D.compare_dates(singleton.PC.getF_ini_sales_nadal());
					singleton.PC.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.PC.calculate_price_final();
					str = "Fecha de inicio de rebajas de navidad actualizado a: " + singleton.PC.getF_ini_sales_nadal();
					break;
				case "Fin de Rebajas de navidad":
					singleton.PC.setF_fin_sales_nadal(date_product.insert_date_sales_end(singleton.PC.getF_ini_sales_nadal()));
					sales_end = singleton.D.compare_dates(singleton.PC.getF_fin_sales_nadal());
					singleton.PC.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.PC.calculate_price_final();
					str = "Fecha de fin de rebajas de navidad actualizado a: " + singleton.PC.getF_fin_sales_nadal();
					break;
				case "Descuento":
					singleton.PC.setDiscont(validators.validator_float(
							"Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
					singleton.PC.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.PC.calculate_price_final();
					str = "Descuento de Rebajas actualizado a: " + singleton.PC.getDiscont();
					break;
				case "Precio final":
					str = "El precio final del producto es " + singleton.PC.getPrice_final()
							+ " y se calcula automáticamente, por lo que no se puede modificar.";
					break;
				case "Diseño de la caja":
					singleton.PC.setDisseny_caixa(insert_data.insert_disseny_caixa());
					str = "Diseño de la caja de pcgaming actualizado a: " + singleton.PC.getDisseny_caixa();
					break;
				case "Refrigeración":
					singleton.PC.setRefrigeracio(insert_data.insert_refrigeracio());
					str = "Refrigeración de pcgaming actualizado a: " + singleton.PC.getRefrigeracio();
					break;
				case "Número de ventiladores":
					singleton.PC.setNum_ventiladors(validators.validator_int(
							"Ingresa el número de ventiladores del producto.", "Ingresar número de ventiladores"));
					str = "Número de ventiladores de pcgaming actualizado a: " + singleton.PC.getNum_ventiladors();
					break;
				case "Descuento de Navidad":
					singleton.PC.setDiscount_nadal(validators.validator_float(
							"Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
					str = "Descuento de Navidad actualizado a: " + singleton.PC.getDiscount_nadal();
					break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end update_pcgaming
	public static void update_smartphone() {
		String str = "";
		int sales_init = 0;
		int sales_end = 0;
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:",
				"Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega",
						"Fecha de devolución", "Fecha de recogida", "Pantalla", "Pulgadas de pantalla", "Memoria RAM",
						"Almacenamiento", "Procesador", "Sistema Operativo", "Marca", "Cámara", "Inicio de Rebajas",
						"Fin de Rebajas", "Descuento", "Precio final" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			sales_init = singleton.D.compare_dates(singleton.S.getDate_sales_init());
			sales_end = singleton.D.compare_dates(singleton.S.getDate_sales_end());
			switch (opt.toString()) {
				case "ID":
					str = set_dummies_ID_smartphone();
					break;
				case "Precio":
					singleton.S.setPrice(validators.validator_float(
							"Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
					singleton.S.calculate_price_final();
					str = "Precio de smartphone actualizado a: " + singleton.S.getPrice();
					break;
				case "Peso":
					singleton.S.setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
					str = "Peso de smartphone actualizado a: " + singleton.S.getPeso();
					break;
				case "Stock":
					singleton.S.setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
					str = "Stock de smartphone actualizado a: " + singleton.S.getStock();
					break;
				case "Color":
					singleton.S.setColor(insert_data.insert_color());
					str = "Color de smartphone actualizado a: " + singleton.S.getColor();
					break;
				case "Dimensión":
					singleton.S.setDimension(
							validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
					str = "Dimensión de smartphone actualizado a: " + singleton.S.getDimension();
					break;
				case "Fecha de compra":
					singleton.S.setF_compra(date_product.insert_date_purchase(
							"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
							"Ingresar fecha compra"));
					singleton.S.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.S.calculate_price_final();
					str = "Fecha de compra de smartphone actualizado a: " + singleton.S.getF_compra();
					break;
				case "Fecha de entrega":
					singleton.S.setF_entrega(date_product.insert_date_delivery(singleton.S.getF_compra()));
					str = "Fecha de entrega de smartphone actualizado a: " + singleton.S.getF_entrega();
					break;
				case "Fecha de devolución":
					singleton.S.setF_devolucion(date_product.insert_date_return(singleton.S.getF_entrega()));
					singleton.S.setIs_return(singleton.S.is_return());
					singleton.S.calculate_price_final();
					str = "Fecha de devolución de smartphone actualizado a: " + singleton.S.getF_devolucion();
					break;
				case "Fecha de recogida":
					singleton.S.setF_recogida(date_product.insert_collection_date(singleton.S.getF_devolucion()));
					str = "Fecha de devolución de smartphone actualizado a: " + singleton.S.getF_recogida();
					break;
				case "Pantalla":
					singleton.S.setScreen(insert_data.insert_screen());
					str = "Tipo de pantalla de smartphone actualizado a: " + singleton.S.getScreen();
					break;
				case "Pulgadas de pantalla":
					singleton.S.setScreen_inches(insert_data.insert_screen_inches("smartphone"));
					str = "Pulgadas de la pantalla de smartphone actualizado a: " + singleton.S.getScreen_inches();
					break;
				case "Memoria RAM":
					singleton.S.setRAM(insert_data.insert_RAM("smartphone"));
					str = "Memoria RAM de smartphone actualizada a: " + singleton.S.getRAM();
					break;
				case "Almacenamiento":
					singleton.S.setStorage(insert_data.insert_storage());
					str = "Almacenamiento del smartphone actualizado a: " + singleton.S.getStorage();
					break;
				case "Procesador":
					singleton.S.setCPU(insert_data.insert_CPU("smartphone"));
					str = "Procesador del smartphone actualizado a: " + singleton.S.getCPU();
					break;
				case "Sistema Operativo":
					singleton.S.setOS(insert_data.insert_OS());
					str = "Sistema Operativo del smartphone actualizado a: " + singleton.S.getOS();
					break;
				case "Cámara":
					singleton.S.setCamera(insert_data.insert_camera());
					str = "Cámara del smartphone actualizado a: " + singleton.S.getCamera();
					break;
				case "Marca":
					singleton.S.setBrand(insert_data.insert_brand("smartphone"));
					str = "Marca del smartphone actualizado a: " + singleton.S.getBrand();
					break;
				case "Inicio de Rebajas":
					singleton.S.setDate_sales_init(date_product.insert_date_sales_init());
					sales_init = singleton.D.compare_dates(singleton.S.getDate_sales_init());
					singleton.S.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.S.calculate_price_final();
					str = "Fecha de inicio de rebajas actualizado a: " + singleton.S.getDate_sales_init();
					break;
				case "Fin de Rebajas":
					singleton.S.setDate_sales_end(date_product.insert_date_sales_end(singleton.S.getDate_sales_init()));
					sales_end = singleton.D.compare_dates(singleton.S.getDate_sales_end());
					singleton.S.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.S.calculate_price_final();
					str = "Fecha de fin de rebajas actualizado a: " + singleton.S.getDate_sales_end();
					break;
				case "Descuento":
					singleton.S.setDiscont(validators.validator_float(
							"Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
					singleton.S.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.S.calculate_price_final();
					str = "Descuento de Rebajas actualizado a: " + singleton.S.getDiscont();
					break;
				case "Precio final":
					str = "El precio final del producto es " + singleton.S.getPrice_final()
							+ " y se calcula automáticamente, por lo que no se puede modificar.";
					break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end update_smartphone

	public static void update_accessory() {
		String str = "";
		int sales_init = 0;
		int sales_end = 0;
		Object opt = JOptionPane.showInputDialog(null, "Seleccione un atributo para actualizarlo:",
				"Selector de opciones",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
						"Fecha de entrega",
						"Fecha de devolución", "Fecha de recogida", "Tipo de accesorio", "Garantía",
						"Inicio de Rebajas",
						"Fin de Rebajas", "Descuento", "Precio final", "Protección", "Conectividad" },
				"ID");
		if (opt == null) {
			JOptionPane.showMessageDialog(null, "Cerrando el programa.", "Cerrar", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			sales_init = singleton.D.compare_dates(singleton.A.getDate_sales_init());
			sales_end = singleton.D.compare_dates(singleton.A.getDate_sales_end());
			switch (opt.toString()) {
				case "ID":
					str = set_dummies_ID_accessory();
					break;
				case "Precio":
					singleton.A.setPrice(validators.validator_float(
							"Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
					singleton.A.calculate_price_final();
					str = "Precio de accessorio actualizado a: " + singleton.A.getPrice();
					break;
				case "Peso":
					singleton.A.setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
					str = "Peso de accessorio actualizado a: " + singleton.A.getPeso();
					break;
				case "Stock":
					singleton.A.setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
					str = "Stock de accessorio actualizado a: " + singleton.A.getStock();
					break;
				case "Color":
					singleton.A.setColor(insert_data.insert_color());
					str = "Color de accessorio actualizado a: " + singleton.A.getColor();
					break;
				case "Dimensión":
					singleton.A.setDimension(
							validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
					str = "Dimensión de accesorio actualizado a: " + singleton.A.getDimension();
					break;
				case "Fecha de compra":
					singleton.A.setF_compra(date_product.insert_date_purchase(
							"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
							"Ingresar fecha compra"));
					singleton.A.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.A.calculate_price_final();
					str = "Fecha de compra de accesorio actualizado a: " + singleton.A.getF_compra();
					break;
				case "Fecha de entrega":
					singleton.A.setF_entrega(date_product.insert_date_delivery(singleton.A.getF_compra()));
					str = "Fecha de entrega de accesorio actualizado a: " + singleton.A.getF_entrega();
					break;
				case "Fecha de devolución":
					singleton.A.setF_devolucion(date_product.insert_date_return(singleton.A.getF_entrega()));
					singleton.A.setIs_return(singleton.A.is_return());
					singleton.A.calculate_price_final();
					str = "Fecha de devolución de accesorio actualizado a: " + singleton.A.getF_devolucion();
					break;
				case "Fecha de recogida":
					singleton.A.setF_recogida(date_product.insert_collection_date(singleton.A.getF_devolucion()));
					str = "Fecha de devolución de accesorio actualizado a: " + singleton.A.getF_recogida();
					break;
				case "Tipo de accesorio":
					singleton.A.setType(insert_data.insert_type_accessory());
					str = "Tipo de accesorio actualizado a: " + singleton.A.getType();
					break;
				case "Garantía":
					singleton.A.setWarranty(
							validators.validator_string("Ingresa la garantía producto.", "Ingresar Garantía"));
					str = "Garantía del producto actualizada a: " + singleton.A.getWarranty();
					break;
				case "Protección":
					singleton.A.setProtection(insert_data.insert_protection());
					str = "Tipo de protección del producto actualizado a: " + singleton.A.getProtection();
					break;
				case "Conectividad":
					singleton.A.setConnectivity(insert_data.insert_connectivity());
					str = "Conectividad de accesorio actualizado a: " + singleton.A.getConnectivity();
					break;
				case "Inicio de Rebajas":
					singleton.A.setDate_sales_init(date_product.insert_date_sales_init());
					sales_init = singleton.D.compare_dates(singleton.A.getDate_sales_init());
					singleton.A.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.A.calculate_price_final();
					str = "Fecha de inicio de rebajas actualizado a: " + singleton.A.getDate_sales_init();
					break;
				case "Fin de Rebajas":
					singleton.A.setDate_sales_end(date_product.insert_date_sales_end(singleton.A.getDate_sales_init()));
					sales_end = singleton.D.compare_dates(singleton.A.getDate_sales_end());
					singleton.A.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.A.calculate_price_final();
					str = "Fecha de fin de rebajas actualizado a: " + singleton.A.getDate_sales_end();
					break;
				case "Descuento":
					singleton.A.setDiscont(validators.validator_float(
							"Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
					singleton.A.setIs_promo(date_product.is_promo(sales_init, sales_end));
					singleton.A.calculate_price_final();
					str = "Descuento de Rebajas actualizado a: " + singleton.A.getDiscont();
					break;
				case "Precio final":
					str = "El precio final del producto es " + singleton.A.getPrice_final()
							+ " y se calcula automáticamente, por lo que no se puede modificar.";
					break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end update
}
