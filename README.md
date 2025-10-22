# 코딩테스트 연습
도커, vscode에서 코딩 테스트 연습하기 위한 환경 구축 및 연습 내용 기록

## 환경
- 실행 환경
  - Docker version 27.5.1
  - Docker Compose version v2.32.4
- 컨테이너 내 환경
  - openjdk17

## 환경설정 내용
- vscode에서 자바 관련 확장프로그램이 미리 설치되도록 환경설정 (extensions 복사)
- 각각의 폴더에서 빌드가 되도록 환경설정 (launch.json, tasks.json)

## 도커 실행
```
docker compose up -d
```

## 자바 실행
1. vscode로 컨테이너에 원격 접속
2. 실행할 자바 파일 열기
3. RUN AND DEBUG 선택 (CMD + SHIFT + D)
4. Run current file으로 실행 (F5)

## 파일명 설명
- Me로 시작하는 자바 파일은 본인의 풀이
- Others로 시작하는 자바 파일은 다른 사람의 풀이
  - 자신이 생각하지 못 했던 풀이를 다름 사람의 풀이를 보면서 공부