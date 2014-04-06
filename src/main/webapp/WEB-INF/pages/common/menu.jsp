<%--
  Created by IntelliJ IDEA.
  User: enpfeff
  Date: 3/31/14
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="menu">
    <ul>
        <c:forEach items="${titles}" var="title">
            <li>
                <c:choose>
                    <c:when test="${title == 'Home'}">
                        <a class="menulink" href="/"><span class="menulabel rotate">${title}</span></a>
                    </c:when>
                    <c:otherwise>
                        <a class="menulink" href="/${title}"><span class="menulabel rotate">${title}</span></a>
                    </c:otherwise>
                </c:choose>
            </li>
        </c:forEach>
    </ul>
</div>