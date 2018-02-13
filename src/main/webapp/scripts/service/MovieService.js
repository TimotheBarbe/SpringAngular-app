'use strict';
var myApp = angular.module('app');

myApp.factory('MovieService', ['$resource', function($resource) {

var defaultRoot = '/movies/';
    return $resource(defaultRoot, {}, {
        getAllMovies: {
            url: defaultRoot,
            method: 'GET',
            isArray: true
        },
        getMovieDetail: {
            url: defaultRoot + ':name',
            method: 'GET',
            params: {name: '@name'}
        }
    });
}]);