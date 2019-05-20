


function tagfunction(){
	var a = window.confirm("是否确认登录");
	
	if(a){
		var username = document.getElementById("username").value;
		
		var password = document.getElementById("password").value;
		
		if(typeof(username)=="undefined" || username == ""){
			alert("用户名不能为空");
			return;
		} 
		if(typeof(password)=="undefined" || username == ""){
			alert("密码不能为空");
			return;
		}
		if(username=="root"&&password=="root"){
			alert("登录成功！")
			document.getElementById("form1").submit();
		}else{
			alert("用户名密码错误！")
			window.location.href="index.html";
		}
		
	}else{
		window.location.href="index.html";
	}
		
		
}

