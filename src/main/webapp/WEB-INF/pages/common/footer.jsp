<%--
  Created by IntelliJ IDEA.
  User: enpfeff
  Date: 3/31/14
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="footer">
    <div class="footerWrapper">
        <span class="logo">${view.footer}</span>
        <span class="login"><a href="#">Login</a></span>
    </div>
</div>
<div id="loginDialog">
    <form action="/login" method="post">
        <p>
            <span class="loginLabel">Username: </span>
            <input name="username" class="username txtfield" type="text" />
        </p>
        <p>
            <span class="loginLabel">Password: </span>
            <input name="password" class="password txtfield" type="password" />
        </p>
    </form>
</div>

<script type="text/javascript">
    $(document).ready(function(event){
        var $model = $('div#loginDialog');
        $model.dialog(
            {
                height: 350,
                width: 400,
                autoOpen: false,
                buttons: {
                    'Log In': function() {
                        //do something

                        $(this).dialog('close');
                    },
                    'Cancel': function() {
                        $(this).dialog('close');
                    }
                }
            }
        )
        $('#footer .login a').click(function(e){
            e.preventDefault();
            e.stopPropagation();
            $model.dialog('open');
        });
    });
</script>
