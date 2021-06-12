package com.example.quizconsoleapp2;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class QuizConsoleApp implements Results{
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String args[]) throws Exception
    {
        int count = 0,ans;
        boolean run=true;
        Maths maths = new Maths();
        Java java = new Java();
        while(run)
        {
            int topicNameInput,topicNameLoop;

            ArrayList<String> topicNames = new ArrayList<>();
            topicNames.add("1.Maths");
            topicNames.add("2.Java");

            for(topicNameLoop=0;topicNameLoop<topicNames.size();topicNameLoop++)
            {
                System.out.println(topicNames.get(topicNameLoop));
            }
            Scanner sc = new Scanner(System.in);
            topicNameInput = sc.nextInt();

            Results r1 =  new QuizConsoleApp();

            switch ((topicNameInput))
            {
                case 1:
                {
                    maths.topicName();
                    for(int i=0;i<3;i++)
                    {
                        maths.getQuestions(i);
                        ans = maths.options(i);
                        Instant start = Instant.now();
                        if (ans==1)
                        {
                            r1.onCorrect();
                            Instant finish = Instant.now();
                            long timeElapsed = Duration.between(start, finish).toMillis();
                            System.out.println("Time taken was : "+timeElapsed/1000);
                            count++;
                        }
                        else if(ans==0)
                        {
                            r1.onIncorrect();
                            Instant finish = Instant.now();
                            long timeElapsed = Duration.between(start, finish).toMillis();
                            System.out.println("Time taken was : "+timeElapsed/1000);
                        }
                    }
                    }
                    break;

                case 2:
                {
                    java.topicName();
                    for(int i=0;i<3;i++)
                    {
                        java.getQuestions(i);
                        ans = java.options(i);
                        long start = System.currentTimeMillis();
                        if (ans==1)
                        {
                            r1.onCorrect();
                            long elapsedTime = System.currentTimeMillis() - start;
                            System.out.println("Time taken was : "+elapsedTime);
                            count++;
                        }
                        else if(ans==0)
                        {
                            r1.onIncorrect();
                            long elapsedTime = System.currentTimeMillis() - start;
                            System.out.println("Time taken was : "+elapsedTime);
                        }
                    }
                }

                    break;

                default: {
                    System.out.println("Invalid Choice");
                }


            }
            System.out.println("Your score is :"+count);
            System.out.println("Do you wish to continue?");
            System.out.println("Enter 1 for YES and 2 for NO");
            int response = sc.nextInt();
            if (response==1)
            {
                run=true;
            }
            else if(response==2)
            {
                run=false;
                System.out.println("Your Final Score is :"+count);
            }
            }

        }


    @Override
    public void onCorrect() {
                System.out.println("CORRECT ANSWER !!");

    }

    @Override
    public void onIncorrect() {
                System.out.println("WRONG ANSWER !!");
    }
}


