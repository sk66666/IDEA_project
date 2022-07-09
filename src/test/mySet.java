package test;

public class mySet {
    private int MAXsize=100;
    private String a[]=new String[MAXsize];
    private int size=0;

    public mySet() {
    }
    public void getMAXsize (int MAXsize){
        System.out.println(MAXsize);
    }
    public int getsize(){
        return size;
    }
    public void add(String chars){
        if(isfull()){
            System.out.println("达到上限输入");
        }else {
            if(!issame(chars)){
                a[size++]=chars;
            }
        }
    }
    public void printSet(){
        int count=0;
        for(Object ob:a){
            if(count++>=size){
                break;
            }
            System.out.print("top:"+count);
            System.out.println(ob);
        }
    }
    public boolean isfull(){
        return size==MAXsize-1;
    }
    public boolean issame(String chars){
        int count=0;
        for(Object ob:a ){
            if(count++>size){
                break;
            }
            if(ob==chars){
                return true;
            }

        }
        return false;
    }

}
