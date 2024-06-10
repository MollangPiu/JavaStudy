package campus.list;

public class LinkedExam {

    static LinkNode head;
    static LinkNode cur;
    static LinkNode newNode;
    static LinkNode del;

    //node 추가하기
    public void addList(int num) {
        System.out.println("=============");

        newNode = new LinkNode();
        newNode.setData(100);

        if(num == 1) {
            newNode.next = head;
            head = newNode;
        } else {

            cur = head;
            for(int i = 0; i < num-2; i++) {
                cur = cur.next;
            }

            newNode.next = cur.next;
            cur.next = newNode;
        }

    }

    //node 삭제하기
    public void del(int num) {
        System.out.println("del=========");
        cur = head;
        for(int i = 0; i < num-2; i++) {
            cur = cur.next;
        }
        del = cur.next;
        cur.next = del.next;
        del = null;

        System.out.println(cur.getData());
        System.out.println("del=========");

    }

    public void print() {
        cur = head;

        //출력
        while(cur != null) {
            System.out.println(cur.getData());
            cur = cur.next;
        }
    }


    public static void main(String[] args) {
        LinkedExam linkedExam = new LinkedExam();
        head = cur = newNode = new LinkNode();

        newNode.setData(1);
        newNode.next = null;

        //new Node 새로운 추가
        newNode.next = new LinkNode();
        newNode.next.setData(2);
        newNode.next.next = null;

        newNode.next.next = new LinkNode();
        newNode.next.next.setData(3);
        newNode.next.next.next = null;

        newNode.next.next.next = new LinkNode();
        newNode.next.next.next.setData(4);
        newNode.next.next.next.next = null;

        newNode = new LinkNode();
        newNode.next = head;
        head =newNode;

        newNode.setData(5);

        linkedExam.print();


        linkedExam.addList(2);

        System.out.println("===========");
        linkedExam.print();

        System.out.println("===========");
        linkedExam.del(2);
        linkedExam.print();
    }
}

