<%-- 
    Document   : viewnote
    Created on : 24-Jan-2020, 10:16:48 AM
    Author     : 794458
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div><b>Title</b></div>${titleView}
        <div><b>Contents</b></div>${contentView}<br/>
        <a href="note?edit">Edit</a>
    </body>
</html>
