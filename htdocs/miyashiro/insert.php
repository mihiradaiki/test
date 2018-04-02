<?php
    mb_internal_encoding("utf8");
    $pdo = new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
    $pdo->exec("insert into keijiban(name,free) values('".$_POST["name"]."','".$_POST["free"]."')");
    header("Location:http://localhost/miyashiro/index.html");
?>