<%--
  Created by IntelliJ IDEA.
  User: Gorazd
  Date: 22. 04. 2022
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#id").on('input', function() {
                $.ajax({
                    url: 'validateEmail',                       // url of the server
                    data: { id: $("#id").val() },               // get the value of particular field that has to be sent to a server (json format)
                    success: function(responseText) {           // callback function (invoked when the response comes back)
                        $("#errMsg").text(responseText);
                        if (responseText != "") {
                            $("#id").focus();   // returns the focus back to id field
                        }
                    }
                });
                if (document.getElementById("id").value == "") {
                    $("#errMsg").text("");
                }
            });
        })
    </script>
</head>
<body>
    <form action="registerUser" method="post">      <!-- registerUser goes to Spring container first, which creates corresponding model object for this POM -->
        <pre>
                Id: <input type="text" name="id" id="id" /><span id="errMsg"></span>
                Name: <input type="text" name="name" />
                Email: <input type="text" name="email" />
                <br />
                <input type="submit" name="register" />     <!-- when submit button is hit, registerUser() method is called and browser goes to /regResult url -->
            </pre>
    </form>
    <br />
    ${message}
    ${result}
</body>
</html>
