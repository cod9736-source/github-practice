> 학습 원본 보존 문서. 개인 프로젝트 성과나 전체 코드의 직접 작성 사실을 주장하지 않음.
> 출처: [.기초수업](https://app.notion.com/p/36cddb1a637780758fd2f1a040247136), 원본 행 7174–9054.

# 파이썬

<details>

<summary>기초 단계</summary>

![](../assets/31dd0ca0819977785414.png)
![](../assets/002db38903f10b6ae74b.png)
# 기초 코드
![](../assets/d4b41b6c9c423e40cd8b.png)

</details>

<details>

<summary>진수모음</summary>

![](../assets/52845d0071948bd3635f.png)

| 클래스 | 첫 번째 숫자 범위 | 기본 마스크 |
| --- | --- | --- |
| A Class(에이 클래스) | `1 ~ 126` | `/8` |
| B Class(비 클래스) | `128 ~ 191` | `/16` |
| C Class(씨 클래스) | `192 ~ 223` | `/24` |

![](../assets/f4497ef4f553c03629ba.png)

<details>

<summary>참고영상</summary>

[진법변환 10진수에서 2진수로 — 원본 참고 링크](https://app.notion.com/p/36cddb1a637780758fd2f1a040247136#36dddb1a63778050974fdebc570f9cdc)
[2진수를 10진수로 변환하는 방법 — 원본 참고 링크](https://app.notion.com/p/36cddb1a637780758fd2f1a040247136#36dddb1a6377809e8728ed81a093e7f8)
[2진수로 빠르게 바꾸는 법 — 원본 참고 링크](https://app.notion.com/p/36cddb1a637780758fd2f1a040247136#36dddb1a6377802e86bcc40495c706c1)
[16진수를 10진수로 변환 — 원본 참고 링크](https://app.notion.com/p/36cddb1a637780758fd2f1a040247136#36dddb1a63778058bd49f01befc633ef)

</details>

</details>

<details>

<summary>python(파이썬)</summary>

![](../assets/18858fe64de1c6225d27.png)

![](../assets/e8c74e66b0393c7cd2c1.png)
하드웨어에게 “이렇게 움직여라”라고 시키는 프로그램들.

| 소프트웨어 | 역할 | 하드웨어 |
| --- | --- | --- |
| **예)윈도우 11** | 컴퓨터 전체를 관리하는 기본 운영체제 | 컴퓨터를 구성하는 물체 |

![](../assets/815fd561318dfa4a2aac.png)

![](../assets/3091297f0719c33ba02b.png)
![](../assets/cbbddc67b21ae246327b.png)

<details>

<summary>기초용어</summary>

| 분류 | 용어 / 코드 | 발음 | 뜻 | 예시 | 핵심 주의점 |
| --- | --- | --- | --- | --- | --- |
| 출력 | `print()` | 프린트 | 화면에 값을 보여주는 출력 함수 | `print("안녕")` | 결과를 눈으로 보려면 사용 |
| 입력 | `input()` | 인풋 | 사용자에게 값을 입력받는 함수 | `name = input("이름: ")` | 입력값은 기본적으로 문자열 `str`(스트링) |
| 변환 | `int()` | 인트 | 정수로 바꾸기 | `int("123")` → `123` | 소수 문자열 `"10.5"`는 바로 안 됨 |
| 변환 | `float()` | 플로트 | 소수 숫자로 바꾸기 | `float("3.14")` → `3.14` | `10`을 넣어도 `10.0` |
| 변환 | `str()` | 스트링 | 문자열로 바꾸기 | `str(123)` → `"123"` | 숫자 자리 인덱싱할 때 자주 씀 |
| 자료형 | `int` | 인트 | 정수 | `10`, `123`, `-5` | 인덱싱 불가 |
| 자료형 | `float` | 플로트 | 소수 | `3.14`, `10.0` | 인덱싱 불가 |
| 자료형 | `str` | 스트링 | 문자열, 글자 | `"hello"` | 인덱싱 가능 |
| 자료형 | `list` | 리스트 | 여러 값을 순서대로 담는 자료 | `[1, 2, 3]` | 수정 가능 |
| 자료형 | `tuple` | 튜플 | 여러 값을 순서대로 담지만 수정 불가 | `(1, 2, "a")` | 인덱싱 가능, 값 변경 불가 |
| 자료형 | `dictionary` | 딕셔너리 | `key`(키)-`value`(밸류)로 저장 | `{"name": "철수"}` | 번호가 아니라 키로 꺼냄 |
| 자료형 | `set` | 세트 | 중복 없는 값 묶음 | `{1, 2, 3}` | 순서 개념 약함 |
| 자료형 | `bool` | 불 | 참/거짓 자료형 | `True`, `False` | 조건문에서 자주 씀 |
| 불리언 | `True` | 트루 | 참, 맞다, 켜짐 | `10 > 3` → `True` | 첫 글자 대문자 |
| 불리언 | `False` | 폴스 | 거짓, 아니다, 꺼짐 | `10 < 3` → `False` | 첫 글자 대문자 |
| 불리언 | `not` | 낫 | 참/거짓을 반대로 바꿈 | `not True` → `False` | “아니다” 느낌 |
| 값 없음 | `None` | 논 | 값이 없음 | `a = None` | `0`, `False`, `""`와 다름 |
| 변수 | `variable` | 베어리어블 | 값을 담는 상자 | `x = 10` | 변수 이름은 직접 정함 |
| 변수 | `area` | 에어리어 | 넓이를 담을 때 자주 쓰는 변수명 | `area = w * h` | 명령어가 아니라 변수 이름 |
| 딕셔너리 | `key` | 키 | 값을 찾는 이름표 | `"name"` | 딕셔너리 안에서 사용 |
| 딕셔너리 | `value` | 밸류 | 키에 저장된 실제 값 | `"철수"` | `{"name": "철수"}`에서 `"철수"` |
| 위치 | `index` | 인덱스 | 위치 번호 | `a[0]` | 파이썬은 0부터 시작 |
| 위치 | `indexing` | 인덱싱 | 인덱스로 값을 꺼내는 것 | `"abc"[1]` → `"b"` | 같은 글자도 자리별로 따로 셈 |
| 리스트 기능 | `append()` | 어펜드 | 리스트 맨 뒤에 값 추가 | `a.append(4)` | 위치 지정 불가 |
| 리스트 기능 | `insert()` | 인서트 | 원하는 위치에 값 끼워 넣기 | `a.insert(1, 99)` | 기존 값은 뒤로 밀림 |
| 리스트 기능 | `remove()` | 리무브 | 특정 값을 찾아 삭제 | `a.remove("star")` | 인덱스가 아니라 값 기준 |
| 리스트 기능 | `pop()` | 팝 | 인덱스 번호로 삭제 | `a.pop(2)` | 삭제한 값을 변수로 받을 수도 있음 |
| 리스트 기능 | `sort()` | 소트 | 리스트 오름차순 정렬 | `a.sort()` | 원본 리스트 자체가 바뀜 |
| 리스트 기능 | `sorted()` | 소티드 | 정렬된 새 리스트 만들기 | `b = sorted(a)` | 원본은 그대로 |
| 리스트 기능 | `reverse()` | 리버스 | 현재 순서를 그대로 뒤집기 | `a.reverse()` | 정렬 아님, 단순 반전 |
| 리스트 옵션 | `reverse=True` | 리버스 트루 | 정렬 방향을 반대로 함 | `a.sort(reverse=True)` | 내림차순 정렬 |
| 문자열 | `" "` | 더블 쿼트 | 문자열 선언 | `"안녕"` | 한 줄 문자열 기본 추천 |
| 문자열 | `' '` | 싱글 쿼트 | 문자열 선언 | `'안녕'` | 문자열 안에 `"`가 있을 때 편함 |
| 문자열 | `""" """` | 트리플 더블 쿼트 | 여러 줄 문자열 | `"""안녕\n하세요"""` | 줄바꿈 포함 가능 |
| 문자열 | `''' '''` | 트리플 싱글 쿼트 | 여러 줄 문자열 | `'''안녕'''` | 여러 줄 가능 |
| 문자열 | `quote` | 쿼트 | 따옴표, 인용부호 | `"`, `'` | 정확히는 `quotation mark`(쿼테이션 마크) |
| 문자열 꾸미기 | `f-string` | 에프 스트링 | 문자열 안에 변수값 넣기 | `f"이름은 {name}"` | 앞에 `f` 없으면 `{name}` 그대로 나옴 |
| 문자열 꾸미기 | `{}` | 중괄호 | 에프 스트링 안 변수 자리 | `f"{name}"` | 인덱스용 아님 |
| 수학 | `import math` | 임포트 매쓰 | 수학 도구함 불러오기 | `import math` | 보통 코드 맨 위 |
| 수학 | `math.pi` | 매쓰 파이 | 원주율 | `math.pi` | `3.14`보다 정확 |
| 수학 | `math.sqrt()` | 매쓰 스퀘어 루트 | 제곱근, 루트 | `math.sqrt(16)` → `4.0` | `import math` 필요 |
| 조건문 | `if` | 이프 | 만약 조건이 맞으면 실행 | `if a > 10:` | 조건 필요 |
| 조건문 | `elif` | 엘리프 | 그게 아니고 다른 조건이면 | `elif a > 5:` | 위에 `if`가 있어야 함 |
| 조건문 | `else` | 엘스 | 위 조건이 전부 아니면 | `else:` | 조건 붙이면 안 됨 |
| 반복문 | `for` | 포 | 정해진 대상에서 하나씩 꺼내 반복 | `for x in list:` | 반복 대상이 있을 때 좋음 |
| 반복문 | `while` | 와일 | 조건이 참인 동안 계속 반복 | `while a < 5:` | 조건이 안 바뀌면 무한 반복 위험 |
| 반복문 | `in` | 인 | 안에서 하나씩 꺼냄 / 포함 확인 | `for x in a:` | `"a" in word`도 가능 |
| 반복문 | `range()` | 레인지 | 숫자 범위 만들기 | `range(5)` | `0~4`, 5는 포함 안 됨 |
| 논리 연산자 | `and` | 앤드 | 둘 다 참이어야 참 | `a >= 90 and a <= 100` | 범위 조건에 자주 씀 |
| 논리 연산자 | `or` | 오어 | 둘 중 하나만 참이어도 참 | `a < 0 or a > 100` | 조건 범위가 넓어짐 |
| 논리 연산자 | `not` | 낫 | 결과 반전 | `not is_login` | `True ↔ False` |
| 연산자 | `+` | 플러스 | 더하기 / 문자열 붙이기 | `1+3`, `"안녕"+"하세요"` | 문자열끼리는 이어붙임 |
| 연산자 | `-` | 마이너스 | 빼기 | `10 - 3` | 숫자 계산 |
| 연산자 | `*` | 스타 / 곱하기 | 곱하기 / 반복 | `3*4`, `"안녕"*3` | 문자열·리스트 반복 가능 |
| 연산자 | `/` | 슬래시 | 일반 나누기 | `11 / 3` | 결과가 소수형 |
| 연산자 | `//` | 더블 슬래시 | 몫 | `11 // 3` → `3` | 나눗셈의 몫만 |
| 연산자 | `%` | 퍼센트 | 나머지 | `11 % 3` → `2` | 나눴을 때 남는 값 |
| 연산자 | `**` | 더블 스타 | 거듭제곱 | `2 ** 3` → `8` | 제곱 |
| 연산자 | `=` | 이퀄 | 오른쪽 값을 왼쪽 변수에 저장 | `x = 10` | 수학의 같다와 다름 |
| 비교 연산자 | `==` | 더블 이퀄 | 같다 비교 | `pw == attempt` | 조건문에서 비교할 때 |
| 비교 연산자 | `!=` | 낫 이퀄 | 같지 않다 | `pw != "python"` | 다르면 참 |
| 비교 연산자 | `<` | 레스 댄 | 작다 | `a < 8` | 비교 결과는 불리언 |
| 비교 연산자 | `>` | 그레이터 댄 | 크다 | `a > 100` | 비교 결과는 불리언 |
| 비교 연산자 | `<=` | 레스 댄 오어 이퀄 | 작거나 같다 | `a <= 19` | 이하 |
| 비교 연산자 | `>=` | 그레이터 댄 오어 이퀄 | 크거나 같다 | `a >= 90` | 이상 |
| 괄호 | `()` | 소괄호 | 함수 실행 / 묶기 | `print()`, `input()` | 실행은 `()` |
| 괄호 | `[]` | 대괄호 | 리스트 만들기 / 인덱싱 | `[1,2,3]`, `a[0]` | 순서와 꺼내기 |
| 괄호 | `{}` | 중괄호 | 딕셔너리 / 세트 / 에프 스트링 | `{"name":"철수"}` | 인덱스에는 안 씀 |
| 주석 | `#` | 샵 | 실행 안 되는 설명 | `# 설명` | 파이썬이 무시 |
| 스타일 | `PEP 8` | 펩 에이트 | 파이썬 코드 스타일 규칙 | `a = 10` | 실행 규칙이 아니라 보기 좋게 쓰는 기준 |
| 영어 표현 | `of` | 오브 | “\~의” | `index of list` | 파이썬 기본 명령어 아님 |
| 이스케이프 | `\n` | 백슬래시 엔 | 줄바꿈, New Line(뉴 라인) | `"안녕\n하세요"` | 자주 씀 |
| 이스케이프 | `\t` | 백슬래시 티 | 수평 탭, Horizontal Tab(호리즌털 탭) | `"이름\t나이"` | 자주 씀 |
| 이스케이프 | `\\` | 백슬래시 백슬래시 | 백슬래시 자체 출력 | `"C:\\Users"` | 경로 쓸 때 |
| 이스케이프 | `\'` | 백슬래시 싱글 쿼트 | 작은따옴표 출력 | `'I\'m'` | 문자열 안 `'` |
| 이스케이프 | `\"` | 백슬래시 더블 쿼트 | 큰따옴표 출력 | `"그가 \"안녕\""` | 문자열 안 `"` |
| 이스케이프 | `\r` | 백슬래시 알 | Carriage Return(캐리지 리턴), 줄 맨 앞으로 | `"abc\r12"` | 거의 안 씀 |
| 이스케이프 | `\f` | 백슬래시 에프 | Form Feed(폼 피드), 페이지 넘김 제어 | `"a\fb"` | 거의 안 씀 |
| 이스케이프 | `\a` | 백슬래시 에이 | Bell / Alert(벨 / 얼럿), 경고음 | `"경고\a"` | 환경 따라 소리 안 날 수 있음 |
| 이스케이프 | `\b` | 백슬래시 비 | Backspace(백스페이스) | `"abc\bde"` | 출력 환경 따라 다름 |
| 이스케이프 | `\000` | 백슬래시 제로제로제로 | Null Character(널 캐릭터) | `"A\000B"` | 화면에는 보통 안 보임 |
| 이스케이프 | `\xhh` | 백슬래시 엑스 | 16진수 문자 코드 | `"\x41"` → `A` | 고급 쪽 |
| 이스케이프 | `\uXXXX` | 백슬래시 유 | 유니코드 4자리 | `"\uAC00"` → `가` | 유니코드 |
| 이스케이프 | `\UXXXXXXXX` | 백슬래시 대문자 유 | 유니코드 8자리 | `"\U0001F600"` → 😀 | 이모지 가능 |
| 이스케이프 | `\N{name}` | 백슬래시 엔 네임 | 유니코드 이름 문자 | `"\N{BLACK HEART SUIT}"` → ♥ | 거의 안 씀 |
|  | sep= | 셉 |  |  |  |
|  | 대문자 | 상수 |  | 변하지 않는 변수 |  |

<details>

<summary>표 요약본</summary>

| 분류 | 용어 / 코드 | 발음 | 뜻 | 예시 | 핵심 주의점 |
| --- | --- | --- | --- | --- | --- |
| 출력 | `print()` | 프린트 | 화면에 값을 보여주는 출력 함수 | `print("안녕")` | 결과를 눈으로 보려면 사용 |
| 입력 | `input()` | 인풋 | 사용자에게 값을 입력받는 함수 | `name = input("이름: ")` | 입력값은 기본적으로 문자열 `str`(스트링) |
| 변환 | `int()` | 인트 | 정수로 바꾸기 | `int("123") → 123` | 소수 문자열 `"10.5"`는 바로 안 됨 |
| 변환 | `float()` | 플로트 | 소수 숫자로 바꾸기 | `float("3.14") → 3.14` | `10`을 넣어도 `10.0` |
| 변환 | `str()` | 스트링 | 문자열로 바꾸기 | `str(123) → "123"` | 숫자 자리 인덱싱할 때 자주 씀 |
| 자료형 | `int` | 인트 | 정수 | `10`, `123`, `-5` | 인덱싱 불가 |
| 자료형 | `float` | 플로트 | 소수 | `3.14`, `10.0` | 인덱싱 불가 |
| 자료형 | `str` | 스트링 | 문자열, 글자 | `"hello"` | 인덱싱 가능 |
| 자료형 | `list` | 리스트 | 여러 값을 순서대로 담는 자료 | `[1, 2, 3]` | 수정 가능 |
| 자료형 | `tuple` | 튜플 | 여러 값을 순서대로 담지만 수정 불가 | `(1, 2, "a")` | 인덱싱 가능, 값 변경 불가 |
| 자료형 | `dictionary` | 딕셔너리 | `key`(키)-`value`(밸류)로 저장 | `{"name": "철수"}` | 번호가 아니라 키로 꺼냄 |
| 자료형 | `set` | 세트 | 중복 없는 값 묶음 | `{1, 2, 3}` | 순서 개념 약함 |
| 자료형 | `bool` | 불 | 참/거짓 자료형 | `True`, `False` | 조건문에서 자주 씀 |
| 불리언 | `True` | 트루 | 참, 맞다, 켜짐 | `10 > 3 → True` | 첫 글자 대문자 |
| 불리언 | `False` | 폴스 | 거짓, 아니다, 꺼짐 | `10 < 3 → False` | 첫 글자 대문자 |
| 불리언 | `not` | 낫 | 참/거짓을 반대로 바꿈 | `not True → False` | “아니다” 느낌 |
| 값 없음 | `None` | 논 | 값이 없음 | `a = None` | `0`, `False`, `""`와 다름 |
| 변수 | `variable` | 베어리어블 | 값을 담는 상자 | `x = 10` | 변수 이름은 직접 정함 |
| 변수 | `area` | 에어리어 | 넓이를 담을 때 자주 쓰는 변수명 | `area = w * h` | 명령어가 아니라 변수 이름 |
| 딕셔너리 | `key` | 키 | 값을 찾는 이름표 | `"name"` | 딕셔너리 안에서 사용 |
| 딕셔너리 | `value` | 밸류 | 키에 저장된 실제 값 | `"철수"` | `{"name": "철수"}`에서 `"철수"` |
| 위치 | `index` | 인덱스 | 위치 번호 | `a[0]` | 파이썬은 0부터 시작 |
| 위치 | `indexing` | 인덱싱 | 인덱스로 값을 꺼내는 것 | `"abc"[1] → "b"` | 같은 글자도 자리별로 따로 셈 |
| 리스트 기능 | `append()` | 어펜드 | 리스트 맨 뒤에 값 추가 | `a.append(4)` | 위치 지정 불가 |
| 리스트 기능 | `insert()` | 인서트 | 원하는 위치에 값 끼워 넣기 | `a.insert(1, 99)` | 기존 값은 뒤로 밀림 |
| 리스트 기능 | `remove()` | 리무브 | 특정 값을 찾아 삭제 | `a.remove("star")` | 인덱스가 아니라 값 기준 |
| 리스트 기능 | `pop()` | 팝 | 인덱스 번호로 삭제 | `a.pop(2)` | 삭제한 값을 변수로 받을 수도 있음 |
| 리스트 기능 | `sort()` | 소트 | 리스트 오름차순 정렬 | `a.sort()` | 원본 리스트 자체가 바뀜 |
| 리스트 기능 | `sorted()` | 소티드 | 정렬된 새 리스트 만들기 | `b = sorted(a)` | 원본은 그대로 |
| 리스트 기능 | `reverse()` | 리버스 | 현재 순서를 그대로 뒤집기 | `a.reverse()` | 정렬 아님, 단순 반전 |
| 리스트 옵션 | `reverse=True` | 리버스 트루 | 정렬 방향을 반대로 함 | `a.sort(reverse=True)` | 내림차순 정렬 |
| 수학 | `import math` | 임포트 매쓰 | 수학 도구함 불러오기 | `import math` | 보통 코드 맨 위 |
| 수학 | `math.pi` | 매쓰 파이 | 원주율 | `math.pi` | `3.14`보다 정확 |
| 수학 | `math.sqrt()` | 매쓰 스퀘어 루트 | 제곱근, 루트 | `math.sqrt(16) → 4.0` | `import math` 필요 |
| 시간 | `import time` | 임포트 타임 | 시간 도구함 불러오기 | `import time` | `time.sleep()` 쓰려면 먼저 필요 |
| 시간 | `time.sleep()` | 타임 슬립 | 지정한 초만큼 프로그램 멈추기 | `time.sleep(3)` | 괄호 안 숫자는 초 단위 |
| 조건문 | `if` | 이프 | 만약 조건이 맞으면 실행 | `if a > 10:` | 조건 필요 |
| 조건문 | `elif` | 엘리프 | 그게 아니고 다른 조건이면 | `elif a > 5:` | 위에 `if`가 있어야 함 |
| 조건문 | `else` | 엘스 | 위 조건이 전부 아니면 | `else:` | 조건 붙이면 안 됨 |
| 반복문 | `for` | 포 | 정해진 대상에서 하나씩 꺼내 반복 | `for x in list:` | 반복 대상이 있을 때 좋음 |
| 반복문 | `while` | 와일 | 조건이 참인 동안 계속 반복 | `while a < 5:` | 조건이 안 바뀌면 무한 반복 위험 |
| 반복문 | `in` | 인 | 안에서 하나씩 꺼냄 / 포함 확인 | `for x in a:` | `"a" in word`도 가능 |
| 반복문 | `range()` | 레인지 | 숫자 범위 만들기 | `range(5)` | `0~4`, 5는 포함 안 됨 |
| 반복 제어 | `continue` | 컨티뉴 | 이번 반복만 건너뛰고 다음 반복으로 이동 | `if i == 3: continue` | 반복문은 계속 진행됨 |
| 반복 제어 | `break` | 브레이크 | 반복문을 완전히 종료 | `if i == 3: break` | 반복 자체가 끝남 |
| 논리 연산자 | `and` | 앤드 | 둘 다 참이어야 참 | `a >= 90 and a <= 100` | 범위 조건에 자주 씀 |
| 논리 연산자 | `or` | 오어 | 둘 중 하나만 참이어도 참 | `a < 0 or a > 100` | 조건 범위가 넓어짐 |
| 논리 연산자 | `not` | 낫 | 결과 반전 | `not is_login` | `True ↔ False` |
| 기본 함수 | `min()` | 민 | 여러 값 중 최솟값 구하기 | `min(10, 20, 3) → 3` | 리스트에도 사용 가능 |
| 기본 함수 | `max()` | 맥스 | 여러 값 중 최댓값 구하기 | `max(10, 20, 3) → 20` | 리스트에도 사용 가능 |

</details>

![](../assets/de76deeaf4505a94ab53.png)

![](../assets/5921686349cfb71fa9f4.png)
![](../assets/7b8dcc6fde461a76932f.png)
![변수는 한개의 값만 들어갈수있다.](../assets/744d0a7389f58d377542.png)

<details>

<summary>변수 예시</summary>

![](../assets/595ff9c38b905bb23712.png)

</details>

![](../assets/38836948be48ae81178b.png)
![아무 이름이 변수명이 될수는 없다.(스테이크 기법=you_name 카넬 기법=meName)](../assets/ec3ad6951c32eb131fa7.png)
![](../assets/e8c111553e2f2395599d.png)
![](../assets/5c831a290c0674582838.png)
![파이썬에서는 큰따음표로 양쪽을 둘러싸야한다.](../assets/29b8743d757a584f5e5b.png)
![](../assets/def57b5cda0d156719cb.png)

<details>

<summary>예시)</summary>

![](../assets/80ff584edd9c233c4bf4.png)

</details>

<details>

<summary>기초문법 이스케이프 코드</summary>

![](../assets/855ac080183da766b972.png)
![](../assets/c88c060ecfe31ac30747.png)
![()=매개변수(인수.인자.파라미터)](../assets/e9ed574a5c3feef5bdb0.png)

<details>

<summary>함수</summary>

> **함수 = 자주 쓰는 작업을 이름 붙여서 저장해놓은 명령 묶음**
이렇게 보면 돼. 🧠
## 1. 현실 비유로 설명
예를 들어 네가 매일 아침마다 이런 행동을 한다고 해봐.
```text
일어나기
세수하기
양치하기
옷 입기
나가기
```
이걸 매번 길게 말하기 귀찮잖아?
그래서 이 전체 행동을 그냥 \*\*“아침 준비”\*\*라고 이름 붙이는 거야.
```text
아침 준비 = 일어나기 + 세수하기 + 양치하기 + 옷 입기 + 나가기
```
프로그래밍의 함수도 똑같아.
```text
defmorning():
print("일어나기")
print("세수하기")
print("양치하기")
print("옷 입기")
print("나가기")
```
이제부터는 `morning()`만 쓰면 저 명령들이 한 번에 실행돼.
---
## 2. 파이썬 함수 기본 모양
```text
def함수이름():
실행할코드
```
예시:
```text
defhello():
print("안녕하세요")
```
이건 **함수를 만든 것**이야.
그런데 만든다고 바로 실행되지는 않아.
실행하려면 이렇게 불러야 해.
```text
hello()
```
결과:
```text
안녕하세요
```
---
## 3. 함수는 “만드는 것”과 “실행하는 것”이 다름
이게 초보 때 제일 중요해.
```text
defhello():
print("안녕하세요")
```
여기까지는 **함수 정의**야.
쉽게 말하면 **설명서 만든 것**.
```text
hello()
```
이건 **함수 호출**이야.
쉽게 말하면 **실제로 실행한 것**.

| 구분 | 뜻 |
| --- | --- |
| 함수 정의 | 함수를 만들어놓음 |
| 함수 호출 | 만들어놓은 함수를 실행함 |

---
## 4. 괄호 `()`가 중요한 이유
함수는 보통 이름 뒤에 괄호가 붙어.
```text
hello()
```
여기서 `()`는 \*\*“이 함수 실행해라”\*\*라는 뜻이야.
```text
hello
```
이렇게 괄호 없이 쓰면 보통 함수 자체를 가리키는 거고, 실행은 안 돼.
---
## 5. 값을 넣는 함수: 매개변수
함수는 안에 값을 넣어서 실행할 수도 있어.
```text
defgreet(name):
print(name+"님 안녕하세요")
```
실행:
```text
greet("철수")
```
결과:
```text
철수님 안녕하세요
```
여기서 `name`은 함수 안으로 들어오는 값이야.

| 용어 | 쉬운 뜻 |
| --- | --- |
| 매개변수 | 함수가 받을 값의 이름 |
| 인자 | 실제로 넣어주는 값 |

예를 들면:
```text
defgreet(name):
print(name+"님 안녕하세요")

greet("철수")
```
여기서:

| 부분 | 의미 |
| --- | --- |
| `name` | 매개변수 |
| `"철수"` | 인자 |

---
## 6. 값을 돌려주는 함수: `return`
함수는 계산 결과를 돌려줄 수도 있어.
```text
defadd(a,b):
returna+b
```
실행:
```text
result=add(3,5)
print(result)
```
결과:
```text
8
```
여기서 `return`은 **결과를 밖으로 돌려준다**는 뜻이야.
`print()`랑 `return`은 다르다. 이거 중요함.

| 구분 | 뜻 |
| --- | --- |
| `print()` | 화면에 보여주기만 함 |
| `return` | 결과값을 밖으로 넘겨줌 |

예시:
```text
defadd(a,b):
print(a+b)

x=add(3,5)
```
이건 화면에는 `8`이 보일 수 있지만, `x`에는 제대로 된 계산값이 저장되지 않아.
반면:
```text
defadd(a,b):
returna+b

x=add(3,5)
```
이건 `x`에 `8`이 저장돼.
---
## 7. 진짜 핵심 정리
```text
defadd(a,b):
returna+b
```
이 코드를 사람 말로 번역하면:
```text
add라는 함수를 만들겠다.
이 함수는 a와 b라는 값을 받는다.
그리고 a+b 결과를 돌려준다.
```
사용하면:
```text
print(add(10,20))
```
결과:
```text
30
```
## 한 줄 결론
**함수는 반복해서 쓸 코드를 하나의 이름으로 묶어놓은 것이다.**
그리고 함수는 보통 **입력값을 받고 → 처리하고 → 결과를 돌려주는 구조.**

</details>

![\*=곱하기 (숫자는 숫자끼리 문자는 문자끼리만 취급을한다.)](../assets/b7db859412317b4e5419.png)
숫자 -정수(integer) -실수(float) -문자열(string) (문자열끼리 더할수있다.)
![(#=한줄주석 “”” “””) (여러줄 주석=””” “”’) # inqut()으로 입력받은 값은 항상 문자열로 저장](../assets/b0a669dfc9b2c64c1441.png)

</details>

</details>

<details>

<summary>인덱스</summary>

![](../assets/2c89ce160135e21811ab.png)
![변수명을 쓰고 내가 원하는 단어에 인덱스를 써준다.  (문자열은 일부만 수정할수 없다.)](../assets/77dfe1f2e45443345b0d.png)
![변수명\[시작인덱스:끝인덱스\]](../assets/d8e58ee91313522729cc.png)
![](../assets/2b1a149f0a0e5e18a1aa.png)
![](../assets/a31672ee90ac7f60fee3.png)

<details>

<summary>리스트</summary>

![](../assets/654181c3e2202c0fbace.png)
![리스트란?: 변수안에 \[\]를 넣고 여러개의 값을 모을 수 있는 것.( 순서가 존재한다:인덱스)](../assets/a3a418fb65a7fb0ac7ca.png)
![핵심!:대중적으로는 2중 리스트까지만 사용.](../assets/e816db1448acc8acc8f4.png)

<details>

<summary>설명 자료</summary>

![](../assets/97229aa53a1671546a65.png)
![](../assets/5020d7552b375c02c1cd.png)
![](../assets/ef33ffddeed1ef83819e.png)
리스트를 자르면 리스트다.
![리스트는 리스트끼리만 더하거나 곱할수있다.](../assets/93a172c587674f187b55.png)
![리스트는 수정이 용이하다.](../assets/438f5a218b57b0b9ceeb.png)

</details>

![삭제 명령어.](../assets/8c47edf8ac2554e30473.png)

<details>

<summary>튜플(tuple)</summary>

특징\[ 리스트와 같지만 수정이 불가능하다.()하면 튜플\]
![변조 불가능.(읽기전용 파일이나 변경하면 안되는 것이나 보안이 필요할떄.)](../assets/c5351daa6d0a736a5e18.png)
![](../assets/1566434e30f2e947c9dd.png)

</details>

<details>

<summary>딕셔너리(dictionary)</summary>

<details>

<summary>한방정리.</summary>

![](../assets/10a94655c831e3e92e1a.png)

</details>

특징:\{”키”:”밸류”\}     꺼낼 때는:\[”name”\] 꺼낼 떄는\[\]써야 한다.<br>\{\}쓰면 딕셔너리
```text
person= {
"name":"철수",
"age":20
}
```
`{}` 중괄호로 만들었고, 안에 `key: value`(키 밸류) 구조가 있으니까 딕셔너리야.
```text
"name" 이름표 = "철수"
"age" 이름표 = 20
```
![key가 중복돼서는 안된다.(가격을 넣을떄 용이하다.)(딕셔너리는 인덱스가 존재x key로value를 구분한다](../assets/414fb656df72be1b2252.png)
![](../assets/c547059a1c8be7bbc6ed.png)
![](../assets/a6e93330f76e3ec41e59.png)
![](../assets/0b156302e18563055005.png)
![](../assets/f8ddbba24aefe7144ead.png)
![](../assets/f3bb0bf2ab168dd7bf14.png)
![](../assets/6f84d40bf5602abb8ddd.png)

</details>

<details>

<summary>집합 (set)</summary>

![인덱스가 존재하지않는다.\{\}사용.](../assets/08a790ede8e3a08db2d3.png)
![교집합: & 합집합:shift+\\  차집합: difference()](../assets/8ded55ea16251654aef7.png)

</details>

<details>

<summary>불리안(boolean)</summary>

![True와Fslse 에 T와F는 항상 대문자로 써야한다.](../assets/cd59559299fc9252391b.png)
![](../assets/d6263a0146f0d46d1119.png)
![](../assets/ab1cfd841794ea16462c.png)
![(asd연산자)비교연산자보다 물리연산자보다 우선순위가 높다](../assets/7ce2203e1f28c03fe4be.png)
![or연산자](../assets/e4650ef85eb56b30c7a1.png)
![연산자 정리표.](../assets/9eb1ec4944b94fd9551b.png)
![and(앞부분이 틀리면 뒤를 읽지않음.) or연산(앞이 맞거나 틀려도 뒤가 다를수있다.)not연산자(true를false로 바꾼다.](../assets/00f5b11d089923dae164.png)

</details>

<details>

<summary>복습</summary>

![list와 fuple은 인덱스가 존재한다.](../assets/1485ff75c53454d0e203.png)
![](../assets/90a3fb086002e724c922.png)
**if age \< 0 or age \> 150:<br>  print("올바른 나이를 입력하세요.(0세\~150세)")<br>else:<br>  # 정상 나이 입력시<br>  # 나이에 따른 요금 계산<br>  if age \< 8:<br>    price = 450<br>  elif age \<= 19:<br>    price = 720<br>  else:<br>    price = 1250<br>  print(f"지하철 요금은 \{price\}원 입니다.")**
![](../assets/66a5c63291f08d38cdc6.png)
![](../assets/3657e81a507f5d685ab4.png)

</details>

<details>

<summary>제어문(if, elif, else)</summary>

![](../assets/40906f1a288f87dc795a.png)
![if=만약 뭐뭐라면\~](../assets/a38421d2613c14b7b932.png)
![](../assets/51f2300fed04a53cef91.png)
![](../assets/d65ce5d2aec2fbbcc226.png)

![](../assets/487e1263334ed286b984.png)
![](../assets/afa2ee6ed04364e7bee2.png)
![논리연산자를 쓰면 간결해진다  예): and,or](../assets/fee88b7b91de7dc7ac67.png)
![min=최소값](../assets/34cd255c8c1124c6a5d1.png)

</details>

<details>

<summary>for문</summary>

![횟수가 정해져있을때 사용(for). 횟수가 정해지지않을때(while)](../assets/60b01810c2fac96202db.png)
![](../assets/bc5b6f8cc8797f67e38b.png)

<details>

<summary>포문 예제)</summary>

![](../assets/b6b1874c53e750808038.png)
![](../assets/d3bf2f252683ba71c990.png)
![](../assets/53e7c0f0235bdc2a8f15.png)
![](../assets/5f0db96dd1e7ffe5d180.png)

</details>

<details>

<summary>range(레인지 함수)</summary>

레인지 함수(특징):((시작값),(끝값뺴고),(간격))
![](../assets/25633dc7f439d2f6b055.png)
![](../assets/736324dcd411ba9d49c3.png)
![](../assets/7c8b30393b148b200131.png)
![](../assets/ada5a28a389dcca7fcb7.png)
![](../assets/d985bae38a544bf565ec.png)
![](../assets/7a8297bf68ba5d8f43b2.png)

</details>

<details>

<summary>이중 반복문 (예제)</summary>

핵심: 이중 for(포)문은
> **바깥 값 하나 고정 → 안쪽 값 전부 반복 → 바깥 다음 값으로 이동**
![](../assets/ff47ec9014e6e0fe7464.png)
![](../assets/56955b8d9fe6188fbebd.png)
![](../assets/8b116d2277161a3d3185.png)

<details>

<summary>힌트</summary>

![](../assets/daae9393e9b0341121a8.png)

</details>

# 핵심 한 방 정리 🔥
꺼낸 숫자 `i`를 합계 `b`에 계속 더하겠다.
![](../assets/245b45b27ac2a7c6fbc1.png)

<details>

<summary>답</summary>

![](../assets/ef76bb3ee3b5781462da.png)
![](../assets/751bcb8b7a5bd200513c.png)
![](../assets/c014af41ec4907ab4fad.png)

</details>

![](../assets/d727ad4f18e92dc21272.png)

<details>

<summary>답</summary>

![](../assets/fcd4a2b5cd19a9d5bf83.png)
![](../assets/de1759ec23c98b2f2af3.png)

</details>

![](../assets/ca5f242a3f30b69e46d8.png)
![](../assets/13ca60bb1e59b295c203.png)
![](../assets/3bc58ef29bb4b8ef0c4f.png)
![](../assets/abf31ecf63bc6ff6a754.png)
![](../assets/343d6a56f659922d4d70.png)
![](../assets/5b073048357a2765a655.png)

<details>

<summary>정해 놓은 답)</summary>

![](../assets/be0448d2ed1f6d6ed585.png)

</details>

![](../assets/1e70fabc111a5661cee4.png)
![문자열 뒤집기](../assets/ac16f65eea98aabfd276.png)
![리스트 자르기 (리스트 삭제는 del) (!.=)같지않다](../assets/38a57fa04db1463d6012.png)
![](../assets/96b3158b72e2b29da0c8.png)
![](../assets/4400c358300b6b67083e.png)
![](../assets/3bb0531572c21e671910.png)
![대문자,소문자 (찾거나) (바꾸는 것)](../assets/159ad80d2c39fac362ee.png)

<details>

<summary>아스키코드</summary>

![](../assets/73fd6d38be20de0d2700.png)

</details>

![리스트에 남아있는 것.](../assets/41b934e118de07560b59.png)
![리스트에서 삭제해서 출력.](../assets/d277940f00dedfc291b5.png)

</details>

</details>

<details>

<summary>f(f-string)에프 스트링</summary>

![](../assets/407a535c5860e7643612.png)

</details>

<details>

<summary>while문</summary>

![](../assets/3308a6f23cb836b209a5.png)
![1은 TRUE 0은 FALSE](../assets/a7764c01fff40a65a8a0.png)
![](../assets/b5c940f3e77fa83922c6.png)
![](../assets/19147b4157ec8ce24dcd.png)
![](../assets/dfdc98f5c9a3deec20ec.png)
![](../assets/0174b2d8c7f43c512998.png)

<details>

<summary>예제)</summary>

![](../assets/2df676c2b23b8ecdf2f4.png)

</details>

![](../assets/33380ee96cb7c7972181.png)
![](../assets/56f8f4b3de28ffbaaf64.png)

<details>

<summary>예제) 문제풀이</summary>

![](../assets/fc68a632e0157e1133cd.png)
![](../assets/0b4810e2b6cb623a6941.png)
![](../assets/aca68822e772aaa08008.png)
![](../assets/a0fb699cdafb03af808f.png)
![](../assets/b56302fedeb664cf75f2.png)
![](../assets/b41b3a9473754397d13f.png)
![](../assets/42281760e7b237dd9bb6.png)
![+활용법](../assets/c8b5ffbdd3f8733214fe.png)
```python
a=int(input("층:"))
i=1
while i<=a:
    print("*"*i)
    i=i+1
```
![](../assets/2cfb1bba9279c6d8a99a.png)

</details>

</details>

<details>

<summary>함수</summary>

![](../assets/bcdb1e3a80ab6b281932.png)
![](../assets/661694baae54e0aa983f.png)
![](../assets/e7bef8e477c339992668.png)
![](../assets/56b47935766b87bb4e40.png)
![내장 함수,외장 함수,사용자정의 함수, return:반환 값](../assets/4f282faf702489914dca.png)
![](../assets/473b136bfddb2bc684c9.png)
![](../assets/e05299e9915d57b8c86c.png)
![argument(아규먼트):매개변수](../assets/3065e7a2abbaccddeefe.png)

![](../assets/43a9cb1efcd3563c00a8.png)

![](../assets/6098966468826a2cc4ec.png)

![](../assets/3739e26c62990770b0f0.png)

<details>

<summary>예제)</summary>

![](../assets/0c081dfde28edd2c738d.png)
![항상 함수선언은 맨위에서 한다.!](../assets/f46dbd06e026f8176828.png)
![](../assets/f8c6121b4ccce796909d.png)
![](../assets/72b347fd7e61a2aa1fef.png)
![](../assets/bcd6563ed541e5c874c9.png)
![](../assets/ffc09305c0425b3ee613.png)

<details>

<summary>답</summary>

![](../assets/dc2a1798cffc8fa4b9bd.png)

</details>

![](../assets/93b0bbe4348e623b483a.png)

<details>

<summary>답</summary>

![](../assets/6c250d31401b69653872.png)

</details>

</details>

</details>

</details>

</details>

<details>

<summary>알고리즘</summary>

![](../assets/69b28ab463b6a95df4a2.png)
![](../assets/a4559bcb7db650fdf9b4.png)
![](../assets/ae03754ad2b2c45cb856.png)
![](../assets/4705ac2f60c5865b03e3.png)
![](../assets/8771deaf566fe4a4bbf3.png)
![](../assets/7499319b61e8e9a044fd.png)

<details>

<summary>답</summary>

![](../assets/84f2e9bf504402b96715.png)

</details>

![](../assets/c2062017e4b10b73022a.png)

<details>

<summary>답</summary>

![](../assets/fd0999e96378fc5d5566.png)

</details>

![](../assets/89ccb2f38691e1c8cd38.png)
![](../assets/345595bad2d73118e9e2.png)

</details>

<details>

<summary>디버깅</summary>

![](../assets/8f345d4132d971206997.png)

<details>

<summary>답</summary>

![](../assets/a5f0df7f46e7ac23a840.png)
korean = 92<br>english = 47<br>mathematics = 86<br>science = 81
print(min(korean, english, mathematics, science) \>= 50)

</details>

![](../assets/82832b9efc1fc2a75d18.png)
![](../assets/62c0ffd649872c3a22c5.png)

<details>

<summary>답</summary>

![](../assets/1a91d7d8151b586dd299.png)

</details>

![](../assets/da5ea46320fcbd8cb6c4.png)

<details>

<summary>답</summary>

![](../assets/dbd243fb8c1e3d42bfc8.png)

</details>

![](../assets/f8cd91b50b66fc0e2852.png)

<details>

<summary>답</summary>

![](../assets/264e3f8d15a923d120bf.png)

</details>

![](../assets/f1b2f4a6bb27d97d42ef.png)

<details>

<summary>답</summary>

![](../assets/4c672841627afed3074a.png)

</details>

<details>

<summary>타자게임</summary>

![](../assets/865c5904cd310abb8407.png)

</details>

<details>

<summary>가위바위보</summary>

![](../assets/27f29a6e951a43b66e4e.png)

</details>

</details>

<details>

<summary>세트 표현식</summary>

![](../assets/f8f27ea970eeb688dc94.png)
![집합에 순서는 없다.](../assets/b3046c4b279c4fd5cfda.png)

<details>

<summary>예제&답</summary>

![3의 배수 5의 배수 집합](../assets/ef405e07863dea9d77bb.png)
![](../assets/dd064d1d454700027e10.png)
![](../assets/e76321d1d475cbc54a74.png)

</details>

</details>

<details>

<summary>문제집</summary>

<details>

<summary>기초문제</summary>

![](../assets/a3f66f9f5a561e802cd8.png)
![](../assets/92610504a7a4c3ba7ddc.png)
![](../assets/247adedeb72c855196e6.png)
![](../assets/2399e4df609cd86013c4.png)
![](../assets/ca42a1891489e666b7f5.png)
![](../assets/bb255798e622e3f21aca.png)

</details>

<details>

<summary>소수찾기</summary>

![](../assets/7fb1b4b27b2f6760eba4.png)

<details>

<summary>풀이, 답</summary>

![](../assets/71aeaab521d0990572f3.png)

</details>

</details>

<details>

<summary>로그인</summary>

![](../assets/d2df485a1c9c919c6eba.png)

<details>

<summary>풀이,답</summary>

![](../assets/d3f54fb5e025188a7f99.png)
![현제 진행중](../assets/701fbfed566e6a49c643.png)
![](../assets/948e884c7ad16d0dc524.png)

</details>

</details>

<details>

<summary>극장예약문제</summary>

![](../assets/e1a731be50b3bd7c50b5.png)
![](../assets/b2a056a31938ca0acd88.png)
![](../assets/8cddc17e21db174049f4.png)

<details>

<summary>답</summary>

![](../assets/66c23a07ae50fa57b1b2.png)

</details>

</details>

<details>

<summary>투표문제</summary>

![](../assets/3603476beefac5c8a7d8.png)
![](../assets/5c3ea67d9e7a9666e5d6.png)
![](../assets/ef2fc1675a424035dfca.png)

<details>

<summary>답</summary>

![-1 안할때](../assets/f1764db4cad66bba1c8d.png)
![-1할때](../assets/f53fd46e4e42a2aa7eaf.png)
![추가본](../assets/c5ed6e1ec34e8e96632f.png)
![추가본](../assets/a7fbf8829cc1f67a68e4.png)
![최종본](../assets/a75eddfe4af1e3105fc5.png)

</details>

</details>

<details>

<summary>타자연습</summary>

![](../assets/ad0463ddabb8339ddfb6.png)
![](../assets/49b00f19b39ea3cae006.png)
![](../assets/803f59e327281f2a1825.png)
![](../assets/2009f5785c1bb8fd8893.png)

<details>

<summary>답</summary>

</details>

</details>

<details>

<summary>hangman 게임</summary>

![](../assets/f010d0b66f1f66fe99c8.png)
![](../assets/f42d47ab8f58b1b44dd8.png)
![](../assets/db02e21df1b5893cb802.png)

<details>

<summary>풀이&답</summary>

<details>

<summary>join</summary>

`join`(조인, 이어 붙이기)은 **리스트 안에 있는 문자열들을 하나의 문자열로 합치는 기능**이야(문자 추가 후 붙이는 것도 가능)
![](../assets/27506008c9f04143bd21.png)

</details>

<details>

<summary>미션&답</summary>

![](../assets/439e9349087786d6d67a.png)
![카운트를 썼을때.](../assets/69eeeffa39506dc52807.png)
![int썼을때.](../assets/a988b2dafbacae383565.png)

</details>

</details>

</details>

<details>

<summary>숫자야구게임</summary>

![](../assets/b032d381146e9822a8eb.png)
![](../assets/a9501923cec935da621b.png)

<details>

<summary>답&풀이</summary>

![하드코딩](../assets/8e49b9fe38f77e9a2cd6.png)
![답](../assets/abed344636204d33b4fb.png)

</details>

</details>

<details>

<summary>악어게임</summary>

![](../assets/92ebc49aa63479b64d79.png)
![](../assets/62ce3e46cf0b0ad3496b.png)

<details>

<summary>답&풀이</summary>

![](../assets/81f47a9f442991903eb0.png)

</details>

</details>

<details>

<summary>통아저씨게임</summary>

![](../assets/e612ea454faa4f784c7d.png)
![](../assets/27cda02e8918a4c6d7d3.png)

<details>

<summary>답&풀이</summary>

</details>

</details>

</details>

<details>

<summary>순서도</summary>

![](../assets/406a848c6cff6472dbf4.png)
![](../assets/e5143482b490bba18421.png)
![](../assets/545717ce4322a4949f6f.png)

</details>

</details>

<details>

<summary>Project(프로젝트)</summary>

</details>
