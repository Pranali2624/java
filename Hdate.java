import java.uitl;

public class Hdate {
	int day;
	int month;
	int year;
	void accept(int d,int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
	int getMonth(){
	    return month;
	}
	void putYear(int y){
	    year=y;
	}
	void display()
	{
		System.out.println("Date is: "+day+"/"+month+"/"+year);
	}
	public static void swap(Hdatae d1,Hdatae d2){
		Hdate temp;
		temp;
		;
	}
	public static void main(String[] args) {
		
		Hdate dob=new Hdate();
		dob.accept(1, 3, 2025);
		dob.display();
		//System.out.println("month is:"+dob.getMonth());
		int m=dob.getMonth();
		switch(m)
		{
		    case 1:System.out.println("month is januwary:"); 
		        break;
		    case 2:System.out.println("month is feb:");
		        break;
	    	case 3:System.out.println("month is march:");
		        break;
        	case 4:System.out.println("month is april:");
		        break;
            case 5:System.out.println("month is may:");
		        break;
		    case 6:System.out.println("month is june:");
		        break;
		    case 7:System.out.println("month is januwary:");
		        break;
		    case 8:System.out.println("month is januwary:");
		        break;
		    case 9:System.out.println("month is januwary:");
		        break;
		}
		dob.putYear(2024);
		System.out.println("modified date is:");
		dob.display();
	}
}