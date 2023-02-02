public class Author {
    private static String name;
    private static String email;
    private static char gender;

    public Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }

    public static String getName(){
        return name;
    }

    public static String getEmail(){
        return email;
    }

    public void setEmail(String email){
       this.email = email;
    }

    public static char getGender(){
        return gender;
    }

    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
