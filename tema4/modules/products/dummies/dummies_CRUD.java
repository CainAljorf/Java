package tema4.modules.products.dummies;

import javax.swing.JOptionPane;

import tema4.classes.dates;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.singleton;
import tema4.modules.products.classes.smartphone;
import tema4.modules.products.utils.date_product;
import tema4.modules.products.classes.accessory;

public class dummies_CRUD {
	public static laptop create_dummies_laptop(){
		return new laptop(singleton.DL.getID_product(), 100, 150, 30, "Rojo", 5, singleton.D=new dates("02/12/2000"), singleton.D=new dates("03/12/2000"),
				singleton.D=new dates("01/12/2001"), singleton.D=new dates("19/12/2001"),singleton.D=new dates("12/12/2000"), singleton.D=new dates("17/12/2000"),0.5f, 7,
				"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
	}
	public static laptop new_laptop(laptop laptop) {
		singleton.ID=laptop.getID_product();
		return new laptop(singleton.ID);
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
		return new smartphone(singleton.DS.getID_product(), 100, 150, 30, "Rojo", 5, singleton.D=new dates("02/12/2000"), singleton.D=new dates("03/12/2000"),
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
		return new accessory(singleton.DA.getID_product(), 100, 150, 30, "Rojo", 5, singleton.D=new dates("02/12/2000"), singleton.D=new dates("03/12/2000"),
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
			singleton.DL.setID_product(singleton.ID);
			str="ID de laptop actualizado a: " + singleton.DL.getID_product();
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
			singleton.DS.setID_product(singleton.ID);
			str="ID de smartphone actualizado a: " + singleton.DS.getID_product();
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
			singleton.DA.setID_product(singleton.ID);
			str="ID de accesorio actualizado a: " + singleton.DA.getID_product();
		}
		return str;
	}
	public static void read_one() {
		Object opt = null;
		String str = "";
		if (singleton.DL instanceof laptop) {
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
				str = "ID: " + singleton.DL.getID_product();
				break;
			case "Precio":
				str = "Precio: " + singleton.DL.getPrice();
				break;
			case "Peso":
				str = "Peso: " + singleton.DL.getPeso();
				break;
			case "Stock":
				str = "Stock: " + singleton.DL.getStock();
				break;
			case "Color":
				str = "Color: " + singleton.DL.getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + singleton.DL.getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + singleton.DL.getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + singleton.DL.getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + singleton.DL.getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + singleton.DL.getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + singleton.DL.getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + singleton.DL.getScreen_inches();
				break;
			case "Tipo de teclado":
				str = "Tipo de teclado: " + singleton.DL.getKeyboard();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + singleton.DL.getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + singleton.DL.getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + singleton.DL.getCPU();
				break;
			case "Fuente de Alimentación":
				str = "Fuente de Alimentación: " + singleton.DL.getPower_supply();
				break;
			case "Gráficos":
				str = "Gráficos: " + singleton.DL.getGraphics();
				break;
			case "Cámara":
				str = "Cámara: " + singleton.DL.getCamera();
				break;
			case "Marca":
				str = "Marca: " + singleton.DL.getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + singleton.DL.getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + singleton.DL.getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + singleton.DL.getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + singleton.DL.getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (singleton.DS instanceof smartphone) {
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
				str = "ID: " + singleton.DS.getID_product();
				break; 
			case "Precio":
				str = "Precio: " + singleton.DS.getPrice();
				break;
			case "Peso":
				str = "Peso: " + singleton.DS.getPeso();
				break;
			case "Stock":
				str = "Stock: " + singleton.DS.getStock();
				break;
			case "Color":
				str = "Color: " + singleton.DS.getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + singleton.DS.getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + singleton.DS.getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + singleton.DS.getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + singleton.DS.getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + singleton.DS.getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + singleton.DS.getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + singleton.DS.getScreen_inches();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + singleton.DS.getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + singleton.DS.getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + singleton.DS.getCPU();
				break;
			case "Sistema Operativo":
				str = "Sistema Operativo: " + singleton.DS.getOS();
				break;
			case "Cámara":
				str = "Cámara: " + singleton.DS.getCamera();
				break;
			case "Marca":
				str = "Marca: " + singleton.DS.getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + singleton.DS.getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + singleton.DS.getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + singleton.DS.getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + singleton.DS.getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (singleton.DA instanceof accessory) {
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
				str = "ID: " + singleton.DA.getID_product();
				break;
			case "Precio":
				str = "Precio: " + singleton.DA.getPrice();
				break;
			case "Peso":
				str = "Peso: " + singleton.DA.getPeso();
				break;
			case "Stock":
				str = "Stock: " + singleton.DA.getStock();
				break;
			case "Color":
				str = "Color: " + singleton.DA.getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + singleton.DA.getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + singleton.DA.getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + singleton.DA.getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + singleton.DA.getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + singleton.DA.getF_recogida();
				break;
			case "Tipo de accesorio":
				str = "Tipo de accesorio: " + singleton.DA.getType();
				break;
			case "Garantía":
				str = "Garantía: " + singleton.DA.getWarranty();
				break;
			case "Protección":
				str = "Protección: " + singleton.DA.getProtection();
				break;
			case "Conectividad":
				str = "Conectividad: " + singleton.DA.getConnectivity();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + singleton.DA.getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Número de días de Rebajas: " + singleton.DA.getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + singleton.DA.getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + singleton.DA.getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read
	public static void update_dummies() {
	String str = "";
	Object opt = null;
	int sales_init=0;
	int sales_end=0;
	if (singleton.DL instanceof laptop) {
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
		sales_init=singleton.D.compare_dates(singleton.DL.getDate_sales_init());
		sales_end=singleton.D.compare_dates(singleton.DL.getDate_sales_end());
		switch (opt.toString()) {
		case "ID":
			str=set_dummies_ID_laptop();
			break;
		case "Precio":
			singleton.DL.setPrice(100);
			singleton.DL.calculate_price_final();
			str = "Precio de laptop actualizado a: " + singleton.DL.getPrice();
			break;
		case "Peso":
			singleton.DL.setPeso(90);
			str = "Peso de laptop actualizado a: " + singleton.DL.getPeso();
			break;
		case "Stock":
			singleton.DL.setStock(99);
			str = "Stock de laptop actualizado a: " + singleton.DL.getStock();
			break;
		case "Color":
			singleton.DL.setColor("RED");
			str = "Color de laptop actualizado a: " + singleton.DL.getColor();
			break;
		case "Dimensión":
			singleton.DL.setDimension(34);
			str = "Dimensión de laptop actualizado a: " + singleton.DL.getDimension();
			break;
		case "Fecha de compra":
			singleton.DL.setF_compra(new dates("12/12/2000"));
			singleton.DL.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.DL.calculate_price_final();
			str = "Fecha de compra de laptop actualizado a: " + singleton.DL.getF_compra();
			break;
		case "Fecha de entrega":
			singleton.DL.setF_entrega(new dates("13/12/2000"));
			str = "Fecha de entrega de laptop actualizado a: " + singleton.DL.getF_entrega();
			break;
		case "Fecha de devolución":
			singleton.DL.setF_devolucion(new dates("14/12/2000"));
			singleton.DL.setIs_return(singleton.DL.is_return());
			singleton.DL.calculate_price_final();
			str = "Fecha de devolución de laptop actualizado a: " + singleton.DL.getF_devolucion();
			break;
		case "Fecha de recogida":
			singleton.DL.setF_recogida(new dates("15/12/2000"));
			str = "Fecha de devolución de laptop actualizado a: " + singleton.DL.getF_recogida();
			break;
		case "Pantalla":
			singleton.DL.setScreen("QLED");
			str = "Pantalla de laptop actualizado a: " + singleton.DL.getScreen();
			break;
		case "Pulgadas de pantalla":
			singleton.DL.setScreen_inches("21'");
			str = "Pulgadas de pantalla del laptop actualizadas a: " + singleton.DL.getScreen_inches();
			break;
		case "Tipo de teclado":
			singleton.DL.setKeyboard("QWERTY RU");
			str = "Tipo de teclado de laptop actualizado a: " + singleton.DL.getKeyboard();
			break;
		case "Memoria RAM":
			singleton.DL.setRAM("64GB");
			str = "Memoria RAM de laptop actualizada a: " + singleton.DL.getRAM();
			break;
		case "Almacenamiento":
			singleton.DL.setStorage("2TB");
			str = "Almacenamiento de laptop actualizado a: " + singleton.DL.getStorage();
			break;
		case "Procesador":
			singleton.DL.setCPU("AMD Ryzen 7");
			str = "Procesador del laptop actualizado a: " + singleton.DL.getCPU();
			break;
		case "Fuente de Alimentación":
			singleton.DL.setPower_supply("80 plus Gold");
			str = "Fuente de alimentación de laptop actualizada a: " + singleton.DL.getPower_supply();
			break;
		case "Gráficos":
			singleton.DL.setGraphics("Nvidia GeForce");
			str = "Gráficos del laptop actualizados a: " + singleton.DL.getGraphics();
			break;
		case "Cámara":
			singleton.DL.setCamera("Sony XLe 1.5f");
			str = "Cámara del laptop actualizada a: " + singleton.DL.getCamera();
			break;
		case "Marca":
			singleton.DL.setBrand("Lenovo");
			str = "Marca del laptop actualizada a: " + singleton.DL.getBrand();
			break;
		case "Inicio de Rebajas":
			singleton.DL.setDate_sales_init(new dates("10/12/2000"));
			sales_init=singleton.D.compare_dates(singleton.DL.getDate_sales_init());
			singleton.DL.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.DL.calculate_price_final();
			str = "Fecha de inicio de rebajas actualizado a: "+ singleton.DL.getDate_sales_init();
			break;
		case "Fin de Rebajas":
			singleton.DL.setDate_sales_end(new dates("22/12/2000"));
			sales_end=singleton.D.compare_dates(singleton.DL.getDate_sales_end());
			singleton.DL.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.DL.calculate_price_final();
			str = "Fecha de fin de rebajas actualizado a: "+ singleton.DL.getDate_sales_end();
			break;
		case "Descuento":
			singleton.DL.setDiscont(0.5f);
			singleton.DL.setIs_promo(date_product.is_promo(sales_init,sales_end));
			singleton.DL.calculate_price_final();
			str = "Descuento de Rebajas actualizado a: " + singleton.DL.getDiscont();
			break;
		case "Precio final":
			str = "El precio final del producto es "+singleton.DL.getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
			break;
		}// end switch
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	} else if (singleton.DS instanceof smartphone) {
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
			str=set_dummies_ID_smartphone();
			break;
		case "Precio":
			singleton.DS.setPrice(66);
			singleton.DS.calculate_price_final();
			str = "Precio de smartphone actualizado a: " + singleton.DS.getPrice();
			break;
		case "Peso":
			singleton.DS.setPeso(30);
			str = "Peso de smartphone actualizado a: " + singleton.DS.getPeso();
			break;
		case "Stock":
			singleton.DS.setStock(200);
			str = "Stock de smartphone actualizado a: " + singleton.DS.getStock();
			break;
		case "Color":
			singleton.DS.setColor("Black");
			str = "Color de smartphone actualizado a: " + singleton.DS.getColor();
			break;
		case "Dimensión":
			singleton.DS.setDimension(40);
			str = "Dimensión de smartphone actualizado a: " + singleton.DS.getDimension();
			break;
		case "Fecha de compra":
			singleton.DS.setF_compra(new dates("12/12/2000"));
			str = "Fecha de compra de smartphone actualizado a: " + singleton.DS.getF_compra();
			break;
		case "Fecha de entrega":
			singleton.DS.setF_entrega(new dates("13/12/2000"));
			str = "Fecha de entrega de smartphone actualizado a: " + singleton.DS.getF_entrega();
			break;
		case "Fecha de devolución":
			singleton.DS.setF_devolucion(new dates("00/00/0000"));
			str = "Fecha de devolución de smartphone actualizado a: " + singleton.DS.getF_devolucion();
			break;
		case "Fecha de recogida":
			singleton.DS.setF_recogida(new dates("00/00/0000"));
			str = "Fecha de devolución de smartphone actualizado a: " + singleton.DS.getF_recogida();
			break;
		case "Pantalla": 
			singleton.DS.setScreen("Micro-LED");
			str = "Tipo de pantalla de smartphone actualizado a: " + singleton.DS.getScreen();
			break;
		case "Pulgadas de pantalla":
			singleton.DS.setScreen_inches("7.1");
			str = "Pulgadas de la pantalla de smartphone actualizado a: " + singleton.DS.getScreen_inches();
			break;
		case "Memoria RAM":
			singleton.DS.setRAM("16GB");
			str = "Memoria RAM de smartphone actualizada a: " + singleton.DS.getRAM();
			break;
		case "Almacenamiento":
			singleton.DS.setStorage("128GB");
			str = "Almacenamiento del smartphone actualizado a: " + singleton.DS.getStorage();
			break;
		case "Procesador":
			singleton.DS.setCPU("MediaTek");
			str = "Procesador del smartphone actualizado a: " + singleton.DS.getCPU();
			break;
		case "Sistema Operativo":
			singleton.DS.setOS("Android 12 with MIUI");
			str = "Sistema Operativo del smartphone actualizado a: " + singleton.DS.getOS();
			break;
		case "Cámara":
			singleton.DS.setCamera("Leica 1.4f");
			str = "Cámara del smartphone actualizado a: " + singleton.DS.getCamera();
			break;
		case "Marca":
			singleton.DS.setBrand("Xiaomi");
			str = "Marca del smartphone actualizado a: " + singleton.DS.getBrand();
			break;
		case "Inicio de Rebajas":
			singleton.DS.setDate_sales_init(new dates("21/12/2000"));
			str = "Fecha de inicio de rebajas actualizado a: "+ singleton.DS.getDate_sales_init();
			break;
		case "Fin de Rebajas":
			singleton.DS.setDate_sales_end(new dates("22/12/2000"));
			str = "Fecha de fin de rebajas actualizado a: "+ singleton.DS.getDate_sales_end();
			break;
		case "Descuento":
			singleton.DS.setDiscont(0.5f);
			str = "Descuento de Rebajas actualizado a: " + singleton.DS.getDiscont();
			break;
		case "Precio final":
			str = "El precio final del producto es "+ singleton.DS.getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
			break;
		}// end switch
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	} else if (singleton.DA instanceof accessory) {
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
			str=set_dummies_ID_accessory();
			break;
		case "Precio":
			singleton.DA.setPrice(300);
			singleton.DA.calculate_price_final();
			str = "Precio de accessorio actualizado a: " + singleton.DA.getPrice();
			break;
		case "Peso":
			singleton.DA.setPeso(333);
			str = "Peso de accessorio actualizado a: " + singleton.DA.getPeso();
			break;
		case "Stock":
			singleton.DA.setStock(999);
			str = "Stock de accessorio actualizado a: " + singleton.DA.getStock();
			break;
		case "Color":
			singleton.DA.setColor("Yellow");
			str = "Color de accessorio actualizado a: " + singleton.DA.getColor();
			break;
		case "Dimensión":
			singleton.DA.setDimension(30);
			str = "Dimensión de accesorio actualizado a: " + singleton.DA.getDimension();
			break;
		case "Fecha de compra":
			singleton.DA.setF_compra(new dates("12/12/2000"));
			str = "Fecha de compra de accesorio actualizado a: " + singleton.DA.getF_compra();
			break;
		case "Fecha de entrega":
			singleton.DA.setF_entrega(new dates("13/12/2000"));
			str = "Fecha de entrega de accesorio actualizado a: " + singleton.DA.getF_entrega();
			break;
		case "Fecha de devolución":
			singleton.DA.setF_devolucion(new dates("14/12/2000"));
			str = "Fecha de devolución de accesorio actualizado a: " + singleton.DA.getF_devolucion();
			break;
		case "Fecha de recogida":
			singleton.DA.setF_recogida(new dates("15/12/2000"));
			str = "Fecha de devolución de accesorio actualizado a: " + singleton.DA.getF_recogida();
			break;
		case "Tipo de accesorio":
			singleton.DA.setType("Funda Rugerizada");
			str = "Tipo de accesorio actualizado a: "+ singleton.DA.getType();
			break;
		case "Garantía":
			singleton.DA.setWarranty("6 meses");
			str = "Garantía del producto actualizada a: "+ singleton.DA.getWarranty();
			break;
		case "Protección":
			singleton.DA.setProtection("Ultravioleta");
			str = "Tipo de protección del producto actualizado a: "+ singleton.DA.getProtection();
			break;
		case "Conectividad":
			singleton.DA.setConnectivity("Manual");
			str = "Conectividad de accesorio actualizado a: "+ singleton.DA.getConnectivity();
			break;
		case "Inicio de Rebajas":
			singleton.DA.setDate_sales_init(new dates("01/12/2000"));
			str = "Fecha de inicio de rebajas actualizado a: "+ singleton.DA.getDate_sales_init();
			break;
		case "Fin de Rebajas":
			singleton.DA.setDate_sales_end(new dates("22/12/2000"));
			str = "Fecha de fin de rebajas actualizado a: "+ singleton.DA.getDate_sales_end();
			break;
		case "Descuento":
			singleton.DA.setDiscont(0.6f);
			str = "Descuento de Rebajas actualizado a: " + singleton.DA.getDiscont();
			break;
		case "Precio final":
			str = "El precio final del producto es "+ singleton.DA.getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
			break;
		}// end switch
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	} // end if
}// end update
}
