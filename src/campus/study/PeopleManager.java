package campus.study;

import java.util.Scanner;

//사람 성함, 나이, 즐겨 타는 대중 교통.
//3명만.
class People {
    private String name;    //성함
    private int age;        //나이
    private String car;     //즐겨타는 대중교통

    public People() {
    }


    public People(String name, int age, String car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
}

class PeopleList {

    People [] arr = new People[3]; // 저장 공간 ( 배열 )
    private int index = 0;  //사람 수 체크(저장 된)




    public int getPeople(Scanner scanner) {
        String name = scanner.next();

        for(int i=0; i < index; i++ ) {
            
            if(arr[i].getName().equals(name)) {
                return i;
            }
        }

        return -1;
    }

    public int getIndex() {
        return index;
    }

    //데이터 저장
    public void setPeople(Scanner scanner) {

        System.out.println("사람의 성함: ");
        String name = scanner.next();

        System.out.println("사람의 나이는: ");
        int age = scanner.nextInt();

        System.out.println("즐겨타는 대중교통은? ");
        String car = scanner.next();

        arr[index] = new People();
        arr[index].setName(name);
        arr[index].setAge(age);
        arr[index].setCar(car);
        index = index+1;
    }

    
    //데이터 불러오기
    public void getPrint() {
        for(int i=0; i< index; i++) {
            getPrint(i);
        }
    }


    //해당 인덱스에 있는 정보만 출력한다.
    public void getPrint(int index) {
        System.out.println("이름은 "+arr[index].getName());
        System.out.println("나이는 "+arr[index].getAge());
        System.out.println("즐겨타는 대중교통은 "+arr[index].getCar());
    }

}


/**
 * 
 */
public class PeopleManager {

    public static void main(String[] args) {
        PeopleList peopleList = new PeopleList();
        Scanner scanner = new Scanner(System.in);




        int check = 0;

        while(true) {

            System.out.println("기능: 1- 입력 / 2- 출력 / 3 - 현재 저장 된 수 / 4- 이름 검색으로 사람의 정보 / 나머지- 종료");
            int num = scanner.nextInt();

            switch(num) {
                case 1:
                    peopleList.setPeople(scanner); //저장 기능
                    break;
                case 2:
                    peopleList.getPrint();  //불러오는 기능
                    break;
                case 3:
                    System.out.println(peopleList.getIndex());
                    break;

                case 4:
                    int index = peopleList.getPeople(scanner);
                    if(index != -1) {
                        peopleList.getPrint(index);
                    }
                    break;


                default:
                    check = 1;  //종료를 구분하는 value, key 값
            }

            //종료구문
            if(check != 0) {
                break;
            }

        }

    }
}
