# 유하영_202130222

# 3월 29일
    ● 실수 리터럴
        소수점 현태나 지수 형태로 표현한 실수
        실수 타입 리터럴은 double타입으로 컴파일
        숫자 뒤에 f(float)나 d(double)를 명시적으로 붙이기도 함

    ● 문자 리터럴
        단일 인용부호(' ') 로 문자 표현
            -\u 다음에 4자리 16진수로, 2바이트의 유니코드
            -'a', 'W', '가', '*', '3', '7', '글'
        특수문자 리터럴은 백슬래시로(\) 시작

● 기본 타입 이외 리터럴
    null 리터럴
        레퍼런스에 대입 사용

    문자열 리터럴(스트링 리터럴)
        - 이중 인용부호로 묶어 표현
        -문자열 리터럴은 String 객체로 자동 처리


● 상수
    상수 선언
        - final 키워드 사용
        - 선언시 초기값 지정
        - 실행 중 값 변경 불가


● var 키워드
    Java 10부터 도입
    기존의 변수 선언 방식: 변수의 타입 반드시 지정

    var 키워드
        -타입을 생각하고 변수 선언 가능
        -컴파일러가 추론 하여 변수 타입 결정
            변수 선언시 초기값이 주어지지 않으면 컴파일 오류
        

    Scanner 클래스



    ● 증감 연산
         -1 증가 혹은 감소 시키는 연산

    ● 대입 연산
        -연산의 오른쪽 결과는 왼쪽 변수에 대입

    ● 비교 연산, 논리 연산
        - 비교 연산자:두 개의 값을 비교하여 true/false 결과
        - 논리 연산자:두 개의 논리 값에 논리 연산. 논리 결과

    ● 조건 연산
        - 3 개의 피연산자로 구성된 삼항(ternary) 연산자
            opr1?opr2:opr3
            opr1이 true이면, 연산식의 결과는 opr2, false이면 opr3

        - if-else을 조건 연산자로 간결하게 표현 가능

    ● 비트 연산
        - 비트 논리 연산
            비트 끼리  AND OR XOR NOT 연산
            피 연산자의 각 비트들을 대상으로 하는 연산

        - 비트  시프트 연산
            비트를 오른쪽이나 왼쪽으로 이동

 ●  단순 if문 if-else문
 ●  다중 if-else문
    -조건문이 너무 많은 경우, switch문 사용 권장

●  switch문 case문

●  case문의 값
    - 문자, 정수, 문자열, 리터럴(JDK 1.7부터)만 허용
    - 실수 리터럴은 허용되지 않음


●  반복문
    - 자바 반복문 : for문, while문, do-while문
        for문 - 가장 많이 사용하는 반복문.

●  자바 배열
    배열(array)
        -인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
            배열을 이용하면 한 번에 많은 메모리 공간 선언 가능
        -배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
            원소 데이터들이 순차적으로 저장
            인덱스를 이용하여 원소 데이터 접근
            반복문을 이용하여 처리하기에 적합한 자료구조
        -배열 인덱스
            0부터 시작
            인덱스는 배열의 시작 위치에서부터 데이터가 있는 상대 위치

●  배열 선언 및 생성 디테일
    -배열 선언과 배열 생성의 두 단계 필요.
    -배열 선언
        배열의 이름 선언(배열 레퍼런스 변수 선언)

        int intArray[]; 또는 int[] intArray;
        int intArray[5]; //크기 지정 안 됨

    -배열 생성
        배열 공간 할당 받는 과정

        int intArray = new int[5]; 또는 int intArray[] = new int[5]; //선언과 동시에 배열 생성

    -배열 초기화
        배열 생성자 값 초기화

        int intArray[] = {4,3,2,1,0};
        double doubleArray[] = {0.01,0.02,0.03,0.04};

●  배열의 크기, length 필드
    -자바의 배열은 객체로 처리
        배열 객체의 length 필드
            배열의 크기는 배열 객체의 length 필드에  저장


# 3월 22일

자바의 특징(1)

● 플랫폼 독립성
    - 하드웨어 운영체제에 종속되지 않는 바이트 코드로 플랩폼 독립성

● 객체지향
    - 캡슐화, 상속, 다형성 지원

● 클래스로 캡슐화
    - 자바의 모든 변수나 함수는 클래스 내에 선언
    - 클래스 안에서 클래스(내부 클래스) 작성 가능
 
● 소스(java)와 클래스(class) 파일
    - 하나의 소스 파일에 여러 클래스를 작성 가능
    - 소스 파일의 이름과 public으로 선언된 클래스 이름은 갈아야 함
    - 클래스 파일에는 하나의 클래스만 존재.


자바의 특징(2)

● 실행 코드 배포
-구성
    >한 개의 class 파일 또는 다수의 class 파일로 구성
    >여러 폴더에 걸쳐 다수의 클래스 파일로 구성된 경우 : jar 압축 파일로 배포

-자바 응용 프로그램의 실행은 main() 메소드에서 시작
    >하나의 클래스 파일에 두 개 이상의 main() 메소드가 있을 수 없음

● 패키지
    -서로 관련 있는 여러 클래스를 패키지로 묶어 관리
    -패키지는 폴더 개념

● 멀티스레드
    -여러 스레드의 동시 수행 환경 지원
        >자바는 운영체제의 도움 없이 자체적으로 멀티스레드 지원
        >C/C++ 프로그램은 멀티스레드를 위해 운영체제 API를 호출

● 가비지 컬렉션
    -자바 언어는 메모리 할당 기능은 있어도 메모리 반환 기능 없음
        사용하지 않는 메모리는 자바 가상 기계에 의해 자동 반환 – 가비지 컬렉션

자바의 특징(3)

● 실시간 응용 프로그램에 부적합
    -실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문.

● 자바 프로그램은 안전
    -타입 체크 엄격
    -물리적 주소를 사용하는 포인터 개념 없음

● 프로그램 작성 쉬움
    -포인터 개념이 없음
    -동적 메모리 반환하지 않음
    -다양한 라이브러리 지원

● 실행 속도 개선을 위한 JIT 컴파일러 사용
    -자바는 바이트 코드를 인터프리터 방식으로 실행
        >기계어가 실행되는 것보다 느림
    -JIT 컴파일 기법으로 실행 속도 개선
        >JIT 컴파일 – 실행 중에 바이트 코드를 기계어 코드로 컴파일하여 기계어를 실행하는 기법

식별자(identifier)

● 식별자란?
    -클래스, 변수, 상수, 메소드 등에 붙이는 이름
    -식별자의 원칙


● 대소문자 구별
    -int barChart 와 barchart는 서로 다른 식별자 선언

문자열
    -문자열은 기본 타입이 아님
    -String 클래스로 분자열 포현
        >문자열 리터럴 - "JDK", "한글", "계속하세요"
        >문자열이 섞인 + 연산 -> 문자열 연결

변수와 선언
    -변수
        프로그램 실행 중에 값을 임시 저장하기 위한 공간
    -변수 선언
        데이터 타입에서 정한 크기의 메모리 할당

리터럴과 정수 리터럴
    리터럴
        프로그램에서 직접 표현한 값
        점수 실수 문자 논리 문자열 리터럴 있음
    점수 리터럴
        10진수 8진수 16진수 2진수 리터럴
    점수 리터럴은 int형으로 컴파일
    long 타입 리터럴은 숫자 뒤에 L 또는 l을 붙여 표시

# 3월15일

# 내용
# (최신 수업내용이 위로 올라가는 순서로)