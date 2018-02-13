'use strict';
var myApp = angular.module('app');

myApp.controller('MovieController', ['$scope','MovieService', function($scope, MovieService) {

    $scope.movies = MovieService.getAllMovies();

    $scope.selectMovie = function(movieName) {
        $scope.selectedMovie = MovieService.getMovieDetail({name : movieName});
    }

}]);