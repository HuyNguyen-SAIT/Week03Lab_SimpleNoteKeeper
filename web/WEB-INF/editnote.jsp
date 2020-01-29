<%-- 
    Document   : editnote
    Created on : 24-Jan-2020, 10:17:07 AM
    Author     : 794458
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form method="POST" action="/Web03Lab_SimpleNoteKeeper/note">
            <table>
                <tr>
                    <td><b>Title:</b></td>
                    <td><input type="text" name="title"></td>
                </tr>
                <tr>
                    <td><b>Contents:</b></td>
                    <td><textarea name="content"></textarea></td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="SAVE">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
