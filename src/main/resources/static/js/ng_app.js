var app = angular.module('app', ['ngRoute','ngResource']);

/*app.config(function($routeProvider){
	    $routeProvider
	        .when('/users',{
	            templateUrl: 'users.html',
	            controller: 'usersController'
	        })
	        .when('/roles',{
	
	            templateUrl: 'roles.html',
	
	            controller: 'rolesController'
	
	        })
	
	        .otherwise(
	
	            { redirectTo: '/'}
	
	        );
	
	});*/



app.config(['$routeProvider','$locationProvider',function($routeProvider,$locationProvider){
	
	$locationProvider.hashPrefix(''); 
	$locationProvider.html5Mode(true);
	
    $routeProvider
   /* .when('/login',  {templateUrl:"/login.html", controller : 'navigation'})*/
    .when('/index',  {templateUrl:"index.html"})
    .when('/users',  {templateUrl:"users.html"})
    .when('/roles',  {templateUrl:"roles.html"})
    .when('/views/productList',    {templateUrl:"/views/productList.html"}).otherwise({templateUrl: 'index.html'})
}]);  


