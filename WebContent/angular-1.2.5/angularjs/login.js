 var formApp = angular.module('app', []);

        formApp.controller("myctrl", function($scope, $http) {
            $scope.user= {};
            $scope.fm = function() {
                $http({
                        method: 'POST',
                        url: 'https://127.0.0.1:8080/test_login/login',
                        data: $.param($scope.user),
                        headers: {
                            'Content-Type': 'application/x-www-form-urlencoded'
                        }
                    })
                    .success(function(data) {
                    	
                       location.href = ""

                    });
            };
        });