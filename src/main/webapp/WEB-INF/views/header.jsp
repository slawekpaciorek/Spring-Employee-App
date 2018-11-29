<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *{
            padding: 0;
            margin: 0;
        }
        h1,h2{
            background-color: #163b69;
            color: white;
            text-align: center;
            width: 100%;
            padding: 20px 0;
            font-family: Ubuntu;
        }
        h2{
            background-color: #19467e;
        }
        div{
            width: 100%;
            padding: 20px;
            text-align: center;
            margin: 30px 0;
        }
        button{
            width: 300px;
            margin-right:  20px;
            padding: 20px;
            border: none;
            box-shadow: none;
            border-right: #19467e solid 5px;
            border-bottom: #19467e solid 5px;
            background-color: white;
            color: #19467e;
            cursor: pointer;
        }
        button:hover{
            color: white;
            font-weight: bolder;
            background-color: #19467e;
        }
        form{
            display: block;
            width: 100%;
            text-align: center;
            font-family: Garuda;
        }

        form div{
            width: 25%;
            margin: 20px auto;
            text-align: left;
            border-bottom: #3e3f3e solid 2px;
            padding: 5px 10px;
            color: #3e3f3e;
        }
        form div:last-of-type{
            border: none;
            text-align: center;
        }
        form span{
            padding: 5px;
            font-size: 18px;
        }
        form input{
            border: none;
            padding: 5px;
            font-size: 18px;
            width: 100%;
        }
        form button{
            margin: 0;
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