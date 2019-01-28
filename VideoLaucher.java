import java.util.Scanner;

public class VideoLaucher {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int choice;
		VideoStore videoStore=new VideoStore();
		do {
				System.out.println("MAIN MENU \n=========");
				System.out.println("1. Add Videos:");
				System.out.println("2. Check Out Video:");
				System.out.println("3. Return Video:");
				System.out.println("4. Receive Rating:");
				System.out.println("5. List Inventory:");
				System.out.println("6. Exit:");
				System.out.print("Enter your choice(1..6): ");
				
				choice=input.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter the name of the video you want to add: ");
					videoStore.addVideo(input.next());
					break;
				case 2:
						System.out.print("Enter the name of the video you want to check out: ");
						videoStore.doCheckout(input.next());
						break;
				case 3:
					System.out.print("Enter the name of the video you want to Return:");
					videoStore.doReturn(input.next());;
					break;
				case 4:
					System.out.println("Enter the name of the video you want to Rate: ");
					videoStore.receiveRating(input.next(), input.nextInt());
					break;
				case 5:
					videoStore.listInventory();
					break;
				case 6:
					System.err.println("Enter ...!! Thanks for using the application");
					System.exit(1);
					break;
				}
		}while(!(choice==6));		
				input.close();
	}
}
