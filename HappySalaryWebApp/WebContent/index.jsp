<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HAPPY SALARY</title>
</head>
<body>
 <p>
 ***************ITPM用の月収計算アプリ******************<br>
 エンジニアランクと単価を入力して<br>
 月収を計算する簡易Webアプリだよ<br>
 <br>
 これで単金アップした時の事を考えてスキルアップ！<br>
 ****************************************************<br>
 </p><br>




 <form action="/HappySalaryWebApp/HappySalary" method="post">
  エンジニアランク<br>
  <input type="text" name="engineerRank"><br>
  現在の単金<br>
  <input type="text" name="cost"><br>
  <br>
  <input type="submit" value="計算する">
 </form>


</body>
</html>