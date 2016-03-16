(function (angular) {

    angular.module("myApp.controllers", []);
    angular.module("myApp.services", []);

    var app = angular.module("myApp", ["myApp.controllers", "myApp.services", "restangular"]);


    /**
     * Set the default route for all requests
     */
    app.config(function(RestangularProvider) {
        RestangularProvider.setBaseUrl('/springBootAngularMMM');
    });
}(angular));