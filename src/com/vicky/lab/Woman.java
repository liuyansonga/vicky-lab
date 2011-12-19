/**
 * 
 */
package com.vicky.lab;

import java.util.HashMap;
import java.util.Map;

/** 
 * 类说明:<br> 
 * 创建时间: 2011-8-21 下午4:51:31<br> 
 * @author Seraph.Liu<br> 
 * @email: seraph115@gmail.com<br>  
 */
public class Woman extends People {
	
	protected People born(Man man) {
		
		String half1 = this.getHalfGene();
		String half2 = man.getHalfGene();
		
		People baby = new People();
		
		Map<Integer, String> gene = new HashMap<Integer, String>();
		gene.put(0, half1);
		gene.put(1, half2);
		
		baby.setName("Noname");
		baby.setGene(gene);
		
		return baby;
	}

}
