angular.module('ping', [])
    .controller('ping', function($scope, $http) {
        $http.get('/api/ping').
        then(function(response) {
            $scope.pingResponse = response.data;
        });
    });