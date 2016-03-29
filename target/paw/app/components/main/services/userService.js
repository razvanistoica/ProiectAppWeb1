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
                .post("http://localhost:8090/paw/user/insert", data)
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