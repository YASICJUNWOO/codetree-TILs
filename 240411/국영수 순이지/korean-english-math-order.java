import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person>{
    String name;
    int kor;
    int english;
    int math;

    public Person(String name, int kor, int english, int math){
        this.name = name;
        this.kor = kor;
        this.english = english;
        this.math = math;
    }

    @Override
    public int compareTo(Person person){
        if(this.kor==person.kor){

            if(this.english == person.english){
                return person.math -this.math;
            }
            else{
                return person.english - this.english;
            }

        }
        else{
            return person.kor-this.kor;
        }
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] arr = new Person[n];

        for(int i = 0; i<n;i++){
            String name = sc.next();
            int kor = sc.nextInt();
            int english = sc.nextInt();
            int math = sc.nextInt();

            arr[i] =new Person(name, kor, english, math);
        }

        Arrays.sort(arr);

        for(int i =0;i<n;i++){
            System.out.println(arr[i].name+" "+ arr[i].kor+" "+arr[i].english+" "+arr[i].math);
        }


    }
}