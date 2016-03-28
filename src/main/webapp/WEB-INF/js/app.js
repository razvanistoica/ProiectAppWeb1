(function() {
	'use strict';

	/* Init application */
	angular
		.module('app', ['ngAnimate', 'ngRoute', 'ngSanitize', 'mgcrea.ngStrap']);



	/* Common application conroller */
	angular
		.module('app')
		.controller('ApplicationCtrl', ApplicationCtrl);

	ApplicationCtrl.$inject = ['$window'];
	function ApplicationCtrl($window) {

		var vm = this;
	}
})();


(function() {
	'use strict';

	angular
		.module('app')
		.directive('sampleDirective', 	sampleDirective);
	
	function sampleDirective() {
	  return function(scope, element, attrs) {
	    scope.$watch(attrs.inputDisabled, function(val) {
	    	if (val === undefined)
	    		element.prop('disabled', false);
	    	else
	    		element.prop('disabled', true);
	    });
	  };
	}
	
})();
(function() {
    'use strict';

    angular
        .module('app')
        .controller('UserController', UserController);

    UserController.$inject = ['$window', 'UserService'];
    function UserController($window, UserService) {

        var vm = this;

        vm.name = "";
        vm.response = "";

        vm.addUser = addUser;

        function addUser() {
            vm.response = "";
            var request = {};
            request.name=vm.name;

            UserService
                .addUser(request)
                .then(onInsertComplete, onInsertError);
        }

        function onInsertComplete(response) {
            vm.response = "OK " + response;
        }

        function onInsertError(response) {
            vm.response = "Error " + response;
        }

    }

})();
(function() {
	'use strict';

	angular
		.module('app')
		.controller('MainCtrl', MainCtrl);

	MainCtrl.$inject = ['$window', 'MainService'];
	function MainCtrl($window, MainService) {

		var vm = this;

	}

})();
(function() {
	'use strict';

	angular
		.module('app')
		.service('MainService', MainService);

	MainService.$inject = ['$http'];
	function MainService($http) {

		var service = {};

		return service;
	}
	
})();
(function() {
    'use strict';

    angular
        .module('app')
        .service('UserService', UserService);

    UserService.$inject = ['$http', '$q'];
    function UserService($http, $q) {

        var service = {
            addUser:addUser
        };

        function addUser(data){

            var deferred = $q.defer();

            $http
                .post("http://localhost:8080/paw/insert", data)
                .success(function(data, status, headers, config) {
                    deferred.resolve(data);
                })
                .error(function(data, status, headers, config) {
                    deferred.reject(data);
                });

            return deferred.promise;
        }

        return service;
    }

})();
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