package javaEigth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpStream {

	public static void main(String[] args) {
		ArrayList<Emp> a1 = new ArrayList<>();
		a1.add(new Emp(1, "Manya", "Manager", 23000));
		a1.add(new Emp(2, "Avinash", "TL", 24000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000));
		a1.add(new Emp(3, "Munna", "Dev", 32000));
		a1.add(new Emp(4, "Pooja", "Trainer", 39000));
		System.out.println(a1);
		
		List<String> li=a1.stream().map(e->e.toString()).collect(Collectors.toList());
		System.out.println("elements in emp"+ li);
		
		Set<String> hs=a1.stream().map(e->e.toString()).collect(Collectors.toSet());
		System.out.println("elements in emp"+ hs);
		
		long count=a1.stream().count();
		System.out.println(count);
		
	long c=a1.stream().filter(a->a.getEname().startsWith("A")).count();
	System.out.println(c);
	Stream<Emp> nameStarts=a1.stream().filter(a->a.getEname().startsWith("A"));
	System.out.println("Name Start with" + nameStarts);
	
	Object s = a1.stream().collect(Collectors.maxBy(Comparator.comparingInt(w -> w.salary)));
	System.out.println("Emp maximum salary:" + s);
	
	Object s1 = a1.stream().collect(Collectors.minBy(Comparator.comparingInt(w -> w.salary)));
	System.out.println("Emp minimum salary:" + s1);
	
	Object s2 = a1.stream().collect(Collectors.averagingInt(w -> w.salary));
	System.out.println("Emp avg salary:" + s2);
	
	
	//only name will come
	
	List<String> namesofemp =a1.stream().map(n->n.ename).collect(Collectors.toList());
            System.out.println(namesofemp);
          //only designation will come    
            List<String> desofemp =a1.stream().map(n->n.designation).collect(Collectors.toList());
            System.out.println(desofemp);
            
          //only salary will come     
            List<Integer> salaryofemp =a1.stream().map(n->n.salary).collect(Collectors.toList());
            System.out.println(salaryofemp);
            //only name with upper case will come     
            List<String> namesofemp_uppercase =a1.stream().map(n->n.ename.toUpperCase()).collect(Collectors.toList());
            System.out.println(namesofemp_uppercase);
            
            System.out.println("Unic designationwise record");
            Object s4=a1.stream().map(Emp::getDesignation).distinct().forEach(System.out::println); 
            System.out.println(s4);
            
            Object s5 = a1.stream().sorted((e1,e2)->((Emp) e1).getEname().compareTo(((Emp) e2).getEname())).collect(Collectors.toList());
            System.out.println(s5);
            
	
            
            ArrayList<String> name = new ArrayList<>();
    		name.add("Abhi");
    		name.add("Radha");
    		name.add("Anu");
    		name.add("Aniket");
    		name.add("Ashish");
    		name.add("Krishna");

    		// to use multiple function using stream api
    		long count2 = name.stream().filter(a -> a.length() > 4 && a.length() < 7).count();
    		System.out.println("Names length less than 5:...." + count2);

    		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
    		long count1 = strList.stream().filter(x -> x.isEmpty()).count();
    		System.out.println("Count space....." + count1);
    		
    		
    		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
    		List<Integer> squares = num.stream().map(n -> n * n).toList();
//.collect(Collectors.toList());
    		System.out.println(squares);
            
    		//prime no
    	//	static int n = 15;

//    		private static boolean isPrime(int number) {
//    			return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
//    		}
//    		System.out.println("Prime checking...."+isPrime(n));
//    		
//	
		
		
	}

}
