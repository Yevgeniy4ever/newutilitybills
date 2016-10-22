<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="../css/main.css">
    <title></title>
</head>
<body>
<div style="background-color: white; padding-bottom: 100%;">
    <% request.setCharacterEncoding("UTF-8");%>
    <div>
        <a class="textHeader" style="padding: 28%;">Комунальные Услуго по ${param["apartmentList"].toString()}</a>
        <%--<img src="../images/icon.png">--%>
    </div>
    <div style="padding-top: 70px;"></div>
    <div style="padding-left: 23%;">
        <table>
            <tr>
                <th>Последная</th>
                <th>Предыдущая</th>
                <th>Колличество</th>
                <th>Тариф</th>
                <th>Сумма</th>
            </tr>
            <tr>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
            </tr>
            <tr>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
            </tr>
            <tr>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
            </tr>
            <tr>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
            </tr>
            <tr>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
                <td>test</td>
            </tr>
        </table>
        <br>
        <input type="button" class="button" value="Добавить">
    </div>
</div>
</body>
</html>
