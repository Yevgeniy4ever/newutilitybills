<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    <title></title>
</head>
<body>
<div style="background-color: white; padding-bottom: 100%;">
    <div class="mainPageBlock">
        <div style="padding-bottom: 10px;">
            <a style="font-family: Times New Roman, serif; font-size: 30pt; color: #276873;">Выберите квартиру:</a>
        </div>
        #{testController.str}
        <form name="toMain" method="post" action="../pages/main.jsp">
            <select name="apartmentList" class="standardElement">
                <option>Айманова</option>
                <option>Гагарина</option>
            </select>
            <input type="submit" class="button">
        </form>
    </div>
</div>
</body>
</html>
