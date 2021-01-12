package project.BehavioralDP;

import java.util.Scanner;

public class CollectionImpl implements Collection{


    String inputArr [] = {"Dog", "Cat", "Rat", "Moose", "Goose", "Gorilla", "Antelope","Bear"};
    @Override
    public Iterator getIterator(){
        return new Itr();
    }
    private class Itr implements Iterator{
        int index = 0;
        @Override
        public boolean hasNext(){
            if(index < inputArr.length)
                return true;
            return false;
        }
        @Override
        public Object next(){
            if(this.hasNext())
                return inputArr[index++];
            return false;
        }
    }
}