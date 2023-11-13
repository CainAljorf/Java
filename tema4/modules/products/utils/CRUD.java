package tema4.modules.products.utils;
import javax.swing.JOptionPane;
import tema4.classes.dates;
import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.product;
import tema4.modules.products.classes.smartphone;
import tema4.utils.validators;

public class CRUD {
	public static product create(int opt) {// with dummies
		String str = "";
		product P = null;
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
				P = new laptop("ASD-123", price, 150, 30, "Rojo", 5, date_purchase, date_delivery,
						date_return, collection_date,date_sales_init, date_sales_end,discont, 7,
						"IPS", "15.1", "QWERTY", "16 GB", "1 TB","Ryzen 7 5700X", "80 Plus Silver", "AMD Radeon", "HP Omen", "Sony XM 1.8f");
				str = "Laptop creado correctamente.";
			break;
			case 1:
				P=new smartphone("BDA-453",price,30,100,"Negro",5,date_purchase,date_delivery,
						date_return,collection_date,date_sales_init,date_sales_end,discont,5,"IPS","6.8","6GB","1 TB","Snapdragon",
						"Oppo","Android","Leica 1.5f");
				str="Smartphone creado correctamente.";
				break;
			case 2:
				P=new accessory("GJR-564",price,50,90,"Azul",5,date_purchase,date_delivery,date_return,collection_date,
						date_sales_init,date_sales_end,discont,70,"Cargador","Cableado","5 años","Polvo");
				str="Accessorio creado correctamente.";
				break;
		}
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		return P;
	}// end create
	public static void read_all(product P) {
		String str = "";
		if (P instanceof laptop) {
			str = ((laptop) P).toString();
		} else if (P instanceof smartphone) {
			str = ((smartphone) P).toString();
		} else if (P instanceof accessory) {
			str = ((accessory) P).toString();
		} // end if
		JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
	}// end read
	public static void read(product P) {
		Object opt = null;
		String str = "";
		if (P instanceof laptop) {
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
				str = "ID: " + ((laptop) P).getID_product();
				break;
			case "Precio":
				str = "Precio: " + ((laptop) P).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((laptop) P).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((laptop) P).getStock();
				break;
			case "Color":
				str = "Color: " + ((laptop) P).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((laptop) P).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((laptop) P).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((laptop) P).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((laptop) P).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((laptop) P).getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + ((laptop) P).getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + ((laptop) P).getScreen_inches();
				break;
			case "Tipo de teclado":
				str = "Tipo de teclado: " + ((laptop) P).getKeyboard();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + ((laptop) P).getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + ((laptop) P).getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + ((laptop) P).getCPU();
				break;
			case "Fuente de Alimentación":
				str = "Fuente de Alimentación: " + ((laptop) P).getPower_supply();
				break;
			case "Gráficos":
				str = "Gráficos: " + ((laptop) P).getGraphics();
				break;
			case "Cámara":
				str = "Cámara: " + ((laptop) P).getCamera();
				break;
			case "Marca":
				str = "Marca: " + ((laptop) P).getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((laptop) P).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + ((laptop) P).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((laptop) P).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((laptop) P).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (P instanceof smartphone) {
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
				str = "ID: " + ((smartphone) P).getID_product();
				break; 
			case "Precio":
				str = "Precio: " + ((smartphone) P).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((smartphone) P).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((smartphone) P).getStock();
				break;
			case "Color":
				str = "Color: " + ((smartphone) P).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((smartphone) P).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((smartphone) P).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((smartphone) P).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((smartphone) P).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((smartphone) P).getF_recogida();
				break;
			case "Pantalla":
				str = "Pantalla: " + ((smartphone) P).getScreen();
				break;
			case "Pulgadas de pantalla":
				str = "Pulgadas de pantalla: " + ((smartphone) P).getScreen_inches();
				break;
			case "Memoria RAM":
				str = "Memoria RAM: " + ((smartphone) P).getRAM();
				break;
			case "Almacenamiento":
				str = "Almacenamiento: " + ((smartphone) P).getStorage();
				break;
			case "Procesador":
				str = "Procesador: " + ((smartphone) P).getCPU();
				break;
			case "Sistema Operativo":
				str = "Sistema Operativo: " + ((smartphone) P).getOS();
				break;
			case "Cámara":
				str = "Cámara: " + ((smartphone) P).getCamera();
				break;
			case "Marca":
				str = "Marca: " + ((smartphone) P).getBrand();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((smartphone) P).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Fin de Rebajas: " + ((smartphone) P).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((smartphone) P).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((smartphone) P).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (P instanceof accessory) {
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
				str = "ID: " + ((accessory) P).getID_product();
				break;
			case "Precio":
				str = "Precio: " + ((accessory) P).getPrice();
				break;
			case "Peso":
				str = "Peso: " + ((accessory) P).getPeso();
				break;
			case "Stock":
				str = "Stock: " + ((accessory) P).getStock();
				break;
			case "Color":
				str = "Color: " + ((accessory) P).getColor();
				break;
			case "Dimensión":
				str = "Dimensión: " + ((accessory) P).getDimension();
				break;
			case "Fecha de compra":
				str = "Fecha de Compra: " + ((accessory) P).getF_compra();
				break;
			case "Fecha de entrega":
				str = "Fecha de entrega: " + ((accessory) P).getF_entrega();
				break;
			case "Fecha de devolución":
				str = "Fecha de devolución: " + ((accessory) P).getF_devolucion();
				break;
			case "Fecha de recogida":
				str = "Fecha de recogida: " + ((accessory) P).getF_recogida();
				break;
			case "Tipo de accesorio":
				str = "Tipo de accesorio: " + ((accessory) P).getType();
				break;
			case "Garantía":
				str = "Garantía: " + ((accessory) P).getWarranty();
				break;
			case "Protección":
				str = "Protección: " + ((accessory) P).getProtection();
				break;
			case "Conectividad":
				str = "Conectividad: " + ((accessory) P).getConnectivity();
				break;
			case "Inicio de Rebajas":
				str = "Inicio de rebajas: " + ((accessory) P).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				str = "Número de días de Rebajas: " + ((accessory) P).getDate_sales_end();
				break;
			case "Descuento":
				str = "Descuento de Rebajas: " + ((accessory) P).getDiscont();
				break;
			case "Precio final":
				str = "Precio final: " + ((accessory) P).getPrice_final();
				break;
			}// end_switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
	}// end read
	public static product update(product P) {
		String str = "";
		Object opt = null;
		if (P instanceof laptop) {
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
				((laptop) P).setID_product(insert_data.insert_ID());
				str = "ID de laptop actualizado a: " + ((laptop) P).getID_product();
				break;
			case "Precio":
				((laptop) P).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de laptop actualizado a: " + ((laptop) P).getPrice();
				break;
			case "Peso":
				((laptop) P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de laptop actualizado a: " + ((laptop) P).getPeso();
				break;
			case "Stock":
				((laptop) P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de laptop actualizado a: " + ((laptop) P).getStock();
				break;
			case "Color":
				((laptop) P).setColor(insert_data.insert_color());
				str = "Color de laptop actualizado a: " + ((laptop) P).getColor();
				break;
			case "Dimensión":
				((laptop) P).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de laptop actualizado a: " + ((laptop) P).getDimension();
				break;
			case "Fecha de compra":
				((laptop) P).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de laptop actualizado a: " + ((laptop) P).getF_compra();
				break;
			case "Fecha de entrega":
				((laptop) P).setF_entrega(date_product.insert_date_delivery(((laptop) P).getF_compra()));
				str = "Fecha de entrega de laptop actualizado a: " + ((laptop) P).getF_entrega();
				break;
			case "Fecha de devolución":
				((laptop)P).setF_devolucion(date_product.insert_date_return(((laptop) P).getF_entrega()));
				str = "Fecha de devolución de laptop actualizado a: " + ((laptop) P).getF_devolucion();
				break;
			case "Fecha de recogida":
				((laptop)P).setF_recogida(date_product.insert_collection_date(((laptop) P).getF_devolucion()));
				str = "Fecha de devolución de laptop actualizado a: " + ((laptop) P).getF_recogida();
				break;
			case "Pantalla":
				((laptop) P).setScreen(insert_data.insert_screen());
				str = "Pantalla de laptop actualizado a: " + ((laptop) P).getScreen();
				break;
			case "Pulgadas de pantalla":
				((laptop) P).setScreen_inches(insert_data.insert_screen_inches("laptop"));
				str = "Pulgadas de pantalla del laptop actualizadas a: " + ((laptop) P).getScreen_inches();
				break;
			case "Tipo de teclado":
				((laptop) P).setKeyboard(insert_data.insert_keyboard());
				str = "Tipo de teclado de laptop actualizado a: " + ((laptop) P).getKeyboard();
				break;
			case "Memoria RAM":
				((laptop) P).setRAM(insert_data.insert_RAM("laptop"));
				str = "Memoria RAM de laptop actualizada a: " + ((laptop) P).getRAM();
				break;
			case "Almacenamiento":
				((laptop) P).setStorage(insert_data.insert_storage());
				str = "Almacenamiento de laptop actualizado a: " + ((laptop) P).getStorage();
				break;
			case "Procesador":
				((laptop) P).setCPU(insert_data.insert_CPU("laptop"));
				str = "Procesador del laptop actualizado a: " + ((laptop) P).getCPU();
				break;
			case "Fuente de Alimentación":
				((laptop) P).setPower_supply(insert_data.insert_power_supply());
				str = "Fuente de alimentación de laptop actualizada a: " + ((laptop) P).getPower_supply();
				break;
			case "Gráficos":
				((laptop) P).setGraphics(insert_data.insert_graphics());
				str = "Gráficos del laptop actualizados a: " + ((laptop) P).getGraphics();
				break;
			case "Cámara":
				((laptop) P).setCamera(insert_data.insert_camera());
				str = "Cámara del laptop actualizada a: " + ((laptop) P).getCamera();
				break;
			case "Marca":
				((laptop) P).setBrand(insert_data.insert_brand("laptop"));
				str = "Marca del laptop actualizada a: " + ((laptop) P).getBrand();
				break;
			case "Inicio de Rebajas":
				((laptop) P).setDate_sales_init(date_product.insert_date_sales_init(
						"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar inicio de rebajas"));
				str = "Fecha de inicio de rebajas actualizado a: "+ ((laptop) P).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((laptop) P).setDate_sales_end(date_product.insert_date_sales_end(((laptop) P).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((laptop) P).getDate_sales_end();
				break;
			case "Descuento":
				((laptop) P).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((laptop) P).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((laptop) P).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (P instanceof smartphone) {
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
				((smartphone) P).setID_product(insert_data.insert_ID());
				str = "ID de smartphone actualizado a: " + ((smartphone) P).getID_product();
				break;
			case "Precio":
				((smartphone) P).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de smartphone actualizado a: " + ((smartphone) P).getPrice();
				break;
			case "Peso":
				((smartphone) P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de smartphone actualizado a: " + ((smartphone) P).getPeso();
				break;
			case "Stock":
				((smartphone) P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de smartphone actualizado a: " + ((smartphone) P).getStock();
				break;
			case "Color":
				((smartphone) P).setColor(insert_data.insert_color());
				str = "Color de smartphone actualizado a: " + ((smartphone) P).getColor();
				break;
			case "Dimensión":
				((smartphone) P).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de smartphone actualizado a: " + ((smartphone) P).getDimension();
				break;
			case "Fecha de compra":
				((smartphone) P).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de smartphone actualizado a: " + ((smartphone) P).getF_compra();
				break;
			case "Fecha de entrega":
				((smartphone) P).setF_entrega(date_product.insert_date_delivery(((smartphone) P).getF_compra()));
				str = "Fecha de entrega de smartphone actualizado a: " + ((smartphone) P).getF_entrega();
				break;
			case "Fecha de devolución":
				((smartphone)P).setF_devolucion(date_product.insert_date_return(((smartphone) P).getF_entrega()));
				str = "Fecha de devolución de smartphone actualizado a: " + ((smartphone) P).getF_devolucion();
				break;
			case "Fecha de recogida":
				((smartphone)P).setF_recogida(date_product.insert_collection_date(((smartphone) P).getF_devolucion()));
				str = "Fecha de devolución de smartphone actualizado a: " + ((smartphone) P).getF_recogida();
				break;
			case "Pantalla": 
				((smartphone) P).setScreen(insert_data.insert_screen());
				str = "Tipo de pantalla de smartphone actualizado a: " + ((smartphone) P).getScreen();
				break;
			case "Pulgadas de pantalla":
				((smartphone) P).setScreen_inches(insert_data.insert_screen_inches("smartphone"));
				str = "Pulgadas de la pantalla de smartphone actualizado a: " + ((smartphone) P).getScreen_inches();
				break;
			case "Memoria RAM":
				((smartphone) P).setRAM(insert_data.insert_RAM("smartphone"));
				str = "Memoria RAM de smartphone actualizada a: " + ((smartphone) P).getRAM();
				break;
			case "Almacenamiento":
				((smartphone) P).setStorage(insert_data.insert_storage());
				str = "Almacenamiento del smartphone actualizado a: " + ((smartphone) P).getStorage();
				break;
			case "Procesador":
				((smartphone) P).setCPU(insert_data.insert_CPU("smartphone"));
				str = "Procesador del smartphone actualizado a: " + ((smartphone) P).getCPU();
				break;
			case "Sistema Operativo":
				((smartphone) P).setOS(insert_data.insert_OS());
				str = "Sistema Operativo del smartphone actualizado a: " + ((smartphone) P).getOS();
				break;
			case "Cámara":
				((smartphone) P).setCamera(insert_data.insert_camera());
				str = "Cámara del smartphone actualizado a: " + ((smartphone) P).getCamera();
				break;
			case "Marca":
				((smartphone) P).setBrand(insert_data.insert_brand("smartphone"));
				str = "Marca del smartphone actualizado a: " + ((smartphone) P).getBrand();
				break;
			case "Inicio de Rebajas":
				((smartphone) P).setDate_sales_init(date_product.insert_date_sales_init(
						"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar inicio de rebajas"));
				str = "Fecha de inicio de rebajas actualizado a: "+ ((smartphone) P).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((smartphone) P).setDate_sales_end(date_product.insert_date_sales_end(((smartphone) P).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((smartphone) P).getDate_sales_end();
				break;
			case "Descuento":
				((smartphone) P).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((smartphone) P).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((smartphone) P).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} else if (P instanceof accessory) {
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
				((accessory) P).setID_product(insert_data.insert_ID());
				str = "ID de accesorio actualizado a: " + ((accessory) P).getID_product();
				break;
			case "Precio":
				((accessory) P).setPrice(validators.validator_float("Ingresa el precio del producto para calcular el precio final.", "Ingresar precio"));
				str = "Precio de accessorio actualizado a: " + ((accessory) P).getPrice();
				break;
			case "Peso":
				((accessory) P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
				str = "Peso de accessorio actualizado a: " + ((accessory) P).getPeso();
				break;
			case "Stock":
				((accessory) P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
				str = "Stock de accessorio actualizado a: " + ((accessory) P).getStock();
				break;
			case "Color":
				((accessory) P).setColor(insert_data.insert_color());
				str = "Color de accessorio actualizado a: " + ((accessory) P).getColor();
				break;
			case "Dimensión":
				((accessory) P).setDimension(
						validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
				str = "Dimensión de accesorio actualizado a: " + ((accessory) P).getDimension();
				break;
			case "Fecha de compra":
				((accessory) P).setF_compra(date_product.insert_date_purchase(
						"Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar fecha compra"));
				str = "Fecha de compra de accesorio actualizado a: " + ((accessory) P).getF_compra();
				break;
			case "Fecha de entrega":
				((accessory) P).setF_entrega(date_product.insert_date_delivery(((accessory) P).getF_compra()));
				str = "Fecha de entrega de accesorio actualizado a: " + ((accessory) P).getF_entrega();
				break;
			case "Fecha de devolución":
				((accessory)P).setF_devolucion(date_product.insert_date_return(((accessory) P).getF_entrega()));
				str = "Fecha de devolución de accesorio actualizado a: " + ((accessory) P).getF_devolucion();
				break;
			case "Fecha de recogida":
				((accessory)P).setF_recogida(date_product.insert_collection_date(((accessory) P).getF_devolucion()));
				str = "Fecha de devolución de accesorio actualizado a: " + ((accessory) P).getF_recogida();
				break;
			case "Tipo de accesorio":
				((accessory) P).setType(insert_data.insert_type_accessory());
				str = "Tipo de accesorio actualizado a: "+ ((accessory) P).getType();
				break;
			case "Garantía":
				((accessory) P).setWarranty(validators.validator_string("Ingresa la garantía producto.", "Ingresar Garantía"));
				str = "Garantía del producto actualizada a: "+ ((accessory) P).getWarranty();
				break;
			case "Protección":
				((accessory) P).setProtection(insert_data.insert_protection());
				str = "Tipo de protección del producto actualizado a: "+ ((accessory) P).getProtection();
				break;
			case "Conectividad":
				((accessory) P).setConnectivity(insert_data.insert_connectivity());
				str = "Conectividad de accesorio actualizado a: "+ ((accessory) P).getConnectivity();
				break;
			case "Inicio de Rebajas":
				((accessory) P).setDate_sales_init(date_product.insert_date_sales_init(
						"Ingresa la fecha de compra del inicio de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX",
						"Ingresar inicio de rebajas"));
				str = "Fecha de inicio de rebajas actualizado a: "+ ((accessory) P).getDate_sales_init();
				break;
			case "Fin de Rebajas":
				((accessory) P).setDate_sales_end(date_product.insert_date_sales_end(((accessory) P).getDate_sales_init()));
				str = "Fecha de fin de rebajas actualizado a: "+ ((accessory) P).getDate_sales_end();
				break;
			case "Descuento":
				((accessory) P).setDiscont(validators.validator_float("Ingresa el descuento que quieras aplicar al producto.", "Ingresar descuento"));
				str = "Descuento de Rebajas actualizado a: " + ((accessory) P).getDiscont();
				break;
			case "Precio final":
				str = "El precio final del producto es "+((accessory) P).getPrice_final()+" y se calcula automáticamente, por lo que no se puede modificar.";
				break;
			}// end switch
			JOptionPane.showMessageDialog(null, str, "Información", JOptionPane.INFORMATION_MESSAGE);
		} // end if
		return P;
	}// end update

	public static product delete(product P) {
		P = null;
		return P;
	}// end delete
}// end class CRUD