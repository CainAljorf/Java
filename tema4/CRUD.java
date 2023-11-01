package tema4;
import javax.swing.JOptionPane;
public class CRUD {
	public static product create(int opt) {
//		String ID_product="",color,f_compra,f_entrega,f_devolucion,f_recogida,RAM,screen,screen_inches,keyboard,storage,type;
//		String connectivity,warranty,electric,protection,CPU,power_supply,graphics,brand,LED_backlit_keyboard,camera,NFC,OS;
//		float price,peso,dimension;
//		int stock,n_dias_entrega,n_dias_recogida,n_dias_devolucion;
//		price=validators.validator_float("Ingresa el precio del producto.", "Ingresar precio");
//		peso=validators.validator_float("Ingresa el peso del producto.", "Ingresar peso");
//		stock=validators.validator_int("Ingresa el stock del producto.", "Ingresar stock");
//		color=validators.validator_string("Ingresa el color del producto.", "Ingresar color");
//		dimension=validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension");
//		f_compra=validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra");
//		f_entrega=validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega");
//		n_dias_entrega=validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días");
//		f_devolucion=validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución");
//		f_recogida=validators.validator_string("Ingresa la fecha de recogida.", "Ingresar fecha recogida");
//		n_dias_recogida=validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida");
//		n_dias_devolucion=validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución");
//		P1=new product(ID_product,price,peso,stock,color,dimension,f_compra,f_entrega,n_dias_entrega,f_devolucion,f_recogida,n_dias_recogida,n_dias_devolucion);
		product P = null;
		switch(opt) {
			case 0:
				P=new laptop("GG",5,1,1,"red",5,"5/04/2012","15/04/2012",10,"30/04/2012","20/04/2012",10,15,"IPS","15.1",
							"QUERTY","16 GB","1 TB","Ryzen 7 5700X","240W","1650M","HP Omen","LED RED","Sony XM 1.8f","23/02/1990","23/03/1990","26/07/1990");
				JOptionPane.showMessageDialog(null, "Laptop creado correctamenmte.","Felicidades", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				P=new smartphone("1",1,1,1,"red",5,"5/04/2012","15/04/2012",10,
						"30/04/2012","20/04/2012",10,15,"IPS","15.1","QUERTY","16 GB","1 TB","Ryzen 7 5700X","240W","1650M","HP Omen","Top","23/02/1990","23/03/1990","26/07/1990");
				JOptionPane.showMessageDialog(null, "Smartphone creado correctamenmte.","Felicidades", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				P=new accessory("1",1,1,1,"red",5,"5/04/2012","15/04/2012",10,
						"30/04/2012","20/04/2012",10,15,"IPS","15.1","16 GB","1 TB","23/02/1990","23/03/1990","26/07/1990");
				JOptionPane.showMessageDialog(null, "Accessorio creado correctamenmte.","Felicidades", JOptionPane.INFORMATION_MESSAGE);
				break;
		}//end switch
		return P;
	}//end create
	public static void read_all(product P) {
		if (P instanceof laptop) {
			JOptionPane.showMessageDialog(null,((laptop)P).toString(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof smartphone) {
			JOptionPane.showMessageDialog(null,((smartphone)P).toString(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof accessory) {
			JOptionPane.showMessageDialog(null,((accessory)P).toString(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}//end if
	}//end read
	public static void read(product P) {
		Object opt = null;
		String str ="";
		if (P instanceof laptop) {
			opt= JOptionPane.showInputDialog(
					   null,
					   "Seleccione un atributo para ver:",
					   "Selector de opciones",
					   JOptionPane.QUESTION_MESSAGE,
					   null,
					   new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
								"Fecha de entrega", "Número de días de entrega", "Fecha de devolución", "Fecha de recogida",
								"Número días de recogida","Número de días de devolución", "Pantalla", "Pulgadas de pantalla",
								"Tipo de teclado","Memoria RAM","Almacenamiento",
								"Procesador","Fuente de Alimentación", "Gráficos","Marca", "LED Teclado Retroiluminado",
								"Cámara", "Fecha de Rebajas","Número de días de Rebajas","Precio de Rebajas"},
					   "ID");
			switch (opt.toString()) {
				case "ID":
					str="ID: "+((laptop)P).getID_product();
					break;
				case "Precio":
					str="Precio: "+((laptop)P).getPrice();
					break;
				case "Peso":
					str="Peso: "+((laptop)P).getPeso();
					break;
				case "Stock":
					str="Stock: "+((laptop)P).getStock();
					break;
				case "Color":
					str="Color: "+((laptop)P).getColor();
					break;
				case "Dimensión":
					str="Dimensión: "+((laptop)P).getDimension();
					break;
				case "Fecha de Compra":
					str="Fecha de Compra: "+((laptop)P).getF_compra();
					break;
				case "Fecha de entrega":
					str="Fecha de entrega: "+((laptop)P).getF_entrega();
					break;
				case "Número de días de entrega":
					str="Número de días de entrega: "+((laptop)P).getN_dias_entrega();
					break;
				case "Fecha de devolución":
					str="Fecha de devolución: "+((laptop)P).getF_devolucion();
					break;
				case "Fecha de recogida":
					str="Fecha de recogida: "+((laptop)P).getF_recogida();
					break;
				case "Número días de recogida":
					str="Número días de recogida: "+((laptop)P).getN_dias_recogida();
					break;
				case "Número de días de devolución":
					str= "Número de días de devolución: "+((laptop)P).getN_dias_devolucion();
					break;
				case "Pantalla":
					str= "Pantalla: "+((laptop)P).getScreen();
					break;
				case "Pulgadas de pantalla":
					str= "Pulgadas de pantalla: "+((laptop)P).getScreen_inches();
					break;
				case "Tipo de teclado":
					str= "Tipo de teclado: "+((laptop)P).getKeyboard();
					break;
				case "Memoria RAM":
					str= "Memoria RAM: "+((laptop)P).getRAM();
					break;
				case "Almacenamiento":
					str= "Almacenamiento: "+((laptop)P).getStorage();
					break;
				case "Procesador":
					str= "Procesador: "+ ((laptop)P).getCPU();
					break;
				case "Fuente de Alimentación":
					str= "Fuente de Alimentación: "+ ((laptop)P).getPower_supply();
					break;
				case "Gráficos":
					str= "Gráficos: "+((laptop)P).getGraphics();
					break;
				case "LED Teclado Retroiluminado":
					str= "LED Teclado Retroiluminado: "+((laptop)P).getLED_backlit_keyboard();
					break;
				case "Cámara":
					str= "Cámara: "+((laptop)P).getCamera();
					break;
				case "Fecha de Rebajas":
					str= "Fecha de Rebajas: "+((laptop)P).getF_sales();
					break;
				case "Número de días de Rebajas":
					str= "Número de días de Rebajas: "+((laptop)P).getNum_dias_sales();
					break;
				case "Marca":
					str= "Marca: "+ ((laptop)P).getBrand();
					break;
				case "Precio de Rebajas":
					str= "Precio de Rebajas: "+((laptop)P).getPrice_sales();
					break;
				default:
					JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteriores opciones");
					break;
			}//end_switch
			JOptionPane.showMessageDialog(null,str,"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof smartphone) {
			opt= JOptionPane.showInputDialog(
					   null,
					   "Seleccione un atributo para ver:",
					   "Selector de opciones",
					   JOptionPane.QUESTION_MESSAGE,
					   null,
					   new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
								"Fecha de entrega", "Número de días de entrega", "Fecha de devolución", "Fecha de recogida",
								"Número días de recogida","Número de días de devolución", "Pantalla", "Pulgadas de pantalla",
								"NFC","Memoria RAM","Almacenamiento",
								"Procesador","Sistema Operativo", "Gráficos","Marca", "Fecha de promoción",
								"Cámara", "Número de días de promoción","Precio de promoción"},
					   "ID");
			switch (opt.toString()) {
				case "ID":
					str="ID: "+((smartphone)P).getID_product();
					break;
				case "Precio":
					str="Precio: "+((smartphone)P).getPrice();
					break;
				case "Peso":
					str="Peso: "+((smartphone)P).getPeso();
					break;
				case "Stock":
					str="Stock: "+((smartphone)P).getStock();
					break;
				case "Color":
					str="Color: "+((smartphone)P).getColor();
					break;
				case "Dimensión":
					str="Dimensión: "+((smartphone)P).getDimension();
					break;
				case "Fecha de Compra":
					str="Fecha de Compra: "+((smartphone)P).getF_compra();
					break;
				case "Fecha de entrega":
					str="Fecha de entrega: "+((smartphone)P).getF_entrega();
					break;
				case "Número de días de entrega":
					str="Número de días de entrega: "+((smartphone)P).getN_dias_entrega();
					break;
				case "Fecha de devolución":
					str="Fecha de devolución: "+((smartphone)P).getF_devolucion();
					break;
				case "Fecha de recogida":
					str="Fecha de recogida: "+((smartphone)P).getF_recogida();
					break;
				case "Número días de recogida":
					str="Número días de recogida: "+((smartphone)P).getN_dias_recogida();
					break;
				case "Número de días de devolución":
					str= "Número de días de devolución: "+((smartphone)P).getN_dias_devolucion();
					break;
				case "Pantalla":
					str= "Pantalla: "+((smartphone)P).getScreen();
					break;
				case "Pulgadas de pantalla":
					str= "Pulgadas de pantalla: "+((smartphone)P).getScreen_inches();
					break;
				case "NFC":
					str= "NFC: "+((smartphone)P).getNFC();
					break;
				case "Memoria RAM":
					str= "Memoria RAM: "+((smartphone)P).getRAM();
					break;
				case "Almacenamiento":
					str= "Almacenamiento: "+((smartphone)P).getStorage();
					break;
				case "Procesador":
					str= "Procesador: "+ ((smartphone)P).getCPU();
					break;
				case "Sistema Operativo":
					str= "Sistema Operativo: "+ ((smartphone)P).getOS();
					break;
				case "Gráficos":
					str= "Gráficos: "+((smartphone)P).getGraphics();
					break;
				case "Precio de promoción":
					str= "Precio de promoción: "+((smartphone)P).getPrice_promo();
					break;
				case "Cámara":
					str= "Cámara: "+((smartphone)P).getCamera();
					break;
				case "Fecha de promoción":
					str= "Fecha de promoción: "+((smartphone)P).getF_promo();
					break;
				case "Número de días de promoción":
					str= "Número de días de promoción: "+((smartphone)P).getN_dias_promo();
					break;
				default:
					JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteriores opciones");
					break;
			}//end_switch
			JOptionPane.showMessageDialog(null,str,"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof accessory) {
			opt= JOptionPane.showInputDialog(
					   null,
					   "Seleccione un atributo para ver:",
					   "Selector de opciones",
					   JOptionPane.QUESTION_MESSAGE,
					   null,
					   new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
								"Fecha de entrega", "Número de días de entrega", "Fecha de devolución", "Fecha de recogida",
								"Número días de recogida","Número de días de devolución", "Tipo de accesorio", 
								"Garantía","Protección","Conectividad",
								"Fecha últimas unidades","Número de días de últimas unidades","Precio de últimas unidades"},
					   "ID");
			switch (opt.toString()) {
				case "ID":
					str="ID: "+((accessory)P).getID_product();
					break;
				case "Precio":
					str="Precio: "+((accessory)P).getPrice();
					break;
				case "Peso":
					str="Peso: "+((accessory)P).getPeso();
					break;
				case "Stock":
					str="Stock: "+((accessory)P).getStock();
					break;
				case "Color":
					str="Color: "+((accessory)P).getColor();
					break;
				case "Dimensión":
					str="Dimensión: "+((accessory)P).getDimension();
					break;
				case "Fecha de Compra":
					str="Fecha de Compra: "+((accessory)P).getF_compra();
					break;
				case "Fecha de entrega":
					str="Fecha de entrega: "+((accessory)P).getF_entrega();
					break;
				case "Número de días de entrega":
					str="Número de días de entrega: "+((accessory)P).getN_dias_entrega();
					break;
				case "Fecha de devolución":
					str="Fecha de devolución: "+((accessory)P).getF_devolucion();
					break;
				case "Fecha de recogida":
					str="Fecha de recogida: "+((accessory)P).getF_recogida();
					break;
				case "Número días de recogida":
					str="Número días de recogida: "+((accessory)P).getN_dias_recogida();
					break;
				case "Número de días de devolución":
					str= "Número de días de devolución: "+((accessory)P).getN_dias_devolucion();
					break;
				case "Tipo de accesorio":
					str= "Tipo de accesorio: "+((accessory)P).getType();
					break;
				case "Garantía":
					str= "Garantía: "+((accessory)P).getWarranty();
					break;
				case "Protección":
					str= "Protección: "+((accessory)P).getProtection();
					break;
				case "Conectividad":
					str= "Conectividad: "+((accessory)P).getConnectivity();
					break;
				case "Fecha últimas unidades":
					str= "Fecha últimas unidades: "+((accessory)P).getF_ultimas_unit();
					break;
				case "Número de días de últimas unidades":
					str= "Número de días de últimas unidades: "+ ((accessory)P).getNum_dias_unit();
					break;
				case "Precio de últimas unidades":
					str= "Precio de últimas unidades: "+ ((accessory)P).getPrice_ult_unit();
					break;
				default:
					JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteriores opciones");
					break;
			}//end_switch
			JOptionPane.showMessageDialog(null,str,"Información",JOptionPane.INFORMATION_MESSAGE);
		}//end if
	}//end read
	public static product update(product P) {
		int menu_sec=0;
		String str="";
		Object opt=null;
		if (P instanceof laptop){
			opt= JOptionPane.showInputDialog(
					   null,
					   "Seleccione un atributo para ver:",
					   "Selector de opciones",
					   JOptionPane.QUESTION_MESSAGE,
					   null,
					   new Object[] { "ID", "Precio", "Peso", "Stock", "Color", "Dimensión", "Fecha de compra",
								"Fecha de entrega", "Número de días de entrega", "Fecha de devolución", "Fecha de recogida",
								"Número días de recogida","Número de días de devolución", "Pantalla", "Pulgadas de pantalla",
								"Tipo de teclado","Memoria RAM","Almacenamiento",
								"Procesador","Fuente de Alimentación", "Gráficos","Marca", "LED Teclado Retroiluminado",
								"Cámara", "Fecha de Rebajas","Número de días de Rebajas","Precio de Rebajas"},
					   "ID");
			switch (opt.toString()) {
					case "ID":
						((laptop)P).setID_product(insert_data.insert_ID());
						JOptionPane.showMessageDialog(null,"ID de laptop actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					case "Precio":
						((laptop)P).setPrice(validators.validator_float("Ingresa el precio del producto.", "Ingresar precio"));
						str="Precio de laptop actualizado correctamente.";
						break;
					case "Peso":
						((laptop)P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
						str="Peso de laptop actualizado correctamente.";
						break;
					case "Stock":
						((laptop)P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
						str="Stock de laptop actualizado correctamente.";
						break;
					case "Color":
						((laptop)P).setColor(validators.validator_string("Ingresa el color del producto.", "Ingresar color"));
						str="Color de laptop actualizado correctamente.";
						break;
					case "Dimensión":
						((laptop)P).setDimension(validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
						str="Dimensión de laptop actualizado correctamente.";
						break;
					case "Fecha de compra":
						((laptop)P).setF_compra(insert_data.insert_date("Ingresa la fecha de compra del producto.\nFormato: Día/Mes/Año XX/XX/XXXX", "Ingresar fecha compra"));
						str="Fecha de compra de laptop actualizado correctamente.";
						break;
					case "Fecha de entrega":
						((laptop)P).setF_entrega(insert_data.insert_date("Ingresa la fecha de entrega del producto.\nFormato: Día/Mes/Año XX/XX/XXXX", "Ingresar fecha entrega"));
						str="Fecha de entrega de laptop actualizado correctamente.";
						break;
					case "Número de días de entrega":
						((laptop)P).setN_dias_entrega(validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días"));
						str="Número de días de entrega laptop actualizado correctamente.";
						break;
					case "Fecha de devolución":
						((laptop)P).setF_devolucion(insert_data.insert_date("Ingresa la fecha de devolución.\nFormato: Día/Mes/Año XX/XX/XXXX", "Ingresar fecha devolución"));
						str="Fecha de devolución de laptop actualizado correctamente.";
						break;
					case "Fecha de recogida":
						((laptop)P).setF_devolucion(insert_data.insert_date("Ingresa la fecha de recogida.\nFormato: Día/Mes/Año XX/XX/XXXX", "Ingresar fecha recogida"));
						str="Fecha de devolución de laptop actualizado correctamente.";
						break;
					case "Número días de recogida":
						((laptop)P).setN_dias_recogida(validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida"));
						str="Número de días de recogida de laptop actualizado correctamente.";
						break;
					case "Número de días de devolución":
						((laptop)P).setN_dias_devolucion(validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución"));
						str="Número de días de devolución laptop actualizado correctamente.";
						break;
					case "Pantalla":
						((laptop)P).setScreen(validators.validator_string("Ingresa el tipo de pantalla.", "Tipo pantalla"));
						str="Pantalla de laptop actualizado correctamente.";
						break;
					case "Pulgadas de pantalla":
						((laptop)P).setScreen_inches(validators.validator_string("Pulgadas de pantalla.", "Ingresar pulgadas"));
						str="Pulgadas de pantalla del laptop actualizadas correctamente.";
						break;
					case "Tipo de teclado":
						((laptop)P).setKeyboard(validators.validator_string("Ingresa el tipo de teclado.", "Teclado"));
						str="Tipo de teclado de laptop actualizado correctamente.";
						break;
					case "Memoria RAM":
						((laptop)P).setRAM(validators.validator_string("Ingresa la memoria RAM.", "Ingresar RAM"));
						str="Memoria RAM de laptop actualizada correctamente.";
						break;
					case "Almacenamiento":
						((laptop)P).setStorage(validators.validator_string("Ingresa el almacenamiento del disco duro.", "Ingresar Disco Duro"));
						str="Almacenamiento de laptop actualizado correctamente.";
						break;
					case "Procesador":
						((laptop)P).setCPU(validators.validator_string("Ingresa procesador.", "Ingresar CPU"));
						str="Procesador del laptop actualizado correctamente.";
						break;
					case "Fuente de Alimentación":
						((laptop)P).setPower_supply(validators.validator_string("Ingresa la fuente de alimentación.", "Fuente de Alimentación"));
						str="Fuente de alimentación de laptop actualizada correctamente.";
						break;
					case "Gráficos":
						((laptop)P).setGraphics(validators.validator_string("Ingresa los gráficos del laptop.", "Ingresar gráficos"));
						str="Gráficos del laptop actualizados correctamente.";
						break;
					case "LED Teclado Retroiluminado":
						((laptop)P).setLED_backlit_keyboard(validators.validator_string("Ingresa el color del LED del teclado retroiluminado.", "Ingresar LED"));
						str="El color del LED del teclado retroiluminado se ha actualizado correctamente.";
						break;
					case "Cámara":
						((laptop)P).setCamera(validators.validator_string("Ingresa la cámara del laptop.", "Ingresar cámara"));
						str="Cámara del laptop actualizada correctamente.";
						break;
					case "Fecha de Rebajas":
						((laptop)P).setF_sales(insert_data.insert_date("Ingresa la fecha de las rebajas.\nFormato: Día/Mes/Año XX/XX/XXXX", "Ingresar fecha rebajas"));
						str="La fecha de rebajas ha sido actualizada correctamente.";
						break;
					case "Número de días de Rebajas":
						((laptop)P).setNum_dias_sales(validators.validator_string("Ingresa los días que duran las rebajas.", "Ingresar rebajas"));
						str="Los días de rebajas de laptop han sido actualizados con éxito.";
						break;
					case "Marca":
						((laptop)P).setBrand(validators.validator_string("Ingresa la marca del laptop.", "Ingresar marca"));
						str="Marca del laptop actualizada correctamente.";
						break;
					case "Precio de Rebajas":
						((laptop)P).setPrice_sales(validators.validator_string("Ingresa el precio rebajado del laptop.", "Ingresar precio rebajado"));
						str="El precio rebajado de laptop ha sido actualizado sin problemas.";
						break;
					default:
						str="Volviendo al menú anterior.\nNo ha seleccionado ninguna opción.";
						break;
				}//end switch
				JOptionPane.showMessageDialog(null,str,"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof smartphone){
			JOptionPane.showMessageDialog(null,"Elige que atributo quieres modificar.","Información",JOptionPane.INFORMATION_MESSAGE);
			String[]buttons_sec={"ID","Precio","Peso","Stock","Color","Dimens","FCompra","F Entr","N Entr","F Dev","NRecog","N Dev"};
			menu_sec=JOptionPane.showOptionDialog(
					null,
					"Elige el atributo a editar.",
					"Información",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_sec,
					buttons_sec[0]);
			switch (menu_sec) {
				case 0:
					((smartphone)P).setID_product(validators.validator_string("Ingresa el ID del producto.", "Ingresar ID"));
					JOptionPane.showMessageDialog(null,"ID de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					((smartphone)P).setPrice(validators.validator_float("Ingresa el precio del producto.", "Ingresar precio"));
					JOptionPane.showMessageDialog(null,"Precio de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					((smartphone)P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
					JOptionPane.showMessageDialog(null,"Peso de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					((smartphone)P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
					JOptionPane.showMessageDialog(null,"Stock de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					((smartphone)P).setColor(validators.validator_string("Ingresa el color del producto.", "Ingresar color"));
					JOptionPane.showMessageDialog(null,"Color de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					((smartphone)P).setDimension(validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
					JOptionPane.showMessageDialog(null,"Dimensión de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					((smartphone)P).setF_compra(validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra"));
					JOptionPane.showMessageDialog(null,"Fecha de compra de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 7:
					((smartphone)P).setF_entrega(validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega"));
					JOptionPane.showMessageDialog(null,"Fecha de entrega de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 8:
					((smartphone)P).setN_dias_entrega(validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días"));
					JOptionPane.showMessageDialog(null,"Número de días de entrega smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 9:
					((smartphone)P).setF_devolucion(validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución"));
					JOptionPane.showMessageDialog(null,"Fecha de devolución de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 10:
					((smartphone)P).setN_dias_recogida(validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida"));
					JOptionPane.showMessageDialog(null,"Número de días de recogida de smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 11:
					((smartphone)P).setN_dias_devolucion(validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución"));
					JOptionPane.showMessageDialog(null,"Número de días de devolución smartphone actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
			}//end switch
		}else if(P instanceof accessory){
			JOptionPane.showMessageDialog(null,"Elige que atributo quieres modificar.","Información",JOptionPane.INFORMATION_MESSAGE);
			String[]buttons_sec={"ID","Precio","Peso","Stock","Color","Dimens","FCompra","F Entr","N Entr","F Dev","NRecog","N Dev"};
			menu_sec=JOptionPane.showOptionDialog(
					null,
					"Elige el atributo a editar.",
					"Información",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_sec,
					buttons_sec[0]);
			switch (menu_sec) {
				case 0:
					((accessory)P).setID_product(validators.validator_string("Ingresa el ID del producto.", "Ingresar ID"));
					JOptionPane.showMessageDialog(null,"ID de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					((accessory)P).setPrice(validators.validator_float("Ingresa el precio del producto.", "Ingresar precio"));
					JOptionPane.showMessageDialog(null,"Precio de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					((accessory)P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
					JOptionPane.showMessageDialog(null,"Peso de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					((accessory)P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
					JOptionPane.showMessageDialog(null,"Stock de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					((accessory)P).setColor(validators.validator_string("Ingresa el color del producto.", "Ingresar color"));
					JOptionPane.showMessageDialog(null,"Color de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					((accessory)P).setDimension(validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
					JOptionPane.showMessageDialog(null,"Dimensión de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					((accessory)P).setF_compra(validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra"));
					JOptionPane.showMessageDialog(null,"Fecha de compra de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 7:
					((accessory)P).setF_entrega(validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega"));
					JOptionPane.showMessageDialog(null,"Fecha de entrega de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 8:
					((accessory)P).setN_dias_entrega(validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días"));
					JOptionPane.showMessageDialog(null,"Número de días de entrega accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 9:
					((accessory)P).setF_devolucion(validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución"));
					JOptionPane.showMessageDialog(null,"Fecha de devolución de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 10:
					((accessory)P).setN_dias_recogida(validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida"));
					JOptionPane.showMessageDialog(null,"Número de días de recogida de accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 11:
					((accessory)P).setN_dias_devolucion(validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución"));
					JOptionPane.showMessageDialog(null,"Número de días de devolución accessorio actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
					break;
			}//end switch
		}//end if
		return P;
	}//end update
	public static product delete(product P) {
		P=null;
		return P;
	}//end delete
}//end class CRUD