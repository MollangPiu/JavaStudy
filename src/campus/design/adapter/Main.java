package campus.design.adapter;

class Main {

    public static void main(String[] args) {

        Person person = new Person("슈퍼맨", 55);
        PersonAdapter adapter = new PersonAdapter(person);

        System.out.println(adapter.showName());
        System.out.println(adapter.showAge());
    }
}
