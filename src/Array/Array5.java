package Array;

import java.util.Scanner;

class Productionhouse {
    long arr[][][] ;
    long arr1[];
    long total_revenue;
    long total_investemnet;
    long prev_profit;
    int lang;
    int cat;
    int mov;
    
    Scanner sc=new Scanner(System.in);

    void initalization() {
    	
    	System.out.println("Enter the total investemnet for the fy 2023-24 by sanjana:");
    	total_investemnet = sc.nextLong();
    	
    	System.out.println("Enter the profit for the 2022-23 for sanjan:");
    	prev_profit=sc.nextLong();
    	System.out.println("=====================");
    	System.out.println("fy 2023-34 date collecting");
    	
    	System.out.println("Enter language count: ");
    	lang=sc.nextInt();
    	
    	System.out.println("Enter category count: ");
    	cat=sc.nextInt();
    	
    	System.out.println("Enter movies count: ");
    	mov=sc.nextInt();
        arr = new long[lang][cat][mov];
        arr1=new long[lang];
        
        System.out.println("Array is created..");
       
    }

    
    void collectionmovieRevenue() { 
    	long temp=0;
        System.out.println("Collecting the revenue made by each movie : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("collecting data for Language no = " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("collecting data for Category no = " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the revenue by movie no" + (k + 1));
                    arr[i][j][k] = sc.nextLong();
                    temp=temp+arr[i][j][k];
                    total_revenue=total_revenue+arr[i][j][k];       
                }
            }
            arr1[i]=temp;
            temp=0;
        }
        System.out.println("=============================================");
    }

  
    void displayProduction() {
        System.out.println("Displaying the revenue made by each movie:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dispalying data for Language no = " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Displaying data for Category no = " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("The revenue by movie no" + (k+1)+" is= "+arr[i][j][k]);
                	}
                }
        }
        System.out.println("=====================================");
        System.out.println("Dispalying the revenue made by each language:");
        for(int i=0;i<arr1.length;i++) {
        	System.out.println("The evenue made by language no : "+(i+1)+" is ="+arr1[i]);        	
        }
        System.out.println("===========================================");
        
        System.out.println("The overall revenue made in fy 2023-24 is="+total_revenue);
    }
    
    void checkProfitLoss() {
    	long Profit;
    	long loss;
    	if(total_revenue>total_investemnet) {
    		System.out.println("Sanjana is on the profit side of the investemnet ");
    		Profit=total_revenue-total_investemnet;
    		System.out.println("Compring the profit of previous year with current year :");
    		if(Profit>prev_profit) {
    			System.out.println("Sanjana has made a profit of"+(Profit-prev_profit)+"during 2023-24");
    			}
    		else {
    			System.out.println("sajana has made less profit of "+(prev_profit-Profit)+"during 2023-24");
    			}
    		}
    	else {
    		System.out.println("Sanjana is on the loss side of the investement");
    		loss=total_investemnet-total_revenue;
    	}
    	System.out.println("=============================================");
    	}
    }

public class Array5{
	public static void main(String[] args) {
		Productionhouse p1=new Productionhouse();
		p1.initalization();
		p1.collectionmovieRevenue();
		p1.displayProduction();
		p1. checkProfitLoss();
	}
}
