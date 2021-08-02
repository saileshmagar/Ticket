<%--
  Created by IntelliJ IDEA.
  User: Sailesh
  Date: 7/22/2021
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<style>
    body {font-family: Arial, Helvetica, sans-serif;}
    * {box-sizing: border-box}

    /* Full-width input fields */
    input[type=text], input[type=password] {
        width: 100%;
        padding: 15px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
    }

    input[type=text]:focus, input[type=password]:focus , input[type=radio]:focus{
        background-color: #ddd;
        outline: none;
    }

    hr {
        border: 1px solid #f1f1f1;
        margin-bottom: 25px;
    }

    /* Set a style for all buttons */
    button {
        background-color: #04AA6D;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
        opacity: 0.9;
    }

    button:hover {
        opacity:1;
    }

    /* Extra styles for the cancel button */
    .cancelbtn {
        padding: 14px 20px;
        background-color: #f44336;
    }

    /* Float cancel and signup buttons and add an equal width */
    .cancelbtn, .signupbtn {
        float: left;
        width: 50%;
    }

    /* Add padding to container elements */
    .container {
        padding: 16px;
    }

    /* Clear floats */
    .clearfix::after {
        content: "";
        clear: both;
        display: table;
    }

    /* Change styles for cancel button and signup button on extra small screens */
    @media screen and (max-width: 300px) {
        .cancelbtn, .signupbtn {
            width: 100%;
        }
    }
</style>
<body>

<form action="register" method="post" style="border:1px solid #ccc">
    <div class="container">
        <%--@declare id="email"--%><%--@declare id="psw"--%><%--@declare id="psw-repeat"--%>

            <%--@declare id="username"--%><%--@declare id="userid"--%><%--@declare id="fname"--%><%--@declare id="lname"--%><%--@declare id="gender"--%><h1>Sign Up</h1>
        <p >Please fill in this form to create an account.</p>
        <hr>
           <!--  <label for="userId"><b>UserId</b></label>
            <input type="text" placeholder="Enter UserId" name="userId" required>
 -->
            <label for="fname"><b>FirstName</b></label>
            <input type="text" placeholder="Enter First Name" name="fname" required>

            <label for="lname"><b>LastName</b></label>
            <input type="text" placeholder="Enter Last Name" name="lname" required>

            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter User Name" name="username" required>

            <label for="gender"><b>Gender</b></label><br><br>

             <input type="radio" value="gender" name="gender" value="Male">
            <label for="gender"><b>Male</b></label>

             <input type="radio" name="gender" value="Female">
            <label for="gender"><b>Female</b></label><br><br>

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" >



        <label for="psw-repeat"><b>Repeat Password</b></label>
        <input type="password" placeholder="Repeat Password" name="psw-repeat" required>

        <label>
            <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
        </label>

        <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

        <div class="clearfix">
            <button type="button" class="cancelbtn">Cancel</button>
            <button type="submit" class="signupbtn">Sign Up</button>
        </div>
    </div>
</form>

</body>
</html>

