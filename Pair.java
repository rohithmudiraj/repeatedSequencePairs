package repeatUniquePair;

import java.util.ArrayList;

public class Pair {
	
	private ArrayList<Integer> pairs = new ArrayList<Integer>();
	
	private void add(int n) {
		pairs.add(n);
	}
	
	
	public int check(ArrayList<Integer> demo) {
		int count=0;
		int maxCount=0;

		for(int i=0;i<demo.size()-1;i++) {
			
		for(int j=i+1;j<demo.size();j++) {
			
			//System.out.println("=============================");
			
			count=0;
				
			for(int k=j+1;k<demo.size();k++) {
			
				
				int x=demo.get(i);
				int y=demo.get(j);
				
				
				if(x!=y) {
			//	System.out.println(x+" <- x "+y+" <- y");

				if(demo.get(k)==x||demo.get(k)==y) {
				//	System.out.println(demo.get(k)+" ");
				//	System.out.println("increment");
				//	System.out.println(i+" <- i "+j+" <- j "+k+" <- k ");
					
					count++;
					//System.out.println(count+" <-count");
					
					if(count>=maxCount) {
						maxCount=count;	
				//	System.out.println("maxcount====="+maxCount+"count====="+count);
					}
				}
				else {
				//	System.out.println(demo.get(k)+" ");
					count=0;

				//	System.out.println("no increment");
				//	System.out.println(i+" <-i"+j+" <-j"+k+" <-k");

				}
			
	
			}
			
			
			}
	
		
		}
		}
		
		return maxCount;
	}
	
	public static void main(String[] args) {
		
		Pair obj = new Pair();
		obj.add(1);
		obj.add(3);
		obj.add(5);
		obj.add(3);
		obj.add(1);
		obj.add(3);
		obj.add(4);
		obj.add(1);
		obj.add(1);
		obj.add(3);
		obj.add(3);
		obj.add(3);
		obj.add(1);
		obj.add(3);
		obj.add(5);
		obj.add(4);
		obj.add(1);
		obj.add(3);
		obj.add(3);
		obj.add(1);
		obj.add(5);
		obj.add(4);
		obj.add(5);
		obj.add(4);
		obj.add(5);
		obj.add(4);
		obj.add(5);
		obj.add(5);
		
		
	
		System.out.println(obj.check(obj.pairs));
		
	}

}
