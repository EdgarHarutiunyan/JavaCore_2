import java.util.HashSet;
import java.util.Set;
public class SetProblem {
    static class User {
        private String name;
        private int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public boolean equals(Object obj) {
            User u = (User) obj;
            if (this == obj) {
                return true;
            } else if (age == u.getAge() || name.equals(u.getName())) {
                return true;
            }
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return name.hashCode() + age;
            //return super.hashCode();
        }
    }

    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User("Max", 27));
        users.add(new User("Veronika", 20));
        users.add(new User("Denis", 30));
        users.add(new User("Max", 27));

        if (users.size() == 3) {
            System.out.println("System works well!");
        } else {
            for (User u: users) {
                System.out.println(u.getName());
            }
            throw new RuntimeException("Users set size should be 3!");
        }
    }
}