package Butter;

public class WriterInfo {
    public static void main(String[] args) {
        Butter butter = new Butter("Good Butter", 100);
        System.out.println(butter.get_name());
        System.out.println(butter.get_information());
    }
}