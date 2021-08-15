package com.jonasermert.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jonasermert.game.MyGdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "libGDXProject";
		config.addIcon("icon.png", Files.FileType.Internal);

		config.width = 800;
		config.height = 480;

		config.fullscreen = false;
		config.vSyncEnabled = true;

		new LwjglApplication(new MyGdxGame(), config);




	}
}
