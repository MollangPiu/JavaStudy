package campus.solid원칙.ocp;

class 올바른예제 {

    public static void main(String[] args) {
        결제관리interface payManager = null;

        //현금결제, 카드 결제 선택
        결제프로세스 payProcess = new 결제프로세스(new 현금결제()); //현금 결제 선택
        payProcess.결제프로세스();
    }
}

interface 결제관리interface {
    void pay();
}

//신용카드 결제
class 현금결제 implements 결제관리interface {
    @Override
    public void pay() {
        System.out.println("현금 결제");
    }
}

//카드 결제
class 카드결제 implements 결제관리interface {
    @Override
    public void pay() {
        System.out.println("카드 결제");
    }
}

class 결제프로세스 {
    결제관리interface payManager;

    public 결제프로세스(결제관리interface payManager) {
        this.payManager = payManager;
    }

    public void 결제프로세스() {
        payManager.pay();
        System.out.println("결제 프로세스");
    }
}