function init()
{
   initSize();
}

window.onresize = function(event) 
{
   initSize();
}
function initSize() {
  var myWidth = 0, myHeight = 0;
  if( typeof( window.innerWidth ) == 'number' ) 
  {
    //Non-IE
    myWidth = window.innerWidth;
    myHeight = window.innerHeight;
  } 
  else if( document.documentElement && ( document.documentElement.clientWidth || document.documentElement.clientHeight ) ) 
  {
    //IE 6+ in 'standards compliant mode'
    myWidth = document.documentElement.clientWidth;
    myHeight = document.documentElement.clientHeight;
  } 
  var sz = "";
  var size = myWidth * 0.7;
  if(size > 1000)
  {
     sz = size + "px";
  }
  else
  {
     sz = "1000px";
  }
  //Widht of body
  document.getElementById("body").style.width = sz;
  
  //Footer width
  document.getElementById("footer").style.width = sz;
  
  //Menu width
  document.getElementById("menu").style.width = sz - 1;

}