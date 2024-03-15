package Test;

public class Static {
    public static void main(String[] args) {

//        Myclass.myFueld = 3;
//        Myclass.myMethod();
//        Myclass.myFueld++;
//        Myclass.myMethod();

//        Myclass myclass = new Myclass();
//        myclass.myFueld = 6;
//        myclass.myMethod();
//        Myclass myclass1 = new Myclass();
//        myclass1.myFueld ++;
//        myclass1.myMethod();
//    }
        Myclass myclass = new Myclass();
        Myclass myclass1 = new Myclass();
        Myclass myclass2 = new Myclass();
        System.out.println(Myclass.numberOfInstances);
    }
}

        class Myclass {
            public static int numberOfInstances = 0;

            public Myclass() {

                numberOfInstances++;

            }
        }




