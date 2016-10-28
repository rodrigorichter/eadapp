package eadapp.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class UserInterface extends Composite {
	public UserInterface(Composite parent, int style) {
		super(parent,style);
		// TODO Auto-generated constructor stub
	}

	public void Login() {
		
		Button btnLogin = new Button(this, SWT.NONE);
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.out.println("MUITO");
			}
		});
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnLogin.setBounds(155, 261, 101, 29);
		btnLogin.setText("Login");
		
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("EU ODEIO JAVA");
		
		
		shell.open();
		shell.layout();
		
		
		while(!shell.isDisposed()) {
			//ui.showUI();
			//ui.getCommand();
			
			if (!display.readAndDispatch()) {
				display.sleep();
			}
			
		}
		
	}
	
}
