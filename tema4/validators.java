package tema4;
import javax.swing.JOptionPane;
public class validators {
	public static int validator_int (String message,String title) {
		int num1 = 0;
		String num_input="";
		boolean convert = false;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else{
					num1=Integer.parseInt(num_input);
					convert=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número correcto. Inténtelo de nuevo.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return num1;
	}//end validator_int
	public static int validator_range(int range,String message,String title) {
		int opt=0;
		String opt_str="";
		boolean convert=true;
		do{
			do{
				try{
					opt_str=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
					if(opt_str==null){
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else {
						opt=Integer.parseInt(opt_str);
						convert=true;
					}//end if
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Posición no válida, debe de ser del 1 al "+range+".", "Error",JOptionPane.ERROR_MESSAGE);
					convert=false;
				}//end try catch
			}while(convert==false);
			if ((opt<1)||(opt>range)) {
				JOptionPane.showMessageDialog(null,"Posición no válida, debe de ser del 1 al "+range+".","Error",JOptionPane.ERROR_MESSAGE);
			}//end if
			}while(((opt<1)||(opt>range)));
		return opt;
	}//end validator_range
	public static String validator_string(String message,String title) {
		String str="";
		boolean convert=true;
		do{
			try{
				str=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				convert=true;
				if (str==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}//end if
				if(str.equals("")){
					JOptionPane.showMessageDialog(null, "No has introducido una cadena de texto válida.","Error",JOptionPane.ERROR_MESSAGE);
					convert=false;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una cadena de texto válida.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return str;
	}//end validator_string
	public static float validator_float(String message,String title) {
		float num = 0.0f;
		String num_input;
		boolean convert=true;
		do{
			try{
				num_input=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				if(num_input==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					num=Float.parseFloat(num_input);
					convert=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido un número decimal.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return num;
	}//end validator_float
	public static char validator_char(String message,String title) {
		char character = 0;
		String letra_input;
		boolean convert=true;
		do{
			try{
				letra_input=JOptionPane.showInputDialog(null, message,title,JOptionPane.QUESTION_MESSAGE);
				if(letra_input==null){
					JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}else {
					character=letra_input.charAt(0);
					convert=true;
				}//end if
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "No has introducido una carácter correcto.", "Error",JOptionPane.ERROR_MESSAGE);
				convert=false;
			}//end try catch
		}while(convert==false);
		return character;
	}//end validator_char
	public static String create_ID() {
		boolean res = false;
		String ID = "";
		do {
			ID = validator_string("Ingresa un ID alfanúmerico (A-Z/0-9).", "Ingresar ID");
			res = validators_patterns.validateProductID(ID);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "ID ingresado incorrecto. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}
		} while (res == false);
		return ID;
	}//end create_ID
	public static float create_price() {
		boolean res = false;
		float price = 0.0f;
		do {
			price = validator_float("Ingresa un número decimal (9.5f/9).", "Ingresar Precio");
			res = validators_patterns.validatePrice(price);
			if (res == false) {
				JOptionPane.showMessageDialog(null, "ID ingresado incorrecto. ", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				res = true;
			}
		} while (res == false);
		return price;
	}//end create_ID
}//end class validators