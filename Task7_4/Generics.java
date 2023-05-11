package Task7_4;

import java.io.Serializable;

public class Generics<T extends Comparable<T>,V extends Animal & Serializable, K extends Number> {
    T var1;
    V var2;
    K var3;

    public static void main(String args[]){

       Generics obj1 = new Generics("task",new Animal(), 4);
       obj1.getVarClassName();
    }
    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    public Generics(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }
    public void getVarClassName(){
        System.out.println(var1.getClass().getSimpleName()+" "+var2.getClass().getSimpleName()+" "+var3.getClass().getSimpleName());
    }
}
