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