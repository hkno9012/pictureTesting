package test.controller;

import test.view.Frame;

public class PictureController
{
	private Frame appFrame;
	
	public PictureController()
	{
		appFrame = new Frame(this);
	}
	
	public Frame getFrame()
	{
		return appFrame;
	}
	
	public void start()
	{
		
	}
}
