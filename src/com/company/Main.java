package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.nextLine());
    ArrayList<Integer> a = new ArrayList<>(N);
    String [] a_ = scanner.nextLine().split(" ");
    for (int i =0; i<a_.length; i++){
        a.add(Integer.parseInt(a_[i]));
    }
    int count=0;
    for (int i=1; i<a.size();i++){
        if(a.get(i)> a.get(i - 1)){
            count=count+1;
        }
    }
        System.out.println(count);
    }
    }

