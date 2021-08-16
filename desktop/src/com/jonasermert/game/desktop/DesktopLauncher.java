package com.jonasermert.game.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jonasermert.game.MyGdxGame;
import com.jonasermert.helpers.GameInfo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "libGDXProject";
		config.addIcon("icon.png", Files.FileType.Internal);

		config.width = GameInfo.WIDTH;
		config.height = GameInfo.HEIGHT;

		config.fullscreen = false;
		config.vSyncEnabled = true;

		new LwjglApplication(new MyGdxGame(), config);


	}
}
