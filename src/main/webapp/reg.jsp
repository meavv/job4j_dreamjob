<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
            integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Работа мечты</title>
</head>
<body>
<script>
    function validate() {
        let rsl = $('.form-control').toArray();
        for (let i = 0; i < rsl.length; i++) {
            let x = $(rsl[i]);
            if (x.val() === "") {
                alert("Не заполнено поле: " + x.attr("name"));
                return false;
            }
        }
        return true;
    }
</script>
<div class="container pt-3">

    <div class="row">
        <div class="card" style="width: 100%">
            <div class="card-header">
                Регистрация
            </div>
            <div class="card-body">
                <form action="<%=request.getContextPath()%>/reg.do" method="post">
                    <div class="form-group">
                        <label>Имя</label>
                        <input type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label>Почта</label>
                        <input type="text" class="form-control" name="email">
                    </div>
                    <div class="form-group">
                        <label>Пароль</label>
                        <input type="text" class="form-control" name="password">
                    </div>
                    <button type="submit"  onclick="return validate();" class="btn btn-primary" >Создать</button>
                    <c:if test="${not empty error}">
                        <div style="color:red; font-weight: bold; margin: 30px 0;">
                            <c:out value="${error}"/>
                        </div>
                    </c:if>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>