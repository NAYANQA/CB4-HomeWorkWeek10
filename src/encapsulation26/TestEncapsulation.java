package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Bhavesh");
        obj.setRollNo(19);
        obj.setAge(51);

        System.out.println("CodeBuster name :" + obj.getName());
        System.out.println("CodeBuster age :" + obj.getAge());
        System.out.println("CodeBuster rollNo :" + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation

// System.out.println("CodeBuster rollNo : " +obj.geekName);

    }
}
