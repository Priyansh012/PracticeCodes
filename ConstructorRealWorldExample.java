class CollegeAdmission{
    String uniqueStudentId, name ;
    int rollnum,age;
    CollegeAdmission(String uniqueStudentId, String name){
        this.uniqueStudentId=uniqueStudentId;
        this.name=name;
    }
    void setRollnum(int rollnum){
        this.rollnum=rollnum;
    }
    void setAge(int age ){
        this.age=age;
    }
    int getRollnum()
    {
        return this.rollnum;
    }
    int getAge()
    {
        return this.age;
    }
    String getUniqueId(){
        return this.uniqueStudentId;
    }
}
public class ConstructorRealWorldExample {
    public static void main(String[] args) {
        CollegeAdmission student1= new CollegeAdmission("ST1480047","Priyansh");
        CollegeAdmission student2= new CollegeAdmission("ST1480055","XYZ");
        System.out.println(student1.getUniqueId());
        System.out.println(student2.getUniqueId());

    }
}