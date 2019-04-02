package test.view;

import javax.swing.JFrame;
//import javax.swing.JPanel;
import test.controller.PictureController;

public class Frame extends JFrame
{
	//private PictureController app;
	//private StartPanel appPanel;
	
	public Frame(PictureController app)
	{
		super();
		//this.app = app;
		//this.appPanel = new StartPanel(app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		//this.setContentPane(appPanel);
		this.setTitle("Create Project");
		this.setSize(1000, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void replaceScreen(String screen)
	{
		if(screen.equals("GAME"))
		{
			
		}
	}
}