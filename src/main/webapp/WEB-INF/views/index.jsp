<%--
  Created by IntelliJ IDEA.
  User: slawekpaciorek
  Date: 29.11.18
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            padding: 0;
            margin: 0;
        }
        h1{
            background-color: #1a477f;
            color: white;
            text-align: center;
            width: 100%;
            padding: 20px 0;
            font-family: Ubuntu;
        }
        div{
            width: 100%;
            padding: 20px;
            text-align: center;
        }
        button{
            width: 300px;
            margin-right:  20px;
            padding: 20px;
            border: none;
            box-shadow: none;
            border-right: #1a477f solid 5px;
            border-bottom: #1a477f solid 5px;
            background-color: white;
            color: #1a477f;
            cursor: pointer;
        }
        button:hover{
            color: white;
            font-weight: bolder;
            background-color: #1a477f;
        }
    </style>
</head>
<body>
<h1>Employee App</h1>
<div>
<a href="add-employee"><button>Add Record</button></a>
<a href="employee-list"><button>Check Data Base</button></a>
<a href="find-employee"><button>Find Record</button></a>
</div>
</body>
</html>
