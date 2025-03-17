package campus.solid원칙.ocp;

class 잘못된예제 {

    public static void main(String[] args) {
        결제관리 payProcess = new 결제관리();
        payProcess.결제프로세스(1);
    }
}

class 결제관리 {
    public void 결제프로세스(int typeCnt) {
        if(typeCnt == 0) {
            System.out.println("현금 결제");
        }
        else if(typeCnt == 1) {
            System.out.println("카드 결제");
        }

        System.out.println("결제 프로세스");
    }
}
