package com.stackroute.pe3;

import java.util.Scanner;

public class VowelRemover {
    String[]words;
    String[] modifiedWords;
    public VowelRemover(int numberOfWords){
        words=new String[numberOfWords];
        modifiedWords=new String[numberOfWords];
    }
    public void getWords(){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words: ");
        for (int i=0;i<words.length;i++){
            words[i]=sc.nextLine();
        }
    }
    public String[] removeVowels(){
        getWords();
        for (int j=0;j<words.length;j++) {
            modifiedWords[j]="";
            char[] letter=new char[words[j].length()];
            for(int i=0;i<words[j].length();i++){
                letter[i]=words[j].charAt(i);
                if((letter[i]=='a')||(letter[i]=='e')||(letter[i]=='i')||(letter[i]=='o')||(letter[i]=='u'))
                    continue;
                else
                    modifiedWords[j]+=letter[i];
            }
        }
        return modifiedWords;
    }
    public void display(){
        for (int i=0;i<modifiedWords.length;i++){
            System.out.println(modifiedWords[i]);
        }
    }
    public static void main(String[] args){
        VowelRemover vowelRemover=new VowelRemover(5);
        vowelRemover.removeVowels();
        vowelRemover.display();
    }
}
