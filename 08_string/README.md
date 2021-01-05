# String 관련 유용한 메소드들

|메소드명|설명|반환값|
|------|------|------|
|charAt(index)|문자열의 index번째 문자(char)를 얻는다.|char|
|contains(특정 문자열)|특정 문자열이 포함되어 있는지 확인|boolean|
|startsWith(특정 문자열)|특정 문자열로 시작하는지 확인|boolean|
|endsWith(특정 문자열)|특정 문자열로 끝나는지 확인|boolean|
|length()|문자열의 길이|int 알파벳의 개수|
|replace(수정할 문자열, 새로운 문자열)|문자열 중 일부를 교체|String 바뀐 문자열 전체|
|split(특정 구분자)|구분자를 기준으로 문자열을 잘라서 배열에 넣는다.|String[]|
|substring(index)|문자열을 index번째부터 맨 뒤까지 자른다. |String 잘린 문자열|
|substring(s_index, e_index)|s_index번째부터 자르고 싶은 마지막 index + 1|String 잘린 문자열|

  

## 예제
### [예제 1](string_ex/Ex01.java) : 문자열 초기화, 문자열끼리 값 비교
### [예제 2](string_ex/Ex02.java) : 문자<->숫자 변환
### [예제 3](string_ex/Ex03.java) : 문자열 유용한 함수들
### [예제 4](string_ex/Ex04.java) : 문자열 입력받기

## 문제
### [문제 1](string_quiz/quiz01/README.md) : 문자열->정수 변환
### [문제 2](string_quiz/quiz02/README.md) : 문자열의 유용한 함수들
### [문제 3](string_quiz/quiz03/README.md) : 문자열 입력
### [문제 4](string_quiz/quiz04/README.md) : 고급 문제