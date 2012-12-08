package labb1;

public class Monkey {
	private int hunger;
	private String name;
	private boolean eating = true;
	boolean alive = true;
	String tekst1;
	
	Monkey(String monkeyName){
		name = monkeyName;
		hunger = 0;
	}
	
	public void hungerIncrease(Tree tree){
		hunger +=5;
		if(hunger<15){
			System.out.println(name + "'s hunger increases!");
			tekst1 = name + "'s hunger increases!";
		}else
		{
			System.out.println(name + "'s hunger is too big, it needs to eat now!");
			tekst1 = name + "'s hunger is too big, it needs to eat now!";
			while(hunger>15){
				if( eating == true){
					eatBananas(tree);
				}else
				{
					System.out.println(name + " has died out of hunger");
					tekst1 = name + " has died out of hunger";
					this.alive = false;
					return;
				}
					
			}
			System.out.println(name + " is not that hungry anymore");
			tekst1 = name + " is not that hungry anymore";
		}
			
	}
	
	public void eatBananas(Tree myTree){
		
		Tree td = myTree;
			
			if(td.getNumberOfBanas()>0){
				hunger -= td.bananas[td.getBananaCounter()].getNourishment();
				td.removeBanana(td.getBananaCounter());
				tekst1 = name + " has eaten a banana";
				System.out.println(name + " has eaten a banana");
				eating = true;
			}else
			{
				eating = false;
				
				
			}
		
	}
	
	public void walk(){
		System.out.println(name + " Walks!");
		tekst1 = name + " Walks!";
	}
	
	public String getText(){
		return tekst1;
	}
	
	public void resetText(){
		tekst1 = "";
	}

}
