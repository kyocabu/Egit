package com.ohn.ijimaproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IjimaSave {

	public static void main(String[] args) throws Exception {
		Hero hero = new Hero("タケシ", 100, 50);
		FileOutputStream fos = new FileOutputStream("data/savedata.data");
		;
		ObjectOutputStream obs = new ObjectOutputStream(fos);
		obs.writeObject(hero);
		obs.flush();
		obs.close();

		hero.name = "マサオ";
		hero.hp = 0;
		hero.mp = 2;

		FileInputStream fis = new FileInputStream("data/savedata.data");
		ObjectInputStream ois = new ObjectInputStream(fis);

		hero = (Hero)ois.readObject();
		ois.close();

		Path old = Paths.get("data/savedata.data");
		Path news = Paths.get("data/savedata2.data");


		Files.copy(old, news);

		System.out.println(hero);
	}

}
