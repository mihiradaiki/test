<?php
    mb_internal_encoding("utf8");//エンコード
    $pdo=new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
    $stmt=$pdo->query("select * from keijiban");
?>

<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>掲示板の練習ページ</title>
        <link rel="stylesheet" type="text/css" href="http:yui.yahooapis.com/3.18.1/build/cssreset/cssreset-min.css">
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <header>
            <div class="logo">
                KEIJIBAN Practice
            </div>
        </header>
        <!--maincontents-->
            <div class="maincontents">
        
            <!--leftside-->
                <div class="leftside">
                    <h1 class="title">掲示板の練習</h1>
                    <h2 class="title">掲示板の練習ページ</h2>
                    下記に名前とコメントを入力し「登録」をクリックしてください。

                    <form method="post" action="insert.php">
                        <p>
                            名前<br>
                            <input type="text" size="30" name="name" />
                        </p>
                        <p>
                            コメント<br>
                            <textarea name="free" cols="80" rows="5"></textarea>
                        </p>
                        <p>
                            <input type="submit" value="登録する" />
                        </p>
                    </form>
                    <?php
                        //以下、サブテーブルの1レコード取得から表示までをワンセットにしている。
                        while($row=$stmt->fetch()){
                            $name=$row["name"];
                            $free=$row["free"];

                    ?>
                    <div class="commentbox">
                        <div class="commentbox-name"><?php echo $name;?></div>
                        <div class="comment-free"><?php echo $free;?></div>
                    </div>
                    <?php
                        }
                    ?>
                </div>
                
            <!--rightside-->
                <div class="rightside">
                    <p>
                        <img src="img/001.jpg">
                    </p>
                    <p>
                        <img src="img/002.jpg">
                    </p>
                </div>
            </div>
    </body>
</html>