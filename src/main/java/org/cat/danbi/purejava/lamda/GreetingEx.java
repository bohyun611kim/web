package org.cat.danbi.purejava.lamda;

public class GreetingEx {

    /**
     *
     * Funtional interface Greeting greet() 메서드 실행
     */
    public void  sayHello(Greeting greeting) {
        greeting.greet();
    }

    public void go() {
        // 1. 내부 클래스 생성 구현
        class EngGreeting implements Greeting {

            @Override
            public void greet() {
                System.out.println("Hello!");
            }
        }

        EngGreeting engGreeting = new EngGreeting();
        sayHello(engGreeting);

        // 2. 프랑스 인사는 익명클래스
        Greeting frGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour!");
            }
        };
        sayHello(frGreeting);



        // 3. 스페인 인사는 익명클래스를 직접 넣어준다.
        sayHello(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hola!");
            }
        });

        // 4. 한국어 인사는 람다식을 이용한다.


        sayHello(() -> System.out.println("안녕하세요!"));
    }


    public static void main(String[] args) {

        new GreetingEx().go();
    }

}
