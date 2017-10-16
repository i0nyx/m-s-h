<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:container>
    <!-- Page Content -->
    <h1>${test}</h1>
    <a href="/page">page 1</a>
    <br />
    <form id="form" class="form-horizontal">
        <div class="form-group">
            <label class="control-label col-sm-4">Имя*:</label>
            <div class="col-sm-8">
                <input type="text" class="form-control" id="name">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-4">email*:</label>
            <div class="col-sm-8">
                <input type="email" class="form-control" id="email">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-4">Пароль*:</label>
            <div class="col-sm-8">
                <input type="password" class="form-control" id="password">
            </div>
        </div>
        <div class="col-sm-offset-4 col-sm-8">
            <button type="submit" class="btn btn-default">Отправить</button>
        </div>
    </form>
</t:container>
