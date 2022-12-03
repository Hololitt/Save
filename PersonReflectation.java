package AdvancedJava.AnotherThemes.JavaReflection;
@Author(author = "Nikon")
public class PersonReflectation {
    private int id;
private String name;

public void enterTheWord(){
    System.out.println(id + " : " + name);
}
public void setId(int id){
    this.id = id;
}
public void setName(String name){
    this.name = name;
}
public int getId(){
    return id;
}
public String getName(){
    return name;
}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
