package campus.link;


class StudentList {

    static LinkNode head;
    static LinkNode cur;
    static LinkNode newNode;
    static LinkNode del;

    public static void main(String[] args) {
        StudentList list = new StudentList();
        //head = cur = newNode = new LinkNode();

        System.out.println("run");
        list.add();
        list.add();

        list.print();

    }

    public void add() {

        Student student = new Student();
        student.setNum(1);
        student.setName("홍길동");
        LinkNode linkNode = new LinkNode();
        linkNode.setStudent(student);
        newNode = linkNode;
        cur = head;
        if(head == null) {

            head = cur = linkNode;
        }

        else if(head != null) {
            int i = 0;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }

        System.out.println("실행");
    }

    public void print() {

        cur = head;
        while(cur != null) {
            System.out.print("학생 번호: "+cur.getStudent().getNum()+"\t\t");
            System.out.println("학생 성명: "+cur.getStudent().getName());
            cur = cur.next;
        }
    }
}
