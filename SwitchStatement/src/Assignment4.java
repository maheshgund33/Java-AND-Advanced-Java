/*  Q4 Take choice from user Show this to user

1.movies 2.Series
What's your interest? Enter your choice 1 or 2:
If user enters 1
Movie you wish to watch today
1.Founder
2. Snowden
3. Jobs 
4. Her
5. Social Network
6. Wall-E 
7.AI
Enter your choice:
2: Snowden
If user enters 2:
Best series to watch
1.Silicon valley
2.Devs 3.the IT crowd
4.Mr Robot
Print users choice
*/

import java.io.*;

class Assignment4{

	public static void main(String args[])throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Whats your interest?"+"\n"+"1Movies"+"\n"+"2.Series");

		System.out.println("Enter Your choice");

		int ch=Integer.parseInt(br.readLine());

		switch(ch){

			case 1:
				{

				System.out.println("Movie you wish to watch today"+"\n"+"1.Founder\n"+"2. Snowden \n3. Jobs \n4. Her\n5. Social Network \n6. Wall-E \n7.AI");
				System.out.println("Enter your choice:");

				int ch1=Integer.parseInt(br.readLine());

				switch(ch1){
					case 1:
						System.out.println("Founder");
						break;
					case 2:
					        System.out.println("Snowden");
					        break;
					case 3:
					        System.out.println("Jobs");
					        break;
					case 4:
					        System.out.println("Her");
					        break;
					case 5: 
					        System.out.println("Social Network");
						break;
					case 6:
					        System.out.println("Wall-E");
						break;
					case 7:
						System.out.println("AI");
						break;
					default:
						System.out.println("Invalid Choice");
						break;
				}
				break;
			}
			case 2:
				{

				System.out.println("Best series you wish to watch today"+"\n"+"1.Silicon valley\n"+"2.Devs\n3. The IT crowd \n4.mr Robot");
                                System.out.println("Enter your choice:");

                                int ch2=Integer.parseInt(br.readLine());

                                switch(ch2){
                                        case 1:
                                                System.out.println("Silicon Valley");
                                                break;
                                        case 2:
                                                System.out.println("Devs");
                                                break;
                                        case 3:
                                                System.out.println("the IT crowd");
                                                break;
                                        case 4:
                                                System.out.println("Mr Robotics");
                                                break;
                                        default:
                                                System.out.println("Invalid Choice");
                                                break;
                                }
				break;
				}
			default:
				System.out.println("Invalid choice");
				break;
		}

	}
}







