package com.videoclub.test;

import java.awt.EventQueue;

import com.videoclub.view.LoginFrame;
import com.videoclub.view.MainFrame;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					LoginFrame frameLogin = new LoginFrame();
					
					frameLogin.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
