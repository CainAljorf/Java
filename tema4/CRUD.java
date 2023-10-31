package tema4;
import javax.swing.JOptionPane;
public class CRUD {
	public static product create(int opt) {

//		float price=validators.validator_float("Ingresa el precio del producto.", "Ingresar precio");
//		float peso=validators.validator_float("Ingresa el peso del producto.", "Ingresar peso");
//		int stock=validators.validator_int("Ingresa el stock del producto.", "Ingresar stock");
//		String color=validators.validator_string("Ingresa el color del producto.", "Ingresar color");
//		float dimension=validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension");
//		String f_compra=validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra");
//		String f_entrega=validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega");
//		int n_dias_entrega=validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días");
//		String f_devolucion=validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución");
//		String f_recogida=validators.validator_string("Ingresa la fecha de recogida.", "Ingresar fecha recogida");
//		int n_dias_recogida=validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida");
//		int n_dias_devolucion=validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución");
//		P1=new product(ID_product,price,peso,stock,color,dimension,f_compra,f_entrega,n_dias_entrega,
//				f_devolucion,f_recogida,n_dias_recogida,n_dias_devolucion);
		product P = null;
		String ID_product="",color,f_compra,f_entrega,f_devolucion,f_recogida,RAM,screen,screen_inches,keyboard,storage,type;
		String connectivity,warranty,electric,protection,CPU,power_supply,graphics,brand,LED_backlit_keyboard,camera,NFC,OS;
		float price,peso,dimension;
		int stock,n_dias_entrega,n_dias_recogida,n_dias_devolucion;
		ID_product=validators.create_ID();
		price=validators.create_price();
		switch(opt) {
			case 0:
				P=new laptop(ID_product,price,1,1,"red",5,"5/04/2012","15/04/2012",10,"30/04/2012","20/04/2012",10,15,"IPS","15.1",
							"QUERTY","16 GB","1 TB","Ryzen 7 5700X","240W","1650M","HP Omen","LED RED","Sony XM 1.8f");
				JOptionPane.showMessageDialog(null, "Laptop creado correctamenmte.","Felicidades", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 1:
				P=new smartphone("1",1,1,1,"red",5,"5/04/2012","15/04/2012",10,
						"30/04/2012","20/04/2012",10,15,"IPS","15.1","QUERTY","16 GB","1 TB","Ryzen 7 5700X","240W","1650M","HP Omen","Top");
				JOptionPane.showMessageDialog(null, "Smartphone creado correctamenmte.","Felicidades", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				P=new accessory("1",1,1,1,"red",5,"5/04/2012","15/04/2012",10,
						"30/04/2012","20/04/2012",10,15,"IPS","15.1","QUERTY","16 GB","1 TB");
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
					   new Object[] { "ID", "Precio", "Peso", "Stock", "Color","Dimension" ,"Fecha de Compra"},
					   "ID");
			switch (opt.toString()) {
				case "ID":
					str="ID: "+((laptop)P).getID_product();
					break;
				case "Precio":
					str="Precio: "+((laptop)P).getPrice();
					break;
				case "Peso":
					break;
				case "Stock":
					break;
				case "Color":
					break;
				case "Dimension":
					break;
				case "Fecha de Compra":
					break;
				default:
					JOptionPane.showMessageDialog(null, "No has elegido ninguna de las anteirores opciones");
			}//end_case
			JOptionPane.showMessageDialog(null,str,"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof smartphone) {
			JOptionPane.showMessageDialog(null,((smartphone)P).toString(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}else if(P instanceof accessory) {
			JOptionPane.showMessageDialog(null,((accessory)P).toString(),"Información",JOptionPane.INFORMATION_MESSAGE);
		}//end if
	}
	public static product update(product P) {
		int menu_sec=0;
		String str="";
		if (P instanceof laptop){
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
						((laptop)P).setID_product(validators.validator_string("Ingresa el ID del producto.", "Ingresar ID"));
						JOptionPane.showMessageDialog(null,"ID de laptop actualizado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					case 1:
						((laptop)P).setPrice(validators.validator_float("Ingresa el precio del producto.", "Ingresar precio"));
						str="Precio de laptop actualizado correctamente.";
						break;
					case 2:
						((laptop)P).setPeso(validators.validator_float("Ingresa el peso del producto.", "Ingresar peso"));
						str="Peso de laptop actualizado correctamente.";
						break;
					case 3:
						((laptop)P).setStock(validators.validator_int("Ingresa el stock del producto.", "Ingresar stock"));
						str="Stock de laptop actualizado correctamente.";
						break;
					case 4:
						((laptop)P).setColor(validators.validator_string("Ingresa el color del producto.", "Ingresar color"));
						str="Color de laptop actualizado correctamente.";
						break;
					case 5:
						((laptop)P).setDimension(validators.validator_float("Ingresa la dimension del producto.", "Ingresar dimension"));
						str="Dimensión de laptop actualizado correctamente.";
						break;
					case 6:
						((laptop)P).setF_compra(validators.validator_string("Ingresa la fecha de compra del producto.", "Ingresar fecha compra"));
						str="Fecha de compra de laptop actualizado correctamente.";
						break;
					case 7:
						((laptop)P).setF_entrega(validators.validator_string("Ingresa la fecha de entrega del producto.", "Ingresar fecha entrega"));
						str="Fecha de entrega de laptop actualizado correctamente.";
						break;
					case 8:
						((laptop)P).setN_dias_entrega(validators.validator_int("Ingresa el número de días que tardará en entregarse.", "Ingresar los días"));
						str="Número de días de entrega laptop actualizado correctamente.";
						break;
					case 9:
						((laptop)P).setF_devolucion(validators.validator_string("Ingresa la fecha de devolución.", "Ingresar fecha devolución"));
						str="Fecha de devolución de laptop actualizado correctamente.";
						break;
					case 10:
						((laptop)P).setN_dias_recogida(validators.validator_int("Ingresa el número de días que tardará en recogerse.", "Ingresar recogida"));
						str="Número de días de recogida de laptop actualizado correctamente.";
						break;
					case 11:
						((laptop)P).setN_dias_devolucion(validators.validator_int("Ingresa el número de días que quedan para la devolución.", "Ingresar devolución"));
						str="Número de días de devolución laptop actualizado correctamente.";
						break;
					default:
						str="Volviendo al menú anterior.\nNo ha seleccionado ningún atributo.";
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