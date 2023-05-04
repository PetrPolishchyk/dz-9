public class Man extends Person{

    public Man(String firstName, String lastName, int age, String partner, boolean hasChild) {
        super(firstName, lastName, age, partner, hasChild);
    }

    @Override
    public boolean isRetired() {
        if (getAge() > 65) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean doesHaveManyChildren() {
        if(getChildrenCount() >= 3){
            return true;
        } else {
            return false;
        }
    }
}
