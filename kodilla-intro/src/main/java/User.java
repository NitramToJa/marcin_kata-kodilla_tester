public class User {


    public static void main(String[] args) {
        String userName;
        int userAge;

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};
    }

    public double ageAverage() {
        int result = 0;
        for (int i = 0; i < users.size; i++) {
            result += users[i]; usersAge;
        }
        return result / users.size;

    }

    public void youngerThenAverage() {
        for (int i = 0; i < users.size; i++) {
            if (users[i],userAge<ageAverage ){
                System.out.println(users[i]);
                else
            }
        }
    }
}