import java.util.Random;
import java.util.Scanner;
/**
 * Created by Eva on 21/12/2016.
 */
public class Calendar {
    private String[] days;
    private String[] subjects;
    private String[] day = {"Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private int daysss;


    public Calendar(int d, int subj, String nameSubj){
        Scanner sc = new Scanner(nameSubj);
        sc.useDelimiter(";");
        daysss = d;
        days = new String[d];
        subjects = new String[subj+1];
        int i = 0;
        while(sc.hasNext()){
            subjects[i] = sc.next();
            i++;
        }
        subjects[subj]="Procastinate";
        generate();
    }
    public void generate(){
        int di = days.length;
        int num = 0;
        while(num < di){
            Random rnd = new Random();
            int number = rnd.nextInt(subjects.length);
            days[num] = subjects[number];
            num++;
        }
    }
    public void printTable(){
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < daysss; i++){
            if(i%7 == 0 && i != 0){
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
            }
            System.out.print(day[i%7] + ": " + days[i] + " || ");

        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
    }

}