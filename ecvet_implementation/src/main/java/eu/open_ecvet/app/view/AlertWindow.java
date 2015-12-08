
package eu.open_ecvet.app.view;

import xdev.lang.EventHandlerDelegate;
import xdev.ui.GBC;
import xdev.ui.XdevButton;
import xdev.ui.XdevLabel;
import xdev.ui.XdevWindow;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class AlertWindow
extends XdevWindow // ${GENERATED-CODE-LINE:BEAN_SUPERCLASS}
{
	

	@EventHandlerDelegate void this_windowClosing(WindowEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		close();
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	@EventHandlerDelegate void button_actionPerformed(ActionEvent event) // ${GENERATED-CODE-BLOCK-START:EVENT_HANDLER_DELEGATE}
	{// ${GENERATED-CODE-BLOCK-END:EVENT_HANDLER_DELEGATE}
		this.close();
	}// ${GENERATED-CODE-LINE:EVENT_HANDLER_DELEGATE}


	// Generated definitions, do not edit! ${GENERATED-CODE-BLOCK-START:DEFINITIONS}
	XdevButton	button;
	XdevLabel	label;
	// End generated definitions ${GENERATED-CODE-BLOCK-END:DEFINITIONS}


	{// Generated initializers, do not edit! ${GENERATED-CODE-BLOCK-START:INITIALIZERS}
		label = new XdevLabel();
		button = new XdevButton();
		
		this.setPreferredSize(new Dimension(300,100));
		label.setText("Constraint Violation");
		button.setTabIndex(1);
		button.setText("OK");
		
		label.saveState();
		
		this.setLayout(new GridBagLayout());
		this.add(label,new GBC(1,1,1,1,0.1,0.0,GBC.CENTER,GBC.NONE,new Insets(3,3,3,3),0,0));
		this.add(button,new GBC(1,2,1,1,0.1,0.1,GBC.CENTER,GBC.NONE,new Insets(3,3,3,3),0,0));
		GBC.addSpacer(this,true,true);
		
		this.addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				this_windowClosing(e);
			}
		});
		button.addActionListener(e -> button_actionPerformed(e));
	}// ${GENERATED-CODE-BLOCK-END:INITIALIZERS}

}