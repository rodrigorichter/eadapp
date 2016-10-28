package eadapp;

import eadapp.data.Database;
import eadapp.ui.UserInterface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import eadapp.teste;

public class EadApp {
	public static UserInterface ui;
	public static Database db;
	
	public static void main(String args[]) {
		db = new Database(true);
		ui = new UserInterface();
		
		
		
	}
}
