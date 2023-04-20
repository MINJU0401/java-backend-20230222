CREATE DATABASE BOARD;
USE BOARD;


-- POST /api/auth/signUp
-- userEmail, userPassword, userPasswordCheck, userNickname,
-- userPhoneNumber, userAddress, userAddressDetail

-- 사용자는 회원가입을 진행한다.
-- 이메일 주소, 비밀번호, 비밀번호 확인, 닉네임, 핸드폰번호, 주소, 상세 주소 를 입력해서 회원가입을 진행한다.
-- 회원가입이 성공적으로 이루어지면 로그인을 진행한다.
-- 로그인 이메일과 패스워드로 로그인을 진행한다.

-- 로그인에 성공하면 메인 화면으로 이동한다.
-- 메인화면에는 주간 Top3 게시글이 보인다.
-- 주간 Top3의 경우 좋아요 순으로 정렬한다.
-- 최신 게시물이 리스트 형식으로 출력된다.
-- 한페이지에 5개씩 게시물이 보인다.
-- 페이징 처리가 되며 최대 10페이지까지 보이고 
-- 이전 섹션과 이후 섹션으로 이동하는 방향 버튼이 있음

-- 인기 검색어가 우측에 존재하도록 한다.

-- 상단에는 내비게이션 바가 있는데 해당 내비게이션 바에서 검색을 할 수 있다.

-- 또한 내비게이션 바에서 마이페이지로 이동할 수 있다.
-- 마이페이지로 이동해서 프로필사진을 수정할 수 있고 닉네임도 수정할 수 있다.
-- 마이페이지에서 게시물을 등록할 수 있다.
-- 게시물 등록 시에는 제목, 내용, 사진, 동영상, 파일을 올릴 수 있다.

-- 게시물 리스트에서 작성자의 프로필 사진, 닉네임, 게시물의 제목, 내용, 좋아요 수, 댓글 수, 조회 수 가 보여진다.

-- 게시물 리스트에서 게시물을 선택하면 
-- 해당 게시물의 제목, 작성자, 작성자 프로필 사진, 작성일, 내용, 사진, 동영상, 파일을 출력해준다.

-- 만약 본인 게시물이라면 게시물을 수정할 수 있다.
-- 게시물 수정은 제목, 내용, 사진, 동영상, 파일을 수정할 수 있다.

-- 또한 본인 게시물이면 삭제 가능하다.

-- 본인 게시물이 아니면 좋아요를 할 수 있다.
-- 게시물에 좋아요를 누른 유저의 프로필 사진과 닉네임이 모두 출력된다.

-- 모든 게시물에 댓글을 작성할 수 있다.
-- 댓글은 내용만 작성한다.
-- 댓글은 작성자, 작성자 프로필 사진, 작성일, 내용이 출력된다.
-- 댓글은 한번에 3개만 출력되고 페이징 최대 10페이지까지 된다.
-- 이전 섹션, 다음 섹션 버튼이 존재한다. 

-- 댓글 수와 좋아요 수가 게시물 상세에서 표시된다.

# User(user_email[PK], user_password, user_nickname, user_phone_number, user_address, user_profile)
CREATE TABLE User (
	user_email VARCHAR(50) PRIMARY KEY,
    user_password VARCHAR(20) NOT NULL,
    user_nickname VARCHAR(30) NOT NULL,
    user_phone_number VARCHAR(15) NOT NULL,
    user_address TEXT NOT NULL,
    user_profile TEXT
);

# Board(board_number[PK], board_title, board_content, board_image, board_video, board_file, 
# 		board_writer_email[FK-User(user-email)], board_writer_profile, board_writer_nickname, 
#		board_write_date, board_click_count, board_like_count, board_comment_count)
CREATE TABLE BOARD (
	board_number INT PRIMARY KEY AUTO_INCREMENT,
    board_title VARCHAR(200) NOT NULL,
    board_content TEXT NOT NULL,
    board_image TEXT,
    board_video TEXT,
    board_file TEXT,
    board_writer_email VARCHAR(50) NOT NULL,
    board_writer_profile TEXT,
    board_writer_nickname VARCHAR(30) NOT NULL,
    board_write_date DATE NOT NULL,
    board_click_count INT DEFAULT 0,
    board_like_count INT DEFAULT 0,
    board_comment_count INT DEFAULT 0
);

# PopularSearch(popular_term[PK], popular_search_count)
CREATE TABLE PopularSearch (
	popular_term VARCHAR(200) PRIMARY KEY,
    popular_search_count INT DEFAULT 1
);

# Like(board_number[FK-Board(board_number)], user_email[FK-User(user-email)], 
#	   like_user_profile, like_user_nickname)
CREATE TABLE Likey(
	like_id INT AUTO_INCREMENT PRIMARY KEY,
	board_number INT NOT NULL,
    user_email VARCHAR(50) NOT NULL,
    like_user_profile TEXT,
    like_user_nickname VARCHAR(30) NOT NULL
);

DROP TABLE Likey;

# Comment(board_number[FK-Board(board_number)], user_email[FK-User(user-email)], 
#		  comment_user_profile, comment_user_nickname, comment_write_date, comment_content
CREATE TABLE Comment(
	comment_id INT AUTO_INCREMENT PRIMARY KEY,
	board_number INT NOT NULL,
    user_email VARCHAR(50) NOT NULL,
    comment_user_profile TEXT,
    comment_user_nickname VARCHAR(30) NOT NULL,
    comment_write_date DATE NOT NULL,
    comment_content TEXT NOT NULL
);

# User - Board 관계
# 1. User가 Board를 작성한다.		- 1 : n
# 2. User가 Board에 좋아요를 행한다.	- n : m
# 3. User가 Board에 댓글을 단다.  	- n : m

