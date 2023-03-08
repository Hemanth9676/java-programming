package Strings28;

public class Methods {

	public static void main(String[] args) {
        String s="Software Developer";
        System.out.println(s.length());
        System.out.println("*******************");
        
        System.out.println(s.toUpperCase());
        System.out.println("*******************");
        
        System.out.println(s.toLowerCase());
        System.out.println("*******************");
        
        System.out.println(s.startsWith("soft"));
        System.out.println(s.startsWith("Soft"));
        System.out.println("*******************");
        
        System.out.println(s.endsWith("per"));
        System.out.println("*******************");
        
        System.out.println(s.contains("dev"));
        System.out.println(s.contains("Dev"));
        System.out.println("*******************");
        
        System.out.println(s.concat("in qspiders"));
        System.out.println("*******************");
        
        System.out.println(s.charAt(2));
        System.out.println("*******************");
        
        System.out.println(s.indexOf('S'));
        System.out.println(s.indexOf('D'));
        System.out.println(s.indexOf('e'));
        System.out.println("*******************");
        
       String s1="java";
       String s2="java";
       String s3="Java";
       System.out.println(s1.equals(s2));
       System.out.println(s2.equals(s3));
       System.out.println("*******************");
       
       System.out.println(s2.equalsIgnoreCase(s3));
       System.out.println("*******************");
       
       String a="Hello Hemanth";
       System.out.println(a.substring(3));
       System.out.println(a.substring(3,7));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
