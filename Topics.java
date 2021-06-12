package com.example.quizconsoleapp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class Topics {
    int answerInput;
    abstract String topicName();
    abstract int getQuestions(int l);

    int checkAnswer(int i ,int ans)
    {
        if (i==ans)
        {
            return 1;
        }
        else
        {
            return 0;
        }

    }
    abstract int options(int i);

}



class Maths extends Topics
{
    int ans=0;
    @Override
    String topicName() {
        System.out.println("You have chosen MATHS");
        return null;
    }

    @Override
    int getQuestions(int l)
    {

        ArrayList<String> questions = new ArrayList<String>();
        questions.add("What is 2+2?");
        questions.add("What is 5+5?");
        questions.add("What is 2*3?");
        System.out.println(questions.get(l));
        return 0;
    }




    @Override
    int options(int i) {
        int ans1=0;

        if(i==0)
        {
            ArrayList<String> answerSerial = new ArrayList<String>();
            answerSerial.add("1");
            answerSerial.add("2");
            answerSerial.add("3");
            answerSerial.add("4");
            Collections.shuffle(answerSerial);
            for(int k=0;k<4;k++)
            {
                System.out.println((k+1)+". "+answerSerial.get(k));
            }
            Scanner qm = new Scanner(System.in);
            answerInput = qm.nextInt();
            answerInput=answerInput-1;
            ans1 = answerSerial.indexOf("4");

        }
        if(i==1)
        {
            ArrayList<String> answerSerial = new ArrayList<String>();
            answerSerial.add("5");
            answerSerial.add("6");
            answerSerial.add("7");
            answerSerial.add("10");
            Collections.shuffle(answerSerial);
            for(int k=0;k<4;k++)
            {
                System.out.println((k+1)+". "+answerSerial.get(k));
            }
            Scanner qm = new Scanner(System.in);
            answerInput = qm.nextInt();
            answerInput=answerInput-1;
            ans1 = answerSerial.indexOf("10");


        }
        if(i==2)
        {
            ArrayList<String> answerSerial = new ArrayList<String>();
            answerSerial.add("3");
            answerSerial.add("4");
            answerSerial.add("5");
            answerSerial.add("6");
            Collections.shuffle(answerSerial);
            for(int k=0;k<4;k++)
            {
                System.out.println((k+1)+". "+answerSerial.get(k));
            }
            Scanner qm = new Scanner(System.in);
            answerInput = qm.nextInt();
            answerInput=answerInput-1;
            ans1 = answerSerial.indexOf("6");

        }
        return(checkAnswer(answerInput,ans1));
    }
}

class Java extends Topics {
    int ans = 0;

    @Override
    String topicName() {
        System.out.println("You have chosen JAVA");
        return null;
    }

    @Override
    int getQuestions(int l) {
        ArrayList<String> questions = new ArrayList<String>();
        questions.add("What is one of the main concepts of JAVA?");
        questions.add("What type of a language is JAVA?");
        questions.add("What was the original name of JAVA?");
        for (int i = 0; i < 3; i++)
        {
            System.out.println(questions.get(i));
            options(i);
            return ans;

        }
        return 0;
    }


    @Override
    int options (int i){
        {
            int ans1 = 0;
            if(i==0)
            {
                ArrayList<String> answerSerial = new ArrayList<String>();
                answerSerial.add("Abstraction");
                answerSerial.add("Line by Line Programming");
                answerSerial.add("All of the above");
                answerSerial.add("None of the above");
                Collections.shuffle(answerSerial);
                for (int k = 0; k < 4; k++) {
                    System.out.println((k + 1) + ". " + answerSerial.get(k));
                }
                Scanner qm = new Scanner(System.in);
                answerInput = qm.nextInt();
                answerInput = answerInput - 1;
                ans1 = answerSerial.indexOf("Abstraction");

            }
            if (i == 1) {
                ArrayList<String> answerSerial = new ArrayList<String>();
                answerSerial.add("OOPL");
                answerSerial.add("POPL");
                answerSerial.add("All of the above");
                answerSerial.add("None of the above");
                Collections.shuffle(answerSerial);
                for (int k = 0; k < 4; k++) {
                    System.out.println((k + 1) + ". " + answerSerial.get(k));
                }
                Scanner qm = new Scanner(System.in);
                answerInput = qm.nextInt();
                answerInput = answerInput - 1;
                ans1 = answerSerial.indexOf("OOPL");

            }
            if (i == 2) {
                ArrayList<String> answerSerial = new ArrayList<String>();
                answerSerial.add("Oak");
                answerSerial.add("Pine");
                answerSerial.add("All of the above");
                answerSerial.add("None of the above");
                Collections.shuffle(answerSerial);
                for (int k = 0; k < 4; k++) {
                    System.out.println((k + 1) + ". " + answerSerial.get(k));
                }
                Scanner qm = new Scanner(System.in);
                answerInput = qm.nextInt();
                answerInput = answerInput - 1;
                ans1 = answerSerial.indexOf("Oak");

            }

            return (checkAnswer(answerInput, ans1));
        }

    }
}