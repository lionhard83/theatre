public class User {
    private String name;
    private String surname;
    private int age;
    private String email;

    public User(String param1, String param2, int param3){
        this.name = param1;
        this.surname = param2;
        if (param3 > 0) {
            this.age = param3;
        } else {
            this.age = 30;
        }
    }

    public void setAge(int param) {
        if (param > 0) {
            this.age = param;
        }
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }
}
