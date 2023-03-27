SELECT * FROM hotel.namgu;

SELECT 구분, 세대수, 면적
FROM namgu;

SELECT DISTINCT 구분, 세대수, 면적  -- 지시한 데이터열 세가지 값이 모두 겹치는 데이터는 없어, 일반출력과 동일하게 출력됨
FROM namgu;

SELECT * FROM namgu WHERE 구분 = '문현2동 ';
SELECT * FROM namgu WHERE 구성비 = 3;

SELECT * FROM namgu WHERE 구분 LIKE '문현%';
SELECT * FROM namgu WHERE 구분 LIKE '%문현%';

SELECT * FROM namgu WHERE 세대수 >= 10000;
SELECT * FROM namgu WHERE 세대수 <= 5000;

SELECT * FROM namgu WHERE 세대수 <= 10000 AND 세대수 >= 5000;
SELECT * FROM namgu WHERE 세대수 BETWEEN 5000 AND 10000;