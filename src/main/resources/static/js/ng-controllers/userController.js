app.controller('getUsers', function($scope, $http, $location) {
	
	/*$location.html5Mode({
		  enabled: true,
		  requireBase: false,
		  rewriteLinks: false
		});

	*/
	$scope.Users={};
	
	$scope.getfunction = function(){
		var url = window.location.origin + "/users/all";
		alert(url);
		//var url=new $window.URL($location.absUrl()).origin+ "/users/all";
		//var relUrl=$location.parseLinkUrl(url);
		
		$http.get(url).then(function (response) {
			
			console.log(response.data);
			$scope.response = response.data
		}, function error(response) {
			$scope.postResultMessage = "Error with status: " +  response.statusText;
		});
	}
});


app.controller('usersController', function($scope) {

	    $scope.headingTitle = "User List";
	
	});
	
	 
	
	app.controller('rolesController', function($scope) {
	
	    $scope.headingTitle = "Roles List";
	
	});
	
	app.controller('navigation', function($scope) {
		
		$scope.goToLogin=function()
		{	
			alert(1);
		   window.location.href="/login.html";
	    }
		
		
	
	});	
	
