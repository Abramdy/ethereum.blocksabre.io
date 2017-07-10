angular.module('address', [])
    .controller('address', function($scope, $http) {
        $http.get('/api/address').
        then(function(response) {
            $scope.addressResponse = response.data;
        });
    });