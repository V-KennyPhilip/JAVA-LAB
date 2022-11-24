import java.util.Scanner;

class student {
	String usn;
	int marks[]=new int[5];
	int credits[]= new int[5];
	String name;

	void input() {
		System.out.println("Enter the usn:");
		Scanner sc = new Scanner(System.in);
		usn=sc.next();
		System.out.println("Enter the name:");
		name=sc.nextLine();
		String usn =sc.nextLine();
		System.out.println("Enter the marks of each subject");
			for(int i=0;i<5;i++)
			 {
			 	marks[i]=sc.nextInt();
			 }
		System.out.println("Enter the credits of each subject");
			for(int i=0;i<5;i++)
			 {
			 	credits[i]=sc.nextInt();
			 }
				 }
		void output()
		 {
		 	System.out.println("Name: "+name);
			System.out.println("USN: "+usn);
				for(int i=0;i<5;i++)
				 {
					System.out.println("Marks of subject_"+(i+1)+" = "+marks[i]);
					System.out.println("credits of subject_"+(i+1)+" = "+credits[i]);
				 }
		 }
		void cgpa()
		 {
			int cred[]= new int[5];
			int sgpa=0;
			int sum=0;
			float res;
				for(int i=0;i<5;i++)
				 {
					if(marks[i]>=90)
						cred[i]=10;
					else if(marks[i]>=80)
						cred[i]=9;
					else if(marks[i]>=70)
						cred[i]=8;
					else if(marks[i]>=60)
						cred[i]=7;
					else if(marks[i]>=50)
						cred[i]=6;
					else if(marks[i]>=40)
						cred[i]=5;
					else if(marks[i]>=35)
						cred[i]=4;
					else if(marks[i]<35 && marks[i]>=0)
						cred[i]=0;
					else
						System.out.println("Invalid marks");
					sgpa+=(cred[i]*credits[i]);
					sum+=credits[i];
				 }
			res=(float)sgpa/sum;
			System.out.println("SGPA = "+res);
		 }
}
	class sgpa {
		public static void main(String args[]) {
			student kp = new student();
				kp.input();
				kp.output();
				kp.cgpa();
	}
}
