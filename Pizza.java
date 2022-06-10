package NIITExams;
import  java.util.Scanner;
		class Pizza {
		void serve() {
		            System.out.println("Pizza is available");
		}};
		class   ChickenPizza   extends    Pizza {
		void   serve(){
	     System.out.println("ChickenTopping for Rs :250");
	     }};
		         
		class    MuttonPizza  extends   ChickenPizza  {
		      void   serve(){
		            System.out.println("MuttonTopping for Rs : 350");
		}};
		

		class  PizzaHut {
		  public   static   void   main(String  args[] ) {
		    Scanner  sc = new  Scanner(System.in);
		    while(true) {
		    	System.out.println("Enter Your Choice 1-3:");
		        System.out.println("1- ChickenPizza Rs. 250");
		    	System.out.println("2- MuttonPizza Rs. 350");
		        System.out.println("3- To Exit");
		          
		        int  ch= sc.nextInt();
		        if(ch==3)
		        	break;
		        
		        Pizza  pz=null;   
		        if(ch==1)
		        	pz = new  ChickenPizza(); 
		        else  if(ch==2) {    
		        	pz = new MuttonPizza();  
		         
		        }
		        pz.serve(); 

		    }
		    sc.close();
		  }};

