import java.util.Scanner;
import java.util.Arrays;

class Person{
    String name;
    int tall;
    int weight;

    public Person(String name, int tall, int weight){
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] arr = new Person[n];

        for(int i = 0;i<n;i++){
            String name = sc.next();
            int tall = sc.nextInt();
            int weight = sc.nextInt();

            arr[i] = new Person(name, tall, weight);
        }

        Arrays.sort(arr,(a,b) -> a.tall - b.tall);

        
        for(int i = 0;i<n;i++){
            System.out.println(arr[i].name+" "+arr[i].tall+" "+ arr[i].weight);
        }
    }
}