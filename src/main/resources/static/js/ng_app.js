var app = angular.module('app', ['ngRoute','ngResource','ngSanitize']);

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



app.config(['$routeProvider','$locationProvider','$httpProvider',function($routeProvider,$locationProvider,$httpProvider){
	
	//$locationProvider.hashPrefix(''); 
	//$locationProvider.html5Mode(true);
	//$locationProvider.html5Mode({
     //   enabled: true,
     //   requireBase: true,
     //   hashPrefix: '!'
   // });
	$httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
	//alert(1);
    $routeProvider
   /* .when('/login',  {templateUrl:"/login.html", controller : 'navigation'})*/
    .when('/views/about',    {templateUrl:"/views/about.html"})
     .when('/index',  {templateUrl:"index.html"})
    .when('/users',  {templateUrl:"users.html"})
    .when('/roles',  {templateUrl:"roles.html"})
    .when('/views/productList',    {templateUrl:"/views/productList.html"}).otherwise({redirectTo: 'index'})
}]);  


