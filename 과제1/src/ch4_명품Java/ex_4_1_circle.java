package ch4_명품Java;

public class ex_4_1_circle {
    int radius;
    String name;
    
    public ex_4_1_circle(){}
    
    public double getArea() {
       return 3.14*radius*radius;
    }
public static void main(String[]args) {
	ex_4_1_circle pizza;
	pizza = new ex_4_1_circle();
	pizza.radius = 10;
	pizza.name = "자바피자";
	double area = pizza.getArea();
	System.out.println(pizza.name + "의 면적은" + area);
	
	ex_4_1_circle donut = new ex_4_1_circle();
	donut.radius = 2;
	donut.name = "자바도넛";
	area = donut.getArea();
	System.out.println(donut.name + "의 면적은" + area);
}
}