import java.util.ArrayList;
import java.util.Scanner;
abstract class Editor_Abstract extends Menu_Abstract
{
	protected UserData_Tools tools;
	public Editor_Abstract(String Menu_Title, UserData z) {
		super(Menu_Title);
		for (Struct o : z.GetData()) {
			Menu_Entry temp = new Menu_Entry(o.GetType());
			AddMenu_Entry(temp);
		}
		tools = new UserData_Tools(z);
	}

	public void Menu_Main(UserData z) {
		int choice = -1;
		while (choice != 0) {
			choice = SelectMenu_Scanner();
			if (choice != 0) {
				SelectMenu(choice - 1, z);
			}
		}
	}
}	
