package campus.design.builder;

class Main {

    public static void main(String[] args) {
//        Text.Builder builder = new Text.Builder()
//                .setTilte("슈퍼맨")
//                .setContent("미국을 구하다")
//                .setItems("파란색 옷", "빨간색 바지", "슈퍼 파워");

        Text text = new Text.Builder()
                .setTilte("슈퍼맨")
                .setContent("미국을 구하다")
                .setItems("파란색 옷", "빨간색 바지", "슈퍼 파워")
                .build();

        System.out.println(text);
    }
}
