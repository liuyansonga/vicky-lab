/**
 * 
 */
package com.vicky.lab;

import java.util.HashMap;
import java.util.Map;

/** 
 * 类说明:<br> 
 * 创建时间: 2011-8-21 下午4:46:24<br> 
 * @author Seraph.Liu<br> 
 * @email: seraph115@gmail.com<br>  
 */
public class TimeMachine {

	/** 
	 * 功能说明:<br> 
	 * 创建者: Seraph.Liu<br> 
	 * 创建时间: 2011-8-21 下午4:46:24<br> 
	 * @param args 
	 */
	public static void main(String[] args) {
		
		Man adam = new Man();
		adam.setName("adam");
		
		Map<Integer, String> adamGene = new HashMap<Integer, String>();
		adamGene.put(0, "X");
		adamGene.put(1, "Y");
		adam.setGene(adamGene);
		
		Woman eve = new Woman();
		eve.setName("eve");
		
		Map<Integer, String> eveGene = new HashMap<Integer, String>();
		eveGene.put(0, "X");
		eveGene.put(1, "X");
		eve.setGene(eveGene);
		
		for (int i = 0; i < 10; i++) {
			People baby = eve.born(adam);
			
			if(baby.getGene().containsValue("Y")) {
				System.out.println("Name: " + baby.getName() + ", Gene: [" + baby.getGene() + "], It's a boy!");
			} else {
				System.out.println("Name: " + baby.getName() + ", Gene: [" + baby.getGene() + "], It's a girl!");
			}
		}
	}

}
