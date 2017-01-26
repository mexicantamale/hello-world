<!DOCTYPE html>
<!-- All HTML documents begin and end with an "html" tag -->
<html lang="en">

  <!-- The "header" is the part of your document where you provide the browser with important information like stylesheets you have used -->
	<head>
		<title>Hello</title>  <!-- This text shows up on the tab in your browser -->
		<link rel="stylesheet" type="text/css" href="page.css">	
	</head>

  <!-- The "body" is the part of your document where you include all content you want to show up in the browser -->
	<body>
		<p>hello DVC</p>
    var $cont = document.querySelector('.cont');
var $elsArr = [].slice.call(document.querySelectorAll('.el'));
var $closeBtnsArr = [].slice.call(document.querySelectorAll('.el__close-btn'));

setTimeout(function() {
  $cont.classList.remove('s--inactive');
}, 200);

$elsArr.forEach(function($el) {
  $el.addEventListener('click', function() {
    if (this.classList.contains('s--active')) return;
    $cont.classList.add('s--el-active');
    this.classList.add('s--active');
  });
});

$closeBtnsArr.forEach(function($btn) {
  $btn.addEventListener('click', function(e) {
    e.stopPropagation();
    $cont.classList.remove('s--el-active');
    document.querySelector('.el.s--active').classList.remove('s--active');
  });
});


	</body>
   
</html>

<!-- W3Schools is a helpful resource to refresh your brain:  http://www.w3schools.com/html/html_intro.asp -->
