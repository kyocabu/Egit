package com.ohn.ijimaproject;

import java.io.Serializable;

public class Hero implements Serializable{
	String name;
	int hp;
	int mp;
	public Hero(String name, int hp, int mp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	@Override
	public String toString(){
		return "ワタシノ----の名前は!!!!" + name +"｡体力は" + hp + "、精神力は" + mp + "だ。";
	}


}
