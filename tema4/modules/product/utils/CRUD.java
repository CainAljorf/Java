package tema4.modules.products.utils;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.product;
import tema4.modules.products.classes.smartphone;
import tema4.utils.menu;
import tema4.utils.validators;

public class CRUD {
	public static void create(int opt) {// with dummies
		String str = "";
		dates date_purchase = date_product.insert_date_purchase(
				"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
				"Ingresar fecha compra");
		dates date_delivery = date_product.insert_date_delivery(date_purchase);
		dates date_return = date_product.insert_date_return(date_delivery);
		dates collection_date = date_product.insert_collection_date(date_return);
		dates date_sales_init = date_product.insert_date_sales_init(
				"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX\nRecuerda que has comprado el producto en esta fecha: "+date_purchase,
				"Ingresar inicio de rebajas");
		dates date_sales_end = date_product.insert_date_sales_end(date_sales_init);
		float price = validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio");
		float discont = validators.validator_float("Ingresa el descuento del producto.", "Ingresar descuento");
		switch(opt) {
			case 0:
				menu.L = new laptop("ASD-123", price, 150, 30, "Rojo", 5, date_purchase, date_delivery,
						date_return, collection_date,date_sales_init, date_sales_end,discont, 7,
						"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
				str = "Laptop creado correctamente.";
			break;
			case 1:
				menu.S=new smartphone("BDA-453",price,30,100,"Negro",5,date_purchase,date_delivery,
						date_return,collection_date,date_sales_init,date_sales_end,discont,5,"IPS","6.8","6GB","1 TB","Snapdragon",
						"Oppo","Android","Leica 1.5f");
				str="Smartphone creado correctamente.";
				break;
			case 2:
				menu.A=new accessory("GJR-564",price,50,90,"Azul",5,date_purchase,date_delivery,date_return,collection_date,
						date_sales_init,date_sales_end,discont,70,"Cargador","Cableado","5 años","Polvo");
				str="Accessorio creado correctamente.";
				break;
		}
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	}// end create
	public static void read_all() {
		String str = "";
		if (menu.L instanceof laptop) {
			str = ((laptop) menu.L).toString();
		} else if (menu.S instanceof smartphone) {
			str = ((smartphone) menu.S).toString();
		} else if (menu.A instanceof accessory) {
			str = ((accessory) menu.A).toString();
		} // end if
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	}// end read
	public static void read() {
		Object opt = null;
		String str = "";
		if (menu.L instanceof laptop) {
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
				str = "ID: " + ((laptop) menu.L).getID_product();
				break;
			case "Precio":
				str = "Precio: " + ((laptop) menu.L).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((laptop) menu.L).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((laptop) menu.L).getStock();
				break;
			case "Color":
				str = "Color: " + ((laptop) menu.L).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((laptop) menu.L).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((laptop) menu.L).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((laptop) menu.L).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((laptop) menu.L).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((laptop) menu.L).getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + ((laptop) menu.L).getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + ((laptop) menu.L).getScreen_inches();
				break;
			case "Tipo de teclado":
				str = "Tipo de teclado: " + ((laptop) menu.L).getKeyboard();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + ((laptop) menu.L).getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + ((laptop) menu.L).getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + ((laptop) menu.L).getCPU();
				break;
			case "Fuente de Alimentación":
				str = "Fuente de Alimentación: " + ((laptop) menu.L).getPower_supply();
				break;
			case "Gráficos":
				str = "Gráficos: " + ((laptop) menu.L).getGraphics();
				break;
			case "Cámara":
				str = "Cámara: " + ((laptop) menu.L).getCamera();
				break;
			case "Marca":
				str = "Marca: " + ((laptop) menu.L).getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((laptop) menu.L).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + ((laptop) menu.L).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((laptop) menu.L).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((laptop) menu.L).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (menu.S instanceof smartphone) {
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
				str = "ID: " + ((smartphone) menu.S).getID_product();
				break; 
			case "Precio":
				str = "Precio: " + ((smartphone) menu.S).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((smartphone) menu.S).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((smartphone) menu.S).getStock();
				break;
			case "Color":
				str = "Color: " + ((smartphone) menu.S).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((smartphone) menu.S).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((smartphone) menu.S).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((smartphone) menu.S).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((smartphone) menu.S).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((smartphone) menu.S).getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + ((smartphone) menu.S).getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + ((smartphone) menu.S).getScreen_inches();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + ((smartphone) menu.S).getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + ((smartphone) menu.S).getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + ((smartphone) menu.S).getCPU();
				break;
			case "Sistema Operativo":
				str = "Sistema Operativo: " + ((smartphone) menu.S).getOS();
				break;
			case "Cámara":
				str = "Cámara: " + ((smartphone) menu.S).getCamera();
				break;
			case "Marca":
				str = "Marca: " + ((smartphone) menu.S).getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((smartphone) menu.S).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + ((smartphone) menu.S).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((smartphone) menu.S).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((smartphone) menu.S).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (menu.A instanceof accessory) {
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
				str = "ID: " + ((accessory) menu.A).getID_product();
				break;
			case "Precio":
				str = "Precio: " + ((accessory) menu.A).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((accessory) menu.A).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((accessory) menu.A).getStock();
				break;
			case "Color":
				str = "Color: " + ((accessory) menu.A).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((accessory) menu.A).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((accessory) menu.A).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((accessory) menu.A).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((accessory) menu.A).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((accessory) menu.A).getF_recogida();
				break;
			case "Tipo de accesorio":
				str = "Tipo de accesorio: " + ((accessory) menu.A).getType();
				break;
			case "Garantía":
				str = "Garantía: " + ((accessory) menu.A).getWarranty();
				break;
			case "Protección":
				str = "Protección: " + ((accessory) menu.A).getProtection();
				break;
			case "Conectividad":
				str = "Conectividad: " + ((accessory) menu.A).getConnectivity();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((accessory) menu.A).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Número de días de Rebajas: " + ((accessory) menu.A).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((accessory) menu.A).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((accessory) menu.A).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read
	public static void update() {
		String str = "";
		Object opt = null;
		if (menu.L instanceof laptop) {
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
			switch (opt.toString()) {
			case "ID":
				((laptop) menu.L).setID_product(insert_data.insert_ID());
				str = "ID de laptop actualizado a: " + ((laptop) menu.L).getID_product();
				break;
			case "Precio":
				((laptop) menu.L).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de laptop actualizado a: " + ((laptop) menu.L).getPrice();
				break;
			case "Peso":
				((laptop) menu.L).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de laptop actualizado a: " + ((laptop) menu.L).getPeso();
				break;
			case "Stock":
				((laptop) menu.L).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de laptop actualizado a: " + ((laptop) menu.L).getStock();
				break;
			case "Color":
				((laptop) menu.L).setColor(insert_data.insert_color());
				str = "Color de laptop actualizado a: " + ((laptop) menu.L).getColor();
				break;
			case "Dimensión":
				((laptop) menu.L).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de laptop actualizado a: " + ((laptop) menu.L).getDimension();
				break;
			case "Fecha de compra":
				((laptop) menu.L).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de laptop actualizado a: " + ((laptop) menu.L).getF_compra();
				break;
			case "Fecha de entrega":
				((laptop) menu.L).setF_entrega(date_product.insert_date_delivery(((laptop) menu.L).getF_compra()));
				str = "Fecha de entrega de laptop actualizado a: " + ((laptop) menu.L).getF_entrega();
				break;
			case "Fecha de devolución":
				((laptop)menu.L).setF_devolucion(date_product.insert_date_return(((laptop) menu.L).getF_entrega()));
				str = "Fecha de devolución de laptop actualizado a: " + ((laptop) menu.L).getF_devolucion();
				break;
			case "Fecha de recogida":
				((laptop)menu.L).setF_recogida(date_product.insert_collection_date(((laptop) menu.L).getF_devolucion()));
				str = "Fecha de devolución de laptop actualizado a: " + ((laptop) menu.L).getF_recogida();
				break;
			case "Pantalla":
				((laptop) menu.L).setScreen(insert_data.insert_screen());
				str = "Pantalla de laptop actualizado a: " + ((laptop) menu.L).getScreen();
				break;
			case "Pulgadas de pantalla":
				((laptop) menu.L).setScreen_inches(insert_data.insert_screen_inches("laptop"));
				str = "Pulgadas de pantalla del laptop actualizadas a: " + ((laptop) menu.L).getScreen_inches();
				break;
			case "Tipo de teclado":
				((laptop) menu.L).setKeyboard(insert_data.insert_keyboard());
				str = "Tipo de teclado de laptop actualizado a: " + ((laptop) menu.L).getKeyboard();
				break;
			case "Memoria RAM":
				((laptop) menu.L).setRAM(insert_data.insert_RAM("laptop"));
				str = "Memoria RAM de laptop actualizada a: " + ((laptop) menu.L).getRAM();
				break;
			case "Almacenamiento":
				((laptop) menu.L).setStorage(insert_data.insert_storage());
				str = "Almacenamiento de laptop actualizado a: " + ((laptop) menu.L).getStorage();
				break;
			case "Procesador":
				((laptop) menu.L).setCPU(insert_data.insert_CPU("laptop"));
				str = "Procesador del laptop actualizado a: " + ((laptop) menu.L).getCPU();
				break;
			case "Fuente de Alimentación":
				((laptop) menu.L).setPower_supply(insert_data.insert_power_supply());
				str = "Fuente de alimentación de laptop actualizada a: " + ((laptop) menu.L).getPower_supply();
				break;
			case "Gráficos":
				((laptop) menu.L).setGraphics(insert_data.insert_graphics());
				str = "Gráficos del laptop actualizados a: " + ((laptop) menu.L).getGraphics();
				break;
			case "Cámara":
				((laptop) menu.L).setCamera(insert_data.insert_camera());
				str = "Cámara del laptop actualizada a: " + ((laptop) menu.L).getCamera();
				break;
			case "Marca":
				((laptop) menu.L).setBrand(insert_data.insert_brand("laptop"));
				str = "Marca del laptop actualizada a: " + ((laptop) menu.L).getBrand();
				break;
			case "Inicio de Rebajas":
				((laptop) menu.L).setDate_sales_init(date_product.insert_date_sales_init(
						"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar inicio de rebajas"));
				str = "Fecha de inicio de rebajas actualizado a: "+ ((laptop) menu.L).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((laptop) menu.L).setDate_sales_end(date_product.insert_date_sales_end(((laptop) menu.L).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((laptop) menu.L).getDate_sales_end();
				break;
			case "Descuento":
				((laptop) menu.L).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((laptop) menu.L).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((laptop) menu.L).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (menu.S instanceof smartphone) {
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
				((smartphone) menu.S).setID_product(insert_data.insert_ID());
				str = "ID de smartphone actualizado a: " + ((smartphone) menu.S).getID_product();
				break;
			case "Precio":
				((smartphone) menu.S).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de smartphone actualizado a: " + ((smartphone) menu.S).getPrice();
				break;
			case "Peso":
				((smartphone) menu.S).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de smartphone actualizado a: " + ((smartphone) menu.S).getPeso();
				break;
			case "Stock":
				((smartphone) menu.S).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de smartphone actualizado a: " + ((smartphone) menu.S).getStock();
				break;
			case "Color":
				((smartphone) menu.S).setColor(insert_data.insert_color());
				str = "Color de smartphone actualizado a: " + ((smartphone) menu.S).getColor();
				break;
			case "Dimensión":
				((smartphone) menu.S).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de smartphone actualizado a: " + ((smartphone) menu.S).getDimension();
				break;
			case "Fecha de compra":
				((smartphone) menu.S).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de smartphone actualizado a: " + ((smartphone) menu.S).getF_compra();
				break;
			case "Fecha de entrega":
				((smartphone) menu.S).setF_entrega(date_product.insert_date_delivery(((smartphone) menu.S).getF_compra()));
				str = "Fecha de entrega de smartphone actualizado a: " + ((smartphone) menu.S).getF_entrega();
				break;
			case "Fecha de devolución":
				((smartphone)menu.S).setF_devolucion(date_product.insert_date_return(((smartphone) menu.S).getF_entrega()));
				str = "Fecha de devolución de smartphone actualizado a: " + ((smartphone) menu.S).getF_devolucion();
				break;
			case "Fecha de recogida":
				((smartphone)menu.S).setF_recogida(date_product.insert_collection_date(((smartphone) menu.S).getF_devolucion()));
				str = "Fecha de devolución de smartphone actualizado a: " + ((smartphone) menu.S).getF_recogida();
				break;
			case "Pantalla": 
				((smartphone) menu.S).setScreen(insert_data.insert_screen());
				str = "Tipo de pantalla de smartphone actualizado a: " + ((smartphone) menu.S).getScreen();
				break;
			case "Pulgadas de pantalla":
				((smartphone) menu.S).setScreen_inches(insert_data.insert_screen_inches("smartphone"));
				str = "Pulgadas de la pantalla de smartphone actualizado a: " + ((smartphone) menu.S).getScreen_inches();
				break;
			case "Memoria RAM":
				((smartphone) menu.S).setRAM(insert_data.insert_RAM("smartphone"));
				str = "Memoria RAM de smartphone actualizada a: " + ((smartphone) menu.S).getRAM();
				break;
			case "Almacenamiento":
				((smartphone) menu.S).setStorage(insert_data.insert_storage());
				str = "Almacenamiento del smartphone actualizado a: " + ((smartphone) menu.S).getStorage();
				break;
			case "Procesador":
				((smartphone) menu.S).setCPU(insert_data.insert_CPU("smartphone"));
				str = "Procesador del smartphone actualizado a: " + ((smartphone) menu.S).getCPU();
				break;
			case "Sistema Operativo":
				((smartphone) menu.S).setOS(insert_data.insert_OS());
				str = "Sistema Operativo del smartphone actualizado a: " + ((smartphone) menu.S).getOS();
				break;
			case "Cámara":
				((smartphone) menu.S).setCamera(insert_data.insert_camera());
				str = "Cámara del smartphone actualizado a: " + ((smartphone) menu.S).getCamera();
				break;
			case "Marca":
				((smartphone) menu.S).setBrand(insert_data.insert_brand("smartphone"));
				str = "Marca del smartphone actualizado a: " + ((smartphone) menu.S).getBrand();
				break;
			case "Inicio de Rebajas":
				((smartphone) menu.S).setDate_sales_init(date_product.insert_date_sales_init(
						"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar inicio de rebajas"));
				str = "Fecha de inicio de rebajas actualizado a: "+ ((smartphone) menu.S).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((smartphone) menu.S).setDate_sales_end(date_product.insert_date_sales_end(((smartphone) menu.S).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((smartphone) menu.S).getDate_sales_end();
				break;
			case "Descuento":
				((smartphone) menu.S).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((smartphone) menu.S).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((smartphone) menu.S).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (menu.A instanceof accessory) {
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
				((accessory) menu.A).setID_product(insert_data.insert_ID());
				str = "ID de accesorio actualizado a: " + ((accessory) menu.A).getID_product();
				break;
			case "Precio":
				((accessory) menu.A).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de accessorio actualizado a: " + ((accessory) menu.A).getPrice();
				break;
			case "Peso":
				((accessory) menu.A).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de accessorio actualizado a: " + ((accessory) menu.A).getPeso();
				break;
			case "Stock":
				((accessory) menu.A).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de accessorio actualizado a: " + ((accessory) menu.A).getStock();
				break;
			case "Color":
				((accessory) menu.A).setColor(insert_data.insert_color());
				str = "Color de accessorio actualizado a: " + ((accessory) menu.A).getColor();
				break;
			case "Dimensión":
				((accessory) menu.A).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de accesorio actualizado a: " + ((accessory) menu.A).getDimension();
				break;
			case "Fecha de compra":
				((accessory) menu.A).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de accesorio actualizado a: " + ((accessory) menu.A).getF_compra();
				break;
			case "Fecha de entrega":
				((accessory) menu.A).setF_entrega(date_product.insert_date_delivery(((accessory) menu.A).getF_compra()));
				str = "Fecha de entrega de accesorio actualizado a: " + ((accessory) menu.A).getF_entrega();
				break;
			case "Fecha de devolución":
				((accessory)menu.A).setF_devolucion(date_product.insert_date_return(((accessory) menu.A).getF_entrega()));
				str = "Fecha de devolución de accesorio actualizado a: " + ((accessory) menu.A).getF_devolucion();
				break;
			case "Fecha de recogida":
				((accessory)menu.A).setF_recogida(date_product.insert_collection_date(((accessory) menu.A).getF_devolucion()));
				str = "Fecha de devolución de accesorio actualizado a: " + ((accessory) menu.A).getF_recogida();
				break;
			case "Tipo de accesorio":
				((accessory) menu.A).setType(insert_data.insert_type_accessory());
				str = "Tipo de accesorio actualizado a: "+ ((accessory) menu.A).getType();
				break;
			case "Garantía":
				((accessory) menu.A).setWarranty(validators.validator_string("Ingresa la garantía producto.", "Ingresar Garantía"));
				str = "Garantía del producto actualizada a: "+ ((accessory) menu.A).getWarranty();
				break;
			case "Protección":
				((accessory) menu.A).setProtection(insert_data.insert_protection());
				str = "Tipo de protección del producto actualizado a: "+ ((accessory) menu.A).getProtection();
				break;
			case "Conectividad":
				((accessory) menu.A).setConnectivity(insert_data.insert_connectivity());
				str = "Conectividad de accesorio actualizado a: "+ ((accessory) menu.A).getConnectivity();
				break;
			case "Inicio de Rebajas":
				((accessory) menu.A).setDate_sales_init(date_product.insert_date_sales_init(
						"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar inicio de rebajas"));
				str = "Fecha de inicio de rebajas actualizado a: "+ ((accessory) menu.A).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((accessory) menu.A).setDate_sales_end(date_product.insert_date_sales_end(((accessory) menu.A).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((accessory) menu.A).getDate_sales_end();
				break;
			case "Descuento":
				((accessory) menu.A).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((accessory) menu.A).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((accessory) menu.A).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end update
	public static void delete() {
		if (menu.L instanceof laptop) {
			menu.L = null;
		} else if (menu.S instanceof smartphone) {
			menu.S = null;
		} else if (menu.A instanceof accessory) {
			menu.A = null;
		} // end if
	}// end delete
}// end class CRUD