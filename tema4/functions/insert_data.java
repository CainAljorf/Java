package tema4.functions;
import javax.swing.JOptionPane;
public class insert_data {
	public static String insert_ID() {
		boolean res = false;
		String ID = "";
		do {
			ID = validators.validator_string("Ingresa un ID alfanúmerico como el siguiente ejemplo.\nABC-123", "Ingresar ID");
			res = regex.validateProductID(ID);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "ID ingresado incorrecto. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return ID;
	}//end insert_ID
	public static String insert_date(String message, String title) {
		boolean res = false;
		String date = "";
		do {
			date = validators.validator_string(message,title);
			res = regex.validateDate(date);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "Formato de fecha incorrecta, inténtelo de nuevo. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}//end if
		} while (res == false);
		return date;
	}//end insert_date
	public static String insert_color() {
		String str="";
		int type=0;
		String[]buttons={
				"Rojo",
				"Negro",
				"Amarillo",
				"Blanco",
				"Verde",
				"Gris",
				"Morado",
				"Rosa",
				"Naranja",
				"Azul"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige un color para el producto.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Rojo";
				break;
			case 1: 
				str="Negro";
				break;
			case 2: 
				str="Amarillo";
				break;
			case 3: 
				str="Blanco";
				break;
			case 4: 
				str="Verde";
				break;
			case 5: 
				str="Gris";
				break;
			case 6: 
				str="Morado";
				break;
			case 7: 
				str="Rosa";
				break;
			case 8: 
				str="Naranja";
				break;
			case 9: 
				str="Azul";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_color
	public static String insert_type_accessory() {
		String str="";
		int type=0;
		String[]buttons={
				"Power Bank",
				"Funda",
				"Auriculares",
				"Cargador",
				"Soporte"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de accesorio.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Power Bank";
				break;
			case 1: 
				str="Funda";
				break;
			case 2: 
				str="Auriculares";
				break;
			case 3: 
				str="Cargador";
				break;
			case 4: 
				str="Soporte";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_type_accessory
	public static String insert_protection() {
		String str="";
		int type=0;
		String[]buttons={
				"Polvo",
				"Agua",
				"Golpes",
				"Caídas"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de protección del accesorio.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Polvo";
				break;
			case 1: 
				str="Agua";
				break;
			case 2: 
				str="Golpes";
				break;
			case 3: 
				str="Caídas";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_protection
	public static String insert_connectivity() {
		String str="";
		int type=0;
		String[]buttons={
				"Cableado",
				"Inalámbrico"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de protección del accesorio.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Cableado";
				break;
			case 1: 
				str="Inalámbrico";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_connectivity
	public static String insert_screen(){
		String str="";
		int type=0;
		String[]buttons={
				"LCD",
				"IPS",
				"QLED",
				"OLED"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de pantalla del producto (60Hz).",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="LCD";
				break;
			case 1: 
				str="IPS";
				break;
			case 2: 
				str="QLED";
				break;
			case 3: 
				str="OLED";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_screen
	public static String insert_screen_inches(String opt){
		String str="";
		String[]buttons={
				"15.6",
				"13.3",
				"17.3",
				"12.1"};
		String[]buttons2={
				"5.5",
				"6.1",
				"6.4",
				"6.8"};
		int type=0;
		switch(opt) {
			case "laptop":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige las pulgadas de la pantalla (1902x1080p).",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (type) {
					case 0: 
						str="15.6";
						break;
					case 1: 
						str="13.3";
						break;
					case 2: 
						str="17.3";
						break;
					case 3: 
						str="12.1";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
				break;
			case "smartphone":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige las pulgadas de la pantalla (1440x2560p).",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons2,
						buttons2[0]);
				switch (type) {
					case 0: 
						str="5.5";
						break;
					case 1: 
						str="6.1";
						break;
					case 2: 
						str="6.4";
						break;
					case 3: 
						str="6.8";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
				break;
		}//end switch
		return str;
	}//end insert_screen_inches
	public static String insert_keyboard(){
		String str="";
		int type=0;
		String[]buttons={
				"QUERTY ES",
				"QUERTY DE",
				"QUERTY UK",
				"QUERTZ",
				"AZERTY",
				"DVORAK"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el tipo de teclado.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="QUERTY ES";
				break;
			case 1: 
				str="QUERTY DE";
				break;
			case 2: 
				str="QUERTY UK";
				break;
			case 3: 
				str="QUERTZ";
				break;
			case 4: 
				str="AZERTY";
				break;
			case 5: 
				str="DVORAK";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_keyboard
	public static String insert_RAM(String opt){
		String str="";
		int type=0;
		String[]buttons={
				"1x8GB",
				"2x8GB",
				"4x8GB",
				"1x16GB",
				"2x16GB",
				"4x16GB",
				"1x32GB",
				"2x32GB",
				"4x32GB"};
		String[]buttons2={
				"4GB",
				"6GB",
				"8GB",
				"12GB",
				"16GB"};
		switch(opt) {
			case "laptop":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige la memoria RAM (DDR5 5000 MHz).",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (type) {
					case 0: 
						str="1x8GB";
						break;
					case 1: 
						str="2x8GB";
						break;
					case 2: 
						str="4x8GB";
						break;
					case 3: 
						str="1x16GB";
						break;
					case 4: 
						str="2x16GB";
						break;
					case 5: 
						str="4x16GB";
						break;
					case 6: 
						str="1x32GB";
						break;
					case 7: 
						str="2x32GB";
						break;
					case 8: 
						str="4x32GB";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
			break;
			case "smartphone":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige la memoria RAM (LPDDR5 4200 MHz).",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons2,
						buttons2[0]);
				switch (type) {
					case 0: 
						str="4GB";
						break;
					case 1: 
						str="6GB";
						break;
					case 2: 
						str="8GB";
						break;
					case 3: 
						str="12GB";
						break;
					case 4: 
						str="16GB";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
			break;
		}//end switch
		return str;
	}//end insert_RAM
	public static String insert_storage(){
		String str="";
		int type=0;
		String[]buttons={
				"128GB",
				"256GB",
				"512GB",
				"1024GB",
				"2048GB",
				"4096GB",
				"8192GB"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el almacenamiento del disco duro (SSD NVMe gen 5).",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="128GB";
				break;
			case 1: 
				str="256GB";
				break;
			case 2: 
				str="512GB";
				break;
			case 3: 
				str="1024GB";
				break;
			case 4: 
				str="2048GB";
				break;
			case 5: 
				str="4096GB";
				break;
			case 6: 
				str="8192GB";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_storage
	public static String insert_CPU(String opt){
		String str="";
		int type=0;
		String[]buttons={
				"AMD Ryzen 5 7600U",
				"Intel Core i5 14600U",
				"AMD Ryzen 7 7700H",
				"Intel Core i7 14700H",
				"AMD Ryzen 9 7900H",
				"Intel Core i9 14900H",
				"Apple M3 PRO"};
		String[]buttons2={
				"Qualcomm Snapdragon Gen 9",
				"Samsung Exynos 8100",
				"Mediatek Helio X60",
				"Huawei Kirin 990",
				"Google Tensor",
				"Mediatek Dimensity 9000U",
				"Apple M3 PRO"};
		switch(opt) {
			case "laptop":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige el procesador del laptop.",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (type) {
					case 0: 
						str="AMD Ryzen 5 7600U";
						break;
					case 1: 
						str="Intel Core i5 14600U";
						break;
					case 2: 
						str="AMD Ryzen 7 7700H";
						break;
					case 3: 
						str="Intel Core i7 14700K";
						break;
					case 4: 
						str="AMD Ryzen 9 7900X";
						break;
					case 5: 
						str="Intel Core i9 14900K";
						break;
					case 6: 
						str="Apple M3 PRO";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
				break;
			case "smartphone":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige el procesador del smartphone (ARM).",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons2,
						buttons2[0]);
				switch (type) {
					case 0: 
						str="Qualcomm Snapdragon Gen 9";
						break;
					case 1: 
						str="Samsung Exynos 8100";
						break;
					case 2: 
						str="Mediatek Helio X60";
						break;
					case 3: 
						str="Huawei Kirin 990";
						break;
					case 4: 
						str="Google Tensor";
						break;
					case 5: 
						str="Mediatek Dimensity 9000U";
						break;
					case 6: 
						str="Apple M3 PRO";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
				break;
		}//end switch
		return str;
	}//end insert_CPU
	public static String insert_graphics(){
		String str="";
		int type=0;
		String[]buttons={
				"AMD Radeon Graphics",
				"Intel HD Graphics",
				"Nvidia GeForce RTX 4080M",
				"Intel Iris Xe MAX",
				"AMD Radeon RX 7900M",
				"Apple Integrated Graphics"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige los gráficos del laptop.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="AMD Radeon Graphics";
				break;
			case 1: 
				str="Intel HD Graphics";
				break;
			case 2: 
				str="Nvidia GeForce RTX 4080M";
				break;
			case 3: 
				str="Intel Iris Xe MAX";
				break;
			case 4: 
				str="AMD Radeon RX 7900M";
				break;
			case 5: 
				str="Apple Integrated Graphics";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_graphics
	public static String insert_power_supply(){
		String str="";
		int type=0;
		String[]buttons={
				"80 Plus Gold CORSAIR",
				"80 Plus Silver Tacens",
				"80 Plus Platinum EVGA",
				"80 Plus Titanium Seasonic",
				"80 Plus Bronce Cooler Master"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige la eficiencia y marca de la fuente de alimentación (250W).",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="80 Plus Gold CORSAIR";
				break;
			case 1: 
				str="80 Plus Silver Tacens";
				break;
			case 2: 
				str="80 Plus Platinum EVGA";
				break;
			case 3: 
				str="80 Plus Titanium Seasonic";
				break;
			case 4: 
				str="80 Plus Bronce Cooler Master";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_power_supply
	public static String insert_camera(){
		String str="";
		int type=0;
		String[]buttons={
				"Sony XM 1.7f",
				"Leica RS 1.2f",
				"Canon LT 1.5f",
				"Panasonic 2.1f zoom x10"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el sensor de la cámara (48Mpx).",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Sony XM 1.7f";
				break;
			case 1: 
				str="Leica RS 1.2f";
				break;
			case 2: 
				str="Canon LT 1.5f";
				break;
			case 3: 
				str="Panasonic 2.1f zoom x10";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_camera
	public static String insert_brand(String opt){
		String str="";
		int type=0;
		String[]buttons={
				"Lenovo",
				"HP Omen",
				"Asus ROG",
				"Gigabyte AORUS",
				"MacBook PRO"};
		String[]buttons2={
				"Samsung Galaxy",
				"Iphone",
				"Huawei",
				"Xiaomi",
				"Google Pixel"};
		switch(opt) {
			case "laptop":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige la marca del laptop.",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (type) {
					case 0: 
						str="Lenovo";
						break;
					case 1: 
						str="HP Omen";
						break;
					case 2: 
						str="Asus ROG";
						break;
					case 3: 
						str="Gigabyte AORUS";
						break;
					case 4: 
						str="MacBook PRO";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
				break;
			case "smartphone":
				type=JOptionPane.showOptionDialog(
						null,
						"Elige la marca del smartphone.",
						"CRUD",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons2,
						buttons2[0]);
				switch (type) {
					case 0: 
						str="Samsung Galaxy";
						break;
					case 1: 
						str="Iphone";
						break;
					case 2: 
						str="Huawei";
						break;
					case 3: 
						str="Xiaomi";
						break;
					case 4: 
						str="Google Pixel";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}//end switch
				break;
		}//end switch
		return str;
	}//end insert_brand
	public static String insert_OS(){
		String str="";
		int type=0;
		String[]buttons={
				"Symbian OS",
				"IOS",
				"Harmony OS",
				"Android"};
		type=JOptionPane.showOptionDialog(
				null,
				"Elige el sistema operativo del smartphone.",
				"CRUD",
				0,
				JOptionPane.QUESTION_MESSAGE,
				null,
				buttons,
				buttons[0]);
		switch (type) {
			case 0: 
				str="Symbian OS";
				break;
			case 1: 
				str="IOS";
				break;
			case 2: 
				str="Harmony OS";
				break;
			case 3: 
				str="Android";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
		}//end switch
		return str;
	}//end insert_OS
}//end insert_data