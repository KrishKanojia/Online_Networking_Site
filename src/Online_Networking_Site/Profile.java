package Online_Networking_Site;


public class Profile {
	
	    private String name;
	    private String emailId;
	    private String city;
	    private String country;
	    private String[] friendlist = new String[100];
	    private int no_of_friends = 0;


	    public void createProfile(String name1,String emailId1,String city1,String country1){
	        this.name = name1;
	        this.emailId = emailId1;
	        this.city = city1;
	        this.country = country1;
	        System.out.println(name1 + " your id has been created.");
	    }
	    public void displayProfile(Profile profile){
	        System.out.println("Displaying your ID ");
	        System.out.println("Your name : " + profile.name);
	        System.out.println("Your Email Id  : " + profile.emailId);
	        System.out.println("Your City : " + profile.city);
	        System.out.println("Your Country : " + profile.country + " \n");


	    }
	    public void addFriend(Profile profile){

	                friendlist[no_of_friends] = profile.name;
	                no_of_friends++;
	                System.out.println(profile.name + " has been added into friends.");
	    }

	    public void addFriend( Profile profile, String message) {
	        System.out.println("\n"+message);
	        friendlist[no_of_friends] = profile.name;
	        no_of_friends++;

	    }

	    public void removeFriends(Profile profile){
	       for (int i = 0;i < friendlist.length;i++)
	       {
	           if (friendlist[i] == profile.name){

	               friendlist[i] = null;
	               no_of_friends--;
	               System.out.println(profile.name + " is removed from your friends list.");
	           }
	       }

	    }
	    public void showFriends(){
	        System.out.println("Number of Friends you have " + no_of_friends );
	        for (String b: friendlist) {
	            if (b == null){
	                continue;
	            }
	            System.out.println("* " + b);
	        }
	    }
	    public boolean search(Profile profile){
	        for (String b: friendlist) {
	            if (b == profile.name){
	                return true;
	            }

	        }
	        return false;
	    }
	    String[] checkMutualFriends(Profile profile) {
	        String list[] = new String[7];
//	        Checkinng user1 friends with the help of this keyword
	        for (int i = 0; i <  this.no_of_friends; i++) {
	//Checking user2 friend list by using pass by reference
	            for (int j = 0; j < profile.no_of_friends; j++) {

	                if (friendlist[i].equals(profile.friendlist[j])) {
	                    list[j] = profile.friendlist[j];

	                }

	            }
	        }
	        return list;

	    }
	

}
