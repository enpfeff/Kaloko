<%--
  Created by IntelliJ IDEA.
  User: enpfeff
  Date: 3/16/14
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <link rel="stylesheet" href="<c:url value = "/static-assets/css/kaloko.css" />" type="text/css" />
    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,400|Josefin+Sans' rel='stylesheet' type='text/css'>

    <script src="/static-assets/js/foss/jquery-2.1.0.js" type="text/javascript"></script>
    <script src="/static-assets/js/foss/jquery-ui-1.10.4.custom/js/jquery-ui-1.10.4.custom.js" type="text/javascript"></script>
</head>
<body>
<jsp:include page="common/header.jsp"/>
<jsp:include page="common/menu.jsp" />

<div id="post">
    <div class="post light-gray">
        <div class="postwrapper" >
            <div class="postTitle"><h2>Post Title</h2></div>
            <div class="postDate">Post Date</div>
            <div class="postBody">
                <p>Post Body blahb Joe is real cool dude bro man and bro it alll nighj hj hj hj hj hjhjht long hjhfjhdjhfdfhjdhfjdhfdh
                    hjdfhjdhfjdhfjhdjhfdjhfjdhfjdhf and tusk ramond tusk this is text that just stays here</p>
                <p>Post Body blahb Joe is real cool dude bro man and bro it alll night long hjhfjhdjhfdfhjdhfjdhfdh
                    hjdfhjdhfjdhfjhdjhfdjhfjdhfjdhf</p>
            </div>
            <div class="postShare">
                <div class="postShareHeader lineafter"><h3>Share</h3></div>
                <div>
                    <a href="#" class="facebook sharebutton">Facebook</a>
                    <a href="#" class="twitter sharebutton">Twitter</a>
                    <a href="#" class="google sharebutton">Google +</a>
                </div>
            </div>
        </div>
    </div>
    <div class="post">
        <div class="postwrapper" >
            <div class="postTitle"><h2>Post Title</h2></div>
            <div class="postDate">Post Date</div>
            <div class="postBody">
                <p>Post Body blahb Joe is real cool dude bro man and bro it alll nighj hj hj hj hj hjhjht long hjhfjhdjhfdfhjdhfjdhfdh
                    hjdfhjdhfjdhfjhdjhfdjhfjdhfjdhf and tusk ramond tusk this is text that just stays here</p>
                <p>Post Body blahb Joe is real cool dude bro man and bro it alll night long hjhfjhdjhfdfhjdhfjdhfdh
                    hjdfhjdhfjdhfjhdjhfdjhfjdhfjdhf</p>
            </div>
            <div class="postShare">
                <div class="postShareHeader lineafter"><h3>Share</h3></div>
                <div>
                    <a href="#" class="facebook sharebutton">Facebook</a>
                    <a href="#" class="twitter sharebutton">Twitter</a>
                    <a href="#" class="google sharebutton">Google +</a>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="common/footer.jsp" />
</body>
</html>
