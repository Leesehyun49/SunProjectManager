# ☀️ SunProjectManager ☀️


### 주제 : 회사 인트라넷 구축을 위한 그룹웨어 구현

### 기간 : 2024.07.30~2024.09.06(6주)

### 인원 : 3명

----------------------

# 목차

### [1.프로젝트 아키텍쳐](#1-프로젝트-아키텍쳐)
### [2.개발 환경](#2-개발-환경)
### [3.ERD](#3-erd)
   - [3.1 Oracle ShellScript](#31-oracle-shellscript)
### [4.주요 기능(담당한 기능 ☀️)](#4-주요-기능) 
   - [4.1로그인/로그아웃](#41-로그인-로그아웃) ☀️
   - [4.2마이페이지](#42-마이페이지) ☀️
   - [4.3채팅](#43-채팅) ☀️
   - [4.4인사관리](#44-인사관리) ☀️
   - [4.5공지사항 게시판](#45-공지사항-게시판) ☀️
   - [4.6전자결재](#46-전자결재)
   - [4.7시설예약](#47-시설예약) 
   - [4.8차량관리](#48-차량관리) 
   - [4.9협력사관리](#49-협력사관리) 
   - [4.10출장/배차관리](#410-출장-배차관리) 
   - [4.11공휴일 관리](#411-공휴일-관리) 
   - [4.12회의록 관리](#412-회의록-관리) 
   - [4.13화면제어](#413-화면제어) 
### [5.성능 개선](#5-성능-개선)



----------------------


# 1. 프로젝트 아키텍쳐
<br><br>
![스크린샷 2024-09-08 203358](https://github.com/user-attachments/assets/55a519a7-49d3-45c3-b325-c24f2496a492)
<br><br>

# 개발 구조
![스크린샷 2024-09-11 102406](https://github.com/user-attachments/assets/2de7f105-ccf9-4aa3-8e4f-345f9615660f)
<br><br>

# 사용 API
![스크린샷 2024-09-11 102353](https://github.com/user-attachments/assets/51f839ac-882f-481c-bd1e-92f634be063a)




----------------------


# 2. 개발 환경


#### Back-end
![Java](https://img.shields.io/badge/Java-17-brightgreen?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.8-brightgreen?style=for-the-badge&logo=springboot&logoColor=white)

#### 통신
![Web Socket](https://img.shields.io/badge/Web%20Socket-Enabled-blue?style=for-the-badge)
![STOMP](https://img.shields.io/badge/STOMP-Enabled-blue?style=for-the-badge)

#### 데이터 처리
![JPA](https://img.shields.io/badge/JPA-Enabled-yellow?style=for-the-badge)
![myBatis](https://img.shields.io/badge/myBatis-Enabled-blue?style=for-the-badge)
![Gson](https://img.shields.io/badge/Gson-Enabled-green?style=for-the-badge)
![Commons FileUpload](https://img.shields.io/badge/Commons%20FileUpload-Enabled-orange?style=for-the-badge)

#### 로깅/유틸
![Lombok](https://img.shields.io/badge/Lombok-Enabled-green?style=for-the-badge)
![AOP](https://img.shields.io/badge/AOP-Enabled-red?style=for-the-badge)


#### Front-end
![JavaScript](https://img.shields.io/badge/JavaScript-Enabled-yellow?style=for-the-badge)
![React](https://img.shields.io/badge/React-Enabled-blue?style=for-the-badge&logo=react)
![Axios Ajax](https://img.shields.io/badge/Axios%20Ajax-Enabled-lightblue?style=for-the-badge)
![Bootstrap](https://img.shields.io/badge/Bootstrap-Enabled-purple?style=for-the-badge)


#### DB
![Oracle 19c](https://img.shields.io/badge/Oracle%2019c-Enabled-red?style=for-the-badge)

#### DB 관리
![Oracle Shell Script](https://img.shields.io/badge/Oracle%20Shell%20Script-Enabled-orange?style=for-the-badge)

#### 캐시 서버
![Redis](https://img.shields.io/badge/Redis-Enabled-red?style=for-the-badge)

#### CI/CD
![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-Enabled-blue?style=for-the-badge&logo=githubactions&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue?style=for-the-badge&logo=docker&logoColor=white)
![Ubuntu](https://img.shields.io/badge/Ubuntu%2024.04%20LTS-Enabled-orange?style=for-the-badge&logo=ubuntu&logoColor=white)

#### 네트워크
![ngrok](https://img.shields.io/badge/ngrok-Enabled-blue?style=for-the-badge)

#### 테스트 도구
![JUnit 5.10.3](https://img.shields.io/badge/JUnit-5.10.3-red?style=for-the-badge)
![SpringBootTest](https://img.shields.io/badge/SpringBootTest-3.2.8-brightgreen?style=for-the-badge)
![Postman](https://img.shields.io/badge/Postman-Enabled-orange?style=for-the-badge&logo=postman&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-Enabled-green?style=for-the-badge&logo=swagger&logoColor=white)

#### 형상 관리
![GitHub](https://img.shields.io/badge/GitHub-Enabled-black?style=for-the-badge&logo=github&logoColor=white)




----------------------

# 3. ERD
![image](https://github.com/user-attachments/assets/6d42da66-2e0a-4794-a86d-09cb2610b7a0)




### 3.1 Oracle ShellScript
[DummyData](https://github.com/bluewt129/SunProjectDeploy/raw/OracleData/sun_main_database.sql)




----------------------


## 4. 주요 기능
### 이미지 클릭 시 동영상 링크로 이동됩니다
### 생략된 기능들에 대한 자세한 설명은 해당 기능 담당자 Git으로 이동하면 확인할 수 있습니다


[RUBI GIT 보러가기](https://github.com/Ahyoung0615/SunProjectManager)  
[SONIC GIT 보러가기](https://github.com/Leesehyun49/SunProjectManager)  
[BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)


### 4.1 로그인 로그아웃
##### ☀️ 담당기능


[![로그인 영상](https://img.youtube.com/vi/eRiS9_uxjdo/0.jpg)](https://youtu.be/eRiS9_uxjdo)


자동로그인을 체크한후 로그인을 해주면 쿠키가 생깁니다


다른 탭에서 홈페이지에 진입시 쿠키를 확인후 자동으로 로그인 처리를 해줍니다.


로그인시 세션 스토리지에 원하는 정보를 저장할수있습니다.




-----------------------------


### 4.2 마이페이지
##### ☀️ 담당기능


[![마이페이지 영](https://img.youtube.com/vi/AGtWQ83rMTE/0.jpg)](https://youtu.be/AGtWQ83rMTE)


마이페이지 입니다. 사진과 간단한 인적사항을 수정할 수 있습니다.


전화번호와 이메일에는 유효성 검사를 통해 알맞은 정보를 입력할 수 있게 했습니다.


비밀번호를 변경시 로그아웃 처리합니다.




-----------------------------


### 4.3 채팅
##### ☀️ 담당기능


[![채팅 영상](https://img.youtube.com/vi/4DVkq1EMirg/0.jpg)](https://youtu.be/4DVkq1EMirg)


채팅 페이지입니다. 채팅이 오면 오른쪽 위에 채팅 버튼을 보시면 빨간 숫자가 표시됩니다.


채팅 목록은 마지막 대화가 가장 최근인 채팅이 가장 위에 뜨도록 했습니다.


채팅방 입장시 대화했던 내용들이 보여집니다. 좌측은 상대방, 우측은 자신이 보낸 메시지가 뜹니다.


채팅방 생성 버튼을 통해 원하는 사람과의 채팅방을 만들수 있습니다.




-----------------------------


### 4.4 인사관리
##### ☀️ 담당기능


[![인사관리 영상](https://img.youtube.com/vi/Dcy6RD4I4ho/0.jpg)](https://youtu.be/Dcy6RD4I4ho)


인사관리 페이지입니다. 재직 상태를 통해 재직, 퇴사, 휴가로 구분 지어 확인 가능합니다.


사원등록 버튼을 통해 신규 사원을 등록할 수 있습니다.


사원번호를 클릭하여 해당 사원 상세정보를 보고 수정할 수 있습니다.




-----------------------------


### 4.5 공지사항 게시판
##### ☀️ 담당기능


[![공지사항 영상](https://img.youtube.com/vi/79yz1n7DSRk/0.jpg)](https://youtu.be/79yz1n7DSRk)


공지사항 페이지입니다. 중요 게시글과 일반 게시글로 구분 지어 중요 게시글이 상단에 배치되도록 했습니다.


게시글 쓰기, 수정, 삭제 버튼은 관리자 로그인일 경우에만 표시됩니다.




-----------------------------


### 4.6 전자결재
#### [RUBI GIT 보러가기](https://github.com/Ahyoung0615/SunProjectManager) 

### 4.7 시설예약
#### [RUBI GIT 보러가기](https://github.com/Ahyoung0615/SunProjectManager)


-----------------------------


### 4.8 차량관리
#### [BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)


### 4.9 협력사관리
#### [BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)



### 4.10 출장 배차관리
#### [BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)



### 4.11 공휴일 관리
#### [BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)



### 4.12 회의록 관리
#### [BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)



### 4.13 화면제어
#### [BLUE GIT 보러가기](https://github.com/bluewt129/SunProjectDeploy)


-----------------------------






