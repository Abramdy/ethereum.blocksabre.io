angular.module('index', [])
    .controller('index', function($scope, $http) {
        $http.get('/api/block').
        then(function(response) {
            $scope.blockResponse = response.data;
        });
    })

.filter('num', function() {
    return function(input) {
        return parseInt(input, 16);
    }
});