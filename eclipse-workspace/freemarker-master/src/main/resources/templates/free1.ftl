<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freemarker</title>
</head>
<body>
<h1>取值：</h1>
<ul>
<li>整数：<font size="20px" color="red">${intVar}</font></li>
<li>长整数：<font size="20px" color="blue">${LongVar}</font></li>
<li>双精度：<font size="20px" color="pink">${doubleVar}</font></li>
<li>字符串：<font size="20px" color="yellow">${StringVar}</font></li>
<li>布尔值: <font size="20px" color="green">${booleanVar?string('yes','no')}</font></li>
<li>日期类型Java.Util.Date:<font size="20px" color="red">${dateVar1?string('yyyy-MM-dd HH:mm:ss')}</font></li>
<li>空值：<font size="20px" color="pink">${nullVar1!}</font></li>
<li>空值：<font size="20px" color="green">${nullVar!'我是默认值'}</font></li>
<li>不存在的变量：<font size="20px" color="blue">${变量!'我是默认变量'}</font></li>
<li>不存在的变量1：<font size="20px" color="red">${free!'我是默认变量'}</font></li>
</ul>
<hr size="10" color="blue">
<ul>
 <li>赋值&运算</li>
 <#assign a=100/>
 a = <font color="red">${a}</font><br/>
 a+100=<font coloe="blue">${a+100}</font><br/>
</ul>
<style>
.font_01 { font-size:80px;}
</style>
<a href="free2.html" class="font_01">free2</a>

</body>
</html>