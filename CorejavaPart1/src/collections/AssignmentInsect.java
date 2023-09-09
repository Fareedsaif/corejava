package collections;

import java.util.ArrayList;
import java.util.List;

class Insect {
	private String insectName;
	private int insectWeight;
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
}
class Insecticides {
	public List <String> mapInsectName(List<Insect>list) {
		List<String> s=new ArrayList<>();
		for(Insect i:list) {
			s.add(i.getInsectName());
			
		}
		return s;
		
	}
	public List<Insect> getWeight(List<Insect>list) {
		List<Insect> s1=new ArrayList<>();
		for(Insect i:list) {
			int weight=i.getInsectWeight();
			if(weight>40 && weight<=100) {
				s1.add(i);
			}
		}
		return s1;
	}

	}

public class AssignmentInsect {

	public static void main(String[] args) {
		Insecticides i=new Insecticides();
		List<Insect> list=new ArrayList<Insect>();
		list.add(new Insect("spider", 46));
		list.add(new Insect("Honeybee", 23));
		list.add(new Insect("cockroach", 76));
		list.add(new Insect("paper", 55));
		
		System.out.println(i.mapInsectName(list));
		System.out.println(i.getWeight(list));

	}

}




