package test;public class test8 {
    public static void main(String[] args) {
        char c='\0';
        for(int i=1;i<=4;i++){
            switch(i){
                case 1:c='k'; System.out.print(c);
                case 2:c='e'; System.out.print(c); break;
                case 3:c='p'; System.out.print(c);
                default: System.out.print("!");
            }
        }
    }
}
