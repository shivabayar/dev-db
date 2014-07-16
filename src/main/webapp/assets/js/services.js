'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.
angular.module('myApp.services', [])

	.service('MyService', function() {	//Service for Project List
	 var projects=[{
    		 "id":1,
    		 "projectName":"HU-Assignment Web Application",
    		 "projectDescription":"This is an assignment for HU14 batch",
    		 "projectCordinators":["Rahul","Nagarjun","Vinit","Ralph"]
     	},
     	{
		 "id":2,
		 "projectName":"HU-Assignment 2 Web Application",
		 "projectDescription":"This is an assignment for HU14 batch",
		 "projectCordinators":["Nagarjun","Vinit","Ralph"]
     	}
     ];
	 this.list = function () {
	        return projects;
	 };
	})
	
	.service("MyTaskDetailsService",function(){	//Service for Task Description List
		var projectDetails=[
	                           {
	                               "id": 1,
	                               "task": [
	                                   {
	                                       "taskName": "xyz",
	                                       "Desc": "abc",
	                                       "createdAt": "12/12/2013",
	                                       "closedOn": "30/12/2013",
	                                       "dueDate": "20/12/2013",
	                                       "priority": "1",
	                                       "status":"done",
	                                       "assignTo":"Ralph",
	                                           "role": "Developer"
	                                       
	                                   },
	                                   {
	                                       "taskName": "qwe",
	                                       "Desc": "qax",
	                                       "createdAt": "13/12/2013",
	                                       "closedOn": "31/12/2013",
	                                       "dueDate": "21/12/2013",
	                                       "priority": "2",
	                                       "status":"pending",
	                                       "assignTo":"Rahul",
	                                           "role": "Developer"
	                                       
	                                   }
	                               ]
	                           },
	                           {
	                               "id": 2,
	                               "task": [
	                                   {
	                                       "taskName": "kjm",
	                                       "Desc": "ghgfv",
	                                       "createdAt": "31/12/2013",
	                                       "closedOn": "01/01/2014",
	                                       "dueDate": "10/01/2014",
	                                       "priority": "2",
	                                       "status":"done",
	                                       "assignTo": "Ralph",
	                                           "role": "Developer"
	                                       
	                                   },
	                                   {
	                                       "taskName": "jhg",
	                                       "Desc": "kjh",
	                                       "createdAt": "13/12/2013",
	                                       "closedOn": "31/12/2013",
	                                       "dueDate": "21/12/2013",
	                                       "priority": "2",
	                                       "status":"done",
	                                       "assignTo":"Nagraj",
	                                        "role": "Developer"
	                                       
	                                   }
	                               ]
	                           }
	                       ];
		this.list = function () {
	        return projectDetails;
	 };
		
	})
	.value('version', '0.1');


/*var phonecatServices = angular.module('myApp.services', ['ngResource']);

myApp.services.factory('Project', ['$resource',
  function($resource){
    return $resource('partials/:phoneId.json', {}, {
      query: {method:'GET', params:{phoneId:'phones'}, isArray:true}
    });
  }]);*/