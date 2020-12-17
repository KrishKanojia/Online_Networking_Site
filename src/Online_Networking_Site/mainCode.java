package Online_Networking_Site;

public class mainCode {

	public static void main(String[] args) {
		System.out.println("--------WELCOME TO SOCIAL NETWORKING SITE---------");
        Profile user1 = new Profile();
        Profile user2 = new Profile();
        Profile user3 = new Profile();
        Profile user4 = new Profile();
//        Creating user account
        user1.createProfile("Krish","Krish.kanojia7@gmail.com","Karachi","Pakistan");
//        Displaying user account
        user1.displayProfile(user1);
        user2.createProfile("Harris","Harris.angalo@gmail.com","Melbourne","Australia");
        user3.createProfile("Ibrahim","Ibrahim.Muneer91@gmail.com","Lahore","Pakistan");
        user4.createProfile("Alex","Alex.Micheal4@gmail.com","California","USA");
//        Adding friends
        user1.addFriend(user2,"Hello Harris please accept my friend Request!!!");
        user1.addFriend(user3);
        user1.addFriend(user4);
        user2.addFriend(user3);
//        Displaying user friend list
        user1.showFriends();
//        Removing Friend from user's Friendlist
        user1.removeFriends(user4);
        user1.showFriends();
        String check[] = user1.checkMutualFriends(user2);
        System.out.println("The list of common friends is: ");
        for (int i = 0;i < check.length;i++){
//            if the value is null continue to next value
            if (check[i] == null){
                continue;
            }
            System.out.println("* " + check[i]);
        }
        System.out.println(user1.search(user3));

	}
	}


