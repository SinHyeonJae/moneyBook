<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
  <tr>
    <td>번호</td>
    <td>이름</td>
  </tr>
<?
$table = "board";
$sql = "select * from ".$board;
$query = mysql_qyery($sql);
 
///////////////////////////////////////////////////////////////////////// 엑셀얻기 시작
$downfile= $table."_".date("Y-m-d").".xls";   // 다운받을 화일
header( "Content-type: application/vnd.ms-excel" );
header( "Content-Disposition: attachment; filename=".$downfile );
header( "Content-Description: PHP4 Generated Data" );
///////////////////////////////////////////////////////////////////////// 엑셀얻기 끝
 
while($data = mysql_fetch_assoc($query)) {
?>
  <tr>
    <td><?=$data[번호필드]?></td>
    <td><?=$data[이름필드]?></td>
  </tr>
<?
}
?>
</table>
</body>
</html>