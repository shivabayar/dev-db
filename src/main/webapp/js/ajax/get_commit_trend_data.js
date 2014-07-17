// $(document).ready(function() {
function loadXMLDoc(url)
{
var xmlhttp;
if (window.XMLHttpRequest)
  {// code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  }
else
  {// code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
xmlhttp.onreadystatechange=function()
  {
  if (xmlhttp.readyState==4 && xmlhttp.status==200)
    {
    // document.getElementById('alert-text').innerHTML=xmlhttp.status;
    // document.getElementById('alert-text').innerHTML=xmlhttp.statusText;
    console.log (innerHTML=xmlhttp.status);
    document.getElementById('alert-text').innerHTML=xmlhttp.responseText;
    }
  }
xmlhttp.open("GET",url,true);
xmlhttp.send();
}

loadXMLDoc("alert.txt");
// }
// );