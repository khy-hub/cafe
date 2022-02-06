<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="head.jsp" %>
<c:if test="${Names ne null}">
${Names}
</c:if>
<c:if test="${Ages ne null}">
${Ages}
</c:if>
<%@ include file="tail.jsp" %>