'use strict';

/* Controllers */

angular.module('myApp.controllers', [])
  .controller('View1Cntrl', ['$scope', 'MyService', function($scope, MyService) {
	  $scope.projects = MyService.list();
	  $scope.submit = function(form) {
    	 var project={"projectName":form.projectName,
    			 "projectDescription":form.projectDescription,
    			 "projectCordinators":[form.projectCordinators]
    	 };
    	 $scope.projects.push(project);
     }; 
  }])
  .controller('MyCtrl2', ['$scope','$routeParams','MyTaskDetailsService', function($scope,
		  	$routeParams,MyTaskDetailsService) {
	  var id=$routeParams.projectId;
	  var i;
 	  $scope.projectDetails=MyTaskDetailsService.list();
 	  for( i=0;i<$scope.projectDetails.length;i++){
 		  if(id == $scope.projectDetails[i].id){
 			  $scope.details=$scope.projectDetails[i];
 		  }
 	  }
 	  
 	  $scope.submitTask = function(form) {
 		  var task={
 				"taskName":form.taskName,
	 			"Desc":form.Desc,
	 			"createdAt": "21/12/2013",
	            "closedOn": "31/01/2014",
	            "dueDate": form.dueDate,
	            "priority": form.priority,
	            "status":form.status,
	            "assignTo":form.assignTo,
	             "role": "Developer"
 		 };
 		 console.log($scope.projectDetails[i]);
 		 
 		 $scope.details.task.push(task);
 	  };
  }]);
