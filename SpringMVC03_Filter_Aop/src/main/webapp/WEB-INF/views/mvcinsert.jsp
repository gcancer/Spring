<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="insertres.do" method="post">
		<table>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="myname" ></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="mytitle"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="30" name="mycontent" ></textarea></td>
			</tr>
			<tr>
				<td colspan="4">
				<input type="text" value="취소" onclick="location.href='list.do'"> 
				<input type="submit" value="작성하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>