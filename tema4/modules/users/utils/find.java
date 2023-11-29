package tema4.modules.users.utils;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.classes.user;

public class find {
	public static int find_username(user U){
		for (int i = 0; i<=(singleton_users.useradmin.size()-1); i++){
			if((singleton_users.useradmin.get(i)).equals(U)) {
				return i;
			}
		}
		for (int j = 0; j<=(singleton_users.useremployee.size()-1); j++){
			if((singleton_users.useremployee.get(j)).equals(U)) {
				return j;
			}
		}
		for (int k = 0; k<=(singleton_users.userclient.size()-1); k++){
			if((singleton_users.userclient.get(k)).equals(U)) {
				return k;
			}
		}
		return -1;
	}
	public static String find_login_user(user U){
		System.out.println("Username pasado por parámetro " +(U).getUsername());
		System.out.println("Password pasado por parámetro " +(U).getPassword());
		for (int i = 0; i<=(singleton_users.useradmin.size()-1); i++){
			if((singleton_users.useradmin.get(i)).getUsername().equals((U).getUsername()) && (singleton_users.useradmin.get(i)).getPassword().equals((U).getPassword())){
					return "Admin";
			}
			System.out.println("Username en el array admin " +singleton_users.useradmin.get(i).getUsername());
			System.out.println("Password en el array admin " +singleton_users.useradmin.get(i).getPassword());
		}
		for (int j = 0; j<=(singleton_users.useremployee.size()-1); j++){
			if((singleton_users.useremployee.get(j)).getUsername().equals((U).getUsername()) && (singleton_users.useremployee.get(j)).getPassword().equals((U).getPassword())) {
				return "Empleado";
			}
			System.out.println("Username en el array employee " +singleton_users.useremployee.get(j).getUsername());
			System.out.println("Password en el array employee " +singleton_users.useremployee.get(j).getPassword());
		}
		for (int k = 0; k<=(singleton_users.userclient.size()-1); k++){
			if((singleton_users.userclient.get(k)).getUsername().equals((U).getUsername()) && (singleton_users.userclient.get(k)).getPassword().equals((U).getPassword())) {
				return "Cliente";
			}
			System.out.println("Username en el array client " +singleton_users.userclient.get(k).getUsername());
			System.out.println("Password en el array client " +singleton_users.userclient.get(k).getPassword());
		}
		return "null";
	}
	
}
