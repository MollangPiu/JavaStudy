package campus.ch10a;

class NewClass {

    public static void main(String[] args) {

        ClassCreate newClass = new ClassCreate();

        newClass.name = "철수";
        newClass.num = 1;

        ClassCreate newClass2 = new ClassCreate();
        newClass2.name = "짱구";
        newClass2.num = 2;


        ClassCreate newClass3 = new ClassCreate();
        newClass3.name = "유리";
        newClass3.num = 3;

        System.out.println("name: "+newClass.name);
        System.out.println("num: "+newClass.num);

        System.out.println("name: "+newClass2.name);
        System.out.println("num: "+newClass2.num);

        System.out.println("name: "+newClass3.name);
        System.out.println("num: "+newClass3.num);


    }
}

class ClassCreate {

    String name;
    int num;
}