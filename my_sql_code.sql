--查询test_tab表,将1替换为男,2替换为女,将province和city链接到一块
SELECT id,case sex when '1' then '男' when '2' then '女' end as sex,concat(a,b,'市') as ab
FROM test_tab