package labb1;

import java.util.ArrayList;
import java.util.Random;

public class Jungle {
	
	private Random rnd = new Random();
	private Tree trees[] = new Tree[5];
	private ArrayList<Monkey> monkeyys;
	String msg;
	
	Jungle(){
		String monkeyNames[] = new String[]{"Gorilla", "Chimp", "Babian", "Tarzan", "Chita"}; 
		
		for(int i=0; i<trees.length; i++){
			trees[i] = new Tree();
		}
		

		monkeyys = new ArrayList<Monkey>();
		for(int i = 0; i<5; i++){
			monkeyys.add(new Monkey(monkeyNames[i]));
		}
	
	}
	
	int randomActionChoice;
	int randomMonkeyChoice = 0;
	public void update(){
		
		randomActionChoice = rnd.nextInt(2);
		if(monkeyys.size()>0){
			randomMonkeyChoice = rnd.nextInt(monkeyys.size());
		}
		if(monkeyys.size()>0){
			if(randomActionChoice == 0){
				int randomTreeChoice = rnd.nextInt(4);
				monkeyys.get(randomMonkeyChoice).hungerIncrease(trees[randomTreeChoice]);
				msg = monkeyys.get(randomMonkeyChoice).getText();
				if(monkeyys.get(randomMonkeyChoice).alive ==false)
					monkeyys.remove(monkeyys.indexOf(monkeyys.get(randomMonkeyChoice)));
			}else
			{
				monkeyys.get(randomMonkeyChoice).walk();
				msg = monkeyys.get(randomMonkeyChoice).getText();
				
			}
		}else
		{
			System.out.println("All the monkeys are dead!!!");
			System.exit(0);
		}
			
		
	}
	
	public void test(){
		int randomMonkeyChoice = rnd.nextInt(monkeyys.size());
//		System.out.println(randomMonkeyChoice);
		System.out.println(monkeyys.size());
	}
	
	public String getText(){
		return msg;
	}
}
