package tema4.modules.products.utils.CRUD;

import tema4.modules.products.classes.accessory;
import tema4.modules.products.classes.laptop;
import tema4.modules.products.classes.smartphone;
import tema4.modules.products.utils.insert_data;

public class create {
	public static void create_admin(laptop laptop) {
		int location = -1;

		a1 = Functions_users.ask_adminDNI(config);
		location = Functions_find.find_admin(a1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("usererror2", config, 0),
					Languages.message("errortitle", config, 0), JOptionPane.ERROR_MESSAGE);
		} else {
			a1 = Functions_users.ask_admin(config);
			Singleton.useradmin.add(a1);
		}
	}

	public static void create_client(smartphone smartphone) {
		int location = -1;

		smartphone = insert_data.insert_ID();
		location = Functions_find.find_client(smartphone);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("usererror2", 0),
					Languages.message("errortitle", config, 0), JOptionPane.ERROR_MESSAGE);
		} else {
			smartphone = Functions_users.ask_client(config);
			Singleton.userclient.add(c1);
		}
	}

	public static void create_userregister(accessory accessory) {
		int location = -1;

		u1 = Functions_users.ask_user_registerDNI(config);
		location = Functions_find.find_user(u1);
		if (location != -1) {
			JOptionPane.showMessageDialog(null, Languages.message("usererror2", config, 0),
					Languages.message("errortitle", config, 0), JOptionPane.ERROR_MESSAGE);
		} else {
			u1 = Functions_users.ask_user_register(config);
			Singleton.userregister.add(u1);
		}
	}
}
