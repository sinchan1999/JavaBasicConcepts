package basicTemplates;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

}

public class getterSetter {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        emp.setName("SINCHAN PANDA");
        System.out.println(emp.getName());
        emp.setId(271999);
        System.out.println(emp.getId());

    }
}
