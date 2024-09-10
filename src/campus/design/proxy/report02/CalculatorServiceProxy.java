package campus.design.proxy.report02;

// 원격 서비스를 위한 프록시
public class CalculatorServiceProxy implements CalculatorService {
    private CalculatorService calculatorService;

    public CalculatorServiceProxy() {
        this.calculatorService = new CalculatorServiceImpl();  // 실제 서비스 객체 초기화
    }

    @Override
    public double add(double a, double b) {
        if (checkAccess()) {
            double result = calculatorService.add(a, b);
            logRequest("add", a, b);
            return result;
        } else {
            throw new IllegalStateException("Access Denied");
        }
    }

    @Override
    public double subtract(double a, double b) {
        if (checkAccess()) {
            double result = calculatorService.subtract(a, b);
            logRequest("subtract", a, b);
            return result;
        } else {
            throw new IllegalStateException("Access Denied");
        }
    }

    private boolean checkAccess() {
        // 네트워크 연결 상태나 사용자 인증 등을 확인
        System.out.println("Access is granted");
        return true;
    }

    private void logRequest(String method, double a, double b) {
        // 요청을 로깅
        System.out.println("Request: " + method + " with " + a + ", " + b);
    }
}
