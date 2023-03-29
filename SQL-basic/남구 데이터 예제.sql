-- namgu 테이블 전체 데이터 검색
SELECT * FROM namgu;

-- namgu 테이블에서 구분, 세대수, 면적 필드 검색 
SELECT 구분, 세대수, 면적
FROM namgu;

-- namgu 테이블에서 구분, 세대수, 면적 필드 중 중복을 제거하여 검색 
SELECT DISTINCT 구분, 세대수, 면적  -- 지시한 데이터열 세가지 값이 모두 겹치는 데이터는 없어, 일반출력과 동일하게 출력됨
FROM namgu;

-- namgu 테이블에서 
-- 구분이 '문현2동 '인 
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 구분 = '문현2동 ';

-- namgu 테이블에서 
-- 구성비가 '3'인 
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 구성비 = 3;

-- namgu 테이블에서 
-- 구분에 '문현'으로 시작하는 
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 구분 LIKE '문현%';

-- namgu 테이블에서 
-- 구분에 '문현'이 포함되는  
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 구분 LIKE '%문현%';

-- namgu 테이블에서 
-- 세대수가 10000 이상인  
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 세대수 >= 10000;

-- namgu 테이블에서 
-- 세대수가 5000 이하인  
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 세대수 <= 5000;

-- namgu 테이블에서 
-- 세대수가 10000이하이면서 5000 이상인  
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 세대수 <= 10000 AND 세대수 >= 5000;

-- namgu 테이블에서 
-- 세대수가 5000과 10000사이인
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 세대수 BETWEEN 5000 AND 10000;

-- namgu 테이블에서 
-- 통이 21, 22, 23 중 하나라도 해당하는
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 통 IN (21, 22, 23);

-- namgu 테이블에서 
-- 통이 21, 22, 23 중 하나라도 해당하지 않는 
-- 레코드 중 전체필드 검색
SELECT * FROM namgu WHERE 통 NOT IN (21, 22, 23);

-- namgu 테이블에서
-- 인구수가 10000명 이상이면서 18세이상 인구수 12000명 이하인 
-- 레코드 중 전체 필드를 검색
SELECT *
FROM namgu 
WHERE 인구수 >= 10000
AND 18세이상인구수 <= 12000;

-- namgu 테이블에서
-- 통이 20 이상 이거나 반이 100 이하인 
-- 레코드 중 구분, 세대수, 인구수, 통, 반 필드를 검색
SELECT 구분, 세대수, 인구수, 통, 반 FROM namgu
WHERE 통 >= 20 OR 반 <= 100;

-- namgu 테이블에서
-- 인구수가 10000명 이상인 레코드 중
-- 18세이상 인구수 12000명 이하이거나 반이 100이상인
-- 레코드의 전체 필드를 검색
SELECT * FROM namgu 
WHERE 인구수 >= 10000
AND (18세이상인구수 <= 12000 OR 반 >= 100);

-- namgu 테이블에서
-- 인구수가 10000명 이상이면서 18세이상인구수가 12000명 이하이고
-- 반이 100이상인
-- 레코드의 전체 필드 검색
SELECT * FROM namgu 
WHERE 인구수 >= 10000 AND 18세이상인구수 <= 12000 OR 반 >= 100;  -- 괄호를 없애면 출력데이터가 달라짐 AND OR 연산자 사용시 주의

