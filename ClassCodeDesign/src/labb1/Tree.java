package labb1;

public class Tree {
	Banana bananas[] = new Banana[5];
	int numberOfBananas;
	int bananaCounter;
	
	Tree(){
		for(int i = 0; i<bananas.length; i++){
			bananas[i] = new Banana();
			numberOfBananas = 5;
			bananaCounter = 4;
		}
	}
	
	public int getNumberOfBanas(){
		return numberOfBananas;
	}
	
	public int getBananaCounter(){
		return bananaCounter;
	}
	
	public void setBananaCounter(){
		if(bananas[0] == null){
			numberOfBananas = 0;
		}else{
			
			for(int i=0; i<bananas.length; i++){
				if(bananas[i] == null){
					bananaCounter = i-1;
					numberOfBananas = i;
					return;
				}
			}
		}
	}
	
	public  boolean removeBanana(int position){
		
		if (numberOfBananas>0){
			bananas[position] = null;
			setBananaCounter();
			return true;
		}else{
			System.out.println("The tree is empty!");
			return false;
		}
			
	}

}
