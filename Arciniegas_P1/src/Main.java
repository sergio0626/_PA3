import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        int count=1;
        double rightCount=0;
        int q=0;


        String comment = "My string";
        String comment1 = "My string";
        Scanner scnr = new Scanner(System.in);

        int Difficulty;
        int TestType;

        while (q!=100)
        {
            int index=0;

            System.out.println("What level of difficulty do you want 1-4?");
            Difficulty = scnr.nextInt();
            System.out.println("Press 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division or 5 for a mixture of all");



            TestType = scnr.nextInt();
            String [] array= {"*","+", "*","-", "*", "+", "+", "/", "+","*"};

            int x= 0;
            int y=0;
            String Z= "My String";


            if (Difficulty == 1){
                x=9;
                y=1;
            }
            else if( Difficulty == 2){
                x=90;
                y=10;
            }
            else if(Difficulty ==3){
                x=900;
                y=100;
            }
            else if(Difficulty==4){
                x=9000;
                y=1000;
            }




            {

                for (count=0; count<10;count++){

                    switch (TestType) {
                        case 1:
                            Z = "+";
                            break;
                        case 2:
                            Z = "*";
                            break;
                        case 3:
                            Z = "-";
                            break;
                        case 4:
                            Z = "/";
                            break;
                        case 5:
                            Z = array[index];
                            break;
                    }








                    Random SecureRandom = new Random();
                    int randMult1 = SecureRandom.nextInt(x) + y;
                    int randMult2 = SecureRandom.nextInt(x) + y;

                    System.out.print("How much is " + randMult1 + Z + randMult2 + "???   ");


                    index++;


                    {


                        int randCommentcorrect = SecureRandom.nextInt(4)+1;
                        int randCommentincorrect = SecureRandom.nextInt(4)+1;

                        switch (randCommentcorrect) {
                            case 1:
                                comment = "Good Job.";
                                break;
                            case 2:
                                comment = "Excellent.";
                                break;
                            case 3:
                                comment = "Nice!";
                                break;
                            case 4:
                                comment = "Perfect.";
                                break;

                        }
                        switch (randCommentincorrect) {
                            case 1:
                                comment1 = "Try again.";
                                break;
                            case 2:
                                comment1 = "Dont give up, try again.";
                                break;
                            case 3:
                                comment1 = "That is not correct, try again.";
                                break;
                            case 4:
                                comment1 = "Give it another try.";
                                break;

                        }

                        double userMult = scnr.nextDouble();
                        double checkMult=0;
                        final double EPSILON = .5;
                        {if (TestType==1){
                            checkMult = randMult1 + randMult2;

                        }
                        else if (TestType ==2){
                            checkMult = randMult1 * randMult2;

                        }
                        else if (TestType == 3){
                            checkMult = randMult1 - randMult2;
                        }
                        else if (TestType == 4){
                            checkMult = randMult1 / randMult2;}

                        else if (TestType == 5){
                            if (count== 0){
                                checkMult = randMult1 * randMult2;}
                            else if (count== 1){
                                checkMult = randMult1 + randMult2;}
                            else if (count== 2){
                                checkMult = randMult1 * randMult2;}
                            else if (count== 3){
                                checkMult = randMult1 - randMult2;}
                            else if (count== 4){
                                checkMult = randMult1 * randMult2;}
                            else if (count== 5){
                                checkMult = randMult1 + randMult2;}
                            else if (count== 6){
                                checkMult = randMult1 + randMult2;}
                            else if (count== 7){
                                checkMult = randMult1 / randMult2;}
                            else if (count== 8){
                                checkMult = randMult1 + randMult2;}
                            else if (count== 9){
                                checkMult = randMult1 * randMult2;}
                        }



                        }

                        if (Math.abs(checkMult - userMult) < EPSILON){

                            System.out.println(comment);
                            rightCount++;
                            q=1;}


                        else {
                            System.out.println(comment1);

                            q=5;}

                    }


                }

                System.out.println("You got a " + (rightCount)*10 + "%");

                if(rightCount<8){
                    System.out.println("Please ask your teacher for extra help.");
                }
                else{System.out.println("Congratulations, you are ready to go to the next level!");

                }}

        }}



}
