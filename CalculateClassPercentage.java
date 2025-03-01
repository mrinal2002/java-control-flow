import java.util.Scanner;

public class CalculateClassPercentage {

    public static double getPercentage(int physicsScore, int chemistryScore,int mathScore){
        double percentage=(double)(physicsScore+chemistryScore+mathScore)/3;
        return percentage;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your physics score : ");
        int physicsScore=sc.nextInt();
        System.out.println("Enter your chemistry score : ");
        int chemistryScore=sc.nextInt();
        System.out.println("Enter your math score : ");
        int mathScore=sc.nextInt();
        
        double getPercentage=getPercentage(physicsScore,chemistryScore,mathScore);

        if(getPercentage>=80){
            System.out.println("Grade : A ");
            System.out.println("Remarks : Level 4, above agency-normalized standards");
            System.out.println("Average Marks : "+getPercentage);
        }
        else if(getPercentage<=79 && getPercentage>=70){
            System.out.println("Grade : B ");
            System.out.println("Remarks : Level 3, agency-normalized standards");
            System.out.println("Average Marks : "+getPercentage);
        }
        else if(getPercentage<=69 && getPercentage>=60){
            System.out.println("Grade : C ");
            System.out.println("Remarks : Level 2, below but approching agency-normalized standards");
            System.out.println("Average Marks : "+getPercentage);
        }
        else if(getPercentage<=59 && getPercentage>=50){
            System.out.println("Grade : D ");
            System.out.println("Remarks : Level 1, well below agency-normalized standards");
            System.out.println("Average Marks : "+getPercentage);
        }
        else if(getPercentage<=49 && getPercentage>=40){
            System.out.println("Grade : E ");
            System.out.println("Remarks : Level 1-, too below agency-normalized standards");
            System.out.println("Average Marks : "+getPercentage);
        }
        else{
            System.out.println("Grade : R ");
            System.out.println("Remarks : Remedial standards");
            System.out.println("Average Marks : "+getPercentage);
        }
    }
}