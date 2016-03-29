(function() {
    'use strict';
    
	angular
		.module('app')
		.config(Routes);
	
	Routes.$inject = ['$routeProvider'];
    function Routes($routeProvider) {

    	$routeProvider.
	    	 when('/', {
	    	   templateUrl: 'templates/main/main.html',
	    	   controller:	'MainCtrl',
	           controllerAs: 'main'
	       	 }).
            when('/user', {
                templateUrl: 'templates/user/user.html',
                controller:	'UserController',
                controllerAs: 'user'
            }).
	         otherwise({
	           redirectTo: '/'
	         });
    }
    
})();