package campus.ch11;

class Animal {
    public void print() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    public void cry() {
        System.out.println("This is a dog");
    }
}

class Cat extends Animal {
    public void cry() {
        System.out.println("This is a cat");
    }

    @Override
    public void print() {
        System.out.println("This is Cat");
    }
}

class MainClass02 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        myDog.print();
        myDog.cry();
        myCat.print();
        myCat.cry();
    }
}
