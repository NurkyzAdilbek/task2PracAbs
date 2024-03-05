public class Mentor extends Info{
    private Group group;

    public Mentor(String name, String gender, String email, Group group) {
        super(name, gender, email);
        this.group = group;
    }






    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    public String searchByMentorEmail(String email){
        if(email.equals(getEmail())){
            return "Mentor{" +
                    "name='" + getName() + '\'' +
                    ", gender='" + getGender() + '\'' +
                    ", email='" + getEmail() + '\'' +
                    "group=" + group +
                    '}';
        }

        return null;
    }
    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", email='" + getEmail() + '\'' +
                "group=" + group +
                '}';
    }




    public Group getAllStudentsOfMentor(String name){
        if (name.equals(getName())){
            return group;
        }
        return null;
    }

}
