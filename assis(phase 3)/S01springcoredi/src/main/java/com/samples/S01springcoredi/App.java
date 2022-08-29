package com.samples.S01springcoredi;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//create the spring container
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
       
        Employee emp = (Employee) springContainer.getBean("emp"); 
        System.out.println(emp);
//     Employee em1 = new Employee();
//     em1.setId(10);
//     em1.setName("x");

   //  Hospital hospital = (Hospital) springContainer.getBean("hospital");
  //   System.out.println(hospital);
     
     
//     CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
//     System.out.println(dealer);
     
    // Customer customer = (Customer) springContainer.getBean("customer");
     //System.out.println(customer);
       
    //   ShoppingCart shoppingcart=(ShoppingCart) springContainer.getBean("shoppingcart");
    //   System.out.println(shoppingcart);
       
 //  	AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S01springcoredi/SpringConfig.xml");
//	Patient patient = (Patient) springContainer.getBean("patient");
//	System.out.println(patient);
//	springContainer.registerShutdownHook();
    }
}

