(function (angular) {
    var ItemController = function (ItemService) {

        var vm = this;

        setup();


        function setup() {
            getList();

            ItemService.findById(1).then(function (data) {
                console.log('Data: ' + data);
            }, function (error) {
                console.log('Error: ' + error);
            })
        }

        function getList() {
            ItemService.getList().then(function (data) {
                vm.items = data ? data : [];
            }, function (error) {
                console.log('Error: ' + error);
            });
        }



        vm.addItem = function (description) {
            var newItem = {
                description: description,
                checked: false
            };

            ItemService.createItem(newItem).then(function () {
                console.log('Insert complete. Refreshing list');
                getList();
            }, function (error) {
                console.log('Error: ' + error);
            });
        };

        vm.updateItem = function (item) {
            console.log('Update item');
        };

        vm.deleteItem = function (item) {
            ItemService.deleteItem(item).then(function () {
                console.log('Delete complete. Refreshing list');
                getList();

                //$scope.items.splice($scope.items.indexOf(item), 1);
            }, function (error) {
                console.log('Error deleting');
            })
        };

    };

    ItemController.$inject = ['ItemService'];
    angular.module("myApp.controllers").controller("ItemController", ItemController);
}(angular));