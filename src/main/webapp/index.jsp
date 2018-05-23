<%@ page import="bellintegrator.weatherBroker.controller.WeatherRequest" %>
<%@ page import="bellintegrator.weatherBroker.service.WeatherService" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page import="bellintegrator.weatherBroker.view.WeatherView" %>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
         pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<form method="get">
    <input type="text" name="city" >
    <input type="submit" value="Submit">
</form>
<%
  String city = request.getParameter("city");
  if (city!=null){
%>
  Weather for the city of
<%= city
%>
is saved to the DataBase
<%
    }
%>
<%
    WeatherRequest.request(city);
%>

</body>
</html>
