/**
 * 
 */
package com.vicky.lab;

import java.util.Map;
import java.util.Random;

/**
 * 类说明:<br>
 * 创建时间: 2011-8-21 下午4:37:00<br>
 * 
 * @author Seraph.Liu<br>
 * @email: seraph115@gmail.com<br>
 */
public class People {

	private String name;

	private Map<Integer, String> gene;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, String> getGene() {
		return gene;
	}

	public void setGene(Map<Integer, String> gene) {
		this.gene = gene;
	}

	public String getHalfGene() {

		Random random = new Random();
		
		int i = random.nextInt(2);
		return gene.get(i);
	}

}
