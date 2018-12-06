<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
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
            font-family: Ubuntu, sans-serif;
            clear: both;
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
            font-family: Garuda, sans-serif;
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
        table{
            margin: 5% auto;
            text-align: left;
            font-family: sans-serif;
            font-size: 1.4rem;
        }
        th,td{
            padding: 20px 10px;
            border: none;
        }
        th{
            background-color: #19467e;
            color: white;
        }
        td{
            color: #3e3f3e;
            text-align: center;
            border-bottom: solid 1px black;
        }
        .back{
            border-color: red;
        }
        .back:hover{
            background-color: red;
        }
        .submit{
            border-color: forestgreen;
        }
        .submit:hover{
            background-color: forestgreen;
        }
        tr:last-of-type td{
            background-color: white;
            border: none;
        }
        .box{
            box-shadow: 0 0 10px 5px #19467e;
            width: 30%;
            margin: 10% auto;
            font-family: sans-serif;
            font-size: 1.6rem;
        }
        .database{
            font-size: 1.2rem;
        }
        .database th{
            text-align: center;
        }
        .database td{
            background-color: white;
            color: #3e3f3e;
        }
        .database tr:first-of-type{
            opacity: 1;
        }
        .database tr:last-of-type td{
            background-color: white;
        }
        .database tr {
            opacity: 0.75;
            border-bottom: solid 1px black;
        }
        .database tr:hover{
            opacity: 1;
        }
        .database button{
            width: 80px;
            height: 80px;
            color: #3e3f3e ;
            border:none;
            border-radius: 50%;
        }
        #delete-record:hover{
            background-color: red;
            color: white;
        }
        #modify-record:hover{
            background-color: darkorange;
            color: white;
        }
        .search-bar{
            width: 40%;
            margin: 3% auto;
            background-color: white;
            text-align: left;
            font-family: sans-serif;
        }
        .search-bar h4{
            color: #3e3f3e;
            width: 100%;
        }
        .search-bar h5{
            display: inline-block;
            width: 40%;
        }
        .search-bar span{
            font-size: 1.2rem;
            display: inline-block;
            width: 55%;
            text-align: center;
        }
        .search-bar input{
            margin: auto;
            width: 50%;
            border-bottom: solid 1px #3e3f3e;
        }
        .search-bar button{
            width: fit-content;
            font-size: 0.9rem;
            padding: 5px 5px;
            color: #3e3f3e;
            border: solid 2px #3e3f3e;
            border-radius: 5px;
            display: block;
            margin: 10px auto;
            float: none;
        }
        .search-bar button:hover{
            background-color: gold;
            color: white;
            border: none;
        }
        .action-form{
            display: inline-block;
            width: fit-content;
        }
    </style>
</head>
<body>
<h1>Employee App</h1>
<div>
    <a href="/db/add-employee">
        <button>Add Record</button></a>
    <a href="/db/employment-database">
        <button>Check Data Base</button></a>
    <a href="/db/find-employee">
        <button>Find Record</button></a>
</div>