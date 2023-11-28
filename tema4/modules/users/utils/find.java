package tema4.modules.users.utils;

import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.classes.user;

public class find {
	public static int find_username(user U){
		for (int i = 0; i<=(singleton_users.useradmin.size()-1); i++){
			if((singleton_users.useradmin.get(i)).equals(U))
				return i;
		}
		for (int j = 0; j<=(singleton_users.useremployee.size()-1); j++){
			if((singleton_users.useremployee.get(j)).equals(U))
				return j;
		}
		for (int k = 0; k<=(singleton_users.userclient.size()-1); k++){
			if((singleton_users.userclient.get(k)).equals(U))
				return k;
		}
		return -1;
	}
	public static int find_login_user(user U){
		for (int i = 0; i<=(singleton_users.useradmin.size()-1); i++){
			if((singleton_users.useradmin.get(i)).equals(U)&&(singleton_users.useradmin.get(i)).equals(U))
				return i;
		}
		for (int j = 0; j<=(singleton_users.useremployee.size()-1); j++){
			if((singleton_users.useremployee.get(j)).equals(U)&&(singleton_users.useremployee.get(j)).equals(U))
				return j;
		}
		for (int k = 0; k<=(singleton_users.userclient.size()-1); k++){
			if((singleton_users.userclient.get(k)).equals(U)&&(singleton_users.userclient.get(k)).equals(U))
				return k;
		}
		return -1;
	}
}
