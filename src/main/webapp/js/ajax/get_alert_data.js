function loadData(url1){
  $.ajax({url:url1,
	  headers: { 'ACCEPT': 'application/json' },
	  success:function(response){
      var result = "";
      console.log (response);
      $.each(response, function(i, item) {
    	  
          if(item.brokeBuild === true){
        	  console.log (item.brokeBuild+"broke build");  
        	  result += "<font color=red><span><h4>You Broke a build</h4></span></font><a href="+item.url+">click here to navigate</a>";
          }
          if(item.frequentCommits === true && item.lastCommitedAt <= 2){
        	  result += "</br><strong><font color=green>You are frequently committing!!Its good</font></strong>";
          }
//      result += "<span><h4>"+item.alertMessage+"</h4></span><a href="+item.link+">link</a>";
      });
    $("#alerts-info").html(result);
  }});
}

loadData("api/alerts");