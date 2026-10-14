
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Event Registration</title>
</head>
<body>

    <h2>Event Registration Form</h2>

    <form action="register" method="post">

        Participant ID:
        <input type="number" name="participantId" required>
        <br><br>

        Participant Name:
        <input type="text" name="participantName" required>
        <br><br>

        Email:
        <input type="email" name="emial" required>
        <br><br>

        Phone:
        <input type="number" name="pnone" required>
        <br><br>

        Event Track:
        <select name="eventTrack" required>
            <option value="">-- Select Event Track --</option>
            <option value="Java">Java</option>
            <option value="Spring Boot">Spring Boot</option>
            <option value="Full Stack">Full Stack</option>
            <option value="Database">Database</option>
        </select>
        <br><br>

        <input type="submit" value="Register">
        <input type="reset" value="Clear">

    </form>

</body>
</html>

