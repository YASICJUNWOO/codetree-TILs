import java.util.*;

class Student{
    String name;
    int score1;
    int score2;
    int score3;

    public Student(String name, int score1, int score2, int score3){
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] arr = new Student[n];

        for(int i = 0 ;i<n;i++){
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            arr[i] = new Student(name, score1, score2, score3);
        }

        Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return (s1.score1 + s1.score2 + s1.score3) - (s2.score1 + s2.score2 + s2.score3);
            }
        });

        for(int i =0 ;i<n;i++){
            System.out.println(arr[i].name + " "+ arr[i].score1+" "+ arr[i].score2+" "+arr[i].score3);
        }
    }
}