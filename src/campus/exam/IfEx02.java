package campus.exam;

public class IfEx02 {

    public static void main(String[] args) {
        char chA = 'A';
        char chZ = 'Z';

        int result = 0;
        if(chA < chZ) {
            result += 100;
        } else {
            result += 500;
        }

        System.out.println(result);
    }
}
