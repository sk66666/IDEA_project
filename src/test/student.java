package test;

public  class student {
    private String name;
    private int xuehao;

    public student() {
    }

    public student(String name, int xuehao) {
        this.name = name;
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    void shout(){
        System.out.println("\uD83C\uDFB6我是"+name+"\uD83C\uDFB6\n\uD83C\uDFB6还有谁\uD83C\uDFB6");
    }
}
 class students extends student {
     public static void main(String[] args) {
         student a=new students();


     }
}
