package cse.basic;

/*
 * Array:
 * CRUD
 * Search
 * Sort
 */

public class Group {
    public static void byValue(float myBmi){
        System.out.println("What i have recieved "+myBmi);
        myBmi-=5;
        System.out.println("What i have updated "+myBmi);
    }
    public static void byRef(float[] arr){
        System.out.println("What i have recieved "+arr[2]);
        arr[2]-=5;
        System.out.println("What i have updated "+arr[2]);
    }
    public static void main(String[] args) {
        // float[] bmis = new float[10];
        float[] bmis = {19.5F,28.9F,35.7F,42.9F,12.6F};
        // Group.byValue(bmis[1]);
        // System.out.println(bmis[1]);
        Group.byRef(bmis);
        System.out.println(bmis[2]);
    }
}
