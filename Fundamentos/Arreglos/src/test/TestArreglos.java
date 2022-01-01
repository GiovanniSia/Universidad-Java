package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 1;
        edades[1] = 2;
        edades[2] = 3;
        //edades[4] = 4; // error
       System.out.println("edades 2= " + edades[1]);
        for(int i=0; i < edades.length;i++){
            System.out.println("edad = " + edades[i]);
        }
    }
}
