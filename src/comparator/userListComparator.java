package comparator;

import java.util.ArrayList;
import java.util.List;

public class userListComparator {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Jack", 17));
        userList.add(new User("Jack", 15));
        userList.add(new User("Aily", 13));
        userList.add(new User("Bily", 13));
        userList.add(new User("Bily", 14));

        userList.sort((user1, user2) -> {
            if(user1.getName().equals(user2.getName())){
                return user1.getAge() - user2.getAge();
            }else{
                return user1.getName().compareTo(user2.getName());
            }
        });
        for (User user : userList) {
            System.out.println(user.getName()+":"+user.getAge());
        }
    }
}
